package JZOffer;

/**
 * Created by Amie on 2018/3/11.
 */
public class Sum_Solution {
    public int sum_solution(int n){
        int ans = n;
        boolean flag = (ans>0) &&( (ans+=sum_solution(n-1))>0);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Sum_Solution().sum_solution(100));
    }
}
