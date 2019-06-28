import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Player> players = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String a;
        do {
            System.out.println("podaj wynik kolejnego gracza: wpisz imie, nazwisko, wiek, ranking, punkty lub stop");
            a = scan.nextLine();

            if (!a.equals("stop")) {
                players.add(new Player(a, scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
                scan.nextLine();
            }

        } while (!a.equals("stop"));
        Collections.sort(players);
        System.out.println(players);
        //zapis
        FileWriter fileWriter=new FileWriter("plik.txt", true);
        BufferedWriter bfw= new BufferedWriter(fileWriter);
        bfw.write(players.toString());
        bfw.close();
    }
}
