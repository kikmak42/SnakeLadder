/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder.Game;

/**
 *
 * @author acer
 */
public class Dice {
    private javax.swing.ImageIcon[][] side;
    private int last=2;
    private class Show extends Thread
    {
        private javax.swing.JLabel jL;
        public void setLabel(javax.swing.JLabel jL)
        {
            this.jL=jL;
        }
        @Override
        public void run() {
            for(int i=0;i<15;i++)
            {
                showDice(Dice.getRamdomDiceValue(),jL,(int)(4*Math.random()));
                jL.repaint();
                try 
                {
                    Thread.sleep(80);
                } 
                catch (InterruptedException ex) {

                }
            }
            showDice(last,jL,1);
        }
    }
    public Dice()
    {
        side=new javax.swing.ImageIcon[6][4];
        for(int i=0;i<6;i++)
        {
            side[i][0]=new javax.swing.ImageIcon(this.getClass().getResource("/snakeladder/visualizer/images/"+Integer.toString(i+1)+"a.jpg"));
            side[i][1]=new javax.swing.ImageIcon(this.getClass().getResource("/snakeladder/visualizer/images/"+Integer.toString(i+1)+"b.jpg"));
            side[i][2]=new javax.swing.ImageIcon(this.getClass().getResource("/snakeladder/visualizer/images/"+Integer.toString(i+1)+"c.jpg"));
            side[i][3]=new javax.swing.ImageIcon(this.getClass().getResource("/snakeladder/visualizer/images/"+Integer.toString(i+1)+"d.jpg"));
        }
    }
    public void refreshDice(javax.swing.JLabel jL)
    {
        showDice(last, jL,(getRamdomDiceValue()-1)*4/6);
    }
    public int throwDice(javax.swing.JLabel jL)
    {
        int l=Dice.getRamdomDiceValue();
        animate(l,jL);
        return l;
    }
    private void animate(int a,javax.swing.JLabel jL)
    {
        Show s=new Show();
        s.setLabel(jL);
        last=a;
        s.start();
    }
    private void showDice(int s,javax.swing.JLabel jL,int or)
    {
        jL.setIcon(side[s-1][or]);
        jL.repaint();
    }
    private static int getRamdomDiceValue()
    {
        int l=1+(int)(6*Math.random());
        if(l>6)
            l=1;
        return l;
    }
    public int getValue()
    {
        return last;
    }
}
