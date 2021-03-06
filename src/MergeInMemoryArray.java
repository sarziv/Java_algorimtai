import java.util.Arrays;

public class MergeInMemoryArray {

    public static void sort(String[] in) {
        if (in.length < 2) return; //do not need to sort
        int mid = in.length / 2;
        String left[] = new String[mid];
        String right[] = new String[in.length - mid];
        for (int i = 0; i < mid; i++) { //copy left
            left[i] = in[i];
        }
        for (int i = 0; i < in.length - mid; i++) { //copy right
            right[i] = in[mid + i];
        }
        sort(left);
        sort(right);
        merge(left, right, in);
    }

    private static void merge(String[] a, String[] b, String[] all) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) { //merge back
            if (a[i].compareTo(b[j]) < 0) {
                all[k] = a[i];
                i++;
            } else {
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < a.length) { //left remaining
            all[k++] = a[i++];
        }
        while (j < b.length) { //right remaining
            all[k++] = b[j++];
        }
    }

    public static void main(String[] args) {
        Generate gen = new Generate();
        String[] Data = gen.getDataArrayList(30000);
        System.out.println(Arrays.toString(Data));
        long startTime = System.currentTimeMillis();
        sort(Data);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime + " Milliseconds.");
        //Data output if needed
        for (int j = 0; j < Data.length; j++) {
            System.out.print(Data[j] + " ");
        }
    }
}

