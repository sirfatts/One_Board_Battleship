package Game.Objects;

import java.util.HashMap;

public class Board {
    
    private HashMap<String, Space> spaces;
    
    public Board() {
        this.spaces = new HashMap<>();
        for(char x = 'A'; x <= 'J'; x++)
        {
            for(int y = 1; y <= 10; y++)
            {
                Space tmpSpace = new Space(x, y);
                this.spaces.put(Character.toString(x) + Integer.toString(y), tmpSpace);
            }
        }
    }
    
    public Space getSpace(char x, int y)
    {
        if(this.spaces.containsKey(Character.toString(x) + Integer.toString(y)))
        {
            return spaces.get(Character.toString(x) + Integer.toString(y));
        }
        else
        {
            return null;
        }
    }
    
    public Space getSpace(String xy)
    {
        if(this.spaces.containsKey(xy))
        {
            return spaces.get(xy);
        }
        else
        {
            return null;
        }
    }
    
}
