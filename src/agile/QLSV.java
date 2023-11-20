/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agile;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class QLSV {
    ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    public QLSV(){
        listSinhVien.add(new SinhVien("SV1","Lê Trung Hiếu","Nam",2004,"Hà Nội",9.2,9,10,""));
        listSinhVien.add(new SinhVien("SV4","Lê Trung Hiếu","Nam",2004,"Hà Nội",9.2,9,10,""));
        listSinhVien.add(new SinhVien("SV5","Lê Trung Hiếu","Nam",2004,"Hà Nội",9.2,9,10,""));
        listSinhVien.add(new SinhVien("SV2", "Ngô Tuấn Linh", "Nam", 2003, "Nam Định", 1, 2, 3,""));
        listSinhVien.add(new SinhVien("SV3","Nguyễn Quốc Trí","Nữ",2004,"Hà Nội",4,5,6,""));
    }
    
    ArrayList<SinhVien> getListSinhVien(){
        return listSinhVien;
    }
    
    Boolean AddNew(SinhVien sv){
//        SinhVien sv =  new SinhVien();
        listSinhVien.add(sv);
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
            if(sinhVien.getMaHS().equals(maTim)){
                ketQuaTim.add(sinhVien);
            }
        }
        return ketQuaTim;
    }
}
