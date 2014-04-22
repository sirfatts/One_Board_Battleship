package Game.Objects;

import java.util.ArrayList;

public class Space {
    
    private int x;
    private int y;
    private ArrayList<Ship> ships;
    
    public Space()
    {
        this.x = 0;
        this.y = 0;
        this.ships = new ArrayList<>();
    }
    
    public Space(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.ships = new ArrayList<>();
    }
    
    @Override
    public String toString()
    {
        return Integer.toString(this.x) + Integer.toString(this.y);
    }
    
}