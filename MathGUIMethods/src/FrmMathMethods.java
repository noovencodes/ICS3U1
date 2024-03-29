/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanes
 */
public class FrmMathMethods extends javax.swing.JFrame {

    /**
     * Creates new form FrmMathMethods
     */
    public FrmMathMethods() {
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

        lbltitle = new javax.swing.JLabel();
        lblmax_desc = new javax.swing.JLabel();
        txtmax_num1 = new javax.swing.JTextField();
        btnmax = new javax.swing.JButton();
        lblmax_result = new javax.swing.JLabel();
        lblmin_desc = new javax.swing.JLabel();
        txtpow_num1 = new javax.swing.JTextField();
        txtmax_num2 = new javax.swing.JTextField();
        txtmin_num2 = new javax.swing.JTextField();
        btnmin = new javax.swing.JButton();
        lblmin_result = new javax.swing.JLabel();
        lblpow_desc = new javax.swing.JLabel();
        txtpow_num2 = new javax.swing.JTextField();
        txtmin_num1 = new javax.swing.JTextField();
        btnpow = new javax.swing.JButton();
        lblpow_result = new javax.swing.JLabel();
        lblhypot_desc = new javax.swing.JLabel();
        txthypot_num1 = new javax.swing.JTextField();
        txthypot_num2 = new javax.swing.JTextField();
        btnhypot = new javax.swing.JButton();
        lblhypot_result = new javax.swing.JLabel();
        lblfloor_desc = new javax.swing.JLabel();
        txtfloor_num = new javax.swing.JTextField();
        btnfloor = new javax.swing.JButton();
        lblfloor_result = new javax.swing.JLabel();
        lblceil_desc = new javax.swing.JLabel();
        txtsqrt_num = new javax.swing.JTextField();
        btnceil = new javax.swing.JButton();
        lblceil_result = new javax.swing.JLabel();
        lblsqrt_desc = new javax.swing.JLabel();
        txtradians_num = new javax.swing.JTextField();
        btnsqrt = new javax.swing.JButton();
        lblsqrt_result = new javax.swing.JLabel();
        lblradians_desc = new javax.swing.JLabel();
        txtceil_num = new javax.swing.JTextField();
        btnradians = new javax.swing.JButton();
        lblradians_result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitle.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(174, 7, 0));
        lbltitle.setText("Magical Math Methods");

        lblmax_desc.setText("Enter two numbers and click the button. The program will display the largest of the two numbers:");

        txtmax_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmax_num1ActionPerformed(evt);
            }
        });

        btnmax.setText("Largest");
        btnmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaxActionPerformed(evt);
            }
        });

        lblmax_result.setText("...");

        lblmin_desc.setText("Enter two numbers and click the button. The program will display the smallest of the two numbers:");

        txtpow_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpow_num1ActionPerformed(evt);
            }
        });

        txtmax_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmax_num2ActionPerformed(evt);
            }
        });

        txtmin_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmin_num2ActionPerformed(evt);
            }
        });

        btnmin.setText("Smallest");
        btnmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminActionPerformed(evt);
            }
        });

        lblmin_result.setText("...");

        lblpow_desc.setText("Enter two numbers and click the button. The program will display the first number to the power of the second:");

        txtpow_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpow_num2ActionPerformed(evt);
            }
        });

        txtmin_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmin_num1ActionPerformed(evt);
            }
        });

        btnpow.setText("To The Power Of...");
        btnpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpowActionPerformed(evt);
            }
        });

        lblpow_result.setText("...");

        lblhypot_desc.setText("Enter the length of two sides of a right angle triangle. The program will display the hypotenuse of the triangle:");

        txthypot_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthypot_num1ActionPerformed(evt);
            }
        });

        txthypot_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthypot_num2ActionPerformed(evt);
            }
        });

        btnhypot.setText("Hypotenuse");
        btnhypot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhypotActionPerformed(evt);
            }
        });

        lblhypot_result.setText("...");

        lblfloor_desc.setText("Enter a decimal value. The program will display the value rounded down to the nearest integer:");

        txtfloor_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfloor_numActionPerformed(evt);
            }
        });

        btnfloor.setText("Rounded Down");
        btnfloor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfloorActionPerformed(evt);
            }
        });

        lblfloor_result.setText("...");

        lblceil_desc.setText("Enter a decimal value. The program will display the value rounded up to the nearest integer:");

        txtsqrt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsqrt_numActionPerformed(evt);
            }
        });

        btnceil.setText("Rounded Up");
        btnceil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceilActionPerformed(evt);
            }
        });

        lblceil_result.setText("...");

        lblsqrt_desc.setText("Enter an integer. The program will display the square root of the interger:");

        txtradians_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtradians_numActionPerformed(evt);
            }
        });

        btnsqrt.setText("Square Root");
        btnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtActionPerformed(evt);
            }
        });

        lblsqrt_result.setText("...");

        lblradians_desc.setText("Enter an angle in degrees. The program will display the angle in radians:");

        txtceil_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtceil_numActionPerformed(evt);
            }
        });

        btnradians.setText("In Radians");
        btnradians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnradiansActionPerformed(evt);
            }
        });

        lblradians_result.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(txtmax_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(txtmax_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(btnmax)
                            .addGap(127, 127, 127)
                            .addComponent(lblmax_result, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblmax_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtmin_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtmin_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(btnmin)
                                        .addGap(125, 125, 125)
                                        .addComponent(lblmin_result, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblmin_desc))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(txtpow_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(txtpow_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(btnpow)
                            .addGap(93, 93, 93)
                            .addComponent(lblpow_result, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpow_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblhypot_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblfloor_desc)
                                    .addComponent(lblsqrt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblradians_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(99, 99, 99)
                                            .addComponent(txtradians_num, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(100, 100, 100)
                                            .addComponent(btnradians)
                                            .addGap(126, 126, 126)
                                            .addComponent(lblradians_result, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblceil_desc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txthypot_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(txthypot_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(btnhypot)
                                    .addGap(118, 118, 118)
                                    .addComponent(lblhypot_result, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(txtfloor_num, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(btnfloor)
                            .addGap(111, 111, 111)
                            .addComponent(lblfloor_result, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(txtceil_num, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnceil)
                        .addGap(120, 120, 120)
                        .addComponent(lblceil_result, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(txtsqrt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnsqrt)
                        .addGap(119, 119, 119)
                        .addComponent(lblsqrt_result, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(lbltitle)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbltitle)
                        .addGap(32, 32, 32)
                        .addComponent(lblmax_desc)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmax_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmax)
                            .addComponent(lblmax_result)
                            .addComponent(txtmax_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(lblmin_desc)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnmin)
                            .addComponent(lblmin_result))
                        .addGap(49, 49, 49)
                        .addComponent(lblpow_desc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmin_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmin_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpow_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpow_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpow)
                    .addComponent(lblpow_result))
                .addGap(48, 48, 48)
                .addComponent(lblhypot_desc)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthypot_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthypot_num2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhypot)
                    .addComponent(lblhypot_result))
                .addGap(37, 37, 37)
                .addComponent(lblfloor_desc)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfloor_num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfloor)
                    .addComponent(lblfloor_result))
                .addGap(34, 34, 34)
                .addComponent(lblceil_desc)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnceil)
                    .addComponent(lblceil_result)
                    .addComponent(txtceil_num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblsqrt_desc)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsqrt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrt)
                    .addComponent(lblsqrt_result))
                .addGap(41, 41, 41)
                .addComponent(lblradians_desc)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtradians_num, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnradians)
                    .addComponent(lblradians_result))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtmax_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmax_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmax_num1ActionPerformed

    private void txtpow_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpow_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpow_num1ActionPerformed

    private void txtmax_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmax_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmax_num2ActionPerformed

    private void txtmin_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmin_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmin_num2ActionPerformed

    private void txtpow_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpow_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpow_num2ActionPerformed

    private void txtmin_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmin_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmin_num1ActionPerformed

    private void btnpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpowActionPerformed
    // IMPORTANT NOTE: I will only be adding commenting to this button, as the code for the other 7 buttons is very similar to this one (the only major difference being they using different math methods). Please let me know if you would like me to add comments to the rest of them and I will change it as soon as possible :)
    // variables to store the number inputed into each of the two text fields
    double pow_num1;
    double pow_num2;
    
    // connecting the variables I made to actually store the text in the appropriate text fields
    pow_num1 = Double.parseDouble(txtpow_num1.getText());
    pow_num2 = Double.parseDouble(txtpow_num2.getText());
    
    // using Math.pow to raise the first number (pow_num1) to the power of the second (pow_num2)
    lblpow_result.setText(String.valueOf(Math.pow(pow_num1, pow_num2)));
    }//GEN-LAST:event_btnpowActionPerformed

    private void txthypot_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthypot_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthypot_num1ActionPerformed

    private void txthypot_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthypot_num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthypot_num2ActionPerformed

    private void txtfloor_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfloor_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfloor_numActionPerformed

    private void txtsqrt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsqrt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsqrt_numActionPerformed

    private void btnceilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceilActionPerformed
    double ceil_num;
     
    ceil_num = Double.parseDouble(txtceil_num.getText());
      
    lblceil_result.setText(String.valueOf((int)Math.ceil(ceil_num))); 
    }//GEN-LAST:event_btnceilActionPerformed

    private void txtradians_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtradians_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtradians_numActionPerformed

    private void txtceil_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtceil_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtceil_numActionPerformed

    private void btnmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaxActionPerformed
    double max_num1;
    double max_num2;
    
    max_num1 = Double.parseDouble(txtmax_num1.getText());
    max_num2 = Double.parseDouble(txtmax_num2.getText());

    lblmax_result.setText(String.valueOf(Math.max(max_num1, max_num2)));
    }//GEN-LAST:event_btnmaxActionPerformed

    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminActionPerformed
    double min_num1;
    double min_num2;

    min_num1 = Double.parseDouble(txtmin_num1.getText());
    min_num2 = Double.parseDouble(txtmin_num2.getText());
    
    lblmin_result.setText(String.valueOf(Math.min(min_num1, min_num2)));
    }//GEN-LAST:event_btnminActionPerformed

    private void btnhypotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhypotActionPerformed
    double hypot_num1;
    double hypot_num2;
    
    hypot_num1 = Double.parseDouble(txthypot_num1.getText());
    hypot_num2 = Double.parseDouble(txthypot_num2.getText());
    
    lblhypot_result.setText(String.valueOf(Math.hypot(hypot_num1, hypot_num2)));
    }//GEN-LAST:event_btnhypotActionPerformed

    private void btnfloorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfloorActionPerformed
    double floor_num;
    
    floor_num = Double.parseDouble(txtfloor_num.getText());
    
    lblfloor_result.setText(String.valueOf((int)Math.floor(floor_num)));
    }//GEN-LAST:event_btnfloorActionPerformed

    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrtActionPerformed
    int sqrt_num;
    
    sqrt_num = Integer.parseInt(txtsqrt_num.getText());
    
    lblsqrt_result.setText(String.valueOf((int)Math.sqrt(sqrt_num)));
    }//GEN-LAST:event_btnsqrtActionPerformed

    private void btnradiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnradiansActionPerformed
    double radians_num;
    
    radians_num = Double.parseDouble(txtradians_num.getText());
    
    lblradians_result.setText(String.valueOf(Math.toRadians(radians_num)));
    }//GEN-LAST:event_btnradiansActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnceil;
    private javax.swing.JButton btnfloor;
    private javax.swing.JButton btnhypot;
    private javax.swing.JButton btnmax;
    private javax.swing.JButton btnmin;
    private javax.swing.JButton btnpow;
    private javax.swing.JButton btnradians;
    private javax.swing.JButton btnsqrt;
    private javax.swing.JLabel lblceil_desc;
    private javax.swing.JLabel lblceil_result;
    private javax.swing.JLabel lblfloor_desc;
    private javax.swing.JLabel lblfloor_result;
    private javax.swing.JLabel lblhypot_desc;
    private javax.swing.JLabel lblhypot_result;
    private javax.swing.JLabel lblmax_desc;
    private javax.swing.JLabel lblmax_result;
    private javax.swing.JLabel lblmin_desc;
    private javax.swing.JLabel lblmin_result;
    private javax.swing.JLabel lblpow_desc;
    private javax.swing.JLabel lblpow_result;
    private javax.swing.JLabel lblradians_desc;
    private javax.swing.JLabel lblradians_result;
    private javax.swing.JLabel lblsqrt_desc;
    private javax.swing.JLabel lblsqrt_result;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtceil_num;
    private javax.swing.JTextField txtfloor_num;
    private javax.swing.JTextField txthypot_num1;
    private javax.swing.JTextField txthypot_num2;
    private javax.swing.JTextField txtmax_num1;
    private javax.swing.JTextField txtmax_num2;
    private javax.swing.JTextField txtmin_num1;
    private javax.swing.JTextField txtmin_num2;
    private javax.swing.JTextField txtpow_num1;
    private javax.swing.JTextField txtpow_num2;
    private javax.swing.JTextField txtradians_num;
    private javax.swing.JTextField txtsqrt_num;
    // End of variables declaration//GEN-END:variables
}
