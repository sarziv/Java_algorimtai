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
    private static void mergeSortArray(int size) {
        MergeInMemoryArray Mima = new MergeInMemoryArray();
        Mima.MergeInMemory(size);
    }
    private static void mergeSortLinked(int size) {
        MergeInMemoryLinked Miml = new MergeInMemoryLinked();
        Miml.test1(size);
    }

    public static void main(String[] args) {
        test();
        long startTime = System.currentTimeMillis();
        mergeSortLinked(10);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " Milliseconds.");
    }

}
