package SpringOffer;

/**
 * Created by Amie on 2019/1/9.
 */
public class reOrderArray {
    public void reOrderArray(int [] num){
        if (num == null || num.length == 0)
            return;
        for (int i=0;i<num.length;i++){
            if (isEven(num[i])){ //num[i]是偶数
                for (int j=i+1;j<num.length;j++){
                    if (!isEven(num[j])){//num[j]是奇数
                        int temp = num[j];
                        for (int k=j-1;k>=i;k--){
                            num[k+1] = num[k];
                        }
                        num[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    public void reOrderArray2(int [] num){
        if (num == null || num.length == 0)
            return;
        for (int i=1;i<num.length;i++){
            int temp = num[i];
            if (temp%2 == 1){ //找到奇数
                for (int j=i;j>0;j--){
                    if (num[j-1] %2 == 0){
                        int t = num[j];
                        num[j] = num[j-1];
                        num[j-1] = t;
                    }
                }
            }
        }
    }

    public boolean isEven(int n){
        if (n%2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int []num = {3, 1, 4, 2, 6, 5, 7};
        new reOrderArray().reOrderArray2(num);
        System.out.println(num.toString());
    }
}
