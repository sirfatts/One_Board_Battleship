package Game.Objects;

import java.util.ArrayList;

public class Board {
    
    private ArrayList<ArrayList<Space>> spaces;
    
    public Board() {
        this.spaces = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            ArrayList<Space> tmpArray = new ArrayList<>();
            for(int j = 0; j < 10; j++)
            {
                Space tmpSpace = new Space(i, j);
                tmpArray.add(j, tmpSpace);
            }
            this.spaces.add(i, tmpArray);
        }
    }
    
    public Space getSpace(int x, int y)
    {
        if(x < this.spaces.size())
        {
            if(y < this.spaces.get(x).size()) {
                return this.spaces.get(x).get(y);
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
        
    }
    
    public Space getSpace(String xy)
    {
        if(xy.length() >= 2 && xy.length() <= 3)
        {
            int x = xy.charAt(0) - 65;
            int y = Integer.parseInt(xy.substring(1)) - 1;
            
            if(x < this.spaces.size())
            {
                if(y < this.spaces.get(x).size()) {
                    return this.spaces.get(x).get(y);
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
    
}
