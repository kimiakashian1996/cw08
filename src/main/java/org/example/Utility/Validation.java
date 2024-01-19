package org.example.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {


    public static boolean isValidPassword(String password) {
        Pattern passwordRegex = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
        Matcher matcher = passwordRegex.matcher(password);
        return matcher.matches();
    }


}
