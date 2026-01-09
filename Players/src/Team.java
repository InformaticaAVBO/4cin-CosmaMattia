import java.util.ArrayList;

public class Team {
    
    private String nomeTeam;
    ArrayList<Player> players;
    public Team(String nomeTeam) {
        this.nomeTeam = nomeTeam;
        this.players = new ArrayList<>();
    }
    public void loadTeam() {
        // Carica i giocatori del team da file (da implementare)
    }
    public void saveTeam() {
        // Salva i giocatori del team su file (da implementare)
    }
    
}
