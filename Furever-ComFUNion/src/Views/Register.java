/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author joshu
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        // Window logo
        ImageIcon icon1 = null;
        try {
            icon1 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/logo2.png")));
            if (icon1.getImageLoadStatus() == MediaTracker.ERRORED) {
                throw new NullPointerException("Image not found or cannot be loaded.");
            }
            this.setIconImage(icon1.getImage());
        } catch (NullPointerException e) {
            System.err.println("Error: Image not found. " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleContainer = new javax.swing.JPanel();
        registerHeader = new javax.swing.JLabel();
        registerContainer = new javax.swing.JPanel();
        fullNameLabel = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        fullName = new javax.swing.JTextPane();
        currentAddressLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        currentAddress = new javax.swing.JTextPane();
        usernameLabel = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        username = new javax.swing.JTextPane();
        occupationLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        occupation = new javax.swing.JTextPane();
        contactNumber = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contactNum = new javax.swing.JTextPane();
        companyNameLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        companyName = new javax.swing.JTextPane();
        emailAddressLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        emailAddress = new javax.swing.JTextPane();
        workTypeLabel = new javax.swing.JLabel();
        workType = new javax.swing.JComboBox<>();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        birthdateLabel = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        birthdate = new javax.swing.JTextPane();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JLabel();
        loginDescription = new javax.swing.JLabel();
        loginButton = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        errorMessage = new javax.swing.JLabel();
        errorMessageContainer = new javax.swing.JLabel();
        registerBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setResizable(false);

        titleContainer.setBackground(new java.awt.Color(194, 144, 69));
        titleContainer.setPreferredSize(new java.awt.Dimension(900, 75));
        titleContainer.setLayout(new java.awt.GridBagLayout());

        registerHeader.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        registerHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register header.png"))); // NOI18N
        titleContainer.add(registerHeader, new java.awt.GridBagConstraints());

        getContentPane().add(titleContainer, java.awt.BorderLayout.PAGE_START);

        registerContainer.setBackground(new java.awt.Color(255, 250, 205));
        registerContainer.setPreferredSize(new java.awt.Dimension(900, 575));
        registerContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        fullNameLabel.setText("Full Name [First, Last]:");
        registerContainer.add(fullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 49, -1, -1));

        jScrollPane12.setHorizontalScrollBar(null);
        jScrollPane12.setViewportView(fullName);

        registerContainer.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 247, -1));

        currentAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        currentAddressLabel.setText("Current Address:");
        registerContainer.add(currentAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 49, -1, -1));

        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setViewportView(currentAddress);

        registerContainer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 280, -1));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        usernameLabel.setText("Username:");
        registerContainer.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jScrollPane10.setHorizontalScrollBar(null);
        jScrollPane10.setViewportView(username);

        registerContainer.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 247, -1));

        occupationLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        occupationLabel.setText("Occupation:");
        registerContainer.add(occupationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 118, -1, -1));

        jScrollPane8.setHorizontalScrollBar(null);
        jScrollPane8.setViewportView(occupation);

        registerContainer.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 150, 282, -1));

        contactNumber.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        contactNumber.setText("Contact Number:");
        registerContainer.add(contactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jScrollPane3.setHorizontalScrollBar(null);
        jScrollPane3.setViewportView(contactNum);

        registerContainer.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 247, -1));

        companyNameLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        companyNameLabel.setText("Company Name:");
        registerContainer.add(companyNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 187, -1, -1));

        jScrollPane9.setHorizontalScrollBar(null);
        jScrollPane9.setViewportView(companyName);

        registerContainer.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 219, 282, -1));

        emailAddressLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        emailAddressLabel.setText("Email Address:");
        registerContainer.add(emailAddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jScrollPane4.setHorizontalScrollBar(null);
        jScrollPane4.setViewportView(emailAddress);

        registerContainer.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 247, -1));

        workTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        workTypeLabel.setText("Work Type:");
        registerContainer.add(workTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 256, -1, -1));

        workType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        workType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workTypeActionPerformed(evt);
            }
        });
        registerContainer.add(workType, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 280, -1));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        passwordLabel.setText("Password:");
        registerContainer.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        registerContainer.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 247, -1));

        birthdateLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        birthdateLabel.setText("Birthday (dd/mm/yyyy)");
        registerContainer.add(birthdateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 325, -1, -1));

        jScrollPane11.setHorizontalScrollBar(null);
        jScrollPane11.setViewportView(birthdate);

        registerContainer.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 357, 102, -1));

        confirmPasswordLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password:");
        registerContainer.add(confirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));
        registerContainer.add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 247, -1));

        registerButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register acc.png"))); // NOI18N
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerContainer.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 403, -1, -1));

        loginDescription.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        loginDescription.setText("Already have an account? ");
        registerContainer.add(loginDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, -1, -1));

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        loginButton.setForeground(new java.awt.Color(99, 71, 12));
        loginButton.setText("<html>\n<u>Login here</u>\n</html>");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        registerContainer.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 480, -1, -1));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        registerContainer.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 357, 53, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });
        registerContainer.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 357, 53, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        registerContainer.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 357, 53, -1));

        errorMessage.setText("Lagayan ng error message");
        registerContainer.add(errorMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        errorMessageContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/success error container.png"))); // NOI18N
        registerContainer.add(errorMessageContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 470, 280, 80));

        registerBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register bg.png"))); // NOI18N
        registerBg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerContainer.add(registerBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 660, 560));

        getContentPane().add(registerContainer, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void workTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workTypeActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // TODO add your handling code here:
        loginButton.setForeground(Color.RED);
    }//GEN-LAST:event_loginButtonMouseEntered

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // TODO add your handling code here:
        loginButton.setForeground(new java.awt.Color(99, 71, 12));
    }//GEN-LAST:event_loginButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        // TODO add your handling code here:
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register acc hover.png")));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        // TODO add your handling code here:
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register acc.png")));
    }//GEN-LAST:event_registerButtonMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane birthdate;
    private javax.swing.JLabel birthdateLabel;
    private javax.swing.JTextPane companyName;
    private javax.swing.JLabel companyNameLabel;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JTextPane contactNum;
    private javax.swing.JLabel contactNumber;
    private javax.swing.JTextPane currentAddress;
    private javax.swing.JLabel currentAddressLabel;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JTextPane emailAddress;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel errorMessageContainer;
    private javax.swing.JTextPane fullName;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel loginDescription;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextPane occupation;
    private javax.swing.JLabel occupationLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel registerBg;
    private javax.swing.JLabel registerButton;
    private javax.swing.JPanel registerContainer;
    private javax.swing.JLabel registerHeader;
    private javax.swing.JPanel titleContainer;
    private javax.swing.JTextPane username;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JComboBox<String> workType;
    private javax.swing.JLabel workTypeLabel;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
