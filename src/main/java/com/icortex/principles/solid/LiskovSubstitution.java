package com.icortex.principles.solid;

interface  SocialMedia1{
    public void chatWithFriend();
    public void SendPhotosAndVideos();
}

interface SocialPostAndMediaManager{
    public void publishPost(Object post);
}

interface VideoCallManager{
    public void GroupVideoCalling(String ...users);
}


class WhatsApp implements SocialMedia1,VideoCallManager{

    @Override
    public void chatWithFriend() {
        System.out.println("Whatsapp can chat!");
    }

    @Override
    public void SendPhotosAndVideos() {
        System.out.println("Whatsapp can send video!");
    }

    @Override
    public void GroupVideoCalling(String... users) {
        System.out.println("Whatsapp can goupcall!");
    }
}


class Instagram implements SocialMedia1,SocialPostAndMediaManager{

    @Override
    public void chatWithFriend() {
        System.out.println("Instagram can chat!");
    }

    @Override
    public void SendPhotosAndVideos() {
        System.out.println("Instagram can send photos!");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("Instagram can public post!");
    }
}


public class LiskovSubstitution {
}
