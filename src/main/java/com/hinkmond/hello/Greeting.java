package com.hinkmond.hello;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getHelloWorld() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting(0, "Greeting-Main");
        System.out.println(greeting.getHelloWorld());
    }
}

