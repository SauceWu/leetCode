import java.util.LinkedList;
import java.util.List;

/**
 * @author sauceWu .
 * @since 2018/1/31 17:49
 */

class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
//        冒泡还是有点慢 然而懒得换 略略略
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length - 1; j++) {
                if (people[j][0] < people[j + 1][0] || (people[j][0] == people[j + 1][0] && people[j][1] > people[j + 1][1])) {
                    int[] tmp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = tmp;
                }
            }
        }
//        链表插入快
        List<int[]> res = new LinkedList<>();
        for (int i = 0; i < people.length; i++) {
            res.add(people[i][1], people[i]);
        }
        return res.toArray(new int[people.length][]);
    }


}
