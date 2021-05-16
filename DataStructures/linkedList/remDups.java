import java.util.*;



public class remDups {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

//Removve dups from sorted ll

    public Node removeDuplicate(Node head) {
        Node node = head;

        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(node.data, 0);

        while (node.next != null) {
            // node=node.next;
            if (hm.containsKey(node.next.data))
                node = removeNode(node);

            else {
                hm.put(node.next.data, 0);

                node = node.next;
            }
        }

        return head;

        // Your code here
    }

    public Node removeNode(Node dupNode) {
        dupNode.next = dupNode.next.next;
        return dupNode;
    }

    Node removeDuplicates(Node head) {
        // Your code here
        Node curr = head;

        while (curr.next != null)

        {
            if (curr.next.data == curr.data) {
                remove(curr);

            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    void remove(Node node) {

        Node dupNode = node.next;
        node.next = dupNode.next;
        dupNode.next = null;
    }
       
        
       
       static Node removeDuplicateRecursive(Node head)
{
    /* Pointer to store the pointer
    of a node to be deleted*/
    Node to_free;
     
    /* do nothing if the list is empty */
    if (head == null)
        return null;
 
    /* Traverse the list till last node */
    if (head.next != null)
    {
         
        /* Compare head node with next node */
        if (head.data == head.next.data)
        {
            /* The sequence of steps is important.
            to_free pointer stores the next of head
            pointer which is to be deleted.*/
            to_free = head.next;
            head.next = head.next.next;
            removeDuplicateRecursive(head);
        }
         
        /* This is tricky: only advance if no deletion */
        else
        {
            removeDuplicateRecursive(head.next);
        }
    }
    return head;
} 
}
