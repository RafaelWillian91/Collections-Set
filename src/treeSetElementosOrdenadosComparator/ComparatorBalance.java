package treeSetElementosOrdenadosComparator;

import treeSetElementosOrdenados.AccountOrderComparator;

import java.util.Comparator;

public class ComparatorBalance implements Comparator <AccountOrderComparator> {
    @Override
    public int compare(AccountOrderComparator o1, AccountOrderComparator o2) {
        return -Double.valueOf(o1.getBalance()).compareTo(o2.getBalance());
    }
}
