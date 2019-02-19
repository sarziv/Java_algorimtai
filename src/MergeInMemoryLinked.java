import java.util.LinkedList;

public class MergeInMemoryLinked {

        node head = null;
        // node a,b;
        static class node
        {
            String val;
            node next;

            public node(String val)
            {
                this.val = val;
            }
        }

        node sortedMerge(node a, node b)
        {
            node result = null;
            /* Base cases */
            if (a == null)
                return b;
            if (b == null)
                return a;

            /* Pick either a or b, and recur */
            if (a.val.compareTo(b.val) < 0 )
            {
                result = a;
                result.next = sortedMerge(a.next, b);
            }
            else
            {
                result = b;
                result.next = sortedMerge(a, b.next);
            }
            return result;

        }

        node mergeSort(node h)
        {
            // Base case : if head is null
            if (h == null || h.next == null)
            {
                return h;
            }

            // get the middle of the list
            node middle = getMiddle(h);
            node nextofmiddle = middle.next;

            // set the next of middle node to null
            middle.next = null;

            // Apply mergeSort on left list
            node left = mergeSort(h);

            // Apply mergeSort on right list
            node right = mergeSort(nextofmiddle);

            // Merge the left and right lists
            node sortedlist = sortedMerge(left, right);
            return sortedlist;
        }

        // Utility function to get the middle of the linked list
        node getMiddle(node h)
        {
            //Base case
            if (h == null)
                return h;
            node fastptr = h.next;
            node slowptr = h;

            // Move fastptr by two and slow ptr by one
            // Finally slowptr will point to middle node
            while (fastptr != null)
            {
                fastptr = fastptr.next;
                if(fastptr!=null)
                {
                    slowptr = slowptr.next;
                    fastptr=fastptr.next;
                }
            }
            return slowptr;
        }

        void push(String new_data)
        {
            /* allocate node */
            node new_node = new node(new_data);

            /* link the old list off the new node */
            new_node.next = head;

            /* move the head to point to the new node */
            head = new_node;
        }

        // Utility function to print the linked list
        void printList(node headref)
        {
            while (headref != null)
            {
                System.out.print(headref.val + " ");
                headref = headref.next;
            }
        }

        public static void main(String[] args)
        {
            int size = 1000;
            MergeInMemoryLinked li = new MergeInMemoryLinked();
            Generate gen = new Generate();

            LinkedList<String> GenList = gen.getDataLinkedList(size);

            for(int i=0;i < size;i++)
            {
                li.push(GenList.get(i));
            }

            // Apply merge Sort
            long startTime = System.currentTimeMillis();
            li.head = li.mergeSort(li.head);
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println(elapsedTime + " Milliseconds.");
            System.out.print("Sorted Linked List is: \n");
            li.printList(li.head);
        }
    }


