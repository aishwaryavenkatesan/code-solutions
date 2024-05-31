public class mergeLists {
    
     public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = new ListNode();
        ListNode res = head;


        if(list1==null && list2==null)
        return null;

        if(list1 == null)
        return list2;

        if(list2 == null)
        return list1;

        while(list1!= null && list2!= null)
        {
            if(list1.val < list2.val)
            {
               res.next = list1;
               list1 = list1.next;
            }

            else
            {
                res.next = list2;
                list2 = list2.next;
            }

            res = res.next;
        }

        res.next = list1!=null ? list1 : list2;

        return head.next;
    }
}
