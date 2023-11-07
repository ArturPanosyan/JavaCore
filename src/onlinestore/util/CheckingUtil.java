package onlinestore.util;

import onlinestore.user.User;

import java.util.regex.Pattern;

public class CheckingUtil {
    public static boolean checkPassword(User user, String password) {
        if (user == null) {
            return true;
        }
            return false;
        }

        public static boolean checkEmail (String email){
            return Pattern.matches("^[!#$%&'*+/=?`{|}~^.-]+@ [a-zA-Z0-9.-]+$", email);
        }

        public static boolean isDigit (String val){
            return val.chars().allMatch(Character::isDigit);
        }
    }
