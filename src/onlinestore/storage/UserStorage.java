package onlinestore.storage;

import onlinestore.order.Order;
import onlinestore.order.OrderStatus;
import onlinestore.product.Product;
import onlinestore.product.ProductType;
import onlinestore.user.User;
import onlinestore.user.UserType;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class UserStorage implements Serializable {

    private User[] users = new User[100];
    private int size;

    public void add(User user) {
        for (int i = 0; i < size; i++) {
            if (size == users.length) {
                extend();
            }
            users[size++] = user;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }


    public User getById(String userId) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(userId)) {
                return users[i];
            }
        }
        return null;
    }

    public void deleteById(String userId) {
        int indexById = getIndexById(userId);
        if (indexById == -1) {
            System.out.println("User does not exists!!!");
            return;
        }
        for (int i = indexById; i < size; i++) {
            users[i - 1] = users[i];
        }
        size--;
    }

    private int getIndexById(String userId) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(userId)) {
                return i;
            }
        }
        return -1;
    }


    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }


    public Object register(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(email) && users[i].getId().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

 //  public Object findUserBYEmailAndPassword(String email) {
 //      for (int i = 0; i < size; i++) ;

 //      return null;
 //  }


    public UserType login (String email, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail(email, password).equals(email) && users[i].getPassword().equals(password)) {
                if (email.equals("admin@gmail.com") && password.equals("admin1996")) {
                    return UserType.ADMIN;
                } else {
                    return UserType.USER;
                }
            }
        }
        return null;
    }


    public User register(String username, String password, boolean isAdmin, User user) {
        user.getEmail(username, password + (isAdmin ? ":admin" : ":user"));
        System.out.println("Пользователь " + username + " успешно зарегистрирован.");
        return user;
    }

    public User changeUserTypeById(User userById) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(userById)) {
                return users[i];
            }
        }
        return null;
    }
}
