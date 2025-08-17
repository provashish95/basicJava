package MyString;

import java.util.Random;

public class randomPassword {
    public static void main(String[] args) {
      String password =  generateRandomPassword();
        System.out.println(password);
    }

    public static String generateRandomPassword(){
        String letters = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ1234567890?&*";
        char[] chars = letters.toCharArray();

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <  8; i++){
           int randomIndex =  random.nextInt(chars.length);
           //System.out.println(letters.charAt(randomIndex));
            sb.append(letters.charAt(randomIndex));
        }
        return sb.toString();
    }
}
