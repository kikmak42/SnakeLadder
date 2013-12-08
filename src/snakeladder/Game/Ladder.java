/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

import java.awt.Color;

/**
 *
 * @author acer
 */
public class Ladder extends WormHole{
    public Ladder()
    {
        
    }
    public Ladder(Position start,Position end)
    {
        if(start.compareTo(end)<0)
        {
            this.start=start;
            this.end=end;
        }
        if(start.compareTo(end)>0)
        {
            this.start=end;
            this.end=start;
        }
    }
    @Override
    public void draw(java.awt.Graphics2D g2d) {
        double dist=72*Math.sqrt((start.getX()-end.getX())*(start.getX()-end.getX())+(start.getY()-end.getY())*(start.getY()-end.getY()));
        double angle;
        if(start.getX()-end.getX()!=0)
        {
            angle=Math.atan((start.getY()-end.getY())/(start.getX()-end.getX()));
        }
        else
        {
            angle=Math.PI/2;
        }
        float[] a={0f,20.0f};
        g2d.setStroke(new java.awt.BasicStroke(4, java.awt.BasicStroke.CAP_SQUARE, java.awt.BasicStroke.JOIN_BEVEL, 1.0f, a, 0.005f));
        g2d.setColor(new java.awt.Color(135,33,0));
        for(int i=-3;i<4;i++)
            g2d.drawLine(36+72*start.getX()+(int)(4*i*Math.cos(angle+Math.PI/2)), 36+72*start.getY()+(int)(4*i*Math.sin(angle+Math.PI/2)), 36+72*end.getX()+(int)(4*i*Math.cos(angle+Math.PI/2)), 36+72*end.getY()+(int)(4*i*Math.sin(angle+Math.PI/2)));
        g2d.setColor(java.awt.Color.BLACK);
        g2d.setStroke(new java.awt.BasicStroke(7));
        g2d.drawLine(36+(int)(start.getX()*72+15*Math.cos(angle+Math.PI/2)), 36+(int)(start.getY()*72+15*Math.sin(angle+Math.PI/2)), 36+(int)(end.getX()*72+15*Math.cos(angle+Math.PI/2)), 36+(int)(end.getY()*72+15*Math.sin(angle+Math.PI/2)));
        g2d.drawLine(36+(int)(start.getX()*72-15*Math.cos(angle+Math.PI/2)), 36+(int)(start.getY()*72-15*Math.sin(angle+Math.PI/2)), 36+(int)(end.getX()*72-15*Math.cos(angle+Math.PI/2)), 36+(int)(end.getY()*72-15*Math.sin(angle+Math.PI/2)));
        g2d.setColor(new java.awt.Color(135,33,0));
        g2d.setStroke(new java.awt.BasicStroke(5));
        g2d.drawLine(36+(int)(start.getX()*72+15*Math.cos(angle+Math.PI/2)), 36+(int)(start.getY()*72+15*Math.sin(angle+Math.PI/2)), 36+(int)(end.getX()*72+15*Math.cos(angle+Math.PI/2)), 36+(int)(end.getY()*72+15*Math.sin(angle+Math.PI/2)));
        g2d.drawLine(36+(int)(start.getX()*72-15*Math.cos(angle+Math.PI/2)), 36+(int)(start.getY()*72-15*Math.sin(angle+Math.PI/2)), 36+(int)(end.getX()*72-15*Math.cos(angle+Math.PI/2)), 36+(int)(end.getY()*72-15*Math.sin(angle+Math.PI/2)));
    }
    
}
