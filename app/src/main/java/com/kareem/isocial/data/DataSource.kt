package com.kareem.isocial.data

import com.kareem.isocial.data.domain.Post
import com.kareem.isocial.data.domain.Story

object DataSource {
 fun getStories() : List<Story> = listOf(
     Story(true, "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg"),
     Story(false, "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png"),
     Story(false, "https://randomuser.me/api/portraits/men/19.jpg"),
     Story(false, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTiMsC4W_flKXR6Nkvfv7cIZWm5eAqQE0BqNisDXlT3RuxGMKw3yw8We2IPAHq0ymgZ-nE&usqp=CAU"),
     Story(false, "https://www.chaac.tf.fau.eu/files/2021/02/1071625.jpg"),
     Story(false, "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067"),
     Story(false, "https://i.pinimg.com/736x/78/83/76/7883768da271cfb0043feca9314a3120.jpg"),
     Story(false, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD3lQV4529eaHbwr59_bfOSYRXhvpfrQEusA&usqp=CAU"),
     Story(true, "https://randomuser.me/api/portraits/men/74.jpg"),
     Story(true, "https://vengreso.com/wp-content/uploads/2016/03/LinkedIn-Profile-Professional-Picture-Sample-Bernie-Borges.png"),
     Story(true, "https://i.pinimg.com/originals/5a/23/d7/5a23d7a5b80c846695b7c92b2876f09e.jpg"),
     Story(false, "https://randomuser.me/api/portraits/men/76.jpg"),
 )


    fun getPost() : List<Post> = listOf(
        Post(userName = "Ali Jaleel", date = "2023/6/5", profileImgUrl = "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg", postImgUrl = "https://img.freepik.com/free-vector/colorful-palm-silhouettes-background_23-2148541792.jpg?size=626&ext=jpg&ga=GA1.2.1685543998.1622592000"),
        Post(userName = "Amnah Ali", date = "2023/6/5", profileImgUrl = "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png", postImgUrl = "https://i.imgflip.com/1c1uej.jpg"),
        Post(userName = "Sajjad Abdul-Aziz", date = "2023/6/4", profileImgUrl = "https://randomuser.me/api/portraits/men/20.jpg", postImgUrl = "https://cnn-arabic-images.cnn.io/cloudinary/image/upload/w_780,c_scale,q_auto/cnnarabic/2019/01/12/images/119388.jpg"),
        Post(userName = "Sahar Qais", date = "2023/6/4", profileImgUrl = "https://www.chaac.tf.fau.eu/files/2021/02/1071625.jpg", postImgUrl = "https://cdn.al-ain.com/images/2020/4/19/62-165230-new-technique-understand-reaction-plants_700x400.jpg"),
        Post(userName = "Mohammed Hakeem", date = "2023/6/4", profileImgUrl = "https://randomuser.me/api/portraits/men/16.jpg", postImgUrl = "https://upload.wikimedia.org/wikipedia/commons/2/23/Cristiano_Ronaldo_WC2022_-_01.jpg"),
        Post(userName = "Shahad Abdul-Hasan", date = "2023/6/4", profileImgUrl = "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067", postImgUrl = "https://ichef.bbci.co.uk/news/640/cpsprodpb/115CF/production/_115591117_gettyimages-1284429766.jpg"),
        Post(userName = "Ali Jaleel", date = "2023/6/2", profileImgUrl = "https://www.archiefoundationhome.org.uk/wp-content/uploads/2020/05/profile-photo-social-media.jpg", postImgUrl = "https://yalalla.com/wp-content/uploads/sites/2/2016/06/ultimate-veggie-burger-840x560.jpg"),
        Post(userName = "Shahad Kadhim", date = "2023/5/31", profileImgUrl = "https://i.pinimg.com/originals/5a/23/d7/5a23d7a5b80c846695b7c92b2876f09e.jpg", postImgUrl = "https://cdni.rt.com/media/pics/2019.05/original/5cf0384895a597263f8b45f5.JPG"),
        Post(userName = "Ahmed Abdul-Kareem", date = "2023/5/30", profileImgUrl = "https://vengreso.com/wp-content/uploads/2016/03/LinkedIn-Profile-Professional-Picture-Sample-Bernie-Borges.png", postImgUrl = "https://socialmediaforhousing.files.wordpress.com/2011/05/coins_64133569.jpg"),
        Post(userName = "Rahama Ahmed", date = "2023/5/30", profileImgUrl = "https://i.pinimg.com/736x/78/83/76/7883768da271cfb0043feca9314a3120.jpg", postImgUrl = "https://i.imgflip.com/38el31.jpg"),
        Post(userName = "Shahad Abdul-Hasan", date = "2023/5/29", profileImgUrl = "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067", postImgUrl = "https://i.imgflip.com/2za3u1.jpg"),
        Post(userName = "Amnah Ali", date = "2023/5/24", profileImgUrl = "https://fiverr-res.cloudinary.com/t_profile_original,q_auto,f_auto/attachments/profile/photo/1f846f639010a1e7e1883aaab85b58f0-1533776088426/Screenshot%202018-08-08%20at%208.12.47%20PM%20-%20Edited.png", postImgUrl = "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F23%2F2010%2F10%2F27%2Fginger-chicken-soup_0.jpg"),
        Post(userName = "Aya Alnaqeep", date = "2023/5/22", profileImgUrl = "https://randomuser.me/api/portraits/women/15.jpg", postImgUrl = "https://i.imgflip.com/m78d.jpg"),
        Post(userName = "Noor Ahmed", date = "2023/5/22", profileImgUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQD3lQV4529eaHbwr59_bfOSYRXhvpfrQEusA&usqp=CAU", postImgUrl = "https://i.imgflip.com/1otk96.jpg"),
    )
}