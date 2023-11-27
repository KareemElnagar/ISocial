package com.kareem.isocial.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kareem.isocial.R
import com.kareem.isocial.data.domain.Story
import com.kareem.isocial.databinding.ItemAddStoryBinding
import com.kareem.isocial.databinding.ItemStoryBinding

class StoriesAdapter(
    private val items: List<Story>,
    private val listener: HomeActionsListener
) :
    RecyclerView.Adapter<StoriesAdapter.BaseStoriesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseStoriesViewHolder {
        return when (viewType) {
            TYPE_ADD_STORY -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_add_story, parent, false)
                AddStoryViewHolder(view)
            }

            TYPE_STORIES -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
                StoriesViewHolder(view)
            }

            else -> throw Exception("UNKNOWN STORY TYPE")
        }
    }

    override fun getItemCount(): Int = items.size + 1 // to add the add story item

    override fun onBindViewHolder(holder: BaseStoriesViewHolder, position: Int) {
        when(holder){
            is AddStoryViewHolder -> bindAddStory(holder, position)
            is StoriesViewHolder -> bindStory(holder, position)
        }
    }

    private fun bindStory(holder: StoriesViewHolder, position: Int) {
        val currentStory = items[position - 1] // add story is not on the list of items

        holder.binding.apply {
            if (currentStory.seen) {
                storyNotSeen.visibility = View.INVISIBLE
            } else {
                storyNotSeen.visibility = View.VISIBLE
            }
            Glide.with(this.root.context).load(currentStory.userImgUrl).into(imageStory)
            root.setOnClickListener { listener.onClickStory(currentStory) }
        }
    }

    private fun bindAddStory(holder: AddStoryViewHolder, position: Int) {
        holder.binding.apply {
            root.setOnClickListener { listener.addStory() }
        }

    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> TYPE_ADD_STORY
            else -> TYPE_STORIES

        }
    }


    abstract class BaseStoriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class StoriesViewHolder(itemView: View) : BaseStoriesViewHolder(itemView) {
        val binding = ItemStoryBinding.bind(itemView)
    }

    class AddStoryViewHolder(itemView: View) : BaseStoriesViewHolder(itemView) {
        val binding = ItemAddStoryBinding.bind(itemView)
    }

    companion object {
        private const val TYPE_ADD_STORY = 1
        private const val TYPE_STORIES = 2
    }
}