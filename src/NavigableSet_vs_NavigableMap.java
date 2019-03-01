import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class NavigableSet_vs_NavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
        nm.put("Cat", 8);
        nm.put("Lamb", 9);
        nm.put("Python", 10);
        nm.put("Tiger", 5);
        nm.put("Bear", 6);
        nm.put("Dog", 8);

        System.out.printf("Descending Set  : %s%n", nm.descendingKeySet());
        System.out.printf("Last Key : %s%n", nm.lastKey());
        System.out.printf("First Key : %s%n", nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n", nm.descendingMap());

        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(10);
        ns.add(11);
        ns.add(12);
        ns.add(31);
        ns.add(44);
        ns.add(51);
        ns.add(61);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = ns.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order NavigableSet: " + ns);
        System.out.println("Reverse order NavigableSet: " + reverseNs);
    }
}
