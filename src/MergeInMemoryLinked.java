import java.util.LinkedList;

public class MergeInMemoryLinked {

    public void test1(int size){
        Generate gen = new Generate();
        LinkedList<String> List = new LinkedList<>(gen.getDataLinkedList(size)) ;
        System.out.println(List);

    }
}

