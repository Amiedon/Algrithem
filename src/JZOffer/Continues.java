package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class Continues {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length<5)
            return false;
        int min = 14;
        int max = -1;
        int[] d = new int[14];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == 0)
                continue;
            d[numbers[i]]++;
            if (d[numbers[i]]>1)
                return false;
            if (numbers[i]>max)
                max = numbers[i];
            if (numbers[i]<min)
                min = numbers[i];
        }
        if (max-min<5)
            return true;
        return false;
    }
}
