package com.sola.webdemo.kafka;

public class SampleMessage {

    private final Integer id;

    private final String message;

    public SampleMessage(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return "SampleMessage{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
