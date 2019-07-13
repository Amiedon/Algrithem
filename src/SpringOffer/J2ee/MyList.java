package SpringOffer.J2ee;

import Link.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amie on 2019/1/22.
 */
public class MyList {
    private static List<String> list = new ArrayList<>();

    public static void add(){
        list.add("anything");
    }

    public static int size(){
        return list.size();
    }
}
