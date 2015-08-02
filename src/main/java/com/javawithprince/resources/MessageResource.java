package com.javawithprince.resources;

import com.javawithprince.model.Message;
import com.javawithprince.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by prince_shah on 7/31/15.
 */
@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{messageID}")
    public Message getMessage(@PathParam("messageID") long messageID){
        return messageService.getMessage(messageID);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {
        messageService.addMessage(message);
        return message;
    }

    @PUT
    @Path("/{messageID}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageID") long messageID, Message message) {
        message.setId(messageID);
        messageService.updateMessage(message);
        return message;
    }

    @DELETE
    @Path("/messageID")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageID") long messageID) {
        messageService.deleteMessage(messageID);
    }

}
