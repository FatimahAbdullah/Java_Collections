import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet_vs_SortedSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Blue");
        set.add("Red");
        set.add("Yellow");
        set.add("Orange");
        set.add("Brown");
        set.add("Red"); //Adding duplicate
        System.out.println("List of elements: "+set); //duplicate was removed
        System.out.println("Set contains Orange or not: " + set.contains("Orange"));

        SortedSet set_sorted = new TreeSet();
        set_sorted.add("Blue");
        set_sorted.add("Red");
        set_sorted.add("Yellow");
        set_sorted.add("Orange");
        set_sorted.add("Brown");
        set_sorted.add("Red"); //Adding duplicate
        //Returns the first element
        System.out.println("The first element is given as: " + set_sorted.first());
        //Returns the last element
        System.out.println("The last element is given as: " + set_sorted.last());
    }
}
