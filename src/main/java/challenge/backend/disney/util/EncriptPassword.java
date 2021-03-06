package challenge.backend.disney.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptPassword {

    public static void main(String[] args) {
        var password = "1234";
        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptPassword(password));

    }

    public static String encriptPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
