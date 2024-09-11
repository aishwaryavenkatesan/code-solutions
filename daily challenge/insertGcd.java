public class insertGcd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        public ListNode insertGreatestCommonDivisors(ListNode head) {
    
            if(head.next == null)
            return head;
    
            ListNode res = head;
            ListNode newList = res;
    
            while(res!= null && res.next!= null)
            {
                ListNode t1 = res;
                ListNode t2 = res.next;
                int element = gcd(t1.val, t2.val);
    
                ListNode gcdNode = new ListNode(element);
    
                t1.next = gcdNode;
                gcdNode.next = t2;
                res = t2;
    
            }
    
            return newList;
            
        }
    
        public int gcd(int a , int b)
        {
            if(b == 0)
            return a;
    
            else
            return gcd(b, Math.abs(a - b));
        }
    
}
