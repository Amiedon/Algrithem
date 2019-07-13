package Link;

/**
 * Created by Amie on 2017/6/7.
 */
public class ChkInterSection_all {
    public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1)
    {
        ListNode loopNode1 = chkLoop(head1);
        ListNode loopNode2 = chkLoop(head2);
        if ((loopNode1 == null && loopNode2 != null) || (loopNode1 !=null && loopNode2 == null) ) return false;
        else if (loopNode1 == null && loopNode2 ==null)
            return ChekIntersect.chkIntersect(loopNode1,loopNode2);
        else
            return ChkIntersection.chkInter(loopNode1,loopNode2,adjust0, adjust1);
    }

    private ListNode chkLoop(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        fast = head;
        while (fast!=slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
