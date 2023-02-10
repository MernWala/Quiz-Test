package miniproject.pkg1;

import Admin.Rules;
import com.connection.connect;
import java.awt.Color;
import javax.swing.JOptionPane;

public class actualTest extends javax.swing.JFrame {

    protected int currIndex = 0, StuAns_Index = 0;
    protected String outputStr = "";
    String[] stuAns = new String[Rules.totalQuestion];

    public actualTest(String testTitle) {
        initComponents();
        utility.BorderSpacing(aT_HeadingSection, 0, 10, 0, 0);
        utility.BorderSpacing(aT_Btn_Next, 2, 5, 2, 5);
        aTest_TF_testName.setText(testTitle);
        connect.createTable(Rules.genrateQuery_createTable(Rules.testNameAns, Rules.totalQuestion));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aT_BtnGrp_UserAns = new javax.swing.ButtonGroup();
        main = new javax.swing.JPanel();
        aT_HeadingSection = new javax.swing.JPanel();
        aTest_TF_testName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        aT_MidSection = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        aT_Sno_Block = new javax.swing.JPanel();
        aT_L_QuestionNum = new javax.swing.JLabel();
        aT_Que_Block = new javax.swing.JPanel();
        aT_TA_ActualQuestion = new javax.swing.JTextArea();
        aT_OptionBlock = new javax.swing.JPanel();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        btn5 = new javax.swing.JRadioButton();
        aT_BottomSection = new javax.swing.JPanel();
        aT_NextPrevious_Btn = new javax.swing.JPanel();
        aT_Btn_Next = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        aT_TF_responseBox = new javax.swing.JTextField();

        aT_BtnGrp_UserAns.add(btn1);
        aT_BtnGrp_UserAns.add(btn2);
        aT_BtnGrp_UserAns.add(btn3);
        aT_BtnGrp_UserAns.add(btn4);
        aT_BtnGrp_UserAns.add(btn5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(51, 51, 51));
        main.setForeground(new java.awt.Color(51, 51, 51));

        aT_HeadingSection.setBackground(new java.awt.Color(51, 51, 51));
        aT_HeadingSection.setForeground(new java.awt.Color(51, 51, 51));

        aTest_TF_testName.setEditable(false);
        aTest_TF_testName.setBackground(new java.awt.Color(51, 51, 51));
        aTest_TF_testName.setFont(new java.awt.Font("HP Simplified", 0, 24)); // NOI18N
        aTest_TF_testName.setForeground(new java.awt.Color(255, 255, 255));
        aTest_TF_testName.setBorder(null);

        javax.swing.GroupLayout aT_HeadingSectionLayout = new javax.swing.GroupLayout(aT_HeadingSection);
        aT_HeadingSection.setLayout(aT_HeadingSectionLayout);
        aT_HeadingSectionLayout.setHorizontalGroup(
            aT_HeadingSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_HeadingSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aTest_TF_testName)
                .addContainerGap())
        );
        aT_HeadingSectionLayout.setVerticalGroup(
            aT_HeadingSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_HeadingSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aTest_TF_testName, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        aT_MidSection.setBackground(new java.awt.Color(51, 51, 51));
        aT_MidSection.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        aT_Sno_Block.setBackground(new java.awt.Color(51, 51, 51));

        aT_L_QuestionNum.setBackground(new java.awt.Color(51, 51, 51));
        aT_L_QuestionNum.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        aT_L_QuestionNum.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout aT_Sno_BlockLayout = new javax.swing.GroupLayout(aT_Sno_Block);
        aT_Sno_Block.setLayout(aT_Sno_BlockLayout);
        aT_Sno_BlockLayout.setHorizontalGroup(
            aT_Sno_BlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_Sno_BlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_L_QuestionNum, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );
        aT_Sno_BlockLayout.setVerticalGroup(
            aT_Sno_BlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_Sno_BlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_L_QuestionNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aT_Que_Block.setBackground(new java.awt.Color(51, 51, 51));

        aT_TA_ActualQuestion.setEditable(false);
        aT_TA_ActualQuestion.setBackground(new java.awt.Color(51, 51, 51));
        aT_TA_ActualQuestion.setColumns(20);
        aT_TA_ActualQuestion.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        aT_TA_ActualQuestion.setForeground(new java.awt.Color(255, 255, 255));
        aT_TA_ActualQuestion.setRows(5);
        aT_TA_ActualQuestion.setText("Press next to continue test");
        aT_TA_ActualQuestion.setBorder(null);

        javax.swing.GroupLayout aT_Que_BlockLayout = new javax.swing.GroupLayout(aT_Que_Block);
        aT_Que_Block.setLayout(aT_Que_BlockLayout);
        aT_Que_BlockLayout.setHorizontalGroup(
            aT_Que_BlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_Que_BlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_TA_ActualQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        aT_Que_BlockLayout.setVerticalGroup(
            aT_Que_BlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_Que_BlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_TA_ActualQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aT_OptionBlock.setBackground(new java.awt.Color(51, 51, 51));

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setFont(new java.awt.Font("HP Simplified", 0, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setFont(new java.awt.Font("HP Simplified", 0, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setFont(new java.awt.Font("HP Simplified", 0, 12)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));

        btn4.setBackground(new java.awt.Color(51, 51, 51));
        btn4.setFont(new java.awt.Font("HP Simplified", 0, 12)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));

        btn5.setBackground(new java.awt.Color(51, 51, 51));
        btn5.setFont(new java.awt.Font("HP Simplified", 0, 12)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aT_OptionBlockLayout = new javax.swing.GroupLayout(aT_OptionBlock);
        aT_OptionBlock.setLayout(aT_OptionBlockLayout);
        aT_OptionBlockLayout.setHorizontalGroup(
            aT_OptionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_OptionBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aT_OptionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        aT_OptionBlockLayout.setVerticalGroup(
            aT_OptionBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_OptionBlockLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(aT_Sno_Block, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aT_Que_Block, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(aT_OptionBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aT_Que_Block, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aT_Sno_Block, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aT_OptionBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout aT_MidSectionLayout = new javax.swing.GroupLayout(aT_MidSection);
        aT_MidSection.setLayout(aT_MidSectionLayout);
        aT_MidSectionLayout.setHorizontalGroup(
            aT_MidSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_MidSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        aT_MidSectionLayout.setVerticalGroup(
            aT_MidSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aT_MidSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        aT_BottomSection.setBackground(new java.awt.Color(51, 51, 51));

        aT_NextPrevious_Btn.setBackground(new java.awt.Color(51, 51, 51));

        aT_Btn_Next.setBackground(new java.awt.Color(51, 51, 51));
        aT_Btn_Next.setFont(new java.awt.Font("HP Simplified", 0, 14)); // NOI18N
        aT_Btn_Next.setForeground(new java.awt.Color(255, 255, 255));
        aT_Btn_Next.setText("Next");
        aT_Btn_Next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aT_Btn_Next.setContentAreaFilled(false);
        aT_Btn_Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aT_Btn_Next.setDefaultCapable(false);
        aT_Btn_Next.setMinimumSize(new java.awt.Dimension(20, 100));
        aT_Btn_Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aT_Btn_NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aT_Btn_NextMouseExited(evt);
            }
        });
        aT_Btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aT_Btn_NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aT_NextPrevious_BtnLayout = new javax.swing.GroupLayout(aT_NextPrevious_Btn);
        aT_NextPrevious_Btn.setLayout(aT_NextPrevious_BtnLayout);
        aT_NextPrevious_BtnLayout.setHorizontalGroup(
            aT_NextPrevious_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_NextPrevious_BtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_Btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        aT_NextPrevious_BtnLayout.setVerticalGroup(
            aT_NextPrevious_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aT_NextPrevious_BtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aT_Btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout aT_BottomSectionLayout = new javax.swing.GroupLayout(aT_BottomSection);
        aT_BottomSection.setLayout(aT_BottomSectionLayout);
        aT_BottomSectionLayout.setHorizontalGroup(
            aT_BottomSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aT_BottomSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_NextPrevious_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        aT_BottomSectionLayout.setVerticalGroup(
            aT_BottomSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aT_BottomSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aT_NextPrevious_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        aT_TF_responseBox.setBackground(new java.awt.Color(51, 51, 51));
        aT_TF_responseBox.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        aT_TF_responseBox.setForeground(new java.awt.Color(255, 255, 255));
        aT_TF_responseBox.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aT_TF_responseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_TF_responseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aT_MidSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aT_HeadingSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aT_BottomSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aT_HeadingSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aT_MidSection, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aT_BottomSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aT_Btn_NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aT_Btn_NextMouseEntered
        aT_Btn_Next.setForeground(new utility().hoverClr);
    }//GEN-LAST:event_aT_Btn_NextMouseEntered

    private void aT_Btn_NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aT_Btn_NextMouseExited
        aT_Btn_Next.setForeground(Color.white);
    }//GEN-LAST:event_aT_Btn_NextMouseExited

    private void aT_Btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aT_Btn_NextActionPerformed
        btn5.setText("Pass the Question");
        if (utility.setTextToAllLablesComponents(aT_L_QuestionNum, aT_TA_ActualQuestion, btn1, btn2, btn3, btn4, currIndex, Rules.testName)) {
            if (currIndex < stuAns.length){ //&& utility.isAnySelected(btn1, btn2, btn3, btn4, btn5)) {
                outputStr = utility.getValue_JRadio(btn1, btn2, btn3, btn4, btn5);
                stuAns[currIndex] = outputStr;
                System.out.println(outputStr);
                aT_BtnGrp_UserAns.clearSelection();
            }
            if (!btn1.isSelected() && !btn2.isSelected() && !btn3.isSelected() && !btn3.isSelected() && !btn5.isSelected()) {
                aT_TF_responseBox.setText("You Have To Choose Any Of The Above Option !");
            }
            aT_TF_responseBox.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Your Test is over.");
            if (connect.insert_into_DB(Rules.testNameAns, Rules.totalQuestion, stuAns, startPage.currEnroll)) {
                JOptionPane.showMessageDialog(this, "Your answer is recorded");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(this, "Problem with storing data");
            }
        }
        currIndex++;
    }//GEN-LAST:event_aT_Btn_NextActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//        java.awt.EventQueue.invokeLater(() -> {
//            new actualTest("").setVisible(true);
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aT_BottomSection;
    private javax.swing.ButtonGroup aT_BtnGrp_UserAns;
    private javax.swing.JButton aT_Btn_Next;
    private javax.swing.JPanel aT_HeadingSection;
    private javax.swing.JLabel aT_L_QuestionNum;
    private javax.swing.JPanel aT_MidSection;
    private javax.swing.JPanel aT_NextPrevious_Btn;
    private javax.swing.JPanel aT_OptionBlock;
    private javax.swing.JPanel aT_Que_Block;
    private javax.swing.JPanel aT_Sno_Block;
    private javax.swing.JTextArea aT_TA_ActualQuestion;
    private javax.swing.JTextField aT_TF_responseBox;
    private javax.swing.JTextField aTest_TF_testName;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JRadioButton btn5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
