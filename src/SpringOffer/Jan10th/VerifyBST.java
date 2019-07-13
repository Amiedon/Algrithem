package SpringOffer.Jan10th;

/**
 * Created by Amie on 2019/1/10.
 */
public class VerifyBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return verify(sequence, 0, sequence.length-1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        if (start >= end)
            return true;
        int i = start;
        while (i < end && sequence[end] > sequence[i])
            i++;
        for (int j=i;j<=end;j++){
            if (sequence[j] < sequence[end])
                return false;
        }
        return verify(sequence, start, i-1) && verify(sequence, i, end-1);
    }

    public static void main(String[] args) {
        VerifyBST verifyBST = new VerifyBST();
        int[] num = {4, 8, 6, 12, 16, 14, 10};
        System.out.println(verifyBST.VerifySquenceOfBST(num));
    }
}
