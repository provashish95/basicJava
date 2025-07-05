/*
 9. Generate random password having following combinations:
a. Must be 8 characters
b. Must be having at least one capital letter
c. Must be having at least one small letter
d. Must be having at least one numeric digit
e. Must be having at least one special characters
 */
package assignment;

import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        int length = 8;

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";
        String allChars = upperCase + lowerCase + digits + specialChars;

        Random random = new Random();
        char[] password = new char[length];

        password[0] = upperCase.charAt(random.nextInt(upperCase.length()));
        password[1] = lowerCase.charAt(random.nextInt(lowerCase.length()));
        password[2] = digits.charAt(random.nextInt(digits.length()));
        password[3] = specialChars.charAt(random.nextInt(specialChars.length()));
    
     for (int i = 4; i < length; i++) {
            password[i] = allChars.charAt(random.nextInt(allChars.length()));
        }
     
     for (int i = 0; i < password.length; i++) {
            int randIndex = random.nextInt(length);
            char temp = password[i];
            password[i] = password[randIndex];
            password[randIndex] = temp;
        }
     
     System.out.println("Generated Password: " + new String(password));
    }
}
