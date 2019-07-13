package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class ReverseSentcnce {
    public void Reverse(char[] chars, int i, int j){
        while (i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }

    public char[] ReverseSen(char[] chars){
        Reverse(chars, 0, chars.length-1);
        int j=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i] == ' '){
                Reverse(chars, j, i-1);
                j = i+1;
            }
        }
        return chars;
    }

    public static void main(String[] args) {
//        char[] ttt = "hsjk".toCharArray();
//        new ReverseSentcnce().Reverse(ttt, 0, ttt.length-1);
//        System.out.println(ttt);
        System.out.println(new ReverseSentcnce().ReverseSen("i am you.".toCharArray()));
    }
}
