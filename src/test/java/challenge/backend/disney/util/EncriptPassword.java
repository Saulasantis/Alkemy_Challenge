package challenge.backend.disney.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptPassword {

    public static void main(String[] args) {

        var password = "123";
        System.out.println("password: " + password);
        System.out.println("encripted password: " + encripPassword(password));
    }

    public static String encripPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
