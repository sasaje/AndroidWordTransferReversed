package com.example.wordtransferbackwards;

public class Reverse {
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
