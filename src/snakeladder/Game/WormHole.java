/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

/**
 *
 * @author acer
 */
public abstract class WormHole {
    protected Position start,end;
    public void passThrough(Player p)
    {
        if(p.getPosition().equals(start))
            p.setPosition(end);
    }
    public abstract void draw(java.awt.Graphics2D g2d);
    public Position getStart()
    {
        return start;
    }
    public Position getEnd()
    {
        return end;
    }
}

