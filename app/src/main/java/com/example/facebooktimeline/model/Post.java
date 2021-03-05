package com.example.facebooktimeline.model;

public class Post {
    private int profileImage;
    private String userName;
    private String postTime;
    private String privacy;
    private String postText;
    private int postImage;
    private String likes;
    private String comments;
    private  static final int NO_IMAGE = -1;

    public Post(int profileImage, String userName, String postTime, String privacy, String postText, String likes, String comments) {
        this.profileImage = profileImage;
        this.userName = userName;
        this.postTime = postTime;
        this.privacy = privacy;
        this.postText = postText;
        this.likes = likes;
        this.comments = comments;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getUserName() {
        return userName;
    }

    public String getPostTime() {
        return postTime;
    }

    public String getPrivacy() {
        return privacy;
    }

    public String getPostText() {
        return postText;
    }

    public int getPostImage() {
        return postImage;
    }

    public String getLikes() {
        return likes;
    }

    public String getComments() {
        return comments;
    }

    public Post(int profileImage, String userName, String postTime, String privacy, int postImage, String likes, String comments) {
        this.profileImage = profileImage;
        this.userName = userName;
        this.postTime = postTime;
        this.privacy = privacy;
        this.postImage = postImage;
        this.likes = likes;
        this.comments = comments;
    }

    public Post(int profileImage, String userName, String postTime, String privacy, String postText, int postImage, String likes, String comments) {
        this.profileImage = profileImage;
        this.userName = userName;
        this.postTime = postTime;
        this.privacy = privacy;
        this.postText = postText;
        this.postImage = postImage;
        this.likes = likes;
        this.comments = comments;
    }

    public Boolean hasImage(){
        return profileImage != NO_IMAGE;
    }

    public Boolean hasText(){
        if (postText != null)
            return true;
        else
            return false;
    }
}
