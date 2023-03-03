/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author TranHung
 */
public class Page {
    /*
    coppy mẫu panel ở phần pnSinhVien
    */
    
    //khai bao chung
    int total_page;
    final int limit = 5;
    int index ;
    
    
    JButton btn_model , btn_model1;
    JPanel pn_page;
    
    private void showRow() {
        //sua lai cho dung panel
        pn_page.removeAll();
        pn_page.revalidate();
        pn_page.repaint();

        JButton pre = new JButton();
        pre.setFont(btn_model.getFont());
        pre.setText("<<");
        pn_page.add(pre);

        for (int i = 1; i <= total_page; i++) {
            if (i + 1 < index && i != 1) {
                continue;
            }

            if (i - 1 > index && i != total_page) {
                continue;
            }

            JButton btn = getButton(i);
            pn_page.add(btn);
        }

        JButton next = new JButton();
        next.setFont(btn_model.getFont());
        next.setText(">>");
        pn_page.add(next);

        if (index == 1) {
            pre.setEnabled(false);
        }
        if (index == total_page) {
            next.setEnabled(false);
        }
        
        
        pre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index--;
                loadData();
            }
        });
         
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 index++;
                 loadData();
            }
        });

    }
    
    private JButton getButton(int i) {
        JButton btn = new JButton();
        btn.setFont(btn_model.getFont());
        
        btn.setText("" + i);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index = Integer.parseInt(btn.getText());
                loadData();
            }
        });

        if (index == i) {
            btn.setBackground(Color.GRAY);
            btn.setFont(btn_model1.getFont());
        }
        return btn;
    }
    
    
    
    private void loadData(){
        
//        double p = (double) listSV.size()/limit;
//        total_page = (int) Math.ceil(p) ;
//        int start = limit*(index-1);
//        
//        
//        for (int i = start; i < start+limit; i++) {
//            if(i<listSV.size()){
//                tbl_data.addRow(new Object[]{
//                    i+1,
//                    listSV.get(i).getMaSV(),
//                    listSV.get(i).getTenSV(),
//                    listSV.get(i).getHedaotao(),
//                    listSV.get(i).getSdt(),
//                    listSV.get(i).getEmail(),
//                    listSV.get(i).getDiachi(),
//                    listSV.get(i).getGioitinh(),
//                    listSV.get(i).getNgaysinh(),
//                    listSV.get(i).getCreated_at(),
//                    listSV.get(i).getUpdated_at()
//                });
//            }
//        }
        
    }
    
}
