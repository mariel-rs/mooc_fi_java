public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public Game(String home, String visiting, int homePts, int visitingPts) {
        this.homeTeam = home;
        this.visitingTeam = visiting;
        this.homePoints = homePts;
        this.visitingPoints = visitingPts;
    }

    public String getHomeTeam() {
        return this.homeTeam;    
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public boolean winner(String team) {

        if (team.equals(this.homeTeam) && this.homePoints > this.visitingPoints) {
            return true;
        }
        else if (team.equals(this.visitingTeam) && this.visitingPoints > this.homePoints) {
            return true;
        }

        return false;
    }
}