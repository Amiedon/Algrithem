package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class ReverseWords {
    public void Reverse(char[] chars, int i, int j){
        while (i<j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
    public String LeftRotateString(String str,int n) {
        if (str.length()==0 || n<0)
            return "";
        char[] chars = str.toCharArray();
        Reverse(chars, 0, n-1);
        Reverse(chars, n, chars.length-1);
        Reverse(chars ,0, chars.length-1);
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWords().LeftRotateString("abcdefg", 2));
    }
}
