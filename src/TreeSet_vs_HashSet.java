import java.net.Inet4Address;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_vs_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(111);
        set.add(3232);
        set.add(35);
        set.add(55);
        set.add(386);
        set.add(853);
        System.out.println("HashSet elements: "+set); //duplicate was removed

        TreeSet<Integer> tree=new TreeSet<Integer>();
        tree.add(111);
        tree.add(3232);
        tree.add(35);
        tree.add(55);
        tree.add(386);
        tree.add(853);
        Iterator<Integer> itr=tree.iterator();
        System.out.print("TreeSet elements: ");
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
