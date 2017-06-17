package com.example.sample2;

/**
 * @author daicham
 */
public class ResponseSet {
    ResponseBody body;
    public ResponseSet(ResponseBodyContent responseBodyContent) {
        this.body = new ResponseBody(responseBodyContent);
    }

    public ResponseBodyContent getResponseBodyContent() {
        return body.getContent();
    }
}
