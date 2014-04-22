package Game.Objects;

public class Ship {
    
    private String player;
    private String type;
    private int health;
    
    public Ship()
    {
        this.player = "";
        this.type = "";
        this.health = 0;
    }
    
    public Ship(String player, String type, int health)
    {
        this.player = player;
        this.type = type;
        this.health = health;
    }
    
}
