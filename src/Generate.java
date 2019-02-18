//generate data double(0.1234) and text(4)
// example 0.12345 GGAS

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.*;

public class Generate extends Main {

    private static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int textSize = 4;

    private String getText() {
        StringBuffer text = new StringBuffer();
        for (int i = 0; i < textSize; i++) {
            int number = getRandomNumber();
            char ch = chars.charAt(number);
            text.append(ch);
        }
        return text.toString();
    }

    private int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(chars.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }

    private String getDouble() {
        int rangeMin = 0;
        int rangeMax = 100;
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        NumberFormat format = new DecimalFormat("#0.00000");
        String formatedValue = format.format(randomValue);
        return formatedValue;
    }

    public ArrayList getDataArrayList(int size) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(getDouble() + getText());
        }
        return arr;
    }

    public LinkedList getDataLinkedList(int size) {
        LinkedList<String> arr = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arr.add(getDouble() + getText());
        }
        return arr;
    }

}
