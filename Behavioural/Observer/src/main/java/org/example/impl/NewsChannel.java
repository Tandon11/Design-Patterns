package org.example.impl;

import org.example.interfaces.Observer;

public class NewsChannel implements Observer {
    private final String channelName;

    public NewsChannel(String name) {
        this.channelName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(channelName + "....Broadcasting...." + news);
    }
}
