package treeSetElementosOrdenados;

import java.util.Set;
import java.util.TreeSet;

public class Setapp4 {

    public static void main(String[] args) {

        //Elemento são adicionados de forma -> ordenadas <-
        Set<Integer> treeset = new TreeSet();
        treeset.add(1);
        treeset.add(4);
        treeset.add(3);
        treeset.add(2);

        //O TreeSet utiliza o Comparable de Integer, por isso tudo é ordenado.

        //Já imprime ordenado, pq Integer implemeta Comparable0
        System.out.println(treeset);
        //saida: 1,2,3,4


        //Para ordernar elementos de uma Classe do Tipo TreeSet ela deve implementar Comparable,
        // senão o TreeSet lança uma exceção
        Set<AccountOrder> treeset2 = new TreeSet<>();

        treeset2.add(new AccountOrder("123", 1000));
        treeset2.add(new AccountOrder("1423", 1000));
        treeset2.add(new AccountOrder("121", 1000));
        treeset2.add(new AccountOrder("352", 1000));

        for (AccountOrder accountOrder : treeset2) {

            System.out.println(accountOrder);
        }

    }

}
