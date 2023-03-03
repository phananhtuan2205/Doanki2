/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SinhVien;

import Diem.pnDiem;
import Diem.pnDiemTheoLop;
import SV_Lop.pn_SV_Lop;
import ThongKe.pnThongKe;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TranHung
 */
public class frmSearch_SV extends javax.swing.JFrame {

    ArrayList<Sinhvien> listSV ;
    private DefaultTableModel tbl_data;
    int row;
    
    pn_SV_Lop SV_Lop;
    pnDiem Diem;
    pnDiemTheoLop DiemTheoLop;
    pnThongKe ThongKe;
    
    /**
     * Creates new form frmSearch_SV
     */
    public frmSearch_SV() {
        initComponents();
        
        initTable();
        loadData();
    }
    
     public frmSearch_SV(pn_SV_Lop pn) {
        initComponents();
        checkbox.setVisible(true);
        SV_Lop = pn;
        
        initTable();
        loadData();
    }
     
     public frmSearch_SV(pnDiem pn) {
        initComponents();
        checkbox.setVisible(false);
        Diem = pn;
        
        initTable();
        loadData();
    }

     public frmSearch_SV(pnDiemTheoLop pn) {
        initComponents();
        checkbox.setVisible(false);
        DiemTheoLop = pn;
        
        initTable();
        loadData();
        tieude.setText("Có "+listSV.size()+" SV chưa có điểm");
    }
     
     public frmSearch_SV(pnThongKe pn) {
        initComponents();
        checkbox.setVisible(false);
        ThongKe = pn;
        
        initTable();
        loadData();
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SinhVien = new javax.swing.JTable();
        label_soluong = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        tieude = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        text_search = new javax.swing.JTextField();
        checkbox = new javax.swing.JCheckBox();

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        tbl_SinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Lớp", "Tên Lớp", "Khoa", "Khóa Học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_SinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SinhVien);

        label_soluong.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(label_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(label_soluong)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 255));

        tieude.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tieude.setForeground(new java.awt.Color(255, 255, 255));
        tieude.setText("Search STUDENT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(tieude)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(tieude)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Tên / ID");

        text_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text_searchKeyReleased(evt);
            }
        });

        checkbox.setText("Chỉ hiển thị SV chưa có lớp");
        checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(checkbox))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_SinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SinhVienMouseClicked

        //lay ra dong select
        row = tbl_SinhVien.getSelectedRow();
        Sinhvien sv = listSV.get(row);

        if(SV_Lop != null){
            SV_Lop.receiveSV(sv);
            
        }else if(Diem!=null){
            Diem.receiveSV(sv);
            
        }else if (DiemTheoLop!=null) {
            DiemTheoLop.receiveSV(sv);
            
        }else if (ThongKe!=null) {
            ThongKe.receiveSV(sv);
        }
        
    }//GEN-LAST:event_tbl_SinhVienMouseClicked

    private void text_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_searchKeyReleased
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_text_searchKeyReleased

    private void checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxActionPerformed
        // TODO add your handling code here:
        if (SV_Lop!=null) {
            if (checkbox.isSelected()) {
                loadData_OnlyChuaCoLop();
            }
            
            else{
                loadData();
            }
        }
    }//GEN-LAST:event_checkboxActionPerformed

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
            java.util.logging.Logger.getLogger(frmSearch_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSearch_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSearch_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSearch_SV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSearch_SV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_soluong;
    private javax.swing.JTable tbl_SinhVien;
    private javax.swing.JTextField text_search;
    private javax.swing.JLabel tieude;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        //truoc tien can xoa du lieu cu (nhung dong co rowcount > 0)
        while (tbl_data.getRowCount() > 0) {
            tbl_data.removeRow(0);
        }

        String s = text_search.getText();
        
        if(DiemTheoLop==null){
            listSV = new SinhvienDAO().search(s);
            
        }else{
            String maLop = DiemTheoLop.getChoosenLop().getMaLop();
            String maMH = DiemTheoLop.getChoosenMH().getMaMH();
            listSV = new SinhvienDAO().searchTheoLop_ChuaCoMonHoc(maLop, maMH, s);
        }

        listSV.forEach(sv -> {
            tbl_data.addRow(new Object[]{
                tbl_data.getRowCount() + 1,
                sv.getMaSV(),
                sv.getTenSV(),
                sv.getHedaotao(),
                sv.getSdt(),
                sv.getEmail(),
            });
        });
        
        label_soluong.setText("("+listSV.size()+" sinh viên)");
    }
    
    private void loadData_OnlyChuaCoLop() {
        //truoc tien can xoa du lieu cu (nhung dong co rowcount > 0)
        while (tbl_data.getRowCount() > 0) {
            tbl_data.removeRow(0);
        }

        String s = text_search.getText();
        
        listSV = new SinhvienDAO().searchOnlyChuaCoLop(s);
            
        listSV.forEach(sv -> {
            tbl_data.addRow(new Object[]{
                tbl_data.getRowCount() + 1,
                sv.getMaSV(),
                sv.getTenSV(),
                sv.getHedaotao(),
                sv.getSdt(),
                sv.getEmail(),
            });
        });
        label_soluong.setText("("+listSV.size()+" sinh viên)");
    }

    private void initTable() {
        tbl_data = new DefaultTableModel();
        tbl_data.addColumn("STT");
        tbl_data.addColumn("Ma SV");
        tbl_data.addColumn("Ten SV");
        tbl_data.addColumn("He dao tao");
        tbl_data.addColumn("SDT");
        tbl_data.addColumn("Email");

        tbl_SinhVien.setModel(tbl_data);
    }
    
    
}