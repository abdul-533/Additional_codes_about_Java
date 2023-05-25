package _08_Generic;

public class _01_Main_class {
    public static void main(String[] args) {
        //Generic classes encapsulate operations that are not specific to a particular data type.
        // The most common use for generic classes is with collections like linked lists,
        // hash tables, stacks, queues, trees, and so on

        Generic_01<Integer> g1 = new Generic_01(10);

        Generic_01<String> g2 = new Generic_01<>("Hello world");

        System.out.println("g1 = " + g1);
        System.out.println("g2 = " + g2);


        Integer[] for_g = {1, 2, 3, 4, 5, 6};
        String[] for_g_St = {"Hello", "How do you do", "and end"};

        Generic_Method(for_g);
        Generic_Method(for_g_St);


    }

    public static <G> void Generic_Method(G[] object) {

        for (G obj : object) {
            System.out.println("obj = " + obj);


        }
    }
}
