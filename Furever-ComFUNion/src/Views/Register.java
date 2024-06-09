package Views;

import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshu
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Main
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        navBar = new javax.swing.JPanel();
        logoContainer = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        navigations = new javax.swing.JPanel();
        filler = new javax.swing.JPanel();
        aboutUs = new javax.swing.JPanel();
        aboutUsButton = new javax.swing.JLabel();
        FAQ = new javax.swing.JPanel();
        faqButton = new javax.swing.JLabel();
        Pets = new javax.swing.JPanel();
        petsButton = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        loginButton = new javax.swing.JLabel();
        Register = new javax.swing.JPanel();
        registerButton = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        slogan = new javax.swing.JLabel();
        description = new javax.swing.JLabel();
        adoptedCounter = new javax.swing.JLabel();
        adoptedLabel = new javax.swing.JLabel();
        badge = new javax.swing.JLabel();
        bulletin = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        navBar.setBackground(new java.awt.Color(194, 144, 69));
        navBar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        logoContainer.setBackground(navBar.getBackground());
        logoContainer.setPreferredSize(new java.awt.Dimension(355, 125));

        logo.setBackground(navBar.getBackground());
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/navLogo.png"))); // NOI18N
        logo.setIconTextGap(0);

        javax.swing.GroupLayout logoContainerLayout = new javax.swing.GroupLayout(logoContainer);
        logoContainer.setLayout(logoContainerLayout);
        logoContainerLayout.setHorizontalGroup(
            logoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoContainerLayout.setVerticalGroup(
            logoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        navBar.add(logoContainer);

        navigations.setBackground(navBar.getBackground());
        navigations.setPreferredSize(new java.awt.Dimension(875, 100));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 25);
        flowLayout1.setAlignOnBaseline(true);
        navigations.setLayout(flowLayout1);

        filler.setBackground(navBar.getBackground());
        filler.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout fillerLayout = new javax.swing.GroupLayout(filler);
        filler.setLayout(fillerLayout);
        fillerLayout.setHorizontalGroup(
            fillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fillerLayout.setVerticalGroup(
            fillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        navigations.add(filler);

        aboutUs.setBackground(navBar.getBackground());
        aboutUs.setPreferredSize(new java.awt.Dimension(100, 40));
        aboutUs.setLayout(new java.awt.GridBagLayout());

        aboutUsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aboutUsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/about us.png"))); // NOI18N
        aboutUsButton.setText("About Us");
        aboutUsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutUsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutUsButtonMouseExited(evt);
            }
        });
        aboutUsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aboutUsButtonKeyPressed(evt);
            }
        });
        aboutUs.add(aboutUsButton, new java.awt.GridBagConstraints());

        navigations.add(aboutUs);

        FAQ.setBackground(navBar.getBackground());
        FAQ.setPreferredSize(new java.awt.Dimension(100, 40));
        FAQ.setLayout(new java.awt.GridBagLayout());

        faqButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        faqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FAQs.png"))); // NOI18N
        faqButton.setText("FAQs");
        faqButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                faqButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                faqButtonMouseExited(evt);
            }
        });
        faqButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                faqButtonKeyPressed(evt);
            }
        });
        FAQ.add(faqButton, new java.awt.GridBagConstraints());

        navigations.add(FAQ);

        Pets.setBackground(navBar.getBackground());
        Pets.setPreferredSize(new java.awt.Dimension(100, 40));
        Pets.setLayout(new java.awt.GridBagLayout());

        petsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        petsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pets.png"))); // NOI18N
        petsButton.setText("Pets");
        petsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                petsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                petsButtonMouseExited(evt);
            }
        });
        petsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                petsButtonKeyPressed(evt);
            }
        });
        Pets.add(petsButton, new java.awt.GridBagConstraints());

        navigations.add(Pets);

        Login.setBackground(navBar.getBackground());
        Login.setPreferredSize(new java.awt.Dimension(150, 60));
        Login.setLayout(new java.awt.GridBagLayout());

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login.png"))); // NOI18N
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });
        Login.add(loginButton, new java.awt.GridBagConstraints());

        navigations.add(Login);

        Register.setBackground(navBar.getBackground());
        Register.setPreferredSize(new java.awt.Dimension(150, 60));
        Register.setLayout(new java.awt.GridBagLayout());

        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register.png"))); // NOI18N
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registerButtonKeyPressed(evt);
            }
        });
        Register.add(registerButton, new java.awt.GridBagConstraints());

        navigations.add(Register);

        navBar.add(navigations);

        getContentPane().add(navBar, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(255, 251, 209));
        body.setBorder(new javax.swing.border.MatteBorder(null));
        body.setPreferredSize(new java.awt.Dimension(1270, 695));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slogan.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        slogan.setForeground(new java.awt.Color(51, 51, 255));
        slogan.setText("<html> <head> <style> p {     font-family: 'Comic Sans MS', cursive;     font-size: 60px;     color: #000000; /* Black text */     text-align: center;     margin-top: 50px;     text-shadow:          -1px -1px 0 #ffffff,           1px -1px 0 #ffffff,         -1px 1px 0 #ffffff,         1px 1px 0 #ffffff; /* White border */ } </style> </head> <body> <p>Connecting Hearts with Paws</p> </body> </html> ");
        body.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 670, 260));

        description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        description.setText("<html> <head> <style> p { \tfont-family: 'Open Sans', sans-serif;             font-size: 14px;             color: #000000;             text-align: justify;             margin-top: 20px;             max-width: 100%;             margin-left: auto;             margin-right: auto; \t\t\t} \t\t</style> \t</head> \t<body> \t\t<p>Finding a loving home for every furry friend is our mission. <br>             <br>With \"Furever ComFUNion,\" adopting/rehoming a pet becomes an effortless and joyful experience. <br><br>             Make a lasting impact—bring joy to an animal's life and enrich your own by giving a pet a forever home today. <br>             <br>With Furever ComFUNion, the perfect companion is just a few clicks away.</p> \t</body> </html>");
        body.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 520, 270));

        adoptedCounter.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        adoptedCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adoptedCounter.setText("100");
        adoptedCounter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                badgeKeyPressed(evt);
            }
        });
        body.add(adoptedCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 220, 120));

        adoptedLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        adoptedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adoptedLabel.setText("Pets are adopted");
        adoptedLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                badgeKeyPressed(evt);
            }
        });
        body.add(adoptedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 320, 50));

        badge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/badge2.png"))); // NOI18N
        badge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                badgeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                badgeMouseExited(evt);
            }
        });
        badge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                badgeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                badgeKeyReleased(evt);
            }
        });
        body.add(badge, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, -1));

        bulletin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bulletin.png"))); // NOI18N
        body.add(bulletin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 650, 410));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/paw prints.png"))); // NOI18N
        body.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonKeyPressed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonKeyPressed

    private void petsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petsButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_petsButtonKeyPressed

    private void faqButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_faqButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_faqButtonKeyPressed

    private void aboutUsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aboutUsButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutUsButtonKeyPressed

    private void badgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_badgeKeyPressed
        // TODO add your handling code here:
        // This will show the records of the adopted pets
    }//GEN-LAST:event_badgeKeyPressed

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login hover.png")));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        // TODO add your handling code here:
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/login.png")));
    }//GEN-LAST:event_loginButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        // TODO add your handling code here:
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register hover.png")));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        // TODO add your handling code here:
        registerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/register.png")));
    }//GEN-LAST:event_registerButtonMouseExited

    private void petsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petsButtonMouseEntered
        // TODO add your handling code here:
        petsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pets hover.png")));
    }//GEN-LAST:event_petsButtonMouseEntered

    private void petsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petsButtonMouseExited
        // TODO add your handling code here:
        petsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pets.png")));
    }//GEN-LAST:event_petsButtonMouseExited

    private void faqButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqButtonMouseEntered
        // TODO add your handling code here:
        faqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FAQs hover.png")));
    }//GEN-LAST:event_faqButtonMouseEntered

    private void faqButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqButtonMouseExited
        // TODO add your handling code here:
        faqButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/FAQs.png")));
    }//GEN-LAST:event_faqButtonMouseExited

    private void aboutUsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsButtonMouseEntered
        // TODO add your handling code here:
        aboutUsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/about us hover.png")));
    }//GEN-LAST:event_aboutUsButtonMouseEntered

    private void aboutUsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsButtonMouseExited
        // TODO add your handling code here:
        aboutUsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/about us.png")));
    }//GEN-LAST:event_aboutUsButtonMouseExited

    private void badgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_badgeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_badgeKeyReleased

    private void badgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badgeMouseEntered
        // TODO add your handling code here:
        badge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/badge2 hover.png")));
        adoptedCounter.setForeground(java.awt.Color.yellow);
        adoptedLabel.setForeground(java.awt.Color.yellow);
    }//GEN-LAST:event_badgeMouseEntered

    private void badgeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_badgeMouseExited
        // TODO add your handling code here:
        badge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/badge2.png")));
        adoptedCounter.setForeground(java.awt.Color.black);
        adoptedLabel.setForeground(java.awt.Color.black);
    }//GEN-LAST:event_badgeMouseExited

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FAQ;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Pets;
    private javax.swing.JPanel Register;
    private javax.swing.JPanel aboutUs;
    private javax.swing.JLabel aboutUsButton;
    private javax.swing.JLabel adoptedCounter;
    private javax.swing.JLabel adoptedLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel badge;
    private javax.swing.JPanel body;
    private javax.swing.JLabel bulletin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel description;
    private javax.swing.JLabel faqButton;
    private javax.swing.JPanel filler;
    private javax.swing.JLabel loginButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoContainer;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel navigations;
    private javax.swing.JLabel petsButton;
    private javax.swing.JLabel registerButton;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables
}
