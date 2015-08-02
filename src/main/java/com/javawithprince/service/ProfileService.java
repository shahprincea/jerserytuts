package com.javawithprince.service;

import com.javawithprince.model.Profile;
import database.DatabaseClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by prince_shah on 8/1/15.
 */
public class ProfileService {

    private Map<String, Profile> profiles = DatabaseClass.getProfiles();

    public ProfileService() {
        profiles.put("Princesh", new Profile(1L, "Princesh", "Prince", "Shah"));
        profiles.put("dhunsh", new Profile(2L, "dhunsh", "Dhwani", "Shah"));
    }

    public List<Profile> getAllProfiles() {

        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName) {
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile) {
        profile.setId(profiles.size()+1);
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile updateProfile(Profile profile) {
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile deleteProfile(String profileName) {
        return profiles.remove(profileName);
    }
}
