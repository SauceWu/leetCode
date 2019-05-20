package utils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author sauce
 * @since 2019-05-13
 */
public class ListUtils {
    public static String List2String(List list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if (o == null) {
                sb.append("null");
            }else {
                if (o instanceof List) {
                    sb.append(List2String((List) o));
                } else {
                    sb.append(o.toString());
                }
            }
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }

        return sb.append("]\n").toString();
    }

    public static String array2String(int[] list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.length; i++) {
            Object o = list[i];

            sb.append(o.toString());

            if (i < list.length - 1) {
                sb.append(",");
            }
        }
        return sb.append("]").toString();
    }
}
