package com.github.camel1984.maven.consumer;

import com.github.camel1984.mavendemo.CamelStringLib;

public class Consumer {
    public static void main(String [] args){
        String myString = "abc";
        String result = new CamelStringLib().upperString(myString);
        System.out.println(result);
    }
}
