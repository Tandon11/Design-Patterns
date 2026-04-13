package org.example.impl;

import org.example.interfaces.Observer;
import org.example.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private String latestNews;
    private final List<Observer> subscribers = new ArrayList<>();

    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers(); // Automatically tell everyone
    }

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : subscribers) {
            o.update(latestNews);
        }
    }
}
