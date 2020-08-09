
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class LibraryEditable extends javax.swing.JFrame {

    /**
     * Creates new form LibraryEditable
     */
    public LibraryEditable() {
        initComponents();
        display();
        setLocationRelativeTo(null);
    }
    
    private void display(){
        int cnt;
        
        try {
            statement=connect.prepareStatement("select *from library");
            result=statement.executeQuery();
            ResultSetMetaData resMeta = result.getMetaData();
            
            cnt = resMeta.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)contentTable.getModel();
            dt.setRowCount(0);
            while(result.next()){
                
                Vector store= new Vector();
                
                for(int i=1; i<=cnt; i++){
                    
                    store.add(result.getString("bookid"));
                    store.add(result.getString("bookname"));
                    store.add(result.getString("authorname"));
                    store.add(result.getString("availableno"));
                    
                }
                dt.addRow(store);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(LibraryEditable.class.getName()).log(Level.SEVERE, null, ex);
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

        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        editAuthorNameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editAuthorNameTextField = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        editAvailableNoTextField = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        editBookNameTextField = new javax.swing.JTextPane();
        editBookNameLabel = new javax.swing.JLabel();
        editAvailableNoLabel = new javax.swing.JLabel();
        editBookIDLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        editBookIdTextField = new javax.swing.JTextPane();
        updateButton = new javax.swing.JButton();
        deletButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(255, 204, 204));
        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(175, 5, 73));
        titleLabel.setText("Library");

        backButton.setBackground(new java.awt.Color(255, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        editAuthorNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editAuthorNameLabel.setText("Edit Author Name:");

        editAuthorNameTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editAuthorNameTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane2.setViewportView(editAuthorNameTextField);

        editAvailableNoTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editAvailableNoTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane3.setViewportView(editAvailableNoTextField);

        editBookNameTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editBookNameTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane4.setViewportView(editBookNameTextField);

        editBookNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editBookNameLabel.setText("Edit Book Name:");

        editAvailableNoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editAvailableNoLabel.setText("Edit Available No:");

        editBookIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editBookIDLabel.setText("Edit Book ID:");

        editBookIdTextField.setMinimumSize(new java.awt.Dimension(6, 18));
        editBookIdTextField.setPreferredSize(new java.awt.Dimension(6, 18));
        jScrollPane5.setViewportView(editBookIdTextField);

        updateButton.setBackground(new java.awt.Color(153, 255, 153));
        updateButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(204, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deletButton.setBackground(new java.awt.Color(153, 255, 153));
        deletButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        deletButton.setForeground(new java.awt.Color(204, 0, 0));
        deletButton.setText("Delete");
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Author Name", "Available No:"
            }
        ));
        contentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contentTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(backButton)
                        .addGap(293, 293, 293)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(94, 94, 94)
                                            .addComponent(editBookIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(78, 78, 78)
                                            .addComponent(editBookNameLabel)))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(96, 96, 96))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(editAuthorNameLabel)
                                        .addComponent(editAvailableNoLabel))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBookIDLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAuthorNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAvailableNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBookNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new ExistingInfo().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletButtonActionPerformed

    }//GEN-LAST:event_deletButtonActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
        int row = contentTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) contentTable.getModel();
        
        editBookIdTextField.setText(model.getValueAt(row, 0).toString());
        editBookNameTextField.setText(model.getValueAt(row, 1).toString());
        editAuthorNameTextField.setText(model.getValueAt(row, 2).toString());
        editAvailableNoTextField.setText(model.getValueAt(row, 3).toString());
        
    }//GEN-LAST:event_contentTableMouseClicked

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
            java.util.logging.Logger.getLogger(LibraryEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryEditable().setVisible(true);
            }
        });
    }
    
    //custom variables.
    private String whoCall = new String();
    
    SQL objLibrary = new SQL();
    
    Connection connect = objLibrary.connection();
    
    PreparedStatement statement;
    ResultSet result;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable contentTable;
    private javax.swing.JButton deletButton;
    private javax.swing.JLabel editAuthorNameLabel;
    private javax.swing.JTextPane editAuthorNameTextField;
    private javax.swing.JLabel editAvailableNoLabel;
    private javax.swing.JTextPane editAvailableNoTextField;
    private javax.swing.JLabel editBookIDLabel;
    private javax.swing.JTextPane editBookIdTextField;
    private javax.swing.JLabel editBookNameLabel;
    private javax.swing.JTextPane editBookNameTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}