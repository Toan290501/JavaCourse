package collections;

import java.util.*;

public class SetDemo {
    public static void showSetDemo() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);
    }
}
