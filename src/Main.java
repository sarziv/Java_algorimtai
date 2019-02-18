import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static void sortTest(){
        Generate gen = new Generate();
        ArrayList data = gen.getDataArrayList(10000);
        Collections.sort(data);
        System.out.println(data);
    }

    public static void main(String[] args) {
    sortTest();
    }

}
