package org.example;

import org.example.builder.HttpRequestBuilder;

public class BuilderDemo {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequestBuilder("https://api.example.com/users")
                .Build();

        HttpRequest request2 = new HttpRequestBuilder("https://api.example.com/users")
                .addMethod("POST")
                .addHeader("Content-Type", "application/json")
                .addBody("{\"name\": \"John\"}")
                .addTimeout(7000)
                .Build();

        System.out.println("Request 1 : "+request1);
        System.out.println("Request 2 : "+request2);
    }
}
