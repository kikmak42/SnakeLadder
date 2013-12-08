/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

/**
 *
 * @author acer
 */
public class Player {
    private String name;
    private Position pos;
    private static int ID=1;
    private static int an=1;
    private javax.swing.ImageIcon pawnicon;
    public Player()
    {
        pos=new snakeladder.Game.Position(0);
        name="AnonymousUser"+an++;
        pawnicon = new javax.swing.ImageIcon(getClass().getResource("/snakeladder/Visualizer/Images/pawn"+Integer.toString(ID++)+".png")); 
        System.out.print("dddd");
    }
    public Player(String name)
    {
        pos=new snakeladder.Game.Position(0);
        this.name=name;
        pawnicon = new javax.swing.ImageIcon(getClass().getResource("/snakeladder/Visualizer/Images/pawn"+Integer.toString(ID++)+".png"));
        System.out.print("rfrf");
    }
    public void setPosition(Position pos)
    {
        this.pos=pos;
    }
    public Position getPosition()
    {
        return pos;
    }
    public String getName()
    {
        return name;
    }
    public void placePawn(javax.swing.JLabel jail)
    {
            
        jail.setIcon(pawnicon);
       
        
    }
    public void removePawn(javax.swing.JLabel jail )
    {
        jail.setIcon(null);
    }
}
