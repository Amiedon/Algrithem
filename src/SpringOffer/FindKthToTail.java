package SpringOffer;

/**
 * Created by Amie on 2019/1/9.
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k){
        if (head == null || k<0)
            return null;
        ListNode p = head;
        ListNode l = head;
        for (int i=1;i<k;i++){
            if (p.next!=null)
                p = p.next;
            else
                return null;
        }
        while (p.next!=null){
            p = p.next;
            l = l.next;
        }
        return l;
    }
}
