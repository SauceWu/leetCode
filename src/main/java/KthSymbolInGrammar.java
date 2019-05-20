/**
 * @author sauce
 * @since 2019-05-15
 */
public class KthSymbolInGrammar {


    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }

        int total = (int)Math.pow(2, N - 1);
        if (K-1 < total/2) {
            return kthGrammar(N-1, K);
        } else {
            return 1-kthGrammar(N-1, K-total/2);
        }

    }

}
