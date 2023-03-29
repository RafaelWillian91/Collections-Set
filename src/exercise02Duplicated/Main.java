package exercise02Duplicated;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Arroz");
        list.add("Feijão");//
        list.add("Arroz");//
        list.add("Carne");
        list.add("Arroz");//
        list.add("Frango");//
        list.add("Frango");
        list.add("Queijo");
        list.add("Linguiça");
        list.add("Linguiça");

        singleList(list);

        for (var item : list) {
            System.out.println(item);
        }



    }
    
    private static void singleList(List list){

       Set<String > set  = new LinkedHashSet<>(list);
       list.clear();
       list.addAll(set);
       

    }
}
