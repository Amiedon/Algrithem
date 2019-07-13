package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class Duplicate {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers.length<=0) {
            duplication[0] = -1;
            return false;
        }
        int [] dd = new int[length];
        for (int i=0;i<length;i++){
            dd[numbers[i]]++;
            if (dd[numbers[i]]>1){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[] num = {2, 3, 2, 4, 5, 1, 2};
        int[] num = {};
        int[] dd = new int[2];
        System.out.println(Duplicate.duplicate(num, num.length, dd));
        System.out.println(dd[0]);
    }
}
