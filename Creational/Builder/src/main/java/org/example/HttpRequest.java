package org.example;

import org.example.builder.HttpRequestBuilder;

import java.util.Map;

public class HttpRequest {
    // required
    private final String url;

    //optional
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    // Private Constructor - Called by builder
    public HttpRequest(String url, String method, Map<String, String> headers,
                       Map<String, String> queryParams, String body, int timeout) {
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.queryParams = queryParams;
        this.body = body;
        this.timeout = timeout;
    }
}
