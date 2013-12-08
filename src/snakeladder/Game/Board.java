/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

/**
 *
 * @author acer
 */
public class Board {
    private snakeladder.Game.Ladder[] ladders;
    private snakeladder.Game.Snake[] snakes;
    private int sn,la;
    private snakeladder.Game.Player[] players;
    private boolean boardengage[];
    private snakeladder.Game.Position startpos,endpos;
    public Board()
    {
        sn=0;
        la=0;
        ladders=new snakeladder.Game.Ladder[la];
        snakes=new snakeladder.Game.Snake[sn];
        boardengage=new boolean[64];
        startpos =  new snakeladder.Game.Position();
        endpos =  new snakeladder.Game.Position();
        for(int i=0;i<64;i++)
        {
            boardengage[i]=false;
        }
    }
    public Board(int sn,int la)
    {
        this.sn=sn;
        this.la=la;
        int randstart;
        int randend;
        
        ladders=new snakeladder.Game.Ladder[la];
        snakes=new snakeladder.Game.Snake[sn];
        boardengage=new boolean[64];
        for(int i=0;i<64;i++)
            boardengage[i]=false;
        
        for(int i=0;i<sn;i++)
        {
            randstart=(int)(63*Math.random());
            randend=(int)(63*Math.random());
            while(boardengage[randstart]==true || boardengage[randend]==true )
                {                    
                    randstart=(int)(63*Math.random());
                    randend=(int)(63*Math.random());
                }
                startpos = new snakeladder.Game.Position(randstart);
                endpos = new snakeladder.Game.Position(randend);
                if(startpos.getX()==endpos.getX())
                    randstart+=2;
                if(startpos.getY()==endpos.getY())
                    randstart+=8;

                snakes[i]=new snakeladder.Game.Snake(new snakeladder.Game.Position(randstart),new snakeladder.Game.Position(randend));
             // snakes[i]=new snakeladder.Game.Snake(new snakeladder.Game.Position((int)(63*Math.random())),new snakeladder.Game.Position((int)(63*Math.random())));
                boardengage[randstart]=true;
                boardengage[randend]=true;
        }
        for(int i=0;i<la;i++)
        {
                randstart=(int)(63*Math.random());
                randend=(int)(63*Math.random());
                while(boardengage[randstart]==true||boardengage[randend]==true)
                    {                    
                        randstart=(int)(63*Math.random());
                        randend=(int)(63*Math.random());
                    }
                startpos = new snakeladder.Game.Position(randstart);
                endpos = new snakeladder.Game.Position(randend);
                if(startpos.getX()==endpos.getX())
                    randstart+=2;
                if(startpos.getY()==endpos.getY())
                    randstart+=8;
                    ladders[i]=new snakeladder.Game.Ladder(new snakeladder.Game.Position(randstart),new snakeladder.Game.Position(randend));
                 // ladders[i]=new snakeladder.Game.Ladder(new snakeladder.Game.Position((int)(63*Math.random())),new snakeladder.Game.Position((int)(63*Math.random())));
                    boardengage[randstart]=true;
                    boardengage[randend]=true;
            
        }
    }
    public void drawBoard(java.awt.Graphics2D g2d)
    {
        for(int i=0;i<sn;i++)
            snakes[i].draw(g2d);
        for(int i=0;i<la;i++)
            ladders[i].draw(g2d);
    }
}
