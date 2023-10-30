import java.util.HashMap;

public class DetectCyleAndReturnIndex {

    public ListNode detectCycle(ListNode head) {

        if (head == null)
            return null;
        int index = 0;

        HashMap<ListNode, Integer> visited = new HashMap<>();
        visited.put(head, index);

        while (head.next != null) {
            if (visited.containsKey(head.next))
                return head.next;
            index++;
            head = head.next;
            visited.put(head, index);

        }

        return null;

    }

}
