package SpringOffer;


import java.util.ArrayList;

/**
 * Created by Amie on 2019/1/7.
 */
public class reVerseList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null)
            return res;
        while (listNode.next!=null){
            res.add(listNode.val);
            listNode = listNode.next;
        }
        res.add(listNode.val);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=res.size()-1;i>=0;i--){
            result.add(res.get(i));
        }
        return result;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode!=null){
            if (listNode.next!=null){
                res = printListFromTailToHead2(listNode.next);
            }
            res.add(listNode.val);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        System.out.println(new reVerseList().printListFromTailToHead2(listNode));
    }
}


class ListNode{
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}
