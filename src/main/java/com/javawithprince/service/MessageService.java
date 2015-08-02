package com.javawithprince.service;

import com.javawithprince.model.Message;
import database.DatabaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by prince_shah on 7/31/15.
 */
public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService(){
        messages.put(1L, new Message(1, "Hello world", "Prince"));
        messages.put(2L, new Message(2, "Hello Jetty", "Prince"));
    }

    public List<Message> getAllMessages() {

        return new ArrayList<>(messages.values());
    }

    public Message getMessage(Long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size()+1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        messages.put(message.getId(), message);
        return message;
    }

    public Message deleteMessage(Long id) {
        return messages.remove(id);
    }
}
