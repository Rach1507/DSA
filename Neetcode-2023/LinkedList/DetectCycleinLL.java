import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


// MISTAKES :
// Forgot edge case : head is null , fast is null 
// Forgot to return false 

public class DetectCycleinLL {


    public boolean hasCycle(ListNode head) {

        if (head == null)
            return false;

        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null ) {
            if (slow == fast)
                return true;

            fast = fast.next.next;
            slow = slow.next;
        }

        return false;

    }


    public boolean hasCycleBF(ListNode head) {

        if (head == null)
            return false;

        HashMap<ListNode, Boolean> visited = new HashMap<>();
        visited.put(head, true);

        while (head.next != null) {
            if (visited.containsKey(head.next))
                return true;

            head = head.next;
            visited.put(head, true);

        }

        return false;
    }
}