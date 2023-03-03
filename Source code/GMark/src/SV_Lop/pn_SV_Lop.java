/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SV_Lop;

import LopHoc.Lop;
import LopHoc.LopDAO;
import LopHoc.frmSearch_Lop;
import SinhVien.Sinhvien;
import SinhVien.frmSearch_SV;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TranHung
 */
public class pn_SV_Lop extends javax.swing.JPanel {

    ArrayList<SinhVien.Sinhvien> list_SV;
    ArrayList<LopHoc.Lop> list_Lop;
    DefaultTableModel tbl_Lop;
    DefaultTableModel tbl_SV;

    Lop choosenlop;
    Sinhvien choosenSV;
    frmSearch_Lop searchLop;
    frmSearch_SV searchSV;
    
    /**
     * Creates new form pn_SV_Lop
     */
    public pn_SV_Lop() {
        initComponents();
        
        searchLop = new frmSearch_Lop(this);
        searchLop.setLocation(400, 200);
        
        searchSV = new frmSearch_SV(this);
        searchSV.setLocation(400, 200);
        
        text_maLop.setEnabled(false);
        text_maSV.setEnabled(false);
        btn_xemLop.setEnabled(false);
        btn_xemSV.setEnabled(false);
        btn_New.setEnabled(false);

        tbl_Lop = new DefaultTableModel();
        tbl_Lop.addColumn("STT");
        tbl_Lop.addColumn("Mã Lớp");
        tbl_Lop.addColumn("Tên Lớp");
        tbl_Lop.addColumn("Khoa");

        tbl_SV = new DefaultTableModel();
        tbl_SV.addColumn("STT");
        tbl_SV.addColumn("Ma SV");
        tbl_SV.addColumn("Ten SV");
        tbl_SV.addColumn("He dao tao");
        tbl_SV.addColumn("SDT");
        tbl_SV.addColumn("Email");
        tbl_SV.addColumn("Dia Chi");
        tbl_SV.addColumn("Gioi tinh");
        tbl_SV.addColumn("Ngay Sinh");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        text_maSV = new javax.swing.JTextField();
        text_maLop = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_chonSV = new javax.swing.JButton();
        btn_chonLop = new javax.swing.JButton();
        btn_xemLop = new javax.swing.JButton();
        btn_xemSV = new javax.swing.JButton();
        text_checkConstraint = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_Delete = new javax.swing.JButton();
        btn_New = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        tab_data = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        text_maLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_maLopActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Chọn Lớp");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Chọn SV");

        btn_chonSV.setText("Chọn");
        btn_chonSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonSVActionPerformed(evt);
            }
        });

        btn_chonLop.setText("Chọn");
        btn_chonLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonLopActionPerformed(evt);
            }
        });

        btn_xemLop.setText("xem SV trong lớp này");
        btn_xemLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemLopActionPerformed(evt);
            }
        });

        btn_xemSV.setText("xem lớp của sinh viên này");
        btn_xemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xemSVActionPerformed(evt);
            }
        });

        text_checkConstraint.setBackground(new java.awt.Color(153, 204, 255));
        text_checkConstraint.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_maSV)
                            .addComponent(text_maLop, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_chonSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_chonLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_xemLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_xemSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(text_checkConstraint))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_chonLop)
                            .addComponent(btn_xemLop)
                            .addComponent(text_maLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_maSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xemSV)
                            .addComponent(btn_chonSV))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_checkConstraint, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        btn_Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 0, 0));
        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Remove.png"))); // NOI18N
        btn_Delete.setText("Del");
        btn_Delete.setEnabled(false);
        btn_Delete.setIconTextGap(2);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_New.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_New.setForeground(new java.awt.Color(255, 0, 0));
        btn_New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new.png"))); // NOI18N
        btn_New.setText("New");
        btn_New.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewActionPerformed(evt);
            }
        });

        btn_Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Reset.setForeground(new java.awt.Color(255, 0, 0));
        btn_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/reset.png"))); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_New, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btn_New, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(btn_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "", ""
            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab_data.addTab("--", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tab_data))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student - Class");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_maLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_maLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_maLopActionPerformed

    private void btn_chonSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonSVActionPerformed
        // TODO add your handling code here:
        searchSV.setVisible(true);
    }//GEN-LAST:event_btn_chonSVActionPerformed

    private void btn_chonLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonLopActionPerformed
        // TODO add your handling code here:
       searchLop.setVisible(true);
    }//GEN-LAST:event_btn_chonLopActionPerformed

    private void btn_xemLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemLopActionPerformed
        // TODO add your handling code here:
        String tittle = "Danh sách sinh viên của lớp  " + text_maLop.getText();
        tab_data.setTitleAt(0, tittle);
        list_SV = new SinhVien.SinhvienDAO().getByLop(text_maLop.getText());

        while (tbl_SV.getRowCount() > 0) {
            tbl_SV.removeRow(0);
        }

        for (Sinhvien sv : list_SV) {
            tbl_SV.addRow(new Object[]{
                tbl_SV.getRowCount() + 1,
                sv.getMaSV(),
                sv.getTenSV(),
                sv.getHedaotao(),
                sv.getSdt(),
                sv.getEmail(),
                sv.getDiachi(),
                sv.getGioitinh(),
                sv.getNgaysinh()
            });
        }

        tbl_data.setModel(tbl_SV);
    }//GEN-LAST:event_btn_xemLopActionPerformed

    private void btn_xemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xemSVActionPerformed
        // TODO add your handling code here:
        String tittle = "Danh sách lớp của SV " + text_maSV.getText();
        tab_data.setTitleAt(0, tittle);

        list_Lop = new LopDAO().getByStudent(text_maSV.getText());

        while (tbl_Lop.getRowCount() > 0) {
            tbl_Lop.removeRow(0);
        }

        for (Lop lop : list_Lop) {
            tbl_Lop.addRow(new Object[]{
                tbl_Lop.getRowCount() + 1,
                lop.getMaLop(),
                lop.getTenLop(),
                new Khoa.KhoaDAO().getByID(lop.getMaKH()).get(0).getTenkhoa(),
                lop.getCreated_at(),
                lop.getUpdated_at()
            });
        }

        tbl_data.setModel(tbl_Lop);
    }//GEN-LAST:event_btn_xemSVActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed

        String maLop = text_maLop.getText();
        String maSV = text_maSV.getText();

        int chon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa quan hệ này ?");

        if(chon==0){
            new SV_LopDAO().Delete(maSV, maLop);
        }

        checkConstraint();
        btn_xemSV.doClick();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewActionPerformed
        // khi nhan nut save:
        String maLop = text_maLop.getText();
        String maSV = text_maSV.getText();
        new SV_LopDAO().Add(maSV, maLop);

        checkConstraint();
        btn_xemSV.doClick();
    }//GEN-LAST:event_btn_NewActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        ResetForm();

        //dispose();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked

    }//GEN-LAST:event_tbl_dataMouseClicked

    private void ResetForm() {
        text_maLop.setText("");
        text_maSV.setText("");
        btn_xemLop.setEnabled(false);
        btn_xemSV.setEnabled(false);

        btn_Delete.setEnabled(false);
        btn_New.setEnabled(false);

        DefaultTableModel reset = new DefaultTableModel();
        tbl_data.setModel(reset);

        tab_data.setTitleAt(0, "---");
    }

    private void checkConstraint() {
        String maLop = text_maLop.getText();
        String maSV = text_maSV.getText();

        if (!maLop.isEmpty()&& !maSV.isEmpty()) {
            if (new SinhVien.SinhvienDAO().checkConstraint(maSV, maLop)) {
                text_checkConstraint.setText("( Sinh vien "+maSV +" đã nằm trong lớp "+maLop+" \n)");
                btn_New.setEnabled(false);
                btn_Delete.setEnabled(true);
            } else {
                btn_New.setEnabled(true);
                btn_Delete.setEnabled(false);
                text_checkConstraint.setText("( Sinh vien "+maSV +" chưa nàm trong lớp "+maLop+" )");
            }
        }

    }
    
    public void receiveLop(Lop lop) {
        choosenlop = lop;
        
        text_maLop.setText(choosenlop.getMaLop());
        btn_xemLop.setEnabled(true);

        btn_xemLop.doClick();
        checkConstraint();
    }

    public void receiveSV(Sinhvien sv) {
        choosenSV = sv;

        text_maSV.setText(sv.getMaSV());
        btn_xemSV.setEnabled(true);
        searchSV.setVisible(false);

        btn_xemSV.doClick();
        checkConstraint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_New;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_chonLop;
    private javax.swing.JButton btn_chonSV;
    private javax.swing.JButton btn_xemLop;
    private javax.swing.JButton btn_xemSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tab_data;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField text_checkConstraint;
    private javax.swing.JTextField text_maLop;
    private javax.swing.JTextField text_maSV;
    // End of variables declaration//GEN-END:variables
}