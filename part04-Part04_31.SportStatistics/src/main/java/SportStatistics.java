
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

        // Bring the input file
        ArrayList<Game> allGames = getGamesFromFile(fileName);

        // Get matches where the team plays
        ArrayList<Game> teamGames = new ArrayList<>();

        for (Game game : allGames) {
            
            if (team.equals(game.getHomeTeam()) || 
            team.equals(game.getVisitingTeam())) {
                
                teamGames.add(game);
            }
        }

        // Find out the times the team won a match
        int wins = 0;

        for (Game game : teamGames) {
            
            if (game.winner(team)) {
                wins++;
            }
        }

        System.out.println("Games: " + teamGames.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (teamGames.size() - wins));

    }

    public static ArrayList<Game> getGamesFromFile(String fileName) {
        
        /* This method reads the input file and processes it as an arraylist */
        
        ArrayList<Game> games = new ArrayList<>();
     
        try (Scanner inputFile = new Scanner(Paths.get(fileName))) {
            
            while (inputFile.hasNextLine()) {
                
                String input = inputFile.nextLine();
                String[] matchInfo = input.split(",");

                String homeTeam = matchInfo[0];
                String visitingTeam = matchInfo[1];
                int homePts = Integer.valueOf(matchInfo[2]);
                int visitingPts = Integer.valueOf(matchInfo[3]);

                games.add(new Game(homeTeam, visitingTeam, homePts, visitingPts));

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return games;
    }
}