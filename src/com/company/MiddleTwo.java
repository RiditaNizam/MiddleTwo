package com.company;

/**
 * Created by ridita on 5/15/17.
 */
public class MiddleTwo {
    public String middleTwo(String str) {
        return str.substring(((str.length() / 2) - 1), (str.length() / 2)) +
                str.substring((str.length() / 2), ((str.length() / 2) + 1));
    }
}
