
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadCar extends javax.swing.JFrame {

    private Carro car = new Carro();
    private GerCar gc = new GerCar();

    public CadCar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotMarca = new javax.swing.JLabel();
        cxMarca = new javax.swing.JTextField();
        rotModelo = new javax.swing.JLabel();
        cxModelo = new javax.swing.JTextField();
        rotPlaca = new javax.swing.JLabel();
        cxPlaca = new javax.swing.JTextField();
        rotAno = new javax.swing.JLabel();
        cxAno = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btCadastraCarro = new javax.swing.JButton();
        btConsultaCarro = new javax.swing.JButton();
        btRemoveCarro = new javax.swing.JButton();
        btAlteraCarro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos");

        rotMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotMarca.setText("Marca:");

        cxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxMarcaActionPerformed(evt);
            }
        });

        rotModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotModelo.setText("Modelo:");

        rotPlaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotPlaca.setText("Placa:");

        rotAno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rotAno.setText("Ano:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btCadastraCarro.setText("Cadastrar");
        btCadastraCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroCarroActionPerformed(evt);
            }
        });

        btConsultaCarro.setText("Consultar");
        btConsultaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaCarroActionPerformed(evt);
            }
        });

        btRemoveCarro.setText("Remover");
        btRemoveCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluiCarroActionPerformed(evt);
            }
        });

        btAlteraCarro.setText("Alterar");
        btAlteraCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlteraCarroActionPerformed(evt);
            }
        });

        tabCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Ano", "Placa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCar);

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Utilize sempre a placa para realizar consultas, remoções e alterações.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)
                        .addGap(391, 391, 391))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btCadastraCarro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsultaCarro)
                                .addGap(18, 18, 18)
                                .addComponent(btRemoveCarro)
                                .addGap(18, 18, 18)
                                .addComponent(btAlteraCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rotModelo)
                                    .addComponent(rotMarca)
                                    .addComponent(rotPlaca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxModelo)
                                    .addComponent(cxMarca)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rotAno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxAno))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotMarca)
                    .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotModelo)
                    .addComponent(cxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotAno)
                        .addComponent(cxAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rotPlaca)
                        .addComponent(cxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastraCarro)
                    .addComponent(btRemoveCarro)
                    .addComponent(btConsultaCarro)
                    .addComponent(btAlteraCarro))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addGap(20, 20, 20))
        );

        getAccessibleContext().setAccessibleName("Cadastro de Veículos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroCarroActionPerformed
        cadCar();
        listaTab();
    }//GEN-LAST:event_btCadastroCarroActionPerformed

    private void btConsultaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaCarroActionPerformed
        consultaCarro();
    }//GEN-LAST:event_btConsultaCarroActionPerformed

    private void btAlteraCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlteraCarroActionPerformed
        alteraCarro();
        listaTab();
    }//GEN-LAST:event_btAlteraCarroActionPerformed

    private void btExcluiCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluiCarroActionPerformed
        excluiCarro();
        listaTab();
    }//GEN-LAST:event_btExcluiCarroActionPerformed

    private void tabCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCarMouseClicked
        selectTabCarro();
    }//GEN-LAST:event_tabCarMouseClicked

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMarcaActionPerformed
    public void selectTabCarro() {
        String valLinTab = "";
        int posLin = tabCar.getSelectedRow();

        for (int coluna = 0; coluna < tabCar.getColumnCount(); coluna++) {
            valLinTab += tabCar.getModel().getValueAt(posLin, coluna).toString();

            if (coluna + 1 < tabCar.getRowCount()) {
                valLinTab += " | ";
            }

        }
        JOptionPane.showMessageDialog(
                null,
                "Valor escolhido: " + valLinTab,
                "Seleção na tabela",
                1
        );
    }

    public void listaTab() {
        DefaultTableModel modelo = (DefaultTableModel) tabCar.getModel();

        int posLin = 0;
        modelo.setRowCount(posLin);

        for (Carro car : gc.getbdCar()) {
            modelo.insertRow(posLin, new Object[]{car.getMarca(), car.getModelo(), car.getAno(), car.getPlaca()});
            posLin++;
        }
    }

    public void excluiCarro() {
        car = new Carro();
        car.setPlaca(cxPlaca.getText());
        car = gc.consultaCarro(car);

        car = gc.excluiCarro(car);

        if (car == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Carro removido com sucesso!",
                    "Exclusão OK",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe uma carsoa com este CPF",
                    "Erro de Excluasão",
                    0
            );

        }
        limpar();
    }

    public void alteraCarro() {
        car = new Carro();
        car.setPlaca((cxPlaca.getText()));
        car = gc.atualizaCarro(car);

        if (car != null) {
            cxModelo.setText(car.getModelo());
            JOptionPane.showMessageDialog(
                    null,
                    "Carro atualizado com sucesso!",
                    "Atualização OK",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Não existe um carro com essa placa",
                    "Erro de Alteração",
                    0
            );

        }
        limpar();
    }

    public void consultaCarro() {
        car = new Carro();
        car.setPlaca(cxPlaca.getText());

        car = gc.consultaCarro(car);

        if (car != null) {
            cxModelo.setText(car.getModelo());
            cxAno.setText(Integer.toString(car.getAno()));
            cxMarca.setText(car.getMarca());
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Carro consultado inexistente.",
                    "Erro de Consulta",
                    0
            );
            limpar();
        }

    }

    public void cadCar() {
        car = new Carro();

        car.setAno(Integer.parseInt(cxAno.getText()));
        car.setModelo(cxModelo.getText());
        car.setMarca(cxMarca.getText());
        car.setPlaca(cxPlaca.getText());

        car = gc.cadastraCarro(car);

        if (car != null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Carro cadastrado com sucesso!",
                    "Cadastro Ok",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Esse carro já foi cadastrado.",
                    "Erro de Cadastro",
                    0
            );
            limpar();
        }
    }

    public void limpar() {
        cxMarca.setText("");
        cxModelo.setText("");
        cxPlaca.setText("");
        cxAno.setText("");
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Encerrar programa?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            dispose();
        } else {
            limpar();
        }
    }

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
            java.util.logging.Logger.getLogger(CadCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlteraCarro;
    private javax.swing.JButton btCadastraCarro;
    private javax.swing.JButton btConsultaCarro;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemoveCarro;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxAno;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxModelo;
    private javax.swing.JTextField cxPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotAno;
    private javax.swing.JLabel rotMarca;
    private javax.swing.JLabel rotModelo;
    private javax.swing.JLabel rotPlaca;
    private javax.swing.JTable tabCar;
    // End of variables declaration//GEN-END:variables
}
