package com.javawithprince.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by prince_shah on 7/31/15.
 */
@XmlRootElement
public class Message {

    private long id;
    private String message;
    private Date date;
    private String author;

    public Message() {
    }

    public Message(long id, String message, String author) {
        this.author = author;
        this.message = message;
        this.id = id;
        this.date = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
