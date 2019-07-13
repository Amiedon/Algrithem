package JZOffer;

/**
 * Created by Amie on 2018/3/10.
 */
public class FindNums {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length<=0)
            return;
        int temp = 0;
        for (int i=0;i<array.length;i++){
            temp^= array[i];
        }
        int index = findFirstBit1(temp);
        for (int i=0;i<array.length;i++){
            if (isBit1(array[i], index))
                num1[0]^=array[i];
            else
                num2[0]^=array[i];
        }
    }

    public int findFirstBit1(int num){
        int bitIndex = 0;
        while (((num & 1) !=1) && (bitIndex < 8*4)){
            num = num >>1;
            bitIndex++;
        }
        return bitIndex;
    }

    public boolean isBit1(int num, int index){
        num = num >>index;
        return (num&1) == 1;
    }
}
