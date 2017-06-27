/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author $$Goutham...!!$$
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    int pokemon_select;
    public Frame1() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        
        int xsize=(int)tk.getScreenSize().getWidth();
        int ysize=(int)tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
       
    }
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_start = new javax.swing.JButton();
        lbl_gotta = new javax.swing.JLabel();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        lbl_loading = new javax.swing.JLabel();
        lbl_player1 = new javax.swing.JLabel();
        btn_typhlosion = new javax.swing.JButton();
        lbl_typhlosion = new javax.swing.JLabel();
        btn_feraligatr = new javax.swing.JButton();
        lbl_feraligatr = new javax.swing.JLabel();
        btn_blastoise = new javax.swing.JButton();
        lbl_blastoise = new javax.swing.JLabel();
        btn_charizad = new javax.swing.JButton();
        lbl_charizad = new javax.swing.JLabel();
        lbl_venasaur = new javax.swing.JLabel();
        btn_venasaur = new javax.swing.JButton();
        lbl_select = new javax.swing.JLabel();
        pl1 = new javax.swing.JLabel();
        pl2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btn_start.setText("START");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        getContentPane().add(btn_start);
        btn_start.setBounds(250, 480, 73, 25);

        lbl_gotta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/article-2415853-002CD0A400000258-494_634x490.jpg"))); // NOI18N
        getContentPane().add(lbl_gotta);
        lbl_gotta.setBounds(0, 0, 700, 500);

        btn4.setText("jButton4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(410, 320, 79, 25);

        btn5.setText("jButton5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(540, 320, 79, 25);

        btn3.setText("jButton3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(290, 320, 79, 25);

        btn2.setText("jButton2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(170, 320, 79, 25);

        btn1.setText("jButton1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(50, 320, 79, 25);

        lbl_loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/ajax-loader.gif"))); // NOI18N
        getContentPane().add(lbl_loading);
        lbl_loading.setBounds(500, 430, 30, 40);

        lbl_player1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_player1.setText("                                           PLAYER 1 : SELECT POKEMON");
        getContentPane().add(lbl_player1);
        lbl_player1.setBounds(30, 480, 600, 20);

        btn_typhlosion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/157Typhlosion_Pokemon_Ranger_Guardian_Signs.png"))); // NOI18N
        btn_typhlosion.setText("jButton1");
        btn_typhlosion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_typhlosionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_typhlosion);
        btn_typhlosion.setBounds(510, 5, 110, 180);

        lbl_typhlosion.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lbl_typhlosion.setForeground(new java.awt.Color(102, 102, 0));
        lbl_typhlosion.setText(" TYPHLOSION");
        getContentPane().add(lbl_typhlosion);
        lbl_typhlosion.setBounds(511, 186, 120, 40);

        btn_feraligatr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/160Feraligatr_OS_anime_2.png"))); // NOI18N
        btn_feraligatr.setText("jButton1");
        btn_feraligatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_feraligatrActionPerformed(evt);
            }
        });
        getContentPane().add(btn_feraligatr);
        btn_feraligatr.setBounds(390, 5, 110, 180);

        lbl_feraligatr.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        lbl_feraligatr.setForeground(new java.awt.Color(0, 0, 102));
        lbl_feraligatr.setText(" FERALIGATR");
        getContentPane().add(lbl_feraligatr);
        lbl_feraligatr.setBounds(390, 180, 130, 50);

        btn_blastoise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/Shiny_Blastoise_XY3.png"))); // NOI18N
        btn_blastoise.setText("jButton1");
        btn_blastoise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blastoiseActionPerformed(evt);
            }
        });
        getContentPane().add(btn_blastoise);
        btn_blastoise.setBounds(270, 10, 110, 170);

        lbl_blastoise.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lbl_blastoise.setForeground(new java.awt.Color(0, 204, 204));
        lbl_blastoise.setText("BLASTOISE");
        getContentPane().add(lbl_blastoise);
        lbl_blastoise.setBounds(270, 193, 100, 30);

        btn_charizad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/Charizard.jpg"))); // NOI18N
        btn_charizad.setText("jButton1");
        btn_charizad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_charizadActionPerformed(evt);
            }
        });
        getContentPane().add(btn_charizad);
        btn_charizad.setBounds(150, 10, 110, 170);

        lbl_charizad.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        lbl_charizad.setForeground(new java.awt.Color(255, 51, 51));
        lbl_charizad.setText("CHARIZAD");
        getContentPane().add(lbl_charizad);
        lbl_charizad.setBounds(160, 190, 100, 40);

        lbl_venasaur.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lbl_venasaur.setForeground(new java.awt.Color(0, 255, 51));
        lbl_venasaur.setText("Venasaur");
        getContentPane().add(lbl_venasaur);
        lbl_venasaur.setBounds(30, 180, 110, 50);

        btn_venasaur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/venusaur.png"))); // NOI18N
        btn_venasaur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venasaurActionPerformed(evt);
            }
        });
        getContentPane().add(btn_venasaur);
        btn_venasaur.setBounds(30, 10, 110, 170);

        lbl_select.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokeimages/select.jpg"))); // NOI18N
        lbl_select.setText("jLabel2");
        getContentPane().add(lbl_select);
        lbl_select.setBounds(1, 6, 650, 470);

        pl1.setBackground(new java.awt.Color(0, 0, 0));
        pl1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pl1.setForeground(new java.awt.Color(255, 255, 255));
        pl1.setText("Player 1 select");
        getContentPane().add(pl1);
        pl1.setBounds(10, 520, 180, 30);

        pl2.setBackground(new java.awt.Color(102, 102, 102));
        pl2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        pl2.setForeground(new java.awt.Color(255, 255, 255));
        pl2.setText("Player 2 select");
        getContentPane().add(pl2);
        pl2.setBounds(240, 520, 180, 30);

        jButton1.setText("BATTLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 520, 77, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        //btn_start.setVisible(false);
        lbl_loading.setVisible(true);
      /*  try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Frame1.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        lbl_gotta.setVisible(false);
        lbl_loading.setVisible(false);
        
    }//GEN-LAST:event_btn_startActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        lbl_loading.setVisible(false);
        pl1.setVisible(true);
        pl2.setVisible(false);
    }//GEN-LAST:event_formWindowOpened
    
    int btnCount=1;
    BackEnd b=new BackEnd();
    private void btn_blastoiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blastoiseActionPerformed
        pokemon_select=2;
        this.setVisible(false);
        new Frame2(pokemon_select).setVisible(true);
    }//GEN-LAST:event_btn_blastoiseActionPerformed

    private void btn_venasaurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venasaurActionPerformed
        // TODO add your handling code here:
        if(btnCount==1){
        pokemon_select=0;
        b.selectPokemonP1(0);
        btnCount++;
        pl1.setVisible(false);
        pl2.setVisible(true);
        
        }
        else if(btnCount==2){
            pokemon_select=0;
            b.selectPokemonP1(0);
            btnCount=3;
            btn_venasaur.setVisible(true);
        }
    }//GEN-LAST:event_btn_venasaurActionPerformed

    private void btn_charizadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_charizadActionPerformed
        // TODO add your handling code here:
        pokemon_select=1;
    }//GEN-LAST:event_btn_charizadActionPerformed

    private void btn_feraligatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_feraligatrActionPerformed
        // TODO add your handling code here:
        pokemon_select=3;
    }//GEN-LAST:event_btn_feraligatrActionPerformed

    private void btn_typhlosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_typhlosionActionPerformed
        // TODO add your handling code here:
        pokemon_select=4;
    }//GEN-LAST:event_btn_typhlosionActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        pokemon_select=5;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        pokemon_select=6;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        pokemon_select=7;

    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        pokemon_select=8;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        pokemon_select=9;
    }//GEN-LAST:event_btn5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn_blastoise;
    private javax.swing.JButton btn_charizad;
    private javax.swing.JButton btn_feraligatr;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_typhlosion;
    private javax.swing.JButton btn_venasaur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_blastoise;
    private javax.swing.JLabel lbl_charizad;
    private javax.swing.JLabel lbl_feraligatr;
    private javax.swing.JLabel lbl_gotta;
    private javax.swing.JLabel lbl_loading;
    private javax.swing.JLabel lbl_player1;
    private javax.swing.JLabel lbl_select;
    private javax.swing.JLabel lbl_typhlosion;
    private javax.swing.JLabel lbl_venasaur;
    private javax.swing.JLabel pl1;
    private javax.swing.JLabel pl2;
    // End of variables declaration//GEN-END:variables
}
