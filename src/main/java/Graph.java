
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class Graph extends javax.swing.JFrame {
    ArrayList<Double> X;
    ArrayList<Double> Y;
    ArrayList<Double> XD;
    ArrayList<Double> YD;
    public double zoom;
    public double transitionX;
    public double transitionY;
    public String function = "";
    public String deriveFunction = "";
    double mouseX = 0;
    double mouseY = 0;
    boolean showGrid = true;
    boolean antiAliasing = true;
    
    public Graph() {
        initComponents();
        X = new ArrayList<Double>();
        Y = new ArrayList<Double>();
        XD = new ArrayList<Double>();
        YD = new ArrayList<Double>();
        zoom = 20;
        transitionX = 0;
        transitionY = 0;
    }

    @Override
    public void paint(Graphics g){
        int w = this.getWidth();
        int h = this.getHeight();
        Graphics2D g2d = (Graphics2D)g;
         if(antiAliasing) g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                         RenderingHints.VALUE_ANTIALIAS_ON);
         g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                         RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         
        g.setColor(Color.white); 
        g.fillRect(0, 0, w, h);
        
        if(showGrid) {
            g.setColor(Color.lightGray);
            for(double i = 0; i <= 1/zoom * (h) + Math.abs(transitionY); i += 1) {
                g.drawLine(0, getY(i, true), w, getY(i, true));
                g.drawLine(0, getY(0 - i, true), w, getY(0 - i, true));
            }
            for(double i = 0; i <= 1/zoom * (w) + Math.abs(transitionX); i += 1) {
                g.drawLine(getX(i, true), 0, getX(i, true), h);
                g.drawLine(getX(0 - i, true), 0, getX(0 - i, true), h);
            }
        }
        
        g.setColor(Color.DARK_GRAY);
        g.drawLine(0, getY(0, true), w, getY(0, true));
        g.drawLine(getX(0, true), 0, getX(0, true), h);

        
        g.setColor(Color.blue);
        for(int i = 0; i < XD.size() - 1; i++) {
            g.drawLine(getX(XD.get(i), true),
                    getY(YD.get(i), true),
                    getX(XD.get(i + 1), true),
                    getY(YD.get(i + 1), true));
        }
        
        g.setColor(Color.red);
        for(int i = 0; i < X.size() - 1; i++) {
            g.drawLine(getX(X.get(i), true),
                    getY(Y.get(i), true),
                    getX(X.get(i + 1), true),
                    getY(Y.get(i + 1), true));
        }

        g.setColor(Color.white);
        g.fillRect(0,0,w,72);
        
        g.setColor(Color.black);
        g.drawString("Tasten: Pfeiltasten, +, -, r (reset), g (grid), a (Anti Aliasing)", 10, 47);
        g.drawString("Maus Koordinaten: X = "+mouseX + "    Y = "+mouseY, this.getWidth() - 400, 47);
        g.setColor(Color.red);
        g.drawString(function, 10, 67);
        g.setColor(Color.blue);
        if(!XD.isEmpty()) g.drawString(deriveFunction, this.getWidth() - 400, 67);

    }
    
    public void addPoint (double x, double y) {
        X.add(x);
        Y.add(y);
    }
    
    int getX(double get, boolean transition) {
        double x = get;
        if (transition) x -= transitionX;
        x = (x * zoom);
        x = (x + (this.getWidth()/2));
        return (int)x;
    }
    
    int getY(double get, boolean transition) {
        double y = get;
        if (transition) y -= transitionY;
        y = (y * zoom);
        y = (this.getHeight()/2 - y);
        return (int) y;
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Graph");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 22, 800, 800));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMinimumSize(new java.awt.Dimension(850, 500));
        setPreferredSize(new java.awt.Dimension(850, 500));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyChar() == '+') {
            if(zoom < 320) zoom *= 1.5;
        }
        if(evt.getKeyChar() == '-') {
            if(zoom > 8) zoom /= 1.5;
        }
        
        if(evt.getKeyCode() == 38) {
            transitionY = (transitionY += 1/zoom * 100);
        }
        if(evt.getKeyCode() == 40) {
            transitionY = (transitionY -= 1/zoom * 100);
        }
        if(evt.getKeyCode() == 37) {
            transitionX = (transitionX -= 1/zoom * 100);
        }
        if(evt.getKeyCode() == 39) {
            transitionX = (transitionX += 1/zoom * 100);
        }
        if(evt.getKeyCode() == 82) {
            zoom = 20;
            transitionX = 0;
            transitionY = 0;
        }
        if(evt.getKeyChar() == 'g') showGrid = !showGrid;
        if(evt.getKeyChar() == 'a') antiAliasing = !antiAliasing;
        // System.out.println(evt.getKeyCode());
        this.repaint();
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        double x = evt.getX() - this.getWidth() / 2;
        x = (x/zoom);
        x += transitionX;     
        x = (x * 100);
        x = Math.round(x);
        x = x / 100;                
        mouseX = x;
        
        double y = this.getHeight()/2 - evt.getY();
        y = y / zoom;
        y += transitionY;
        y = (y * 100);
        y = Math.round(y);
        y = y / 100;
        mouseY = y;
        this.repaint();

    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void addPointDerive (double x, double y) {
        XD.add(x);
        YD.add(y);
    }
}
