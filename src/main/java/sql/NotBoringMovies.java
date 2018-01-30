package sql;

/**
 * @author sauceWu .
 * @since 2018/1/30 14:39
 */

class NotBoringMovies {
    public static final String sql="select * from cinema where id&1 and description != 'boring' order by rating desc";
}
