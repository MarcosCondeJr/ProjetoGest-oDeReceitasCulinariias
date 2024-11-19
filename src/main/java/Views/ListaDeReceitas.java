package Views;

import Classes.ColecaoReceita;
import Classes.Receita;
import Classes.ReceitaDoce;
import Classes.ReceitaSalgado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos Conde
 */
public class ListaDeReceitas extends javax.swing.JDialog 
{
    
    ColecaoReceita colecao;
    
    public ListaDeReceitas(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
    }
    
    public ListaDeReceitas(java.awt.Frame parent, boolean modal, ColecaoReceita colecao) 
    {
        super(parent, modal);
        this.colecao = colecao;
        initComponents();
        exibeReceitas();
    }
    
    public void exibeReceitas()
    {
        DefaultTableModel model = (DefaultTableModel) tblReceitas.getModel();
        tblReceitas.setDefaultEditor(Object.class, null);
        model.setRowCount(0);
        
        ArrayList<Receita> receitas = colecao.listarReceita();
        
        //Prenche as colunas da tabela
        for(int i=0; i<receitas.size(); i++)
        {
            Receita receita = receitas.get(i);
            model.addRow(new Object[]
            {
                i+1,
                receita.getTitulo(),
                receita.getCategoria(),
                receita.getDescricao()
            });
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceitas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnDEletar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setUndecorated(true);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblReceitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Categoria", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tblReceitas);

        jLabel1.setFont(new java.awt.Font("Signatra DEMO", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Lista de Receitas");

        btnCadastrar.setBackground(new java.awt.Color(0, 204, 51));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrar.setText("+ Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnDEletar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDEletar.setForeground(new java.awt.Color(204, 0, 0));
        btnDEletar.setText("Deletar");
        btnDEletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDEletarMouseClicked(evt);
            }
        });
        btnDEletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDEletarActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 153, 51));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDEletar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnCadastrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDEletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.dispose();
        CadastroReceitaView cadastro = new CadastroReceitaView(colecao);
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDEletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDEletarMouseClicked
        int receitaSelecionada = tblReceitas.getSelectedRow(); 
        
        if(receitaSelecionada != -1)
        {
            int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar?","Deseja excluir?", receitaSelecionada);
            if(opcao == JOptionPane.YES_OPTION)
            {
                colecao.removerReceita(receitaSelecionada);
                exibeReceitas();
            }    
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione uma receita valida");
        }
    }//GEN-LAST:event_btnDEletarMouseClicked

    private void btnDEletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDEletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDEletarActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        int selecionado = tblReceitas.getSelectedRow();
        
        if(selecionado != -1)
        {
            int idReceita = (int) tblReceitas.getValueAt(selecionado, 0);
            Receita receitaSelecionada = colecao.listarReceita().get(idReceita - 1);
            abrirTelaEdicao(receitaSelecionada);
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Selecione uma receita para editar.");
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void abrirTelaEdicao(Receita receitaSelecionada) {
        this.dispose();        
        EditarReceita telaEdicao = new EditarReceita(this,colecao, receitaSelecionada);
        telaEdicao.setVisible(true);
    }
        
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaDeReceitas dialog = new ListaDeReceitas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDEletar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReceitas;
    // End of variables declaration//GEN-END:variables
}
