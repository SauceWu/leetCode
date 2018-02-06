package sql;

/**
 * @author sauceWu .
 * @since 2018/1/26 12:02
 */

class BigCountries {

    String sql="select name,population,area from world where population > 25000000  or area > 3000000";

}
