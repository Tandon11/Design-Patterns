package org.example.builder;

import org.example.HttpRequest;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder {
    private String url;
    private String method = "GET";
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> queryParams = new HashMap<>();
    private String body;
    private int timeout = 3000;

    public HttpRequestBuilder(String url) {
        this.url = url;
    }

    public HttpRequestBuilder addMethod(String method) {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder addHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder addQueryParams(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder addBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequestBuilder addTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public HttpRequest Build() {
        return new HttpRequest(this.url, this.method, this.headers, this.queryParams, this.body, this.timeout);
    }
}
