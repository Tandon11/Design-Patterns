package org.example.interfaces;

public interface Subject {
    void subscribe(Observer o);
    void unSubscribe(Observer o);
    void notifyObservers();
}

