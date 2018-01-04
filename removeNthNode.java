class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode sp,fp,prev;
        sp =head;
        fp=head;
        int count =0;
        if(head == null || head.next ==null)
            return null;
        while(count!=n)
        {
            fp=fp.next;

         count++;
        }
        prev =sp;
        while(fp!=null )
        {   prev =sp;
            sp=sp.next;
            fp=fp.next;
        }
        if(sp==head)
            head=head.next;

        prev.next = sp.next;

        return head;

    }
}
