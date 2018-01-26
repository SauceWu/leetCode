package sql;

/**
 * @author sauceWu .
 * @since 2018/1/26 12:03
 */

class SwapSalary {
    public String sql="update salary set sex= ( case when sex='f' then 'm' when sex = 'm' then 'f' end);";
}
