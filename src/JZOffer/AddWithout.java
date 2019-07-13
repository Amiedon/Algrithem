package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class AddWithout {
    public int add(int num1, int num2){
        int sum,carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }while (num2 !=0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new AddWithout().add(12, 3));
    }
}
