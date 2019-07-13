package JZOffer;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/3/11.
 */
public class FindTwoNums {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> num = new ArrayList<>();
        if (array.length<=1)
            return num;
        int start = 0;
        int end = array.length-1;
        int cursum = 0;
        ArrayList<ArrayList<Integer>> twoNum = new ArrayList<>();
        while (start<end){
            cursum = array[start] + array[end];
            ArrayList<Integer> result = new ArrayList<>();
            if (cursum == sum){
                result.add(array[start]);
                result.add(array[end]);
                start++;
                end--;
                twoNum.add(result);
            }
            else if (cursum>sum){
                end--;
            }
            else
                start++;

        }
        int maxMul = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        for (int i=0;i<twoNum.size();i++){
            if ((twoNum.get(i).get(0) * twoNum.get(i).get(1))<maxMul){
                maxMul = (twoNum.get(i).get(0) * twoNum.get(i).get(1));
                num1 = twoNum.get(i).get(0);
                num2 = twoNum.get(i).get(1);
            }
        }
        if (num1 !=0 || num2!=0){
            num.add(num1);
            num.add(num2);
        }

        return  num;
    }

    public static void main(String[] args) {
        System.out.println(new FindTwoNums().FindNumbersWithSum(new int[]{1,2,4,7,11,15}, 15));
    }
}
