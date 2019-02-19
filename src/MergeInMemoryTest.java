public class MergeInMemoryTest extends MergeInMemoryArray {

    public void TestAssert() {
        String[] a = {
                "3.10113VGAL",
                "0.66197JLRU",
                "1.68535KWEL",
                "9.34175HGGU",
                "2.11581KZLN",
                "3.09456PFAW",
                "0.66535AAAA",
                "0.66535AAAC",
                "3.10113VGAL"};
        sort(a);
        String[] expectedArray = {
                "0.66197JLRU",
                "0.66535AAAA",
                "0.66535AAAC",
                "1.68535KWEL",
                "2.11581KZLN",
                "3.09456PFAW",
                "3.10113VGAL",
                "3.10113VGAL",
                "9.34175HGGU"};
        for (int j = 0; j < a.length; j++) {
            if (!a[j].equals(expectedArray[j])) {
                System.out.println("Test Error\n");
                System.out.println(a[j] + " and " + expectedArray[j] + " not equal");
                System.exit(1);
            }
        }
        System.out.println("Test successful.");
    }
}
