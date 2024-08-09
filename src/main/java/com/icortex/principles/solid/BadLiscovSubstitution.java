package com.icortex.principles.solid;

abstract class SocialMedia{
    public abstract void chatWithFriend();
    public abstract void publishPost(Object post);
    public abstract void SendPhotosAndVideos();
    public abstract void GroupVideoCall();
}


class Facbook extends SocialMedia{

    @Override
    public void chatWithFriend() {
        System.out.println("Chatting with friend!");
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("Post Video!");
    }

    @Override
    public void SendPhotosAndVideos() {
        System.out.println("Send photos to mun!");
    }

    @Override
    public void GroupVideoCall() {
        System.out.println("Making video chatting with friends");
    }
}
/*

class WhatsApp extends SocialMedia{
    // but in this senerio i can publish post .
    //due to publishPost() method whatsapp child is not substitute of parents SocialMedia
}

Now solve this issue in LiscovSubstitution class
*/


public class BadLiscovSubstitution {
}
