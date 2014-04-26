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
    
    public boolean addShip(String topLeft, boolean vertical, int size, Ship s)
    {
        Character x = topLeft.charAt(0);
        Integer y = Integer.getInteger(topLeft.substring(1));
        
        if(!this.spaces.containsKey(topLeft))
        {
            return false;
        }            
        if(x + size > 'J')
        {
            return false;
        }
        if(y + size > 10)
        {
            return false;
        }
        
        //If vertical
        if(vertical)
        {
            for(int i = y; i < y + size; i++)
            {
                this.getSpace(x, i).addShip(s);
            }
        }
        //Otherwise is horizontal
        else
        {
            for(char i = x; i < x + size; i++)
            {
                this.getSpace(i, y).addShip(s);
            }
        }
        
        return true;
    }
}
