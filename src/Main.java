public class Main {
    /*
     * Static test for mergeSort
     * */
    private static void test() {
        MergeInMemoryTest test = new MergeInMemoryTest();
        test.TestAssert();
    }

    /*
     * MergeSortArray
     * */
    private static void mergeSortArray(String[] Data) {
        MergeInMemoryArray Mima = new MergeInMemoryArray();
        Mima.MergeInMemory(Data);
    }

    /*
     * MergeSortLinkedList
     * */
    private static void mergeSortLinked(int size) {
        MergeInMemoryLinked Miml = new MergeInMemoryLinked();
        Miml.test1(size);
    }

    public static void main(String[] args) {
        test();
        Generate gen = new Generate();

        long startTime = System.currentTimeMillis();
        mergeSortArray(gen.getDataArrayList(1000000));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " Milliseconds.");
    }

}
