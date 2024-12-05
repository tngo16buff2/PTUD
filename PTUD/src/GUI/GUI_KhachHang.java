/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author ADMIN
 */
public class GUI_KhachHang extends javax.swing.JPanel {

    /**
     * Creates new form GUI_KhachHang
     */
    public GUI_KhachHang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        content = new javax.swing.JPanel();
        ThongtinKH = new javax.swing.JPanel();
        maKH = new javax.swing.JLabel();
        maKHtxt = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        CCCD = new javax.swing.JLabel();
        cccdtxt = new javax.swing.JTextField();
        ngaysinh = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diachi = new javax.swing.JLabel();
        gioitinh = new javax.swing.JLabel();
        gtnam = new javax.swing.JRadioButton();
        gtnu = new javax.swing.JRadioButton();
        hovatentxt = new javax.swing.JTextField();
        diachitxt = new javax.swing.JTextField();
        timkiem = new javax.swing.JLabel();
        timkiemtxt = new javax.swing.JTextField();
        nuttim = new javax.swing.JButton();
        panelbang = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangthongtin = new javax.swing.JTable();
        buttontxs = new javax.swing.JPanel();
        them = new javax.swing.JButton();
        capnhat = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        ThongtinKH.setName(""); // NOI18N

        maKH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maKH.setText("Mã Khách Hàng");

        maKHtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maKHtxtActionPerformed(evt);
            }
        });

        email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email.setText("Email");

        CCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CCCD.setText("CCCD");

        cccdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cccdtxtActionPerformed(evt);
            }
        });

        ngaysinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ngaysinh.setText("Ngày SInh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Họ và Tên");

        diachi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        diachi.setText("Địa Chỉ");

        gioitinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gioitinh.setText("Giới Tính");

        gtnam.setText("Nam");

        gtnu.setText("Nữ");

        timkiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        timkiem.setText("Tìm Kiếm Khách Hàng Theo Mã KH");

        nuttim.setBackground(new java.awt.Color(25, 145, 166));
        nuttim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nuttim.setText("Tìm Kiếm");

        javax.swing.GroupLayout ThongtinKHLayout = new javax.swing.GroupLayout(ThongtinKH);
        ThongtinKH.setLayout(ThongtinKHLayout);
        ThongtinKHLayout.setHorizontalGroup(
            ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinKHLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngaysinh)
                    .addGroup(ThongtinKHLayout.createSequentialGroup()
                        .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CCCD)
                            .addComponent(maKH)
                            .addComponent(maKHtxt)
                            .addComponent(email)
                            .addComponent(emailtxt)
                            .addComponent(cccdtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                        .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ThongtinKHLayout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(gtnam)
                                .addGap(60, 60, 60)
                                .addComponent(gtnu)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ThongtinKHLayout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hovatentxt)
                                    .addComponent(diachi)
                                    .addComponent(gioitinh)
                                    .addComponent(diachitxt, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timkiem)
                                    .addComponent(timkiemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongtinKHLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nuttim)))))
                .addGap(107, 107, 107))
        );
        ThongtinKHLayout.setVerticalGroup(
            ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinKHLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maKH)
                    .addComponent(jLabel6)
                    .addComponent(timkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maKHtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hovatentxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timkiemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(diachi)
                    .addComponent(nuttim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diachitxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gioitinh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CCCD))
                .addGap(18, 18, 18)
                .addGroup(ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cccdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gtnam)
                    .addComponent(gtnu))
                .addGap(18, 18, 18)
                .addComponent(ngaysinh)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bangthongtin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Họ và Tên", "Email", "Địa Chỉ", "CCCD", "Ngày Sinh", "Giới Tính"
            }
        ));
        jScrollPane1.setViewportView(bangthongtin);

        panelbang.addTab("", jScrollPane1);

        them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        them.setText("Thêm");
        them.setPreferredSize(new java.awt.Dimension(90, 23));
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        capnhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        capnhat.setText("Cập Nhật");
        capnhat.setPreferredSize(new java.awt.Dimension(90, 23));

        xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoa.setText("Xóa");
        xoa.setPreferredSize(new java.awt.Dimension(90, 23));
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttontxsLayout = new javax.swing.GroupLayout(buttontxs);
        buttontxs.setLayout(buttontxsLayout);
        buttontxsLayout.setHorizontalGroup(
            buttontxsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttontxsLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        buttontxsLayout.setVerticalGroup(
            buttontxsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttontxsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(buttontxsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelbang)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ThongtinKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttontxs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ThongtinKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelbang, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttontxs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(content, java.awt.BorderLayout.CENTER);

        header.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 115, 135));
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");
        header.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(header, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void maKHtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maKHtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maKHtxtActionPerformed

    private void cccdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cccdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cccdtxtActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CCCD;
    private javax.swing.JPanel ThongtinKH;
    private javax.swing.JTable bangthongtin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttontxs;
    private javax.swing.JButton capnhat;
    private javax.swing.JTextField cccdtxt;
    private javax.swing.JPanel content;
    private javax.swing.JLabel diachi;
    private javax.swing.JTextField diachitxt;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel gioitinh;
    private javax.swing.JRadioButton gtnam;
    private javax.swing.JRadioButton gtnu;
    private javax.swing.JPanel header;
    private javax.swing.JTextField hovatentxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maKH;
    private javax.swing.JTextField maKHtxt;
    private javax.swing.JLabel ngaysinh;
    private javax.swing.JButton nuttim;
    private javax.swing.JTabbedPane panelbang;
    private javax.swing.JButton them;
    private javax.swing.JLabel timkiem;
    private javax.swing.JTextField timkiemtxt;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
