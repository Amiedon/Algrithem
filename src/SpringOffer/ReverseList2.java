package SpringOffer;

/**
 * Created by Amie on 2019/1/9.
 */
public class ReverseList2 {
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while (head !=null){
            pre = head.next;
            head.next = next;
            next = head;
            head = pre;
        }
        return next;
    }
}
