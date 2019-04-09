import java.util.HashSet;
import java.util.Set;

/**
 * @author sauce
 * @since 2018/12/26
 */
public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] emailFiler = email.split("@");
            emailFiler[0] = emailFiler[0].replace(".", "").split("\\+")[0];
            set.add(emailFiler[0]+emailFiler[1]);
        }
        return set.size();
    }
}
