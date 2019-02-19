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
    * Static test
    * */
    private static void test() {
        MergeInMemoryTest test = new MergeInMemoryTest();
        test.TestAssert();
    }
    /*
    * MergeSort*/
    private static void mergeSort(int size) {
        MergeInMemory Mim = new MergeInMemory();
        Mim.MergeInMemory(size);
    }

    public static void main(String[] args) {
        test();
        mergeSort(1000000);
    }

}
