package com.example.sample2;

/**
 * @author daicham
 */
@SuppressWarnings("ALL")
public class Main {
    public static void main(String... args) {
        ResponseSet responseSet = new ResponseSet(new DefaultResponseBodyContent());
        ResponseBodyContent content = responseSet.getResponseBodyContent();

        DefaultResponseBodyContent defaultContent = DefaultResponseBodyContent.class.cast(content);
    }
}
