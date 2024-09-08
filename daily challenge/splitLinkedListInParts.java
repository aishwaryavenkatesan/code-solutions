public class splitLinkedListInParts {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        public ListNode[] splitListToParts(ListNode head, int k) {
    
            ListNode temp = head;
            ListNode[] res = new ListNode[k];
            int n = 0;
            int count = 0;
    
            if(head == null)
            return res;
    
            ListNode prev = head;
            ListNode curr = head.next;
    
            while(temp != null)
            {
                n++;
                temp = temp.next;
            }
    
            if( n < k)
            {
                while(prev!= null)
                {
                    curr = prev.next;
                    prev.next = null;
                    res[count++] = prev;
                    prev = curr;
                }
    
                for(int i = count; i < k; i++)
                {
                    res[i] = null;
                }
                return res;
            }
    
            
            int q = n/k;
            int rem = n % k;
            int tc = q + 1;
    
    
            prev = head;
            while(prev!= null)
            {
                curr = prev;
                tc = q + 1;
                while(rem > 0 && tc > 1)
                {
                    prev = prev.next;
                    tc--;
                }
    
                if(rem <= 0)
                {
                    tc = q;
                    while(tc > 1)
                    {
                        prev = prev.next;
                        tc--;
                    }
                }
    
    
                ListNode t = prev.next;
                prev.next = null;
                res[count++] = curr;
                prev = t;
                curr = t;
                rem--;
    
            }
    
            return res;
        }
    
}
