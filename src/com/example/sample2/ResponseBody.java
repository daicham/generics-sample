package com.example.sample2;

/**
 * @author daicham
 */
public class ResponseBody {
    ResponseBodyContent content;

    public ResponseBody(ResponseBodyContent content) {
        this.content = content;
    }

    public ResponseBodyContent getContent() {
        return content;
    }
}
