public class Main {

    private static void printData(){
        Generate gen = new Generate();
        System.out.println(gen.getDataArrayList(0));
        System.out.println(gen.getDataLinkedList(10000));
    }
    private static void TimeCalc(){
        long startTime = System.currentTimeMillis();
        printData();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " Milliseconds");
    }

    public static void main(String[] args) {
    TimeCalc();
    }

}
