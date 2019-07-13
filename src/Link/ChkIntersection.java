package Link;

/**
 * Created by Amie on 2017/6/7.
 */
public class ChkIntersection {
    public static boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1)
    {
        ListNode p1 = find(head1);
        ListNode p2 = find(head2);
        if (p1 == p2) return true;
        ListNode cur = p1.next;
        while (p1!=cur)
        {
            if (cur == p2) return true;
            cur = cur.next;
        }
        return false;
    }

    private static ListNode find(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                break;
        }
        if (fast == null || fast.next == null) return null;
        fast = head;
        while (fast!=slow)
        {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
