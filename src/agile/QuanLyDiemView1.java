package agile;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
// Import thư viện để bo cong góc
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.border.MatteBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;

//// Bo cong góc -----------------------------------------------------------------
//class RoundBorder implements Border {
//    private int radius;
//
//    RoundBorder(int radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//        g.setColor(Color.BLACK); // Màu viền
//        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
//    }
//
//    @Override
//    public Insets getBorderInsets(Component c) {
//        return new Insets(radius + 1, radius + 1, radius + 2, radius);
//    }
//
//    @Override
//    public boolean isBorderOpaque() {
//        return true;
//    }
//}
class RoundedCornerBorder extends AbstractBorder {

    private int radius;

    RoundedCornerBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(new Color(0, 0, 0, 100)); // Màu đen với alpha (độ trong suốt) là 100
        g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f)); // Độ trong suốt của viền

        RoundRectangle2D roundRect = new RoundRectangle2D.Float(x, y, width - 1, height - 1, radius, radius);
        g2d.draw(roundRect);
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(radius, radius, radius, radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}

//------------------------------------------------------------------------------
public class QuanLyDiemView1 extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyDiemView
     */
    //ok tri sua xong
    DefaultTableModel defaultTableModel;
    
    
    QLSV qlsv = new QLSV();

    public QuanLyDiemView1() {
        initComponents();
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        lblDong.setText(LayThongTinTable(0, list.size()));
        loadData(list);
        btImage.setEnabled(false);
        txtTen.setEditable(false);
        txtQueQuan.setEditable(false);
        cboNamSinh.setEditable(false);
        txtDiemAnh.setEditable(false);
        txtDiemVan.setEditable(false);
        txtDiemToan.setEditable(false);
    }

    public String LayThongTinTable(int viTriBanDau, int TongSoBanGhi) {
        return (viTriBanDau + 1) + " of " + TongSoBanGhi;
    }

    
    
    
    
    
    void loadData(ArrayList<SinhVien> list) {
        defaultTableModel = (DefaultTableModel) tblSinhVien.getModel();
        defaultTableModel.setRowCount(0);
        int stt = 1;
        double total;
        for (SinhVien sinhVien : list) {
            defaultTableModel.addRow(new Object[]{
                stt,
                sinhVien.getMaHS(),
                sinhVien.getTenHS(),
                sinhVien.getGioiTinh(),
                sinhVien.getNamSinh(),
                sinhVien.getQueQuan(),
                sinhVien.getDiemToan(),
                sinhVien.getDiemAnh(),
                sinhVien.getDiemVan(),
                total = (sinhVien.getDiemToan() + sinhVien.getDiemAnh() + sinhVien.getDiemVan()) ,
                sinhVien.getHinhAnh(),});
            stt++;
        }

//    DefaultTableModel model = (DefaultTableModel) tbl.getModel();
//    model.setRowCount(0);
//
//    // Thêm dữ liệu mới từ danh sách
//    for (SinhVien sv : list) {
//        model.addRow(new Object[]{sv.getMaHS(), sv.getTenSV(), sv.getDiem()});
//    }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        rdNu = new javax.swing.JRadioButton();
        txtDiemToan = new javax.swing.JTextField();
        cboNamSinh = new javax.swing.JComboBox<>();
        txtDiemVan = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btImage = new javax.swing.JButton();
        txtDiemAnh = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        btDau = new javax.swing.JButton();
        btPrev = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblDong = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuBackToLogin = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        menuLoadAgain = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tên học sinh:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Giới tính:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Năm sinh");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Quê quán:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Điểm toán:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKeyReleased(evt);
            }
        });
        getContentPane().add(txtMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 126, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Điểm văn:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 30));

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");
        getContentPane().add(rdNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Điểm anh:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, 30));

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");
        getContentPane().add(rdNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        getContentPane().add(txtDiemToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 45, 30));

        cboNamSinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        getContentPane().add(cboNamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 126, -1));
        getContentPane().add(txtDiemVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 45, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btImage.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        btImage.setForeground(new java.awt.Color(255, 255, 255));
        btImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btImage, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btImage, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));
        getContentPane().add(txtDiemAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 45, 30));
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 126, -1));
        getContentPane().add(txtQueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 126, -1));

        btDau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btDau.setText("|<");
        btDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDauActionPerformed(evt);
            }
        });
        getContentPane().add(btDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 50, 30));

        btPrev.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btPrev.setText("<<");
        btPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrevActionPerformed(evt);
            }
        });
        getContentPane().add(btPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 60, 30));

        btNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btNext.setText(">>");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        getContentPane().add(btNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 60, 30));

        btLast.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLast.setText(">|");
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });
        getContentPane().add(btLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 50, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mã học sinh:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblDong.setText("1 or 10");
        getContentPane().add(lblDong, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 102, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 140, 46));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Trang tra cứu điểm");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 0, 770, 50));

        btnTimKiem.setBackground(new java.awt.Color(249, 249, 249));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(0, 0, 0));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-23.png"))); // NOI18N
        btnTimKiem.setText("Search");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 109, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-login-23.png"))); // NOI18N
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 109, -1));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(109, 165, 120));

        tblSinhVien.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã hs", "Tên hs", "Giới tính", "Năm sinh", "Quê quán", "Điểm toán", "Điểm anh", "Điểm văn", "Avg", "Hình ảnh"
            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);
        if (tblSinhVien.getColumnModel().getColumnCount() > 0) {
            tblSinhVien.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblSinhVien.getColumnModel().getColumn(1).setPreferredWidth(45);
            tblSinhVien.getColumnModel().getColumn(2).setPreferredWidth(130);
        }

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 760, 650));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-file-17 (2).png"))); // NOI18N
        jMenu1.setText(" File");

        menuBackToLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-login-23.png"))); // NOI18N
        menuBackToLogin.setText("Về trang đăng nhập");
        menuBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBackToLoginActionPerformed(evt);
            }
        });
        jMenu1.add(menuBackToLogin);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-exit-23 (1).png"))); // NOI18N
        menuExit.setText("Thoát");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        menuLoadAgain.setText("Tải lại trang");
        menuLoadAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLoadAgainMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLoadAgain);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
        int i = tblSinhVien.getSelectedRow();
        String ma = (String) tblSinhVien.getValueAt(i, 1);
        txtMa.setText(ma);
        String ten = (String) tblSinhVien.getValueAt(i, 2);
        txtTen.setText(ten);

        Integer namSinh = (Integer) tblSinhVien.getValueAt(i, 4);
        cboNamSinh.setSelectedItem(namSinh.toString());
        String queQuan = (String) tblSinhVien.getValueAt(i, 5);
        txtQueQuan.setText(queQuan);
        Double diemToan = (Double) tblSinhVien.getValueAt(i, 6);
        txtDiemToan.setText(diemToan.toString());
        Double diemAnh = (Double) tblSinhVien.getValueAt(i, 7);
        txtDiemAnh.setText(diemAnh.toString());
        Double diemVan = (Double) tblSinhVien.getValueAt(i, 8);
        txtDiemVan.setText(diemVan.toString());

        String tenAnh = (String) tblSinhVien.getValueAt(i, 10);
        String imagePath = tenAnh;  // Thay bằng đường dẫn thực tế

        // Đọc ảnh từ đường dẫn
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage();

        // Lấy kích thước của JButton
        int width = btImage.getWidth();
        int height = btImage.getHeight();

        // Điều chỉnh kích thước ảnh để vừa với JButton
        Image newImage = image.getScaledInstance(97, 125, java.awt.Image.SCALE_SMOOTH);

        // Tạo ImageIcon mới từ ảnh đã điều chỉnh kích thước
        ImageIcon newIcon = new ImageIcon(newImage);

        // Hiển thị ảnh trên JButton
        btImage.setIcon(newIcon);
        btImage.setText(imagePath);

        String gioiTinh = (String) tblSinhVien.getValueAt(i, 3);
        if (gioiTinh.equals("Nam")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        lblDong.setText(LayThongTinTable(i, list.size()));
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImageActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        dlg.showOpenDialog(this);

        File selectedFile = dlg.getSelectedFile();

        String path = selectedFile.getAbsolutePath();

        ImageIcon icon = new ImageIcon(path);
        Image newImage = icon.getImage().getScaledInstance(97, 125, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);

        btImage.setIcon(newIcon);
        btImage.setText(path); // Set text thành đường dẫn
    }//GEN-LAST:event_btImageActionPerformed
    void ghiFile() throws IOException {
        File file = new File("agile.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        for (SinhVien sinhVien : list) {
            oos.writeObject(sinhVien);
        }
        oos.close();
        fos.close();

    }    

    void docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File file = new File("agile.txt");
        if (!file.exists()) {
            System.out.println("Khong tim thay file");
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        while (fis.available() > 0) {
            list.add((SinhVien) ois.readObject());
        }
        ois.close();
        fis.close();
        loadData(list);

    }
    
    
    
    public void fillSinhVien(int index) {
        txtMa.setText(qlsv.getListSinhVien().get(index).getMaHS());
        txtTen.setText(qlsv.getListSinhVien().get(index).getTenHS());
        if (qlsv.getListSinhVien().get(index).getGioiTinh().equals("Nam")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        cboNamSinh.setSelectedItem(String.valueOf(qlsv.getListSinhVien().get(index).getNamSinh()));
        txtQueQuan.setText(qlsv.getListSinhVien().get(index).getQueQuan());
        txtDiemToan.setText(String.valueOf(qlsv.getListSinhVien().get(index).getDiemToan()));
        txtDiemVan.setText(String.valueOf(qlsv.getListSinhVien().get(index).getDiemVan()));
        txtDiemAnh.setText(String.valueOf(qlsv.getListSinhVien().get(index).getDiemAnh()));
//        btImage.setText(qlsv.getListSinhVien().get(index).getHinhAnh
        String tenAnh = (String) tblSinhVien.getValueAt(index, 10);
        String imagePath = tenAnh;  // Thay bằng đường dẫn thực tế

        // Đọc ảnh từ đường dẫn
        ImageIcon icon = new ImageIcon(imagePath);
        Image image = icon.getImage();

        // Lấy kích thước của JButton
        int width = btImage.getWidth();
        int height = btImage.getHeight();

        // Điều chỉnh kích thước ảnh để vừa với JButton
        Image newImage = image.getScaledInstance(97, 125, java.awt.Image.SCALE_SMOOTH);

        // Tạo ImageIcon mới từ ảnh đã điều chỉnh kích thước
        ImageIcon newIcon = new ImageIcon(newImage);

        // Hiển thị ảnh trên JButton
        btImage.setIcon(newIcon);
        btImage.setText("");

    }
    private void btDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDauActionPerformed
        // TODO add your handling code here:
        int index = 0;
        tblSinhVien.setRowSelectionInterval(index, index);
        fillSinhVien(index);
        lblDong.setText(LayThongTinTable(index, tblSinhVien.getRowCount()));
    }//GEN-LAST:event_btDauActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        // TODO add your handling code here:
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        int index = list.size() - 1;
        tblSinhVien.setRowSelectionInterval(index, index);
        fillSinhVien(index);
        lblDong.setText(LayThongTinTable(index, tblSinhVien.getRowCount()));
    }//GEN-LAST:event_btLastActionPerformed

    private void btPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrevActionPerformed
        // TODO add your handling code here:
        int index = tblSinhVien.getSelectedRow();
        if (index == 0) {
            ArrayList<SinhVien> list = qlsv.getListSinhVien();
            index = list.size() - 1;
        } else {
            index--;
        }
        tblSinhVien.setRowSelectionInterval(index, index);
        fillSinhVien(index);
        lblDong.setText(LayThongTinTable(index, tblSinhVien.getRowCount()));
    }//GEN-LAST:event_btPrevActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        // TODO add your handling code here:
        int index = tblSinhVien.getSelectedRow();
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        if (index == qlsv.getListSinhVien().size() - 1) {
            index = 0;
        } else {
            index++;
        }
        tblSinhVien.setRowSelectionInterval(index, index);
        fillSinhVien(index);
        lblDong.setText(LayThongTinTable(index, tblSinhVien.getRowCount()));
    }//GEN-LAST:event_btNextActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        lblDong.setText("");
        int i = tblSinhVien.getSelectedRow();
        String maCanTim = txtMa.getText();
        ArrayList<SinhVien> ketQuaTim = qlsv.timKiem(maCanTim);

        if (maCanTim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp mã!");
        } else if (!ketQuaTim.isEmpty()) {
            loadData(ketQuaTim);
            for (SinhVien sinhVien : ketQuaTim) {
                String ten = sinhVien.getTenHS();
                txtTen.setText(ten);
                String gioiTinh = sinhVien.getGioiTinh();
                if (gioiTinh.equals("Nam")) {
                    rdNam.setSelected(true);
                } else {
                    rdNu.setSelected(true);
                }

                Integer namSinh = sinhVien.getNamSinh();
                cboNamSinh.setSelectedItem(namSinh);
                String queQuan = sinhVien.getQueQuan();
                txtQueQuan.setText(queQuan);
                Double diemToan = sinhVien.getDiemToan();
                txtDiemToan.setText(diemToan.toString());
                Double diemAnh = sinhVien.getDiemAnh();
                txtDiemAnh.setText(diemAnh.toString());
                Double diemVan = sinhVien.getDiemVan();
                txtDiemVan.setText(diemVan.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Học sinh " + maCanTim + " không tồn tại trong danh sách" ,"Thông báo", HEIGHT);
        }
        
        
        
    
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn ra màn hình đăng nhập không", "Quay lại trang đăng nhập", JOptionPane.YES_NO_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            login login = new login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
                    // TODO add your handling code here:
                    docFile();
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyDiemView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QuanLyDiemView.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_formWindowOpened

    private void txtMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyReleased
        // TODO add your handling code here:
        String ma = txtMa.getText();
        if (ma.equals("")) {
            txtTen.setText("");
            txtQueQuan.setText("");
            txtDiemAnh.setText("");
            txtDiemVan.setText("");
            txtDiemToan.setText("");
            btImage.setText("");
            cboNamSinh.setSelectedIndex(-1);
            btImage.setIcon(null);
            buttonGroup1.clearSelection();
            loadData(qlsv.getListSinhVien());
        }
    }//GEN-LAST:event_txtMaKeyReleased

    private void menuBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBackToLoginActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn ra màn hình đăng nhập không", "Quay lại trang đăng nhập", JOptionPane.YES_NO_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            login login = new login();
            login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_menuBackToLoginActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát không", "Thoát chương trình", JOptionPane.YES_NO_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuLoadAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoadAgainMouseClicked
        // TODO add your handling code here:
        ArrayList<SinhVien> list = qlsv.getListSinhVien();
        loadData(list);
        try {
                    // TODO add your handling code here:
                    list.clear();
                    docFile();
                } catch (IOException ex) {
                    Logger.getLogger(QuanLyDiemView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(QuanLyDiemView.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_menuLoadAgainMouseClicked

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
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiemView1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDau;
    private javax.swing.JButton btImage;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboNamSinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel lblDong;
    private javax.swing.JMenuItem menuBackToLogin;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuLoadAgain;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtDiemAnh;
    private javax.swing.JTextField txtDiemToan;
    private javax.swing.JTextField txtDiemVan;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
