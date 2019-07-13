package SpringOffer;

/**
 * Created by Amie on 2019/1/8.
 */
public class JumpFloor {
    public int JumpFloor(int target){
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        return JumpFloor(target-1) + JumpFloor(target-2);
    }

    public static void main(String[] args) {
        System.out.println(new JumpFloor().JumpFloor(3));
    }
}
