import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List_vs_Set {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Amir");
        al.add("Marriam");
        al.add("Bilal");
        al.add("Bilal");  //duplicate
        al.add("Zainab");

        System.out.println("List Elements: ");
        System.out.println(al);

        Set<String> set=new TreeSet<String>();
        set.add("Amir");
        set.add("Marriam");
        set.add("Bilal");
        set.add("Bilal"); //duplicate
        set.add("Zainab");
        System.out.println("Set Elements: ");
        System.out.println(set);

    }
}
