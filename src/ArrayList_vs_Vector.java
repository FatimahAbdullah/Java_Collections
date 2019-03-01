import java.util.*;

public class ArrayList_vs_Vector {
    public static void main(String[] args) {
        System.out.println("Using an ArrayList to add elements in the list and iterating through it");
        ArrayList<String> browsers = new ArrayList<String>();//creating an ArrayList
        browsers.add("Chrome");//adding object in ArrayList
        browsers.add("Firefox");
        browsers.add("Safari");
        browsers.add("Opera");

        //displaying elements using Iterator
        Iterator itr = browsers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\nUsing a Vector to add elements and enumerating through it");
        Vector<String> shoes = new Vector<String>();//creating vector
        shoes.addElement("Adidas");
        shoes.addElement("Nike");//method of Vector
        shoes.addElement("Reebok");
        shoes.addElement("Converse");
        //displaying elements using Enumeration
        Enumeration e = shoes.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
