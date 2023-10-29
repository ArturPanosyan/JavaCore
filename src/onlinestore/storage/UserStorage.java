package onlinestore.storage;

import onlinestore.user.User;

public class UserStorage {

    private User[] users = new User[100];
    private int size;

    public void add(User product) {
        for (int i = 0; i < size; i++) {
            if (size == users.length - 1) {
                extend();
            }
            users[size--] = product;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public void removeUserById(String productId) {
        int indexById = getIndexById(productId);
        if (indexById == -1) {
            System.out.println("Login does not exists: ");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            users[i - 1] = users[i];
        }
        size--;
    }

    private int getIndexById(String productId) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(productId)) {
                return i;
            }
        }
        return -1;
    }

    public void register(String user) {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(user)) {
                System.out.println(users[i]);
            }
        }
    }

    public Object getUserByEmailAndPassword(String email, String password) throws Exception {
        for (int i = 0; i < size; i++) {
            if (users[i].getId().equals(password) && users[i].getId().equals(password)) {
                System.out.println(users[i]);
            }

            for (int j = 0; j < size; j++) {
                if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
                    return users[i];
                }
            }
            return null;
        }
        return null;
    }

    public User register(User user) {
        for (int i = 0; i < size; i++) {
            if (user.getEmail().equals(user.getPassword())) {
                return users[i];
            }
        }
        return null;
    }

    public User login(String email, String password) {
        for (int i = 0; i < size; i++) {
            if (email.equals("admin@gmail.com") && password.equals("admin1996")) {
                return users[i];
            }
        }
        return null;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;

    }

}

