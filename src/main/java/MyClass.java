
import java.util.Scanner;

public class MyClass {

    public static boolean password(String password){
        if (!((password.length() >= 8)
                && (password.length() <= 25))) {

            return false;
        }
        //contains small Letters
        int count = 0;
        for (int i = 90; i <= 122; i++) {

            char c = (char)i;
            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        //contains big Letter
        for (int i = 65; i <= 90; i++) {

            char c = (char)i;
            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        // contains Numbers
        for (int i = 0; i <= 9; i++) {

            String str1 = Integer.toString(i);
            if (password.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        // contains special character
        if (!(password.contains("(") || password.contains(")")
                || password.contains("#") || password.contains("$")
                || password.contains("?") || password.contains("!")
                || password.contains("%") || password.contains("/")
                || password.contains("@") )) {
            return false;
        }
        if (true) {
            count = 1;
        }

        //Extensions
        if ((password.contains("123") || password.contains("234")
                || password.contains("345") || password.contains("456")
                || password.contains("567") || password.contains("678")
                || password.contains("789") || password.contains("0000")
                || password.contains("1111") || password.contains("2222")
                || password.contains("3333") || password.contains("4444")
                || password.contains("5555") || password.contains("6666")
                || password.contains("7777") || password.contains("8888")
                || password.contains("9999")) || password.contains("012")) {
            return false;
        }

        if (true) {
            count = 1;
        }

            //if all cases return false
        return true;
    }

    public static void main(String [] args){

        String password1 = "MeinPasswort1!";

                if (password(password1)){
            System.out.println("Valid Password");
        }else {
            System.out.println("INVALID Password!!!");
        }

        String password2 = "TestTest123";

        if (password(password2)){
            System.out.println("Valid Password");
        }else {
            System.out.println("INVALID Password!!!");
        }

    }
    }
