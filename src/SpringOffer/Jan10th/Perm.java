package SpringOffer.Jan10th;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Amie on 2019/1/10.
 */
public class Perm {
    public ArrayList<String> Permutation(String str){
        ArrayList<String> res = new ArrayList<>();
        if (str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(), 0, res);
            Collections.sort(res);
        }
        return res;
    }

    private void PermutationHelper(char[] chars, int i, ArrayList<String> res) {
        if (i == chars.length){
            String string = String.valueOf(chars);
            if (!res.contains(string)){
                res.add(string);
                System.out.println(string);
            }
        }
        else {
            for (int j = i;j<chars.length;j++){
                swap(chars, i, j);
                PermutationHelper(chars, i+1, res);
                swap(chars, i, j);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(new Perm().Permutation(str));
    }
}
