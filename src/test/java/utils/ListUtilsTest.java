package utils;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-13
 */
public class ListUtilsTest {

    @Test
    public void list2String() {
        System.out.println(ListUtils.List2String(Arrays.asList(1,1,1,1)));
    }
}