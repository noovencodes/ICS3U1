/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vanes
 */
public class FrmGradeCalc extends javax.swing.JFrame {

    /**
     * Creates new form FrmGradeCalc
     */
    public FrmGradeCalc() {
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

        lblwelcomemsg = new javax.swing.JLabel();
        lbltitle = new javax.swing.JLabel();
        lblinstructions = new javax.swing.JLabel();
        txtfirst_grade = new javax.swing.JTextField();
        txtsecond_grade = new javax.swing.JTextField();
        txtthird_grade = new javax.swing.JTextField();
        txtfourth_grade = new javax.swing.JTextField();
        txtfifth_grade = new javax.swing.JTextField();
        lblaverage = new javax.swing.JLabel();
        lblfirst_grade = new javax.swing.JLabel();
        lblsecond_grade = new javax.swing.JLabel();
        lblthird_grade = new javax.swing.JLabel();
        lblfourth_grade = new javax.swing.JLabel();
        lblfifth_grade = new javax.swing.JLabel();
        lblaverage_msg = new javax.swing.JLabel();
        btncalculate_average = new javax.swing.JButton();
        lblpercentage1 = new javax.swing.JLabel();
        lblpercentage2 = new javax.swing.JLabel();
        lblpercentage3 = new javax.swing.JLabel();
        lblpercentage4 = new javax.swing.JLabel();
        lblpercentage5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblwelcomemsg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblwelcomemsg.setText("Welcome to... ");

        lbltitle.setText("The Grade Average Calculator!");

        lblinstructions.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblinstructions.setText("Enter in the percentage grade (0-100%) from your last 5 assignments. Then, click on the \"Calculate\" button to see your average!");

        txtfirst_grade.setText("0");
        txtfirst_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirst_gradeActionPerformed(evt);
            }
        });

        txtsecond_grade.setText("0");

        txtthird_grade.setText("0");
        txtthird_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtthird_gradeActionPerformed(evt);
            }
        });

        txtfourth_grade.setText("0");

        txtfifth_grade.setText("0");

        lblaverage.setText("0.0%");

        lblfirst_grade.setText("First Grade:");

        lblsecond_grade.setText("Second Grade:");

        lblthird_grade.setText("Third Grade:");

        lblfourth_grade.setText("Fourth Grade:");

        lblfifth_grade.setText("Fifth Grade:");

        btncalculate_average.setText("Calculate");
        btncalculate_average.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculate_averageActionPerformed(evt);
            }
        });

        lblpercentage1.setText("%");

        lblpercentage2.setText("%");

        lblpercentage3.setText("%");

        lblpercentage4.setText("%");

        lblpercentage5.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(lblwelcomemsg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(lblaverage)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(btncalculate_average))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(lbltitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblfirst_grade)
                            .addComponent(lblthird_grade)
                            .addComponent(lblfourth_grade)
                            .addComponent(lblfifth_grade)
                            .addComponent(lblsecond_grade))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtthird_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(txtsecond_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(txtfirst_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(txtfifth_grade)
                            .addComponent(txtfourth_grade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpercentage1)
                            .addComponent(lblpercentage2)
                            .addComponent(lblpercentage3)
                            .addComponent(lblpercentage4)
                            .addComponent(lblpercentage5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblinstructions)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblaverage_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblwelcomemsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblinstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfirst_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfirst_grade)
                    .addComponent(lblpercentage1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsecond_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsecond_grade)
                    .addComponent(lblpercentage2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtthird_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblthird_grade)
                    .addComponent(lblpercentage3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfourth_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfourth_grade)
                    .addComponent(lblpercentage4))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfifth_grade)
                    .addComponent(txtfifth_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpercentage5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btncalculate_average)
                .addGap(30, 30, 30)
                .addComponent(lblaverage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblaverage_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfirst_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirst_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirst_gradeActionPerformed

    private void txtthird_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtthird_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtthird_gradeActionPerformed

    private void btncalculate_averageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculate_averageActionPerformed
        // created a constant for how many percentages will be added togther (5) to calculate the average
        final double NUM_OF_GRADES = 5;
        
        // variables for each of the percentage grades
        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double grade5;
        
        // a variable to store the sum of each grade percentage as they're being added in the loop
        double grades_added = 0;
        
        // a variable for the average
        double average;
        
        // connecting the grade percentage variables to store user input from the text fields in the GUI
        grade1 = Double.parseDouble(txtfirst_grade.getText());
        grade2 = Double.parseDouble(txtsecond_grade.getText());
        grade3 = Double.parseDouble(txtthird_grade.getText());
        grade4 = Double.parseDouble(txtfourth_grade.getText());
        grade5 = Double.parseDouble(txtfifth_grade.getText());
        
        // an array to store each grade variable as they're being looped through
        double[] calculating_grades = {grade1, grade2, grade3, grade4, grade5};
        
        // a loop used to sum all of the inputed grade percentages together
        for (int i = 0; i < calculating_grades.length; i ++){
            grades_added += calculating_grades[i];
        }
        
        // calculates the average by dividing the sum of all the grades and how many grades were added together
        average = grades_added/NUM_OF_GRADES;
        
        // rounds the average to one decimal point
        average = Math.round(average * 10.0) / 10.0;
        
        // connects the average variable to the label in the GUI
        lblaverage.setText(String.valueOf(average + "%"));
        
        // an if/else if/else statement that displays a message if you got a 90% or higher, or a 69% or lower.
        if (average >= 90) {
            lblaverage_msg.setText(String.valueOf("               That's a pretty good mark! Great job! :D"));
        }
        else if (average <= 69) {
            lblaverage_msg.setText(String.valueOf("Hey, it's okay. There's always room for improvement! :)"));
        }
        else{
            lblaverage_msg.setText(String.valueOf(""));
        }
    }//GEN-LAST:event_btncalculate_averageActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGradeCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGradeCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGradeCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGradeCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGradeCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculate_average;
    private javax.swing.JLabel lblaverage;
    private javax.swing.JLabel lblaverage_msg;
    private javax.swing.JLabel lblfifth_grade;
    private javax.swing.JLabel lblfirst_grade;
    private javax.swing.JLabel lblfourth_grade;
    private javax.swing.JLabel lblinstructions;
    private javax.swing.JLabel lblpercentage1;
    private javax.swing.JLabel lblpercentage2;
    private javax.swing.JLabel lblpercentage3;
    private javax.swing.JLabel lblpercentage4;
    private javax.swing.JLabel lblpercentage5;
    private javax.swing.JLabel lblsecond_grade;
    private javax.swing.JLabel lblthird_grade;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JLabel lblwelcomemsg;
    private javax.swing.JTextField txtfifth_grade;
    private javax.swing.JTextField txtfirst_grade;
    private javax.swing.JTextField txtfourth_grade;
    private javax.swing.JTextField txtsecond_grade;
    private javax.swing.JTextField txtthird_grade;
    // End of variables declaration//GEN-END:variables
}
