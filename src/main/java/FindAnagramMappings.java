/**
 * @author sauceWu .
 * @since 2018/1/26 12:13
 */

class FindAnagramMappings {


    public  int[] anagramMappings(int[] A, int[] B) {
        int result[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            for (int j = 0; j < B.length; j++) {
                if (a == B[j]) {
                    result[i] = j;
                    continue;
                }
            }

        }
        return result;
    }
}
