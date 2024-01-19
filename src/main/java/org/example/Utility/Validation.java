package org.example.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {


    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher(passwordRegex);
        return matcher.matches();
    }


}
