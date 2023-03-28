package hw_12_Jenkins.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

///Просто скопировал, не использую
public class RandomUtils {


    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomItemFromArray(String[] values) {
        int index = getRandomInt(0, values.length - 1);

        return values[index];
    }


    public static void main(String[] args) {
        System.out.println(getRandomString(10));
        System.out.println(getRandomInt(10, 100));
        System.out.println(getRandomEmail());

        String[] names = {"a", "b", "c", "d", "e"};
        System.out.println(getRandomItemFromArray(names));

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Faker faker = new Faker();
        String dob = sdf.format(faker.date().birthday());
        System.out.println(" Дата " + dob);
    }


    public static String getRandomString(int length) {
//        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public static String getRandomEmail() {
        return getRandomString(10) + "@qa.guru";
    }

    public static String getRndValueArr(String[] arr) {
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    }


}

