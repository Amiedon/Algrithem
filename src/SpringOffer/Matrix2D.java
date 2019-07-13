package SpringOffer;

/**
 * Created by Amie on 2019/1/7.
 */
public class Matrix2D {
    public boolean Find(int target, int[][] array){
        int row = array.length;
        int col = array[0].length;
        int i=0;
        int j=col -1;
        while (j >=0 && i<row){
            if (array[i][j] == target)
                return true;
            else if (array[i][j] < target){
                i ++;
            }
            else
                j--;
        }
        return false;
    }
}
