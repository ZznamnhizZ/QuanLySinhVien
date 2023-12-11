/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class QLSV {
     ArrayList<SinhVien> getListDocFile = new ArrayList<>();
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    public QLSV(){
//        listSinhVien.add(new SinhVien("SV1", "Lê Trung Hiếu", "Nam", 2004, "Hà Nội", 9.2, 9, 10, ""));
//        listSinhVien.add(new SinhVien("SV2", "Nguyễn Thị Hương", "Nữ", 2003, "Hải Phòng", 8.5, 8, 9.5, ""));
//        listSinhVien.add(new SinhVien("SV3", "Trần Văn Anh", "Nam", 2002, "Đà Nẵng", 7.8, 7.5, 8, ""));
//        listSinhVien.add(new SinhVien("SV4", "Phạm Thị Mai", "Nữ", 2004, "Hồ Chí Minh", 9.0, 9.2, 9.5, ""));
//        listSinhVien.add(new SinhVien("SV5", "Hoàng Văn Đức", "Nam", 2003, "Hà Nội", 8.3, 7.8, 8.5, ""));
//        listSinhVien.add(new SinhVien("SV6", "Vũ Thị Linh", "Nữ", 2002, "Đà Nẵng", 7.5, 7.0, 7.8, ""));
//        listSinhVien.add(new SinhVien("SV7", "Nguyễn Văn Tâm", "Nam", 2004, "Hồ Chí Minh", 9.5, 9.8, 10, ""));
//        listSinhVien.add(new SinhVien("SV8", "Trần Thị Thanh", "Nữ", 2003, "Hải Phòng", 8.0, 8.5, 9.0, ""));
//        listSinhVien.add(new SinhVien("SV9", "Lê Văn Bình", "Nam", 2002, "Hà Nội", 7.2, 7.5, 8.0, ""));
//        listSinhVien.add(new SinhVien("SV10", "Phan Văn Hà", "Nam", 2004, "Đà Nẵng", 9.7, 9.5, 10, ""));
    }
    
    ArrayList<SinhVien> getListSinhVien(){
        return listSinhVien;
    }
    
    Boolean AddNew(SinhVien sv) {
//      SinhVien sv =  new SinhVien();
        listSinhVien.add(sv);
        // Lưu danh sách vào file
        //saveToFile();
        return true;
    }
    
    Boolean delete(int i){
        listSinhVien.remove(i);
        return true;
    }
    
    
    Boolean update(int viTri, SinhVien sinhVienNew){
        listSinhVien.set(viTri, sinhVienNew);
        return true;
    }
    ArrayList<SinhVien> timKiem(String maTim){
        ArrayList<SinhVien> ketQuaTim = new ArrayList<>();
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getMaHS().equals(maTim)) {
                ketQuaTim.add(sinhVien);
            }
        }
        System.out.println("Kết quả tìm kiếm: " + ketQuaTim);
        return ketQuaTim;
    }
    
    
    
    // Phương thức saveToFile trong lớp QLSV
    private void saveToFile() {
    try {
        FileOutputStream fos = new FileOutputStream("agile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listSinhVien);
        oos.close();
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    
    

    
    
    
    
    public Boolean deletetheoString(String maSinhVien) {
        // Tìm kiếm SinhVien theo mã và xóa nếu tồn tại
        SinhVien sinhVienToDelete = null;
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getMaHS().equals(maSinhVien)) {
                sinhVienToDelete = sinhVien;
                break;
            }
        }

        if (sinhVienToDelete != null) {
            listSinhVien.remove(sinhVienToDelete);
            return true;
        } else {
            return false; 
        }
    }


    public Boolean updatetheoString(String maSinhVien, SinhVien sinhVienNew) {
        // Tìm kiếm SinhVien theo mã và cập nhật nếu tồn tại
        for (int i = 0; i < listSinhVien.size(); i++) {
            SinhVien sinhVien = listSinhVien.get(i);
            if (sinhVien.getMaHS().equals(maSinhVien)) {
                listSinhVien.set(i, sinhVienNew);
                return true;
            }
        }
        return false; 
    }
}
    
    
    
