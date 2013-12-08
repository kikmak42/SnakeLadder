/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

/**
 *
 * @author acer
 */
public class Position implements Comparable<Position> {
    private int x,y;
    public Position()
    {
        x=0;
        y=0;
    }
    public Position(int iD)
    {
        iD=63-iD;
        if((iD/8)%2==0)
        {
            x=iD%8;
            y=iD/8;
        }
        else
        {
            x=7-iD%8;
            y=iD/8;
        }
    }
    public Position(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.x=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getID()
    {
        if(y%2==0)
        {
            return 63-y*8-x;
        }
        else
        {
            return 63-y*8-7+x;
        }
    }
    @Override
    public int compareTo(Position o) {
        if(y==o.y&&x==o.x)
            return 0;
        if(y>o.y)
        {
            return -1;
        }
        else
        {
            if(x>o.x)
                return -1;
            else
                return 1;
        }
    }
}
