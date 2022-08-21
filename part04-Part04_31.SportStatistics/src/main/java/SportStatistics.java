
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int numberOfGames = 0;
        int wins = 0;

        try (Scanner reader = new Scanner(Paths.get(fileName))) {

            while (reader.hasNextLine()) {

                String info = reader.nextLine();
                String[] matchInfo = info.split(",");

                if (teamIsPlaying(team, matchInfo)) {
                  numberOfGames++;  
                }

                if (findWin(team, matchInfo)) {
                    wins++;
                }                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (numberOfGames - wins));

    }

    public static boolean teamIsPlaying(String team, String[] matchInfo){
        String homeTeam = matchInfo[0];
        String visitingTeam = matchInfo[1];

        boolean counter = false;

        if (homeTeam.equals(team) || visitingTeam.equals(team)) {
            counter = true;
        }

        return counter;
    }

    public static boolean findWin(String team, String[] matchInfo) {
        
        boolean win = false;

        String homeTeam = matchInfo[0];
        String visitingTeam = matchInfo[1];
        int homePoints = Integer.valueOf(matchInfo[2]);
        int visitingPoints = Integer.valueOf(matchInfo[3]);

        if (homeTeam.equals(team)) {
            if (homePoints > visitingPoints) {
                win = true;
            }            
        }

        if (visitingTeam.equals(team)) {
            if (visitingPoints > homePoints) {
                win = true;
            }            
        }

        return win;
    }
}