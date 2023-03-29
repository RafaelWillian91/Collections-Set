package exercise01Jogador;

import java.util.Comparator;

public class ComparatorScore implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return -Integer.valueOf(o1.getScore()).compareTo(o2.getScore());
    }
}
