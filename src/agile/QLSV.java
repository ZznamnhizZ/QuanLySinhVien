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
        listSinhVien.add(new SinhVien("HS01","Lê Trung Hiếu","Nam",2004,"Hà Nội",9,9,10));
         listSinhVien.add(new SinhVien("HS02","Ngô Tuấn Linh","Nam",2003,"Nam Định",1,2,3));
          listSinhVien.add(new SinhVien("HS03","Nguyễn Quốc Trí","Nam",2004,"Hà Nội",4,5,6));
    }
    ArrayList<SinhVien> getListSinhVien(){
        return listSinhVien;
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
