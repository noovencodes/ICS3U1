/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanes
 */
public class frmMainScreen extends javax.swing.JFrame {

    /**
     * Creates new form frmMainScreen
     */
    public frmMainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lblmercat_cost = new javax.swing.JLabel();
        txtnum_puppycat = new javax.swing.JTextField();
        txtnum_cupcat = new javax.swing.JTextField();
        tn_calculate = new javax.swing.JButton();
        txtsubtotal = new javax.swing.JLabel();
        lblpuppycat_cost = new javax.swing.JLabel();
        lblcupcat_cost = new javax.swing.JLabel();
        txtnum_mercat = new javax.swing.JTextField();
        lblcosplaycat_cost = new javax.swing.JLabel();
        txtnum_cosplaycat = new javax.swing.JTextField();
        txttax = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        lblsubtotal = new javax.swing.JLabel();
        lbltax = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblwelcome = new javax.swing.JLabel();
        lblshoptitle = new javax.swing.JLabel();
        lblshopdesc = new javax.swing.JLabel();
        iconcosplaycat = new javax.swing.JLabel();
        iconpuppycat = new javax.swing.JLabel();
        iconmercat = new javax.swing.JLabel();
        iconcupcat = new javax.swing.JLabel();
        lbldollarsign_subtotal = new javax.swing.JLabel();
        lbldollarsign_tax = new javax.swing.JLabel();
        lbldollarsign_total = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblmercat_cost.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblmercat_cost.setText("Mercat ($39.99):");

        txtnum_puppycat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum_puppycat.setText("0");
        txtnum_puppycat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_puppycatActionPerformed(evt);
            }
        });

        txtnum_cupcat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum_cupcat.setText("0");
        txtnum_cupcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_cupcatActionPerformed(evt);
            }
        });

        tn_calculate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tn_calculate.setText("Calculate!");
        tn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tn_calculateActionPerformed(evt);
            }
        });

        txtsubtotal.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txtsubtotal.setText("0.00");

        lblpuppycat_cost.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblpuppycat_cost.setText("Puppycat ($29.99):");

        lblcupcat_cost.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblcupcat_cost.setText("Cupcat ($24.45): ");

        txtnum_mercat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum_mercat.setText("0");
        txtnum_mercat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnum_mercatActionPerformed(evt);
            }
        });

        lblcosplaycat_cost.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        lblcosplaycat_cost.setText("Cosplaycat ($30.49): ");

        txtnum_cosplaycat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnum_cosplaycat.setText("0");

        txttax.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txttax.setText("0.00");

        txttotal.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        txttotal.setText("0.00");

        lblsubtotal.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lblsubtotal.setText("Subtotal:");

        lbltax.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbltax.setText("Tax (13%):");

        lbltotal.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbltotal.setText("Total:");

        lblwelcome.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        lblwelcome.setText("Welcome to...");

        lblshoptitle.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        lblshoptitle.setText("Van's Cool Cat Shop");

        lblshopdesc.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        lblshopdesc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblshopdesc.setText("Enter in how many cats of each type you would like to purchase. Then, press the Calculate button to see your total.");

        iconcosplaycat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconcosplaycat.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\OneDrive\\Desktop\\sgcat crop.jpg")); // NOI18N

        iconpuppycat.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\OneDrive\\Desktop\\puppycat crop.jpg")); // NOI18N

        iconmercat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconmercat.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\OneDrive\\Desktop\\mercat crop.jpg")); // NOI18N

        iconcupcat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconcupcat.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\OneDrive\\Desktop\\cupcat crop.jpg")); // NOI18N

        lbldollarsign_subtotal.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbldollarsign_subtotal.setText("$");

        lbldollarsign_tax.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbldollarsign_tax.setText("$");

        lbldollarsign_total.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lbldollarsign_total.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblshopdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblwelcome)
                            .addComponent(lblshoptitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(iconpuppycat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconcosplaycat, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iconcupcat, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iconmercat, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblpuppycat_cost)
                                    .addComponent(lblcupcat_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcosplaycat_cost)
                                    .addComponent(lblmercat_cost))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtnum_puppycat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(571, 571, 571)
                                        .addComponent(tn_calculate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnum_mercat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbltotal))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnum_cosplaycat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbltax))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnum_cupcat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(517, 517, 517)
                                                .addComponent(lblsubtotal)))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbldollarsign_subtotal)
                                            .addComponent(lbldollarsign_tax)
                                            .addComponent(lbldollarsign_total))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txttax)
                                            .addComponent(txttotal)
                                            .addComponent(txtsubtotal))))))))
                .addGap(338, 418, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(lblwelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblshoptitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblshopdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconcupcat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(iconcosplaycat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(iconpuppycat))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(iconmercat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnum_puppycat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpuppycat_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tn_calculate))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcupcat_cost)
                    .addComponent(txtnum_cupcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsubtotal)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldollarsign_subtotal))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcosplaycat_cost)
                    .addComponent(txtnum_cosplaycat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltax)
                    .addComponent(txttax)
                    .addComponent(lbldollarsign_tax))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmercat_cost)
                    .addComponent(txtnum_mercat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltotal)
                    .addComponent(txttotal)
                    .addComponent(lbldollarsign_total))
                .addGap(635, 635, 635))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnum_cupcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_cupcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum_cupcatActionPerformed

    private void tn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tn_calculateActionPerformed
        // constants for the cost of each item, since it never changes
        final double PUPPYCAT_COST = 29.99;
        final double CUPCAT_COST = 24.45;
        final double COSPLAYCAT_COST = 30.49;
        final double MERCAT_COST = 39.99;
        
        // integer variables to store each user input (see line 304)
        int puppycat;
        int cupcat;
        int cosplaycat;  
        int mercat;
        
        // all double variables, since we're working with doubles (the price of each item) 
        double subtotal;
        double subtotal_rounded;
        double tax;
        double tax_rounded;
        double total;
        double total_rounded;
        
        // connects the regular integer variables I made to the text boxes so that my GUI can record user input
        puppycat = Integer.parseInt(txtnum_puppycat.getText());
        cupcat = Integer.parseInt(txtnum_cupcat.getText());
        cosplaycat = Integer.parseInt(txtnum_cosplaycat.getText());
        mercat = Integer.parseInt(txtnum_mercat.getText());

        // calculate the subtotal (price of each item * the amount of each item purchased)
        subtotal = (PUPPYCAT_COST * (double)puppycat) + (CUPCAT_COST * (double)cupcat)+ (COSPLAYCAT_COST * (double)cosplaycat) + (MERCAT_COST * (double)mercat);
        // round the subtotal to two decimal places
        subtotal_rounded = Math.round(subtotal * 100.0) / 100.0;
        // turns the subtotal from a double to a string
        txtsubtotal.setText(String.valueOf(subtotal_rounded));
        
        // calculate the tax (subtotal * 0.13)
        tax = (double)subtotal * 0.13;
        // round the tax to two decimal places
        tax_rounded = Math.round(tax * 100.0) / 100.0;
        // turns the tax from a double to a string
        txttax.setText(String.valueOf(tax_rounded));
        
        // calculate the total (subtotal + tax)
        total = (double)subtotal + (double)tax;
        // round the total to two decimal places
        total_rounded = Math.round(total * 100.0) / 100.0;
        // turns the total from a double to a string
        txttotal.setText(String.valueOf(total_rounded));
    }//GEN-LAST:event_tn_calculateActionPerformed

    private void txtnum_puppycatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_puppycatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum_puppycatActionPerformed

    private void txtnum_mercatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnum_mercatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnum_mercatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconcosplaycat;
    private javax.swing.JLabel iconcupcat;
    private javax.swing.JLabel iconmercat;
    private javax.swing.JLabel iconpuppycat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblcosplaycat_cost;
    private javax.swing.JLabel lblcupcat_cost;
    private javax.swing.JLabel lbldollarsign_subtotal;
    private javax.swing.JLabel lbldollarsign_tax;
    private javax.swing.JLabel lbldollarsign_total;
    private javax.swing.JLabel lblmercat_cost;
    private javax.swing.JLabel lblpuppycat_cost;
    private javax.swing.JLabel lblshopdesc;
    private javax.swing.JLabel lblshoptitle;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltax;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lblwelcome;
    private javax.swing.JButton tn_calculate;
    private javax.swing.JTextField txtnum_cosplaycat;
    private javax.swing.JTextField txtnum_cupcat;
    private javax.swing.JTextField txtnum_mercat;
    private javax.swing.JTextField txtnum_puppycat;
    private javax.swing.JLabel txtsubtotal;
    private javax.swing.JLabel txttax;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
