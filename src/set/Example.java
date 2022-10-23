package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

    private Set<String> tasks = new HashSet<>();

    public void generateTask() {
        for (int first = 1; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                String s = first + " * " + second;
                tasks.add(s);
            }
        }
        Iterator<String> itr = tasks.iterator();
        for (int i = 0; i < 15; i++) {
            System.out.println(itr.next());
        }
    }
}

