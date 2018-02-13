/**
 * @author sauceWu .
 * @since 2018/2/13 16:41
 */

class SingleNumber {
//    N1 ^ N1 ^ N2 ^ N2 ^…^ Nx ^ Nx ^ N
//
//= (N1^N1) ^ (N2^N2) ^…^ (Nx^Nx) ^ N
//
//= 0 ^ 0 ^ …^ 0 ^ N
//
//= N
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
