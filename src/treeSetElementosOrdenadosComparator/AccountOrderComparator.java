package treeSetElementosOrdenados;

import java.util.Objects;

public class AccountOrderComparator implements Comparable<AccountOrderComparator>{

    private final String number;
    private final double balance;

    public AccountOrderComparator(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    //Equals e HashCode ensinam o java que ele deve comparar a igualdade dentro de cada elemento.
    //O equals tem que considerar os atributos de igualdade que voce deseja comparar


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountOrderComparator that = (AccountOrderComparator) o;
        return Objects.equals(number, that.number);
    }

    //HashCode está muito ligado ao equals. Quando implementa um implementa o outro


    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public int compareTo(AccountOrderComparator o) {
        return number.compareTo(o.number);
    }
    //Em HashCode não pode colocar numeros randomicos no retorno, pq o java vai adicionar em baldes diferentes
    //Então o set vai acabar permitindo elementos duplicados.
    //Vira um comportamento imprevisível. é melhor usar return Objects.hash(number, balance);
}
