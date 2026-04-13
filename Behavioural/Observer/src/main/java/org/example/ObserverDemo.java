package org.example;

import org.example.impl.NewsAgency;
import org.example.impl.NewsChannel;

public class ObserverDemo {
    static void main() {
        NewsAgency newsAgency = new NewsAgency();

        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel cnn = new NewsChannel("CNN");

        newsAgency.subscribe(bbc);
        newsAgency.subscribe(cnn);

        newsAgency.setNews("Design Patterns are Awesome!!!");

        newsAgency.unSubscribe(bbc);
        newsAgency.setNews("Please prepare for LLD and HLD");
    }
}
