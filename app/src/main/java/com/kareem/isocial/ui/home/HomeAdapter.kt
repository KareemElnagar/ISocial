package com.kareem.isocial.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.kareem.isocial.R
import com.kareem.isocial.data.domain.HomeItem
import com.kareem.isocial.data.domain.Post
import com.kareem.isocial.data.domain.Story
import com.kareem.isocial.data.domain.enums.HomeItemType
import com.kareem.isocial.databinding.ItemNewPostBinding
import com.kareem.isocial.databinding.ItemPostBinding
import com.kareem.isocial.databinding.ItemStoryBinding
import com.kareem.isocial.databinding.ItemStoryListBinding

class HomeAdapter(
    private val items: List<HomeItem<Any>>,
    private val listener: HomeActionsListener
) : RecyclerView.Adapter<HomeAdapter.BaseHomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHomeViewHolder {
        return when(viewType){
            TYPE_STORY -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_story_list,parent,false)
                StoryViewHolder(view)
            }
            TYPE_NEW_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_new_post,parent,false)
                NewPostViewHolder(view)

            }
            TYPE_POST -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
                PostViewHolder(view)

            }
            else -> throw Exception("UNKNOWN VIEW TYPE")

        }
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BaseHomeViewHolder, position: Int) {
        when (holder){
            is PostViewHolder -> bindPost(holder, position)
            is StoryViewHolder -> bindStories(holder, position)
            is NewPostViewHolder -> bindNewPost(holder, position)
        }
    }
    private fun bindStories(holder: StoryViewHolder, position: Int){
        val stories = items[position].item as List<Story>
        val mAdapter = StoriesAdapter(stories,listener)
        holder.binding.apply {
            recyclerStories.adapter = mAdapter


        }


    }
    private fun bindPost(holder: PostViewHolder, position: Int){
        val currentPost = items[position].item as Post
        holder.binding.apply {
            textUserName.text = currentPost.userName
            textDate.text = currentPost.date
            Glide.with(this.root.context).load(currentPost.postImgUrl).into(imagePost)
            Glide.with(this.root.context).load(currentPost.profileImgUrl).into(imageProfile)


        }


    }
    private fun bindNewPost(holder: NewPostViewHolder, position: Int){
        val hintText = items[position].item as String
        holder.binding.apply {
            inputNewPost.hint = hintText
            iconPublish.setOnClickListener { listener.onSharePost() }
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position].type){
            HomeItemType.TYPE_STORY -> TYPE_STORY
            HomeItemType.TYPE_NEW_POST -> TYPE_NEW_POST
            HomeItemType.TYPE_POST -> TYPE_POST

        }
    }


    abstract class BaseHomeViewHolder(itemView: View) : ViewHolder(itemView)
    class PostViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemPostBinding.bind(itemView)
    }

    class StoryViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemStoryListBinding.bind(itemView)
    }

    class NewPostViewHolder(itemView: View) : BaseHomeViewHolder(itemView) {
        val binding = ItemNewPostBinding.bind(itemView)
    }

    companion object {
        private const val TYPE_STORY = 1
        private const val TYPE_POST = 2
        private const val TYPE_NEW_POST = 3

    }


}

