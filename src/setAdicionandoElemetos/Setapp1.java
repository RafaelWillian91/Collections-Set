package setAdicionandoElemetos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setapp1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");

        //Primeira Caracteristica do HashSet, não garante a ordem de inserção. Tem algoritmo de espalhamento
        for(String s : set){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------");

        //Caso voce precise ter um set, mas quer manater a ordem de inserção, voce usa um
        Set<String> set2 = new LinkedHashSet<String>();
        set2.add("A");
        set2.add("E");
        set2.add("I");
        set2.add("O");
        set2.add("U");
        //Set não duplica elementros
        set2.add("U");
        set2.add("U");
        //Ele não adiciona pq a Classe String já implementou equals e HashCode

        for(String s1 : set2){
            System.out.println(s1);
        }


       // set.size();Retorna o Tamanho
       // set.clear();Limpa o conjunto

        //Desvantagem do Set é que não existe um indice .get igual nas listas. Aqui no Set é um saco que recebe coisas

        //A Grande Vantagem está no fato de o Set buscar muito rápido as coisas.
        System.out.println(set.contains("A"));


        //Principais Desvantagens:
        //Nao aceita elementos Duplicados
        //Não tem indece para acesso

        //Vantagens:
        //A busca de um elemento é muito rápida



    }
}
