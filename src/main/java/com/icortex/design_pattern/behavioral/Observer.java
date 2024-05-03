package com.icortex.design_pattern.behavioral;

import java.util.ArrayList;
import java.util.List;

class Channel {
    private String title;
    private List<Subscriber> subs = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subs.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subs.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber sub : subs) {
            sub.update();
        }
    }

    public void upload(String title) {
        System.out.println("Video upload: " + title);
        notifySubscribers(); // Notify subscribers when a video is uploaded
    }
}

class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name, Channel channel) {
        this.name = name;
        this.channel = channel;
    }

    public void update() {
        System.out.println(name + " received a notification: Video uploaded!");
    }
}

public class Observer {
    public static void main(String[] args) {
        Channel mahin = new Channel();
        Subscriber s1 = new Subscriber("A", mahin);
        Subscriber s2 = new Subscriber("B", mahin);
        Subscriber s3 = new Subscriber("C", mahin);

        mahin.subscribe(s1);
        mahin.subscribe(s2);
        mahin.subscribe(s3);

        mahin.upload("My first video!");
    }
}
