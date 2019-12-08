/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Doador;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CorrigeData;
import model.Querys;
import model.ValidaCPF;

/**
 *
 * @author leo_m
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private boolean verificacaoCampos() {
        ValidaCPF validaCPF = new ValidaCPF();
        if (tfNomeCompleto.getText() == null || tfNomeCompleto.getText().trim().equals("")) {
            this.numErro = 1;
            return false;
        } else if (tfDocumento.getText() == null || tfDocumento.getText().trim().equals("")) {
            this.numErro = 2;
            return false;
        } else if (validaCPF.isCPF(tfDocumento.getText())) {
            this.numErro = 3;
            return false;
        } else if (tfDataNascimento.getText() == null || tfDataNascimento.getText().trim().equals("")) {
            this.numErro = 4;
            return false;
        } else if (tfNomeMae.getText() == null || tfNomeMae.getText().trim().equals("")) {
            this.numErro = 5;
            return false;
        } else if (tfNomePai.getText() == null || tfNomePai.getText().trim().equals("")) {
            this.numErro = 6;
            return false;
        } else if (tfEndereco.getText() == null || tfEndereco.getText().trim().equals("")) {
            this.numErro = 7;
            return false;
        } else if (tfNumero.getText() == null || tfNumero.getText().trim().equals("")) {
            this.numErro = 8;
            return false;
        } else if (tfBairro.getText() == null || tfBairro.getText().trim().equals("")) {
            this.numErro = 9;
            return false;
        } else if (tfComplemento.getText() == null || tfComplemento.getText().trim().equals("")) {
            this.numErro = 10;
            return false;
        }
        numErro = 0;
        return true;
    }

    private void cadastroDoador() throws ParseException, SQLException {
        Querys banco = new Querys();
        CorrigeData cd = new CorrigeData();
        this.doador = new Doador();
        if (verificacaoCampos()) {
            this.doador.setNomeCompleto(tfNomeCompleto.getText());
            this.doador.setDocumento(tfDocumento.getText());
            this.doador.setBairro(tfBairro.getText());
            this.doador.setComplemento(tfComplemento.getText());
            this.doador.setNumero(Integer.getInteger(tfNumero.getText()));
            this.doador.setNomePai(tfNomePai.getText());
            this.doador.setNomeMae(tfNomeMae.getText());
            this.doador.setEndereco(tfEndereco.getText());
            this.doador.setDataNascimento(cd.correcao(tfDataNascimento.getText()));
            banco.novoDoador(doador);
        } else {
            System.out.println(numErro);
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCadastroDoador = new javax.swing.JLabel();
        lbBancoSangue = new javax.swing.JLabel();
        lbNomeCompleto = new javax.swing.JLabel();
        lbDataNascimento = new javax.swing.JLabel();
        lbNomeMae = new javax.swing.JLabel();
        lbNumeroDoc = new javax.swing.JLabel();
        lbNomePai = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbBairro = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        tfNomeCompleto = new javax.swing.JTextField();
        tfNomeMae = new javax.swing.JTextField();
        tfNomePai = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        tfDocumento = new javax.swing.JFormattedTextField();
        tfDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCadastroDoador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCadastroDoador.setForeground(new java.awt.Color(0, 5, 70));
        lbCadastroDoador.setText("CADASTRO DE DOADOR");

        lbBancoSangue.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbBancoSangue.setForeground(new java.awt.Color(128, 0, 0));
        lbBancoSangue.setText("Banco de Sangue");

        lbNomeCompleto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeCompleto.setForeground(new java.awt.Color(0, 5, 70));
        lbNomeCompleto.setText("Nome Completo");

        lbDataNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbDataNascimento.setForeground(new java.awt.Color(0, 5, 70));
        lbDataNascimento.setText("Data de Nascimento");

        lbNomeMae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeMae.setForeground(new java.awt.Color(0, 5, 70));
        lbNomeMae.setText("Nome da Mãe");

        lbNumeroDoc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNumeroDoc.setForeground(new java.awt.Color(0, 5, 70));
        lbNumeroDoc.setText("Número do CPF");

        lbNomePai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomePai.setForeground(new java.awt.Color(0, 5, 70));
        lbNomePai.setText("Nome do Pai");

        lbNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(0, 5, 70));
        lbNumero.setText("Número");

        lbComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbComplemento.setForeground(new java.awt.Color(0, 5, 70));
        lbComplemento.setText("Complemento");

        lbBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(0, 5, 70));
        lbBairro.setText("Bairro");

        lbEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(0, 5, 70));
        lbEndereco.setText("Endereço");

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(128, 0, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        try {
            tfDocumento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbBancoSangue)
                        .addGap(414, 414, 414))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNomeCompleto)
                                    .addComponent(lbNumeroDoc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbDataNascimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfDataNascimento))
                                    .addComponent(tfNomeCompleto)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNomePai)
                                    .addComponent(lbEndereco)
                                    .addComponent(lbBairro)
                                    .addComponent(lbNomeMae))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbComplemento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                    .addComponent(tfNomePai)
                                    .addComponent(tfNomeMae, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCadastroDoador)
                .addGap(208, 208, 208))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbBancoSangue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(lbCadastroDoador)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCompleto)
                    .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataNascimento)
                    .addComponent(tfDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeMae)
                    .addComponent(tfNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomePai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumero)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEndereco)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBairro)
                    .addComponent(lbComplemento)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnCadastrar)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            cadastroDoador();
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(TelaCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Doador getDoador() {
        return this.doador;
    }

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbBancoSangue;
    private javax.swing.JLabel lbCadastroDoador;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbDataNascimento;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNomeCompleto;
    private javax.swing.JLabel lbNomeMae;
    private javax.swing.JLabel lbNomePai;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbNumeroDoc;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JFormattedTextField tfDataNascimento;
    private javax.swing.JFormattedTextField tfDocumento;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNomeCompleto;
    private javax.swing.JTextField tfNomeMae;
    private javax.swing.JTextField tfNomePai;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
    private Doador doador;
    private int numErro;
}
