/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Planilha.PS;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael Ribeiro
 */
public class Tela extends javax.swing.JFrame {
    
    public Color COR_BTN_HABILITADO = Color.BLACK;
    public Color COR_BTN_DESABILITADO = Color.RED;
    
    public int v;
    public int TDA;
    public int AT1, AT2, AT3, AT4, AT5, AT6;
    
    public static String A1, A2, A3, A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7, D1, D2, D3, D4, D5, D6, D7, E1, E2, E3, E4, E5, E6, E7, F1, F2, F3, F4, F5, F6, F7;
    
    public Planilha planilha = new Planilha();
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    public void FuncaoPrincipal(){
                v++;//A cada clique incrementa +1
                ////////////////////////////////////////////////////////////////////////
                /*SE NENHUM BOTAO ESTIVER HABILITADO*/
                if((BTN1.isSelected() && BTN2.isSelected() && BTN3.isSelected() && BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()) ||
                (!BTN1.isEnabled() && !BTN2.isEnabled() && !BTN3.isEnabled() && !BTN4.isEnabled() && !BTN5.isEnabled() && !BTN6.isEnabled())){
                    JOptionPane.showMessageDialog(null,"Habilite pelo menos um Técnico.","Aviso",JOptionPane.WARNING_MESSAGE);
                }
                ////////////////////////////////////////////////////////////////////////
                /*SE APENAS O 5° TÉCNICO ESTIVER HABILITADO*/
                if((BTN1.isSelected() && BTN2.isSelected() && BTN3.isSelected() && BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()) ||
                (!BTN1.isEnabled() && !BTN2.isEnabled() && !BTN3.isEnabled() && !BTN4.isEnabled() && BTN5.isEnabled() && !BTN6.isEnabled())){
                    v = 5;
                }
                ///////////////////////////////////////////////////////////////////////
                 if(v == 1 && (BTN1.isSelected() && BTN2.isSelected() && BTN3.isSelected() && BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()) || 
                (!BTN1.isEnabled() && !BTN2.isEnabled() && !BTN3.isEnabled() && !BTN4.isEnabled() && BTN5.isEnabled() && !BTN6.isEnabled())){
                    
                TEXTO_NOME_DA_VEZ.setText("Técnico 5"+" - "+"5555");
                AT5++;
                BTN5.setText("Técnico 5"+" - "+AT5);
                TDA++;
                    
                }
                ///////////////////////////////////////////////////////////////////////
                /*SE APENAS O 4º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && BTN2.isSelected() && BTN3.isSelected() && !BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 5;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 5 && BTN1.isSelected() && !BTN2.isSelected() && BTN3.isSelected() && !BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 3;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && !BTN2.isSelected() && BTN3.isSelected() && BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 4;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 3º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 5 && BTN1.isSelected() && BTN2.isSelected() && !BTN3.isSelected() && !BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 2;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º E O 3º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 4 && BTN1.isSelected() && !BTN2.isSelected() && !BTN3.isSelected() && BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 2;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 3º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && BTN2.isSelected() && !BTN3.isSelected() && BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 3;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º, O 3º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && !BTN2.isSelected() && !BTN3.isSelected() && BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 4;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 3º, O 4º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && BTN2.isSelected() && !BTN3.isSelected() && !BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 3;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º, O 3º E O 4º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 5 && BTN1.isSelected() && !BTN2.isSelected() && !BTN3.isSelected() && !BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 3;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º, O 4º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && !BTN2.isSelected() && BTN3.isSelected() && !BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 4;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º, O 3º, O 4º E O 5º TÉCNICO ESTIVEREM HABILITADOS*/
                if(v == 6 && BTN1.isSelected() && !BTN2.isSelected() && !BTN3.isSelected() && !BTN4.isSelected() && !BTN5.isSelected() && BTN6.isSelected()){
                    v = v - 4;
                }
                //////////////////////////////////////////////////////////////////////
                /*NA VEZ DO TÉCNICO E O MESMO ESTIVER DESABILITADO*/
                 if(v == 1 && BTN1.isSelected() || v == 1 && !BTN1.isEnabled()){
                    v++;
                }if(v == 2 && BTN2.isSelected() || v == 2 && !BTN2.isEnabled()){
                    v++;
                }if(v == 3 && BTN3.isSelected() || v == 3 && !BTN3.isEnabled()){
                    v++;
                }if(v == 4 && BTN4.isSelected() || v == 4 && !BTN4.isEnabled()){
                    v++;
                }if(v == 5 && BTN5.isSelected() || v == 5 && !BTN5.isEnabled()){
                    v++;
                }if(v == 6 && BTN6.isSelected() || v == 6 && !BTN6.isEnabled()){
                    v=1;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 1º TÉCNICO ESTIVER HABILITADO*/
                if(BTN2.isSelected() && BTN3.isSelected() && BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v=1;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 2º TÉCNICO ESTIVER HABILITADO*/
                if(BTN1.isSelected() && BTN3.isSelected() && BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v=2;
                }
                /////////////////////////////////////////////////////////////////////
                /*SE APENAS O 3º TÉCNICO ESTIVER HABILITADO*/
                if(BTN1.isSelected() && BTN2.isSelected() && BTN4.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v=3;
                }
                //////////////////////////////////////////////////////////////////////
                /*SE APENAS O 4º TÉCNICO ESTIVER HABILITADO*/
                if(BTN1.isSelected() && BTN2.isSelected() && BTN3.isSelected() && BTN5.isSelected() && BTN6.isSelected()){
                    v=4;
                }
                /////////////////////////////////////////////////////////////////////
                /*SE APENAS O 5º TÉCNICO ESTIVER HABILITADO*/
                if(BTN1.isSelected() && BTN2.isSelected() && BTN3.isSelected() && BTN4.isSelected() && BTN6.isSelected()){
                    v=5;
                }
                /////////////////////////////////////////////////////////////////////
                /*NA VEZ DO TÉCNICO E O MESMO ESTIVER HABILITADO*/
                if(v == 1 && !BTN1.isSelected()){
                    
                    TEXTO_NOME_DA_VEZ.setText(A2+" - "+B2);
                    AT1++;
                    BTN1.setText(A2+" - "+AT1);
                    TDA++;
                    
                }       if(v == 2 && !BTN2.isSelected()){
                    
                    TEXTO_NOME_DA_VEZ.setText(A3+" - "+B3);
                    AT2++;
                    BTN2.setText(A3+" - "+AT2);
                    TDA++;
                    
                }       if(v == 3 && !BTN3.isSelected()){ 
                    
                    TEXTO_NOME_DA_VEZ.setText(A4+" - "+B4);
                    AT3++;
                    BTN3.setText(A4+" - "+AT3);
                    TDA++;
                    
                }       if(v == 4 && !BTN4.isSelected()){ 
                    
                    TEXTO_NOME_DA_VEZ.setText(A5+" - "+B5);
                    AT4++;
                    BTN4.setText(A5+" - "+AT4);
                    TDA++;
                    
                }       if(v == 5 && !BTN5.isSelected()){ 
                    
                    TEXTO_NOME_DA_VEZ.setText(A6+" - "+B6);
                    AT5++;
                    BTN5.setText(A6+" - "+AT5);
                    TDA++;
                    
                }       if(v == 6 && !BTN6.isSelected()){ 
                    
                    TEXTO_NOME_DA_VEZ.setText(A7+" - "+B7);
                    AT6++;
                    BTN6.setText(A7+" - "+AT6);
                    TDA++;
                    
                    v = 0;
                }
                
                TEXTO_TOTAL.setText("Atendimentos : "+TDA);
                
                System.out.println(""+v);
                
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN1 = new javax.swing.JToggleButton();
        BTN2 = new javax.swing.JToggleButton();
        BTN3 = new javax.swing.JToggleButton();
        BTN4 = new javax.swing.JToggleButton();
        BTN5 = new javax.swing.JToggleButton();
        BTN6 = new javax.swing.JToggleButton();
        BTN_CHAMAR = new javax.swing.JButton();
        TEXTO_NOME_DA_VEZ = new javax.swing.JLabel();
        BOTAO_ZERAR = new javax.swing.JButton();
        TEXTO_TOTAL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(988, 382));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN1.setText("Técnico 1 - 10");
        BTN1.setBorder(null);
        BTN1.setContentAreaFilled(false);
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 319, -1, -1));

        BTN2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN2.setText("Técnico 2 - 10");
        BTN2.setBorder(null);
        BTN2.setContentAreaFilled(false);
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 319, -1, -1));

        BTN3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN3.setText("Técnico 3 - 10");
        BTN3.setBorder(null);
        BTN3.setContentAreaFilled(false);
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 319, -1, -1));

        BTN4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN4.setText("Técnico 4 - 10");
        BTN4.setBorder(null);
        BTN4.setContentAreaFilled(false);
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 319, -1, -1));

        BTN5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN5.setText("Técnico 5 - 10");
        BTN5.setBorder(null);
        BTN5.setContentAreaFilled(false);
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 319, -1, -1));

        BTN6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN6.setText("Técnico 6 - 10");
        BTN6.setBorder(null);
        BTN6.setContentAreaFilled(false);
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 319, -1, -1));

        BTN_CHAMAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN_CHAMAR.setText("CHAMAR");
        BTN_CHAMAR.setBorder(null);
        BTN_CHAMAR.setContentAreaFilled(false);
        BTN_CHAMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CHAMARActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_CHAMAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 11, -1, -1));

        TEXTO_NOME_DA_VEZ.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        TEXTO_NOME_DA_VEZ.setText("Técnico 1 - 1111");
        getContentPane().add(TEXTO_NOME_DA_VEZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        BOTAO_ZERAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BOTAO_ZERAR.setText("ZERAR");
        BOTAO_ZERAR.setBorder(null);
        BOTAO_ZERAR.setContentAreaFilled(false);
        BOTAO_ZERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAO_ZERARActionPerformed(evt);
            }
        });
        getContentPane().add(BOTAO_ZERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 11, -1, -1));

        TEXTO_TOTAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TEXTO_TOTAL.setText("Atendimentos :");
        TEXTO_TOTAL.setToolTipText("");
        getContentPane().add(TEXTO_TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CHAMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CHAMARActionPerformed
        // TODO add your handling code here:
        FuncaoPrincipal();
    }//GEN-LAST:event_BTN_CHAMARActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        // TODO add your handling code here:
        if(BTN1.isSelected()){
            BTN1.setSelected(true);
            BTN1.setForeground(COR_BTN_DESABILITADO);
        }else{
            BTN1.setSelected(false);
            BTN1.setForeground(COR_BTN_HABILITADO);
        }
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
        if(BTN2.isSelected()){
            BTN2.setSelected(true);
            BTN2.setForeground(COR_BTN_DESABILITADO);
        }else{
            BTN2.setSelected(false);
            BTN2.setForeground(COR_BTN_HABILITADO);
        }
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        // TODO add your handling code here:
        if(BTN3.isSelected()){
            BTN3.setSelected(true);
            BTN3.setForeground(COR_BTN_DESABILITADO);
        }else{
            BTN3.setSelected(false);
            BTN3.setForeground(COR_BTN_HABILITADO);
        }
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        // TODO add your handling code here:
        if(BTN4.isSelected()){
            BTN4.setSelected(true);
            BTN4.setForeground(COR_BTN_DESABILITADO);
        }else{
            BTN4.setSelected(false);
            BTN4.setForeground(COR_BTN_HABILITADO);
        }
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        // TODO add your handling code here:
        if(BTN5.isSelected()){
            BTN5.setSelected(true);
            BTN5.setForeground(COR_BTN_DESABILITADO);
        }else{
            BTN5.setSelected(false);
            BTN5.setForeground(COR_BTN_HABILITADO);
        }
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        // TODO add your handling code here:
        if(BTN6.isSelected()){
            BTN6.setSelected(true);
            BTN6.setForeground(COR_BTN_DESABILITADO);
        }else{
            BTN6.setSelected(false);
            BTN6.setForeground(COR_BTN_HABILITADO);
        }
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BOTAO_ZERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAO_ZERARActionPerformed
        // TODO add your handling code here:
        v = 0;
                TDA = 0;
                AT1 = 0;
                AT2 = 0;
                AT3 = 0;
                AT4 = 0;
                AT5 = 0;
                AT6 = 0;
                TEXTO_TOTAL.setText("Atendimentos : ");
                TEXTO_NOME_DA_VEZ.setText("");
                BTN1.setText(A2);
                BTN2.setText(A3);
                BTN3.setText(A4);
                BTN4.setText(A5);
                BTN5.setText(A6);
                BTN6.setText(A7);
    }//GEN-LAST:event_BOTAO_ZERARActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        planilha.lerPlanilha("CONFIG6");
        
        ////////////////////////////////////////////////////////////////////////
        A1 = PS[0];//QUANTIDADE DE TÉCNICOS
        ////////////////////////////////////////////////////////////////////////
        B1 = PS[1];//SEM IMPORTANCIA
        C1 = PS[2];//SEM IMPORTANCIA
        D1 = PS[3];//SEM IMPORTANCIA
        E1 = PS[4];//SEM IMPORTANCIA
        F1 = PS[5];//SEM IMPORTANCIA
        ////////////////////////////////////////////////////////////////////////
        A2 = PS[6];//NOME 1º TÉCNICO
        B2 = PS[7];//EM 1º TÉCNICO
        C2 = PS[8];//HORA ENTRADA 1º TÉCNICO
        D2 = PS[9];//MINUTO ENRADA 1º TÉCNICO
        E2 = PS[10];//HORA SAIDA 1º TÉCNICO
        F2 = PS[11];//MINUTO SAIDA 1º TÉCNICO
        ////////////////////////////////////////////////////////////////////////
        A3 = PS[12];//NOME 2º TÉCNICO
        B3 = PS[13];//EM 2º TÉCNICO
        C3 = PS[14];//HORA ENTRADA 2º TÉCNICO
        D3 = PS[15];//MINUTO ENRADA 2º TÉCNICO
        E3 = PS[16];//HORA SAIDA 2º TÉCNICO
        F3 = PS[17];//MINUTO SAIDA 2º TÉCNICO
        ////////////////////////////////////////////////////////////////////////
        A4 = PS[18];//NOME 3º TÉCNICO
        B4 = PS[19];//EM 3º TÉCNICO
        C4 = PS[20];//HORA ENTRADA 3º TÉCNICO
        D4 = PS[21];//MINUTO ENRADA 3º TÉCNICO
        E4 = PS[22];//HORA SAIDA 3º TÉCNICO
        F4 = PS[23];//MINUTO SAIDA 3º TÉCNICO
        ////////////////////////////////////////////////////////////////////////
        A5 = PS[24];//NOME 4º TÉCNICO
        B5 = PS[25];//EM 4º TÉCNICO
        C5 = PS[26];//HORA ENTRADA 4º TÉCNICO
        D5 = PS[27];//MINUTO ENRADA 4º TÉCNICO
        E5 = PS[28];//HORA SAIDA 4º TÉCNICO
        F5 = PS[29];//MINUTO SAIDA 4º TÉCNICO
        ////////////////////////////////////////////////////////////////////////
        A6 = PS[30];//NOME 5º TÉCNICO
        B6 = PS[31];//EM 5º TÉCNICO
        C6 = PS[32];//HORA ENTRADA 5º TÉCNICO
        D6 = PS[33];//MINUTO ENRADA 5º TÉCNICO
        E6 = PS[34];//HORA SAIDA 5º TÉCNICO
        F6 = PS[35];//MINUTO SAIDA 5º TÉCNICO
        ////////////////////////////////////////////////////////////////////////
        A7 = PS[36];//NOME 6º TÉCNICO
        B7 = PS[37];//EM 6º TÉCNICO
        C7 = PS[38];//HORA ENTRADA 6º TÉCNICO
        D7 = PS[39];//MINUTO ENRADA 6º TÉCNICO
        E7 = PS[40];//HORA SAIDA 6º TÉCNICO
        F7 = PS[41];//MINUTO SAIDA 6º TÉCNICO
        ////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////
        TEXTO_NOME_DA_VEZ.setText("");
                BTN1.setText(A2);
                BTN2.setText(A3);
                BTN3.setText(A4);
                BTN4.setText(A5);
                BTN5.setText(A6);
                BTN6.setText(A7);
        ////////////////////////////////////////////////////////////////////////
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAO_ZERAR;
    private javax.swing.JToggleButton BTN1;
    private javax.swing.JToggleButton BTN2;
    private javax.swing.JToggleButton BTN3;
    private javax.swing.JToggleButton BTN4;
    private javax.swing.JToggleButton BTN5;
    private javax.swing.JToggleButton BTN6;
    private javax.swing.JButton BTN_CHAMAR;
    private javax.swing.JLabel TEXTO_NOME_DA_VEZ;
    private javax.swing.JLabel TEXTO_TOTAL;
    // End of variables declaration//GEN-END:variables
}
