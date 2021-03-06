/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Times;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class FrCadastro extends javax.swing.JFrame {

    /**
     * Creates new form FrCadastro
     */
    public FrCadastro() {
        initComponents();
        setLocationRelativeTo(null);
        btLimpar.setVisible(false);
        btListar.setVisible(false);
        btPesquisa.setVisible(false);
        txtPesquisa.setVisible(false);
        txtLista.setVisible(false);
        txtPesquisar.setVisible(false);
        
        btExcluir.setVisible(false);
        btEditar.setVisible(false);
        btPesquisa.setVisible(false);
        txtEditaExclui.setVisible(false);
        txtBuscar.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btPesquisa = new javax.swing.JButton();
        txtBuscar = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        txtEditaExclui = new javax.swing.JTextField();
        btOption = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JLabel();
        btOption02 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE HARDWARES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 320, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Item:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 290, 30));

        btSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disquete.png"))); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 40));

        btListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list2.png"))); // NOI18N
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });
        jPanel1.add(btListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 70, 40));

        btLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limps.png"))); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 60, 40));

        btPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 58, 38));

        txtBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBuscar.setText("Buscar:");
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 240, 30));

        btExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 60, 40));

        btEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 60, 40));
        jPanel1.add(txtEditaExclui, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 210, 30));

        btOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/option.png"))); // NOI18N
        btOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOptionActionPerformed(evt);
            }
        });
        jPanel1.add(btOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 30));

        txtPesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        txtPesquisar.setText("Pesquisar:");
        jPanel1.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        btOption02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/option.png"))); // NOI18N
        btOption02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOption02ActionPerformed(evt);
            }
        });
        jPanel1.add(btOption02, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtLista.setColumns(20);
        txtLista.setRows(5);
        jScrollPane1.setViewportView(txtLista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 370, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   static Times bdTime = new Times();
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txtTime.getText().equals("") || txtTime.getText().equals(null)
                || txtTime.getText().length() <= 2) {
            JOptionPane.showMessageDialog(null, "Insira um time antes de salvar!!");
        } else {
            bdTime.adicionar(txtTime.getText());
            txtLista.setText(bdTime.listarTimes());
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        txtLista.setText(bdTime.listarTimes());
    }//GEN-LAST:event_btListarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtLista.setText(null);

    }//GEN-LAST:event_btLimparActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        String nome;
        int i;
        nome = txtPesquisa.getText();
        i = bdTime.pesquisar(nome);
        if (i != -1) {
            txtLista.setText("     Resultado da Pesquisa realizada     "
                    + "\n=======================================\n\n"
                    + (i + 1) + " - " + nome.toUpperCase());
        } else if (bdTime.retornarVazio()) {
            txtLista.setText("     Rela????o de Itens vazio!!     ");

        } else {
            txtLista.setText("     Resultado da Pesquisa realizada     "
                    + "\n=======================================\n\n"
                    + "Este item n??o foi encontrado!");
        }
    }//GEN-LAST:event_btPesquisaActionPerformed

    private void btOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOptionActionPerformed
        if (!bdTime.retornarVazio()) {
            btExcluir.setVisible(true);
            btEditar.setVisible(true);
            txtEditaExclui.setVisible(true);
            txtBuscar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "N??o existe itens para edi????o ou exclus??o",
                    "alerta", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btOptionActionPerformed
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
   String nome, novoNome;
        int i;
        nome = txtEditaExclui.getText().toUpperCase();
        i = bdTime.pesquisar(nome);
        
        if (i != -1) {
           novoNome = JOptionPane.showInputDialog("Informe o nome do Item").toUpperCase();
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja alterar este time?",
                    "Alterar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bdTime.editar(i,novoNome);
                btListar.doClick();
            }
        } else if (bdTime.retornarVazio()) {
            txtLista.setText("     Rela????o de Itens vazia!!     ");

        } else {
            txtLista.setText("     Resultado da Pesquisa realizada     "
                    + "\n=======================================\n\n"
                    + "Este Item n??o foi encontrado!");
        }

        btExcluir.setVisible(false);
        btEditar.setVisible(false);
        txtEditaExclui.setVisible(false);
        txtBuscar.setVisible(false);
    }//GEN-LAST:event_btEditarActionPerformed
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String nome;
        int i;
        nome = txtEditaExclui.getText().toUpperCase();

        i = bdTime.pesquisar(nome);
        if (i != -1) {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este time?",
                    "Excluir", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                bdTime.excluir(i);
                txtLista.setText("Time Exclu??do com Sucesso!!");
            }
        } else if (bdTime.retornarVazio()) {
            txtLista.setText("     Rela????o de Times vazia!!     ");

        } else {
            txtLista.setText("     Resultado da Pesquisa realizada     "
                    + "\n=======================================\n\n"
                    + "Este time n??o foi encontrado!");
        }

        btExcluir.setVisible(false);
        btEditar.setVisible(false);
        txtEditaExclui.setVisible(false);
        txtBuscar.setVisible(false);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btOption02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOption02ActionPerformed
        if (!bdTime.retornarVazio()) {
            btLimpar.setVisible(true);
            btListar.setVisible(true);
            btPesquisa.setVisible(true);
            txtPesquisa.setVisible(true);
            txtLista.setVisible(true);
            txtPesquisar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "N??o existe itens para Listagem, Lipeza ou Pesquisa",
                    "alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btOption02ActionPerformed

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
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListar;
    private javax.swing.JButton btOption;
    private javax.swing.JButton btOption02;
    private javax.swing.JButton btPesquisa;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtBuscar;
    private javax.swing.JTextField txtEditaExclui;
    private javax.swing.JTextArea txtLista;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JLabel txtPesquisar;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
