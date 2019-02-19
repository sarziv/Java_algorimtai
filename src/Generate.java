//generate data double(0.1234) and text(4)
// example 0.12345 GGAS

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.*;

public class Generate {

    private static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int textSize = 4;

    /*
     * Generate random 4 letter @String
     * from @chars
     * return @String
     * */
    private String getText() {
        StringBuffer text = new StringBuffer();
        for (int i = 0; i < textSize; i++) {
            Random randomGenerator = new Random();
            int number = randomGenerator.nextInt(chars.length());
            char ch = chars.charAt(number);
            text.append(ch);
        }
        return text.toString();
    }

    /*
     * Generate double with pattern of 0.00000
     * Max value 10.00000
     * return @String
     * */
    private String getDouble() {
        int rangeMin = 0;
        int rangeMax = 10;
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        NumberFormat format = new DecimalFormat("#0.0000");
        return format.format(randomValue);
    }

    /*
     * Generate @String ArrayList
     * Parameters @int size of array
     * Return String[]
     * */
    public String[] getDataArrayList(int size) {
        System.out.println("Array size of " + size + " was generated.");
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i]=(getDouble() + getText());
        }

        return arr;
    }

    /*
     * Generate @String LinkedList
     * Parameters @int size of List
     * Return LinkedList
     * */
    public LinkedList getDataLinkedList(int size) {
        System.out.println("Linked List size of " + size + " was generated.");
        LinkedList<String> arr = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            arr.add(getDouble() + getText());
        }
        return arr;
    }

}
