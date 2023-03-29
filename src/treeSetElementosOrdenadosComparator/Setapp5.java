package treeSetElementosOrdenadosComparator;

import treeSetElementosOrdenados.AccountOrderComparator;

import java.util.Set;
import java.util.TreeSet;

public class Setapp5 {

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
        Set<AccountOrderComparator> treeset2 = new TreeSet<>(new ComparatorBalance());

        treeset2.add(new AccountOrderComparator("123", 1000));
        treeset2.add(new AccountOrderComparator("1423", 3000));
        treeset2.add(new AccountOrderComparator("121", 5000));
        treeset2.add(new AccountOrderComparator("352", 1500));

        for (AccountOrderComparator accountOrderComparator : treeset2) {

            System.out.println(accountOrderComparator);
        }

    }

}
