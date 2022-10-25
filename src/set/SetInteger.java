package set;

import java.util.*;

public class SetInteger{

    private Set<Integer> integers = new HashSet<>();
    public void randomSetInteger() {
        for (int i = 1; i <= 20; i++) {
            integers.add((int) Math.floor(Math.random() * 1000));
        }
        for (Integer current : integers) {
            System.out.print(current.toString() + " / ");
        }
        System.out.println();
    }

    public void removeOddNumber() {
        integers.removeIf(i -> i % 2 != 0);
        System.out.println(integers);
    }
}
