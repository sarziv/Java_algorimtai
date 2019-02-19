import java.util.*;

public class Main {
    /*
     *Prints generated data example
     **/
    private static void print() {
        Generate gen = new Generate();
        System.out.println(gen.getDataArrayList(10));
    }
    /*
    * Static test for mergeSort
    * */
    private static void test() {
        MergeInMemoryTest test = new MergeInMemoryTest();
        test.TestAssert();
    }
    /*
    * MergeSort
    * */
    private static void mergeSort(int size) {
        MergeInMemory Mim = new MergeInMemory();
        Mim.MergeInMemory(size);
    }

    public static void main(String[] args) {
        test();
        long startTime = System.currentTimeMillis();
        mergeSort(10000000);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime+" Milliseconds.");
    }

}
