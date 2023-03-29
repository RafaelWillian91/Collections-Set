package exercise01Jogador;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Rank {

    //Foi passado um Comparator
    private final Set<Player> players = new TreeSet<>(new ComparatorScore());

    public  void addPlayer(Player player){
        players.add(player);
    }

    public  void printRankig(){
        int i = 1;
        for(Player player : players){
            System.out.printf("%02d. %-6s -> %d \n", i++, player.getName(), player.getScore());
        }
    }



}
