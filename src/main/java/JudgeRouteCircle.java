/**
 * @author sauceWu .
 * @since 2018/1/26 12:08
 */

class JudgeRouteCircle {


    public  boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] move = moves.toCharArray();
        for (char ca : move) {
            switch (ca) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x++;
                    break;
                case 'R':
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
