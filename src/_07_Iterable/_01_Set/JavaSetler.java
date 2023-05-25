package _07_Iterable._01_Set;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class JavaSetler {
    public static void main(String[] args) {
        // HashSet<>
        //LinkenHashSet<>
        //TreeSet<>


        HashSet h=new HashSet<>();
        h.add("Salam");
        h.add(12);
        h.add(true);
        h.add(0.001);
        h.add(null);

        System.out.println("h = " + h.clone());
        HashSet m=new HashSet<>();
        m.add("saqol");
        m.add(14);
        m.add(12);
        m.add(12);
        System.out.print("m = " + m+"<>\n");

        

        h.remove(1);
        System.out.println("m = " + h);
        
        HashSet<Integer> a=new HashSet<>(Arrays.asList(1,2,3,4));
        System.out.println("a = " + a);
        Collections.addAll(h,1,2,3,"a");

        Iterator itr= h.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ,");
            
        }
        System.out.println();

        h.forEach(item-> System.out.print("item = " + item+",:"));
        for (Object y : a)
            System.out.println("y = " + y);
       




    }
}
