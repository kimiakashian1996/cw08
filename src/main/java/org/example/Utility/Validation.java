package org.example.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {


    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher(passwordRegex);
        return matcher.matches();
    }


}
