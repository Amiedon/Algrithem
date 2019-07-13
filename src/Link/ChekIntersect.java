package Link;

/**
 * Created by Amie on 2017/6/7.
 */
public class ChekIntersect {
    public static boolean chkIntersect(ListNode headA, ListNode headB){
        if (headA == null || headB == null) return false;
        ListNode cur1 = headA;
        while (cur1.next!=null)
        {
            cur1 = cur1.next;
        }
        ListNode cur2 = headB;
        while (cur2.next!=null)
            cur2 = cur2.next;
        if (cur1 ==cur2) return true;
        return false;
    }
}
