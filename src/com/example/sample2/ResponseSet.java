package com.example.sample2;

/**
 * @author daicham
 */
class ResponseSet<T extends ResponseBodyContent> {
    private ResponseBody<T> body;

    private ResponseSet(T responseBodyContent) {
        body = new ResponseBody<>(responseBodyContent);
    }

    T getResponseBodyContent() {
        return body.getContent();
    }

    static <T extends ResponseBodyContent> ResponseSet<T> createResponseSet(T content) {
        return new ResponseSet<>(content);
    }

    static ResponseSet<DefaultResponseBodyContent> createDefaultResponseSet() {
        return new ResponseSet<>(new DefaultResponseBodyContent());
    }
}
