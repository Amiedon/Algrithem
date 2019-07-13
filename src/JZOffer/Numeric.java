package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class Numeric {
    public boolean isNumeric(char[] str){
        try {
            double dd = Double.parseDouble(String.valueOf(str));
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
