
public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Generate gen = new Generate();
        System.out.println(gen.getDataLinkedList(6));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime+" Milliseconds");
    }


}
