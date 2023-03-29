package equalsAndHashCodesPart01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setapp2 {

    public static void main(String[] args) {

        Account acc1 = new Account("123", 3000);
        Account acc2 = new Account("564", 5000);
        Account acc3 = new Account("564", 5000);

        //Equals e HashCode ensinam o java que ele deve comparar a igualdade dentro de cada elemento.
        //Por isso  acc3 não é adicionado. Senao o Java usa equals de classe object que compara referencia de memoria
        //Se na minha aplicacao faz sentido contas iguais com números iguais (dados internos do objeto) serem iguais
        //Ensinamos o java com equals e HashCode sobrescrito na classe.
        var accs = new HashSet<Account>();//Set.of assim como List.of cria um Conjunto (Set) imutável.
        accs.add(acc1);
        accs.add(acc2);
        accs.add(acc3);

        for(Account c : accs){
            System.out.println(c);
        }

        System.out.println(accs.contains(acc1));
        System.out.println(accs.contains(acc2));
        //Apesar de ac3 não ter sido adicionado o java olha dentro do objeto e verifica que os dados dele jão existem
        System.out.println(accs.contains(acc3));



    }
}
