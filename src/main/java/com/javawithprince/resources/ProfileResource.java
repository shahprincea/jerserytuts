package com.javawithprince.resources;

import com.javawithprince.model.Profile;
import com.javawithprince.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by prince_shah on 8/1/15.
 */
@Path("/profiles")
public class ProfileResource {

    private ProfileService profileService = new ProfileService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Profile> getProfiles() {
        return profileService.getAllProfiles();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Profile addPost(Profile profile) {
        return profileService.addProfile(profile);
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{profilename}")
    public Profile getProfile(@PathParam("profilename") String name) {
        return profileService.getProfile(name);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{profilename}")
    public Profile updateProfile(@PathParam("profilename") String name, Profile profile) {
        profile.setProfileName(name);
        profileService.updateProfile(profile);
        return profile;
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{profilename}")
    public void deleteProfile(@PathParam("profilename") String name) {
        profileService.deleteProfile(name);
    }

}
