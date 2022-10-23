package hashmap;

import java.util.HashMap;

public class Directory {
    HashMap<String, String> directory = new HashMap<>();

    public void addDirectory(String name, String phoneNumber) {
        directory.put(name, phoneNumber);
    }

    public void printAllDirectory() {
        System.out.println(directory.keySet());
        System.out.println(directory.values());
    }
}
