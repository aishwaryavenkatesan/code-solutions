import java.util.HashSet;
import java.util.Set;

public class deleteNodesFromLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        Set<Integer> digits = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++)
        {
            digits.add(nums[i]);
        }

        ListNode res = new ListNode();
        ListNode temp = new ListNode();
        temp = res;
        ListNode curr = head;


        while(curr != null)
        {
            if(!(digits.contains(curr.val)))
            {
                res.next = new ListNode(curr.val);
                res = res.next;
                curr = curr.next;   
            }

            else
            {
                curr = curr.next;
            }

        }


        return temp.next;
    }

}
