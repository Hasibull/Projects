
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class TeacherInfoEditable extends javax.swing.JFrame {

    /**
     * Creates new form TeacherInfoEditable
     */
    public TeacherInfoEditable() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void display(String val){
        int cnt;
        
        try {
            statement=connect.prepareStatement("select *from teacherinformation");
            result=statement.executeQuery();
            ResultSetMetaData resMeta = result.getMetaData();
            
            cnt = resMeta.getColumnCount();
            DefaultTableModel dt= (DefaultTableModel)contentTable.getModel();
            dt.setRowCount(0);
            while(result.next()){
                
                Vector store= new Vector();
                
                for(int i=1; i<=cnt; i++){
                    
                    if(result.getString("subject").equals(val) || result.getString("subject").equals(val.toLowerCase())){
                        store.add(result.getString("fullname"));
                        store.add(result.getString("email"));
                        store.add(result.getString("mobileno"));
                    }
                    
                }
                
                if(!store.isEmpty()){
                    dt.addRow(store);
                }
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(TeacherInfoEditable.class.getName()).log(Level.SEVERE, null, ex);
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
        selectSubjectLabel = new javax.swing.JLabel();
        selectSubjectCombobox = new javax.swing.JComboBox<>();
        editNameLabel = new javax.swing.JLabel();
        editEmailLabel = new javax.swing.JLabel();
        editPhoneNoLabel = new javax.swing.JLabel();
        editPhoneNoTextField = new javax.swing.JTextField();
        editEmailTextField = new javax.swing.JTextField();
        editNameTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setBackground(new java.awt.Color(255, 204, 204));
        titleLabel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(175, 5, 73));
        titleLabel.setText(" Teacher's Info");

        backButton.setBackground(new java.awt.Color(255, 153, 153));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(204, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        selectSubjectLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectSubjectLabel.setText("Select Subject:");

        selectSubjectCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math", "Biology", "Chemistry", "Physics", "ICT", "Bangla", "English" }));
        selectSubjectCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSubjectComboboxActionPerformed(evt);
            }
        });

        editNameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editNameLabel.setText("Edit Name:");

        editEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editEmailLabel.setText("Edit Email:");

        editPhoneNoLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editPhoneNoLabel.setText("Edit Phone No:");

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email", "Phone No:"
            }
        ));
        contentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contentTable);

        deleteButton.setBackground(new java.awt.Color(153, 255, 153));
        deleteButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(204, 0, 0));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(153, 255, 153));
        updateButton.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(204, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(backButton)
                        .addGap(246, 246, 246)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectSubjectCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectSubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(editNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editEmailLabel)
                        .addGap(12, 12, 12)
                        .addComponent(editEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPhoneNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editPhoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(305, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(selectSubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(selectSubjectCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPhoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editPhoneNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        new ExistingInfo().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            
            statement = connect.prepareStatement("select *from teacherinformation");
            
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TeacherInfoEditable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void selectSubjectComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSubjectComboboxActionPerformed
        int value = selectSubjectCombobox.getSelectedIndex();
        
        if(value == 0){
            display("Math");
        }
        else if(value == 1){
            display("Biology");
        }
        else if(value == 2){
            display("Chemistry");
        }
        else if(value == 3){
            display("Physics");
        }
        else if(value == 4){
            display("ICT");
        }
        else if(value == 5){
            display("Bangla");
        }
        else if(value == 6){
            display("English");
        }
    }//GEN-LAST:event_selectSubjectComboboxActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
        int row = contentTable.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) contentTable.getModel();
        
        editNameTextField.setText(model.getValueAt(row, 0).toString());
        editEmailTextField.setText(model.getValueAt(row, 1).toString());
        editPhoneNoTextField.setText(model.getValueAt(row, 2).toString());
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
            java.util.logging.Logger.getLogger(TeacherInfoEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherInfoEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherInfoEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherInfoEditable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherInfoEditable().setVisible(true);
            }
        });
    }
    
    //custom variables.
    
    SQL objTeacherInfo = new SQL();
    
    Connection connect = objTeacherInfo.connection();
    
    PreparedStatement statement;
    
    ResultSet result;
    
    Vector name = new Vector();
    Vector phoneNo = new Vector();
    Vector email = new Vector();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable contentTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel editEmailLabel;
    private javax.swing.JTextField editEmailTextField;
    private javax.swing.JLabel editNameLabel;
    private javax.swing.JTextField editNameTextField;
    private javax.swing.JLabel editPhoneNoLabel;
    private javax.swing.JTextField editPhoneNoTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectSubjectCombobox;
    private javax.swing.JLabel selectSubjectLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}