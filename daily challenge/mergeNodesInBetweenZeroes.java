public class mergeNodesInBetweenZeroes {

    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        public ListNode mergeNodes(ListNode head) {
            
            ListNode res = new ListNode();
            ListNode p1 = res;
            int sum = 0;
    
            ListNode curr = head.next;
    
            while(curr!= null)
            {
                while(curr.val != 0)
                {
                    sum = sum + curr.val;
                    curr = curr.next;
                }
    
                ListNode temp = new ListNode(sum);
                p1.next = temp;
                p1 = p1.next;
                sum = 0;
                curr = curr.next;
            }
    
        p1.next = null;
        return res.next;
        
    
    }
}
