package bean;

/**
 * @author sauceWu .
 * @since 2018/2/13 17:05
 */

class Test {
    public static void main(String[] src) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (10 - i - j < 1)
                    continue;
                System.out.printf("[%d,%d,%d]\n", i, j, 10 - i - j);
            }
        }


    }

}
