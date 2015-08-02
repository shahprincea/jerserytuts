package database;

import com.javawithprince.model.Message;
import com.javawithprince.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prince_shah on 7/31/15.
 */
public class DatabaseClass {

    private static Map<Long, Message> messagesMap = new HashMap<>();
    private static Map<String, Profile> profileMap = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messagesMap;
    }

    public static Map<String, Profile> getProfiles() {
        return profileMap;
    }
}
