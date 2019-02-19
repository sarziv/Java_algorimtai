import java.util.ArrayList;

public class MergeInMemory {

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

    public void MergeInMemory(int size) {
        Generate gen = new Generate();
        ArrayList<String> ArrayToString = gen.getDataArrayList(size);
        String[] a = ArrayToString.toArray(new String[ArrayToString.size()]);
        sort(a);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + "\n");
        }
    }

}

