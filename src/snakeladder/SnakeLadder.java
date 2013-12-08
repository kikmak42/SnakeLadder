/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder;

/**
 *
 * @author acer
 */
public class SnakeLadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(snakeladder.Visualizer.Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.print("oooo");
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(snakeladder.Visualizer.Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.print("ooo");
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(snakeladder.Visualizer.Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.print("oo");
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(snakeladder.Visualizer.Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.print("o");
        }
  
        snakeladder.Visualizer.Starter s = new snakeladder.Visualizer.Starter();
        s.setVisible(true);

  }
}
