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
        MergeInMemoryArray Mim = new MergeInMemoryArray();
        Mim.MergeInMemory(size);
    }

    public static void main(String[] args) {
        test();
        long startTime = System.currentTimeMillis();
        mergeSort(10);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " Milliseconds.");
    }

}
