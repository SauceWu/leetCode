

/**
 * @author sauceWu .
 * @since 2018/2/1 11:37
 */

class BattleshipsInABoard {
    public int countBattleships(char[][] board) {
        int c = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
//                X周边左上同时为。的时候 会有一个舰娘   主要是因为没有相邻的舰娘
                if (board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                    c++;
                }
            }
        }
        return c;
    }
}
