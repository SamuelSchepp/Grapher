
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samuel
 */
public class Main extends javax.swing.JFrame {
    double[] coefficient = {0, 0, 0, 0, 0, 0};
    double solve;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        inStartKeyReleased(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        in5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        in4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        in3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        in2 = new javax.swing.JTextField();
        in1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        in0 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inStart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        inStep = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inStop = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inExplicit = new javax.swing.JTextField();
        infoButton = new javax.swing.JButton();
        fPicker = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        deriveBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grapher von Samuel Schepp");
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Schritt 1: Gleichung eingeben:");

        in5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        in5.setText("0");

        jLabel3.setText("X⁵ + ");

        in4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        in4.setText("0");

        jLabel4.setText("X⁴ + ");

        jLabel5.setText("X³ + ");

        in3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        in3.setText("0");

        jLabel6.setText("X² + ");

        in2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        in2.setText("0");

        in1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        in1.setText("0");

        jLabel7.setText("X + ");

        in0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        in0.setText("0");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Schritt 2: Einstellungen vornehmen:");

        jLabel9.setText("Start:");

        inStart.setText("-10");
        inStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inStartKeyReleased(evt);
            }
        });

        jLabel10.setText("Schritt:");

        inStep.setText("0.1");
        inStep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inStartKeyReleased(evt);
            }
        });

        jLabel11.setText("Ende:");

        inStop.setText("10");
        inStop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inStartKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("Schritt 3: Rechnung Starten:");

        startButton.setText("Start");
        startButton.setFocusable(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Expl. Stelle:");

        inExplicit.setText("0");

        infoButton.setText("Info");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        fPicker.setMaximumRowCount(20);
        fPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "f(x)", "g(x)", "h(x)", "i(x)", "j(x)", "k(x)", "l(x)", "m(x)", "n(x)", "o(x)", "p(x)" }));

        jLabel2.setText("=");

        deriveBox.setSelected(true);
        deriveBox.setText("1ste Ableitung (f') einbeziehen (Ableitungsregel)");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(deriveBox, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSeparator1)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(startButton)
                                .add(18, 18, 18)
                                .add(statusLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jLabel14))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(infoButton))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel11)
                            .add(jLabel9)
                            .add(jLabel12))
                        .add(9, 9, 9)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, inExplicit)
                            .add(inStop)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, inStep)
                            .add(inStart)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel10)
                            .add(jLabel1)
                            .add(jLabel8)
                            .add(layout.createSequentialGroup()
                                .add(fPicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel2)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(in5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(in4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(in3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel5)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(in2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel6)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(in1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel7)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(in0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(in5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(in4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4)
                    .add(in3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(in2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6)
                    .add(in1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)
                    .add(in0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fPicker, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(18, 18, 18)
                .add(jLabel8)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(inStart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(inStop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(inStep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(inExplicit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(deriveBox)
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel14)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(startButton))
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(statusLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(infoButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double f(double x) {
        return (coefficient[5] * x*x*x*x*x + coefficient[4] *x*x*x*x + (coefficient[3] * x*x*x) + (coefficient[2] * x*x) + (coefficient[1] * x) + (coefficient[0]));
    }
    double fd(double x) {
        return (coefficient[5] * 5*x*x*x*x + coefficient[4] *4*x*x*x + (coefficient[3] * 3*x*x) + (coefficient[2] * 2*x) + (coefficient[1]));
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            LookupTable lt = new LookupTable();
            Graph gr = new Graph();
            gr.setLocationRelativeTo(null);
            lt.setLocationRelativeTo(null);
            
            coefficient[5] = Double.parseDouble(in5.getText());
            coefficient[4] = Double.parseDouble(in4.getText());
            coefficient[3] = Double.parseDouble(in3.getText());
            coefficient[2] = Double.parseDouble(in2.getText());
            coefficient[1] = Double.parseDouble(in1.getText());
            coefficient[0] = Double.parseDouble(in0.getText());
            
            double start = Double.parseDouble(inStart.getText());
            double stop = Double.parseDouble(inStop.getText());
            double step = Double.parseDouble(inStep.getText());  
            boolean shouldDerive = deriveBox.isSelected();
            
            double xEx = Double.parseDouble(inExplicit.getText());
            solve = f(xEx);
                
            double tmpsxEX;
            tmpsxEX = (double) (solve * 1000);
            tmpsxEX = Math.round(tmpsxEX);
            tmpsxEX = tmpsxEX / 1000;
            lt.textField.setText(fPicker.getSelectedItem().toString() + " = " + in5.getText() + "x⁵ + " + in4.getText() + "x⁴ + " + in3.getText() + "x³ + " + in2.getText() + "x² + " + in1.getText() + "x + " + in0.getText() + "\n"); 
            if(shouldDerive) lt.textField.setText(lt.textField.getText() + fPicker.getSelectedItem().toString().charAt(0) + "'(x) = " + (Double.parseDouble(in5.getText()) * 5) + "x⁴ + " + (Double.parseDouble(in4.getText()) * 4) + "x³ + " + (Double.parseDouble(in3.getText()) * 3) + "x² + " + (Double.parseDouble(in2.getText()) * 2) + "x + " + in1.getText() + "\n");
            lt.setTitle("Wertetabelle " + fPicker.getSelectedItem().toString() + " = " + in5.getText() + "x⁵ + " + in4.getText() + "x⁴ + " + in3.getText() + "x³ + " + in2.getText() + "x² + " + in1.getText() + "x + " + in0.getText() + "\n");
            lt.textField.setText(lt.textField.getText() +"Expiziete X Stelle: "+fPicker.getSelectedItem().toString().charAt(0) +"("+xEx+") = " + tmpsxEX + "\n\n");
            
            for(double x = start; x <= stop; x+=step) {              
                solve = f(x);
                
                double tmpx;
                tmpx = (double) (x * 1000);
                tmpx = Math.round(tmpx);
                tmpx = tmpx / 1000;
                
                double tmps;
                tmps = (double) (solve * 1000);
                tmps = Math.round(tmps);
                tmps = tmps / 1000;
                
                double tmpd = 0;
                if(shouldDerive) {
                    tmpd = (double) (fd(x) * 1000);
                    tmpd = Math.round(tmpd);
                    tmpd = tmpd / 1000;
                }
                
                gr.addPoint(x, solve);
                if(shouldDerive) gr.addPointDerive(x, tmpd);
                lt.textField.setText(lt.textField.getText() +"X = " + tmpx + " \t"+ fPicker.getSelectedItem().toString() +" = " + tmps);
                if(shouldDerive) lt.textField.setText(lt.textField.getText() +" \t" + fPicker.getSelectedItem().toString().charAt(0) + "'(x) = " + tmpd);
                lt.textField.setText(lt.textField.getText() +"\n");
            }
            lt.textField.setText(lt.textField.getText() + "\nAufgrund von approximativen\nDarstellungen reeller Zahlen\nkann das Ergebnis um\nbis zu 0.000001 variieren.\nUnd ich dachte, PC wären\ngut im rechnen...");
            gr.function = fPicker.getSelectedItem().toString() + " = " + in5.getText() + "x⁵ + " + in4.getText() + "x⁴ + " + in3.getText() + "x³ + " + in2.getText() + "x² + " + in1.getText() + "x + " + in0.getText();
            gr.deriveFunction = fPicker.getSelectedItem().toString().charAt(0) + "'(x) = " + (Double.parseDouble(in5.getText()) * 5) + "x⁴ + " + (Double.parseDouble(in4.getText()) * 4) + "x³ + " + (Double.parseDouble(in3.getText()) * 3) + "x² + " + (Double.parseDouble(in2.getText()) * 2) + "x + " + in1.getText();
            gr.setTitle("Graph " + fPicker.getSelectedItem().toString() + " = " + in5.getText() + "x⁵ + " + in4.getText() + "x⁴ + " + in3.getText() + "x³ + " + in2.getText() + "x² + " + in1.getText() + "x + " + in0.getText());
            gr.setVisible(true);
            gr.paint(gr.getGraphics());
            lt.setVisible(true);
            
        } catch (Exception ex) { 
            JOptionPane.showMessageDialog(null,"Fehler:\n" + ex.toString(),"Fehler", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void inStartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inStartKeyReleased
         try {
            double start = Double.parseDouble(inStart.getText());
            double stop = Double.parseDouble(inStop.getText());
            double step = Double.parseDouble(inStep.getText());
            int calcs = (int) ((Math.abs(start) + Math.abs(stop)) / step + 2);
            statusLabel.setText("Es werden "+ calcs + " Werte berechnet");
        } catch (Exception ex) { statusLabel.setText(ex.toString()); }
    }//GEN-LAST:event_inStartKeyReleased

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        new InfoForm().setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox deriveBox;
    private javax.swing.JComboBox fPicker;
    private javax.swing.JTextField in0;
    private javax.swing.JTextField in1;
    private javax.swing.JTextField in2;
    private javax.swing.JTextField in3;
    private javax.swing.JTextField in4;
    private javax.swing.JTextField in5;
    private javax.swing.JTextField inExplicit;
    private javax.swing.JTextField inStart;
    private javax.swing.JTextField inStep;
    private javax.swing.JTextField inStop;
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
