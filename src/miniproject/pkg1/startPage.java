package miniproject.pkg1;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import com.connection.connect;

public class startPage extends javax.swing.JFrame {

    public startPage() {
        initComponents();
        this.Login_TF_StudentName.setBorder(BorderFactory.createCompoundBorder(
                this.Login_TF_StudentName.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        this.Login_TF_TesName.setBorder(BorderFactory.createCompoundBorder(
                this.Login_TF_TesName.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)
        ));

        this.Login_TF_Enrollment.setBorder(BorderFactory.createCompoundBorder(
                this.Login_TF_Enrollment.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        this.Login_Btn_StartTest.setBorder(BorderFactory.createCompoundBorder(
                this.Login_Btn_StartTest.getBorder(), BorderFactory.createEmptyBorder(2, 5, 2, 5)
        ));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginTopParent = new javax.swing.JPanel();
        login_BrandName = new javax.swing.JPanel();
        Login_TF_TesName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Login_RegistrationForm = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Login_TF_StudentName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Login_TF_Enrollment = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Login_Btn_StartTest = new javax.swing.JButton();
        Login_TF_ResponseMess = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        LoginTopParent.setBackground(new java.awt.Color(51, 51, 51));
        LoginTopParent.setForeground(new java.awt.Color(51, 51, 55));

        login_BrandName.setBackground(new java.awt.Color(51, 51, 51));
        login_BrandName.setForeground(new java.awt.Color(51, 51, 55));

        Login_TF_TesName.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        Login_TF_TesName.setForeground(new java.awt.Color(255, 255, 255));
        Login_TF_TesName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Login_TF_TesName.setText("Heading of form");
        Login_TF_TesName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login_TF_TesName.setName(""); // NOI18N

        javax.swing.GroupLayout login_BrandNameLayout = new javax.swing.GroupLayout(login_BrandName);
        login_BrandName.setLayout(login_BrandNameLayout);
        login_BrandNameLayout.setHorizontalGroup(
            login_BrandNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_BrandNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login_TF_TesName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        login_BrandNameLayout.setVerticalGroup(
            login_BrandNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_BrandNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login_TF_TesName, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        Login_RegistrationForm.setBackground(new java.awt.Color(51, 51, 51));
        Login_RegistrationForm.setForeground(new java.awt.Color(51, 51, 55));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 55));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");

        Login_TF_StudentName.setBackground(new java.awt.Color(51, 51, 51));
        Login_TF_StudentName.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        Login_TF_StudentName.setForeground(new java.awt.Color(204, 204, 204));
        Login_TF_StudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Login_TF_StudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_TF_StudentNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_TF_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Login_TF_StudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enroll");

        Login_TF_Enrollment.setBackground(new java.awt.Color(51, 51, 51));
        Login_TF_Enrollment.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        Login_TF_Enrollment.setForeground(new java.awt.Color(204, 204, 204));
        Login_TF_Enrollment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Login_TF_Enrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_TF_EnrollmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_TF_Enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(Login_TF_Enrollment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        Login_Btn_StartTest.setBackground(new java.awt.Color(51, 51, 51));
        Login_Btn_StartTest.setForeground(new java.awt.Color(255, 255, 255));
        Login_Btn_StartTest.setText("Start Test");
        Login_Btn_StartTest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login_Btn_StartTest.setContentAreaFilled(false);
        Login_Btn_StartTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_Btn_StartTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_Btn_StartTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login_Btn_StartTest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Login_Btn_StartTest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Login_TF_ResponseMess.setEditable(false);
        Login_TF_ResponseMess.setBackground(new java.awt.Color(51, 51, 51));
        Login_TF_ResponseMess.setFont(new java.awt.Font("HP Simplified Hans Light", 0, 14)); // NOI18N
        Login_TF_ResponseMess.setForeground(new java.awt.Color(255, 255, 255));
        Login_TF_ResponseMess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Login_TF_ResponseMess.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Login_TF_ResponseMess, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Login_TF_ResponseMess, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Login_RegistrationFormLayout = new javax.swing.GroupLayout(Login_RegistrationForm);
        Login_RegistrationForm.setLayout(Login_RegistrationFormLayout);
        Login_RegistrationFormLayout.setHorizontalGroup(
            Login_RegistrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_RegistrationFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Login_RegistrationFormLayout.setVerticalGroup(
            Login_RegistrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_RegistrationFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LoginTopParentLayout = new javax.swing.GroupLayout(LoginTopParent);
        LoginTopParent.setLayout(LoginTopParentLayout);
        LoginTopParentLayout.setHorizontalGroup(
            LoginTopParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginTopParentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginTopParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_BrandName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Login_RegistrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        LoginTopParentLayout.setVerticalGroup(
            LoginTopParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginTopParentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_BrandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Login_RegistrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTopParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginTopParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_TF_StudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_TF_StudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_TF_StudentNameActionPerformed

    private void Login_TF_EnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_TF_EnrollmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_TF_EnrollmentActionPerformed

    private void Login_Btn_StartTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_Btn_StartTestActionPerformed
        final String stuName = Login_TF_StudentName.getText();
        final String stuEnroll = Login_TF_Enrollment.getText();

        connect obj = new connect();

        if (!stuName.isEmpty() && !stuEnroll.isEmpty()) {
            int i = obj.registerStudent(stuName, stuEnroll);
            if(i > 0){
                Login_TF_ResponseMess.setText("Your test is being started. Best of Luck");
            }else{
                Login_TF_ResponseMess.setText("Somthing went wrong with server ..!");
            }
        }

        
    }//GEN-LAST:event_Login_Btn_StartTestActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startPage.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginTopParent;
    private javax.swing.JButton Login_Btn_StartTest;
    private javax.swing.JPanel Login_RegistrationForm;
    private javax.swing.JTextField Login_TF_Enrollment;
    private javax.swing.JTextField Login_TF_ResponseMess;
    private javax.swing.JTextField Login_TF_StudentName;
    private javax.swing.JLabel Login_TF_TesName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel login_BrandName;
    // End of variables declaration//GEN-END:variables
}
