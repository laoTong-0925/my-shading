package org.tx.shading.shading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName : Test
 * @Description :
 * @Author :
 * @Date: 2020-07-10 12:03
 */
public class Test {
    private org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws InterruptedException {
//        int a[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int s1 = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                int height = Math.min(a[i], a[j]);
//                int square = height * (j - i);
//                s1 = Math.max(s1, square);
//            }
//        }
//        System.out.println(s1);
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < 10000000; i++) {
//            set.add(i);
//        }
        int i = 15 >> 1;
        System.out.println(i);
        System.out.println("end");
        TimeUnit.SECONDS.sleep(5);

        ConcurrentMap<String ,Integer> map = new ConcurrentHashMap<>();
        map.put("1", 1);
        map.put("1", 1);
        System.out.println();
    }
}
