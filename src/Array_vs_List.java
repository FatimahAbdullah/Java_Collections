import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Array_vs_List {
    public static void main(String[] args) {
        int arr[]=new int[10];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println("Traversing Array :");
        for (int i=0; i<10; i++){
            System.out.println(arr[i]);
        }

        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Traversing List :");
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
