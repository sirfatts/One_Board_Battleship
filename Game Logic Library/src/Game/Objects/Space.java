package Game.Objects;

import java.util.ArrayList;

public class Space {
    
    private char x;
    private int y;
    private ArrayList<Ship> ships;
    
    public Space()
    {
        this.x = 0;
        this.y = 0;
        this.ships = new ArrayList<>();
    }
    
    public Space(char x, int y)
    {
        this.x = x;
        this.y = y;
        this.ships = new ArrayList<>();
    }
    
    @Override
    public String toString()
    {
        return Character.toString(this.x) + Integer.toString(this.y);
    }
    
}