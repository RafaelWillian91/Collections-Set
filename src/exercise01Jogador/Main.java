package exercise01Jogador;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Rafael", 200);
        Player p2 = new Player("Pedro", 40);
        Player p3 = new Player("Paulo", 300);
        Player p4 = new Player("Maria", 900);
        Player p5 = new Player("Joana", 600);
        Player p6 = new Player("Paulo", 300);
        Player p7 = new Player("Jorge", 500);

        Rank r1 = new Rank();

        r1.addPlayer(p1);
        r1.addPlayer(p2);
        r1.addPlayer(p3);
        r1.addPlayer(p4);
        r1.addPlayer(p5);
        r1.addPlayer(p6);
        r1.addPlayer(p7);

        r1.printRankig();

    }

}
