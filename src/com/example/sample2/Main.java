package com.example.sample2;

/**
 * @author daicham
 */
@SuppressWarnings("unused")
public class Main {
    public static void main(String... args) {
        // 特定の content を渡して、それが含まれる ResponseSet を作る
        ResponseSet<DefaultResponseBodyContent> responseSet = ResponseSet.createResponseSet(new DefaultResponseBodyContent());
        // 中に含まれている content の型で get できる
        DefaultResponseBodyContent content = responseSet.getResponseBodyContent();

        // 特定の content が含まれる ResponseSet を作る
        ResponseSet<DefaultResponseBodyContent> responseSet2 = ResponseSet.createDefaultResponseSet();
        // 中に含まれている content の型で get できる
        DefaultResponseBodyContent content2 = responseSet2.getResponseBodyContent();
    }
}
