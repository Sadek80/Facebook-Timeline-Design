package com.example.facebooktimeline.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebooktimeline.R;
import com.example.facebooktimeline.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<Post> posts = new ArrayList<Post>();

    public PostAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,parent,false);

        return new PostViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
            Post post = posts.get(position);
            holder.profileImage.setImageResource(post.getProfileImage());
            holder.userName.setText(post.getUserName());
            holder.postTime.setText(post.getPostTime());
            if (post.getPrivacy() == "public"){
                holder.privacy.setImageResource(R.drawable.ic_globe_americas);
            }
            else {
                holder.privacy.setImageResource(R.drawable.ic_user_friends_bold);
            }

            if(post.hasText() && post.hasImage()){
                holder.postText.setText(post.getPostText());
                holder.postImage.setImageResource(post.getPostImage());
            }
            else if (post.hasText()){
                holder.postText.setText(post.getPostText());
                holder.postImage.setVisibility(View.GONE);
            }
            else if (post.hasImage()){
                holder.postImage.setImageResource(post.getPostImage());
                holder.postText.setVisibility(View.GONE);
            }

            holder.likes.setText(post.getLikes());
            holder.comments.setText(post.getComments());
    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        else
            return posts.size();

    }

    public class PostViewHolder extends RecyclerView.ViewHolder{
        ImageView profileImage;
        TextView userName;
        TextView postTime;
        ImageView privacy;
        TextView postText;
        ImageView postImage;
        TextView likes;
        TextView comments;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = (ImageView) itemView.findViewById(R.id.profile_image);
            userName = (TextView) itemView.findViewById(R.id.username);
            postTime = (TextView) itemView.findViewById(R.id.post_time);
            privacy = (ImageView) itemView.findViewById(R.id.privacy);
            postText = (TextView) itemView.findViewById(R.id.post_text);
            postImage = (ImageView) itemView.findViewById(R.id.post_image);
            likes = (TextView) itemView.findViewById(R.id.likes_number);
            comments = (TextView) itemView.findViewById(R.id.comments_number);
        }
    }
}
