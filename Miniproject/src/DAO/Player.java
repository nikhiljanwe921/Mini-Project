package DAO;

public class Player {
    
    private int playerID;
    private String pName;
    private String PsurName;
    private String ability;
    private String position;
    private String teamName;
    private String teamGround;
    private String side;
    private String fullName;

    
    public Player() {
    }
    
    public Player(String fullName) {
        this.fullName=fullName;
    }

    public Player(String pName, String PsurName) {
        this.pName = pName;
        this.PsurName = PsurName;
    }

    public Player(int playerID,String PName, String PsurName, String ability,String position, String teamName,String ground,String fullName) {
        this.playerID = playerID;
        this.PsurName = PsurName;
        this.pName = PName;
        this.position = position;
        this.ability = ability;
        this.teamName = teamName;
        this.teamGround=ground;
        this.fullName=fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getTeamGround() {
        return teamGround;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeamGround(String teamGround) {
        this.teamGround = teamGround;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPsurName() {
        return PsurName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public void setPsurName(String PsurName) {
        this.PsurName = PsurName;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return getFullName();
//        return (getpName()+" "+getPsurName());
//        return "Player{" + "PlayerID=" + playerID + ", Name=" + pName + ", Surname=" + PsurName + ", Ability=" + ability + ", Team=" + teamName + '}';
    }   
    
    
    
    public String FullPlayerName() {
        return (getpName()+" "+getPsurName());
    }

    
    
}
