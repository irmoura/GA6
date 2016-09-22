/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import static CODIGOS.Planilha.PS;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.Timer;

/**
 *
 * @author Ismael Ribeiro
 */
public class Tela extends javax.swing.JFrame {
    
    public Color COR_BTN_HABILITADO = Color.BLACK;
    public Color COR_BTN_DESABILITADO = Color.RED;
    
    public int v, contador, contador_piada, contador_chamar_novamente,t0,t1,t2,t3,t4,t5,t6;
    public int TDA;
    public int AT1, AT2, AT3, AT4, AT5, AT6;
    
    public static String A1, A2, A3, A4, A5, A6, A7, B1, B2, B3, B4, B5, B6, B7, C1, C2, C3, C4, C5, C6, C7, D1, D2, D3, D4, D5, D6, D7, E1, E2, E3, E4, E5, E6, E7, F1, F2, F3, F4, F5, F6, F7;
    
    public int HCT1, MCT1, HST1, MST1, HCT2, MCT2, HST2, MST2, HCT3, MCT3, HST3, MST3, HCT4, MCT4, HST4, MST4,  HCT5, MCT5, HST5, MST5, HCT6, MCT6, HST6, MST6;
    
    public String ET1, ST1, ET2, ST2, ET3, ST3, ET4, ST4, ET5, ST5,  ET6, ST6;
    
    public int hora, minuto, segundo;
    public String horas;
    public String opcao;
    public Calendar now;
    public Timer timer;
    
    public String segundos;
    public String minutos;
    public String HC;//HORARIO CRONOMETRO
    public int minutos_int;
    public int horas_int;
    
    public String Senha = "CP1318RMKLZ";
    
    public Planilha planilha = new Planilha();
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    }
    
    public void obterHoras(){
        now = Calendar.getInstance();
        horas = String.format("%1$tH:%1$tM:%1$tS", now);//HORAS NO FORMATO 13:00:00
        hora = Integer.parseInt(String.format("%1$tH", now));//HORAS 13
        minuto = Integer.parseInt(String.format("%1$tM", now));//MINUTO 00
        segundo = Integer.parseInt(String.format("%1$tS", now));//SEGUNDO
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
        setTitle("Gerenciador de Atendimento Alpha Version - Desenvolvedor Ismael Ribeiro Moura");
        setPreferredSize(new java.awt.Dimension(968, 382));
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
        BTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN1MouseEntered(evt);
            }
        });
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        BTN2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN2.setText("Técnico 2 - 10");
        BTN2.setBorder(null);
        BTN2.setContentAreaFilled(false);
        BTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN2MouseEntered(evt);
            }
        });
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        BTN3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN3.setText("Técnico 3 - 10");
        BTN3.setBorder(null);
        BTN3.setContentAreaFilled(false);
        BTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN3MouseEntered(evt);
            }
        });
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        BTN4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN4.setText("Técnico 4 - 10");
        BTN4.setBorder(null);
        BTN4.setContentAreaFilled(false);
        BTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN4MouseEntered(evt);
            }
        });
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, -1, -1));

        BTN5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN5.setText("Técnico 5 - 10");
        BTN5.setBorder(null);
        BTN5.setContentAreaFilled(false);
        BTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN5MouseEntered(evt);
            }
        });
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        BTN6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN6.setText("Técnico 6 - 10");
        BTN6.setBorder(null);
        BTN6.setContentAreaFilled(false);
        BTN6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BTN6MouseEntered(evt);
            }
        });
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, -1, -1));

        BTN_CHAMAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BTN_CHAMAR.setText("CHAMAR");
        BTN_CHAMAR.setBorder(null);
        BTN_CHAMAR.setContentAreaFilled(false);
        BTN_CHAMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CHAMARActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_CHAMAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

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
        getContentPane().add(BOTAO_ZERAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, -1));

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
                 Object[] options = { "Sim", "Não" };   
        int opcao = JOptionPane.showOptionDialog(null,"Deseja zerar a contagem ?","Aviso",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);   
  
        if (opcao != 0){
        //JOptionPane.showMessageDialog(null,"");
        }else{
              
            String senha = "";
            int tentativas = 3;//Define o número de tentativas que o usuário terá para acertar a senha.
            
            for(int i=0;i<tentativas;i++)
            {
                if(!senha.equals(Senha))      
                {
                
                    JPasswordField jpf = new JPasswordField();
            
                    JOptionPane.showConfirmDialog(null,new Object[]{ jpf},"Warning "+(i+1)+"ª tentativa.",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        
                    senha = new String(jpf.getPassword());
                    
                }    
            }
            if (!senha.equals(Senha) || senha.equals(null))    
            {
                JOptionPane.showMessageDialog(null,"Senha incorreta ou operação cancelada","Aviso",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
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
            }
        }
                
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
        /*   ENTRADA   */
        if(Integer.parseInt(C2) < 10 && Integer.parseInt(D2) < 10){
        ET1 = "0"+C2+":0"+D2+":00";
          }else
        if(Integer.parseInt(C2) > 9 && Integer.parseInt(D2) > 9){
        ET1 = C2+":"+D2+":00";
        }else
        if(Integer.parseInt(C2) < 10 && Integer.parseInt(D2) > 9){
        ET1 = "0"+C2+":"+D2+":00";
        }else
        if(Integer.parseInt(C2) > 9 && Integer.parseInt(D2) < 10){
        ET1 = C2+":0"+D2+":00";
        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[14]) < 10 && Integer.parseInt(PS[15]) < 10){
//        PSL3[6] = "0"+PS[14]+":0"+PS[15]+":00";
//        }else
//        if(Integer.parseInt(PS[14]) > 9 && Integer.parseInt(PS[15]) > 9){
//        PSL3[6] = PS[14]+":"+PS[15]+":00";
//        }else
//        if(Integer.parseInt(PS[14]) < 10 && Integer.parseInt(PS[15]) > 9){
//        PSL3[6] = "0"+PS[14]+":"+PS[15]+":00";
//        }else
//        if(Integer.parseInt(PS[14]) > 9 && Integer.parseInt(PS[15]) < 10){
//        PSL3[6] = PS[14]+":0"+PS[15]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[20]) < 10 && Integer.parseInt(PS[21]) < 10){
//        PSL4[6] = "0"+PS[20]+":0"+PS[21]+":00";
//        }else
//        if(Integer.parseInt(PS[20]) > 9 && Integer.parseInt(PS[21]) > 9){
//        PSL4[6] = PS[20]+":"+PS[21]+":00";
//        }else
//        if(Integer.parseInt(PS[20]) < 10 && Integer.parseInt(PS[21]) > 9){
//        PSL4[6] = "0"+PS[20]+":"+PS[21]+":00";
//        }else
//        if(Integer.parseInt(PS[20]) > 9 && Integer.parseInt(PS[21]) < 10){
//        PSL4[6] = PS[20]+":0"+PS[21]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[26]) < 10 && Integer.parseInt(PS[27]) < 10){
//        PSL5[6] = "0"+PS[26]+":0"+PS[27]+":00";
//        }else
//        if(Integer.parseInt(PS[26]) > 9 && Integer.parseInt(PS[27]) > 9){
//        PSL5[6] = PS[26]+":"+PS[27]+":00";
//        }else
//        if(Integer.parseInt(PS[26]) < 10 && Integer.parseInt(PS[27]) > 9){
//        PSL5[6] = "0"+PS[26]+":"+PS[27]+":00";
//        }else
//        if(Integer.parseInt(PS[26]) > 9 && Integer.parseInt(PS[27]) < 10){
//        PSL5[6] = PS[26]+":0"+PS[27]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[32]) < 10 && Integer.parseInt(PS[33]) < 10){
//        PSL6[6] = "0"+PS[32]+":0"+PS[33]+":00";
//        }else
//        if(Integer.parseInt(PS[32]) > 9 && Integer.parseInt(PS[33]) > 9){
//        PSL6[6] = PS[32]+":"+PS[33]+":00";
//        }else
//        if(Integer.parseInt(PS[32]) < 10 && Integer.parseInt(PS[33]) > 9){
//        PSL6[6] = "0"+PS[32]+":"+PS[33]+":00";
//        }else
//        if(Integer.parseInt(PS[32]) > 9 && Integer.parseInt(PS[33]) < 10){
//        PSL6[6] = PS[32]+":0"+PS[33]+":00";
//        }
//        
//        /*   SAIDA   */
//        if(Integer.parseInt(PS[10]) < 10 && Integer.parseInt(PS[11]) < 10){
//        PSL2[7] = "0"+PS[10]+":0"+PS[11]+":00";
//        }else
//        if(Integer.parseInt(PS[10]) > 9 && Integer.parseInt(PS[11]) > 9){
//        PSL2[7] = PS[10]+":"+PS[11]+":00";
//        }else
//        if(Integer.parseInt(PS[10]) > 9 && Integer.parseInt(PS[11]) < 10){
//        PSL2[7] = PS[10]+":0"+PS[11]+":00";
//        }else
//        if(Integer.parseInt(PS[10]) < 10 && Integer.parseInt(PS[11]) > 9){
//        PSL2[7] = "0"+PS[10]+":"+PS[11]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[16]) < 10 && Integer.parseInt(PS[17]) < 10){
//        PSL3[7] = "0"+PS[16]+":0"+PS[17]+":00";
//        }else
//        if(Integer.parseInt(PS[16]) > 9 && Integer.parseInt(PS[17]) > 9){
//        PSL3[7] = PS[16]+":"+PS[17]+":00";
//        }else
//        if(Integer.parseInt(PS[16]) > 9 && Integer.parseInt(PS[17]) < 10){
//        PSL3[7] = PS[16]+":0"+PS[17]+":00";
//        }else
//        if(Integer.parseInt(PS[16]) < 10 && Integer.parseInt(PS[17]) > 9){
//        PSL3[7] = "0"+PS[16]+":"+PS[17]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[22]) < 10 && Integer.parseInt(PS[23]) < 10){
//        PSL4[7] = "0"+PS[22]+":0"+PS[23]+":00";
//        }else
//        if(Integer.parseInt(PS[22]) > 9 && Integer.parseInt(PS[23]) > 9){
//        PSL4[7] = PS[22]+":"+PS[23]+":00";
//        }else
//        if(Integer.parseInt(PS[22]) > 9 && Integer.parseInt(PS[23]) < 10){
//        PSL4[7] = PS[22]+":0"+PS[23]+":00";
//        }else
//        if(Integer.parseInt(PS[22]) < 10 && Integer.parseInt(PS[23]) > 9){
//        PSL4[7] = "0"+PS[22]+":"+PS[23]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[28]) < 10 && Integer.parseInt(PS[29]) < 10){
//        PSL5[7] = "0"+PS[28]+":0"+PS[29]+":00";
//        }else
//        if(Integer.parseInt(PS[28]) > 9 && Integer.parseInt(PS[29]) > 9){
//        PSL5[7] = PS[28]+":"+PS[29]+":00";
//        }else
//        if(Integer.parseInt(PS[28]) > 9 && Integer.parseInt(PS[29]) < 10){
//        PSL5[7] = PS[28]+":0"+PS[29]+":00";
//        }else
//        if(Integer.parseInt(PS[28]) < 10 && Integer.parseInt(PS[29]) > 9){
//        PSL5[7] = "0"+PS[28]+":"+PS[29]+":00";
//        }
//        ////////////////////////////////////////////////////////////////////////
//        if(Integer.parseInt(PS[34]) < 10 && Integer.parseInt(PS[35]) < 10){
//        PSL6[7] = "0"+PS[34]+":0"+PS[35]+":00";
//        }else
//        if(Integer.parseInt(PS[34]) > 9 && Integer.parseInt(PS[35]) > 9){
//        PSL6[7] = PS[34]+":"+PS[35]+":00";
//        }else
//        if(Integer.parseInt(PS[34]) > 9 && Integer.parseInt(PS[35]) < 10){
//        PSL6[7] = PS[34]+":0"+PS[35]+":00";
//        }else
//        if(Integer.parseInt(PS[34]) < 10 && Integer.parseInt(PS[35]) > 9){
//        PSL6[7] = "0"+PS[34]+":"+PS[35]+":00";
//        }
        ////////////////////////////////////////////////////////////////////////
        HCT1 = Integer.parseInt(C2);//Hora Chegada Técnico 1
        MCT1 = Integer.parseInt(D2);//Minuto chegada Técnico 1
        HST1 = Integer.parseInt(E2);//Hora Saida Técnico 1
        MST1 = Integer.parseInt(F2);//Minuto Saida Técnico 1
//        ET1 = PSL2[6];//Entrada Técnico 1
//        ST1 = PSL2[7];//Saida Técnico 1
        
        HCT2 = Integer.parseInt(C3);//Hora Chegada Técnico 2
        MCT2 = Integer.parseInt(D3);//Minuto Chegada Técnico 2
        HST2 = Integer.parseInt(E3);//Hora Saida Técnico 2
        MST2 = Integer.parseInt(F3);//Minuto Saida Técnico 2
//        ET2 = PSL3[6];//Entrada Técnico 2
//        ST2 = PSL3[7];//Saida Técnico 2
        
        HCT3 = Integer.parseInt(C4);//Hora Chegada Técnico 3
        MCT3 = Integer.parseInt(D4);//Minuto Chegada Técnico 3
        HST3 = Integer.parseInt(E4);//Hora Saida Técnico 3
        MST3 = Integer.parseInt(F4);//Minuto Saida Técnico 3
//        ET3 = PSL4[6];//Entrada Técnico 3
//        ST3 = PSL4[7];//Saida Técnico 3
        
        HCT4 = Integer.parseInt(C5);//Hora Chegada Técnico 4
        MCT4 = Integer.parseInt(D5);//Minuto Chegada Técnico 4
        HST4 = Integer.parseInt(E5);//Hora Saida Técnico 4
        MST4 = Integer.parseInt(F5);//Minuto Saida Técnico 4
//        ET4 = PSL5[6];//Entrada Técnico 4
//        ST4 = PSL5[7];//Saida Técnico 4
        
        HCT5 = Integer.parseInt(C6);//Hora Chegada Técnico 5
        MCT5 = Integer.parseInt(D6);//Minuto Chegada Técnico 5
        HST5 = Integer.parseInt(E6);//Hora Saida Técnico 5
        MST5 = Integer.parseInt(F6);//Minuto Saida Técnico 5
//        ET5 = PSL6[6];//Entrada Técnico 5
//        ST5 = PSL6[7];//Saida Técnico 5
        
        HCT6 = Integer.parseInt(C7);//Hora Chegada Técnico 5
        MCT6 = Integer.parseInt(D7);//Minuto Chegada Técnico 5
        HST6 = Integer.parseInt(E7);//Hora Saida Técnico 5
        MST6 = Integer.parseInt(F7);//Minuto Saida Técnico 5
//        ET6 = PSL6[6];//Entrada Técnico 5
//        ST6 = PSL6[7];//Saida Técnico 5

        ////////////////////////////////////////////////////////////////////////
         timer = new Timer(1000, (ActionEvent e) -> {
            
            contador++;
            
            /////////////////////////SEGUNDOS/////////////////////////
                if(contador < 10){
                    segundos = "0"+contador;
                }
                if(contador > 9){
                    segundos = ""+contador;
                }
                if(contador == 60){
                    contador = 0;
                    segundos = "0"+contador;
                    minutos_int++;
                }
                /////////////////////////SEGUNDOS/////////////////////////
                /////////////////////////MINUTOS/////////////////////////
                if(minutos_int == 0){
                    minutos = "00";
                }
                if(minutos_int < 10){
                    minutos = "0"+minutos_int;
                }
                if(minutos_int > 9){
                    minutos = ""+minutos_int;
                }
                if(minutos_int == 60){
                    minutos_int = 0;
                    minutos = "0"+minutos_int;
                    horas_int++;
                }
                /////////////////////////MINUTOS/////////////////////////
                /////////////////////////HORAS/////////////////////////
                if(horas_int == 0){
                    HC = "00";
                }
                if(horas_int < 10){
                    HC = "0"+horas_int;
                }
                if(horas_int > 9){
                    HC = ""+horas_int;
                }
                if(horas_int == 24){
                    horas_int = 0;
                    HC = "0"+horas_int;
                }
              
              obterHoras();

              ////////////////////////////////////////////////////////////////////
            /*TÉCNICOS HABILITADOS NA HORA E MINUTO DEFINIDOS*/
            if(horas.equals(ET1)){
                BTN1.setEnabled(true);
                BTN1.setSelected(false);
                BTN1.setForeground(Color.black);
            }
            if(horas.equals(ET2)){
                BTN2.setEnabled(true);
                BTN2.setSelected(false);
                BTN2.setForeground(Color.black);
            }
            if(horas.equals(ET3)){
                BTN3.setEnabled(true);
                BTN3.setSelected(false);
                BTN3.setForeground(Color.black);
            }
            if(horas.equals(ET4)){
                BTN4.setEnabled(true);
                BTN4.setSelected(false);
                BTN4.setForeground(Color.black);
            }
            if(horas.equals(ET5)){
                BTN5.setEnabled(true);
                BTN5.setSelected(false);
                BTN5.setForeground(Color.black);
            }
                ////////////////////////////////////////////////////////////////////
            /*TÉCNICOS DESABILITADOS NA HORA E MINUTO DEFINIDOS*/
            if(horas.equals(ST1)){
                BTN1.setEnabled(false);
                BTN1.setSelected(true);
                BTN1.setForeground(Color.red);
            }
            if(horas.equals(ST2)){
                BTN2.setEnabled(false);
                BTN2.setSelected(true);
                BTN2.setForeground(Color.red);
            }
            if(horas.equals(ST3)){
                BTN3.setEnabled(false);
                BTN3.setSelected(true);
                BTN3.setForeground(Color.red);
            }
            if(horas.equals(ST4)){
                BTN4.setEnabled(false);
                BTN4.setSelected(true);
                BTN4.setForeground(Color.red);
            }
            if(horas.equals(ST5)){
                BTN5.setEnabled(false);
                BTN5.setSelected(true);
                BTN5.setForeground(Color.red);
            }
           
        });
        
        timer.start();
        
    }//GEN-LAST:event_formWindowOpened

    private void BTN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN1MouseEntered
        // TODO add your handling code here:
        BTN1.setToolTipText(ET1+" às "+ST1);
    }//GEN-LAST:event_BTN1MouseEntered

    private void BTN2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN2MouseEntered
        // TODO add your handling code here:
        BTN2.setToolTipText(ET2+" às "+ST2);
    }//GEN-LAST:event_BTN2MouseEntered

    private void BTN3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN3MouseEntered
        // TODO add your handling code here:
        BTN3.setToolTipText(ET3+" às "+ST3);
    }//GEN-LAST:event_BTN3MouseEntered

    private void BTN4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN4MouseEntered
        // TODO add your handling code here:
        BTN4.setToolTipText(ET4+" às "+ST4);
    }//GEN-LAST:event_BTN4MouseEntered

    private void BTN5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN5MouseEntered
        // TODO add your handling code here:
        BTN5.setToolTipText(ET5+" às "+ST5);
    }//GEN-LAST:event_BTN5MouseEntered

    private void BTN6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN6MouseEntered
        // TODO add your handling code here:
        BTN6.setToolTipText(ET6+" às "+ST6);
    }//GEN-LAST:event_BTN6MouseEntered

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
