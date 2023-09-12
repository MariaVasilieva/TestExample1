package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User me = new User("Tom",32);
        Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
        String json = gson.toJson(me);
        System.out.println(json);
    }
}