package com.driver;

import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;

    public Message(int _id, String _content, Date _timestamp) {
        this.id = _id;
        this.content = _content;
        this.timestamp = _timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
