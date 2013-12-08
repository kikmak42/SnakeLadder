/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

/**
 *
 * @author acer
 */
public class Snake extends WormHole {
    public Snake()
    {
        
    }
    public Snake(Position start,Position end)
    {
        if(start.compareTo(end)>0)
        {
            this.start=start;
            this.end=end;
        }
        if(start.compareTo(end)<0)
        {
            this.start=end;
            this.end=start;
        }
    }
    @Override
    public void draw(java.awt.Graphics2D g2d) {
        int x1,x2,y1,y2;
        double x=Math.random();
        x1=(int)(x*start.getX()+(1-x)*end.getX());
        x2=(int)((1-x)*start.getX()+x*end.getX());
        y1=start.getY();
        y2=end.getY();
        java.awt.geom.CubicCurve2D c=new java.awt.geom.CubicCurve2D.Double(36+72*start.getX(), 36+72*start.getY(), 36+72*x1, 36+72*y1, 36+72*x2, 36+72*y2, 36+72*end.getX(), 36+72*end.getY());
        g2d.setColor(new java.awt.Color(255,181,0));
        g2d.setStroke(new java.awt.BasicStroke((int)(10*Math.random()+5)));
        g2d.draw(c);
        g2d.setColor(java.awt.Color.BLACK);
        float[] z={10.0f};
        g2d.setStroke(new java.awt.BasicStroke(3, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_ROUND,1.0f,z,50.0f));
        g2d.draw(c);
    }
}