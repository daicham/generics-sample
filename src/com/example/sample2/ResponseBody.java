package com.example.sample2;

/**
 * @author daicham
 */
class ResponseBody<T extends ResponseBodyContent> {
    private T content;

    ResponseBody(T content) {
        this.content = content;
    }

    T getContent() {
        return content;
    }
}
