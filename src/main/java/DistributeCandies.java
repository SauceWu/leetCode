import java.util.HashSet;

/**
 * @author sauceWu .
 * @since 2018/1/30 16:34
 */

class DistributeCandies {
    public int distributeCandies(int[] candies) {
        int max = candies.length / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int candy : candies) {
            set.add(candy);
        }
        return max < set.size() ? max : set.size();
    }
}
