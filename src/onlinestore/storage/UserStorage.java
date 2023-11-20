package onlinestore.storage;

import onlinestore.model.User;
import onlinestore.model.enums.UserType;
import onlinestore.util.StorageSerializeUtil;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class UserStorage implements Serializable {
    Map <String, User> users = new HashMap();

    public void add(User user) {
        users.put(user.getEmail(), user);
        StorageSerializeUtil.serializeUserStorage(this);
    }

    public void print() {
        for (String email : users.keySet()) {
            System.out.println(email);
        }
    }

    public User getByEmail(String email) {
        return users.get(email);
    }

    public void printByType(UserType userType) {
        for (User user : users.values()) {
            if (user.getUserType() == userType) {
                System.out.println(user);
            }
        }
    }
}