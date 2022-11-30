package vn.edu.stu.appqbamthuc.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class BaiViet implements Serializable {

        public int mabaiviet;
        public String tenbaiviet;
        public String mota;
        public String nguyenlieu;
        public String cachlam;
        public String hinh;

    public BaiViet() {
    }

    public BaiViet(int mabaiviet, String tenbaiviet, String mota, String nguyenlieu, String cachlam, String hinh) {
        this.mabaiviet = mabaiviet;
        this.tenbaiviet = tenbaiviet;
        this.mota = mota;
        this.nguyenlieu = nguyenlieu;
        this.cachlam = cachlam;
        this.hinh = hinh;
    }

    public int getMabaiviet() {
        return mabaiviet;
    }

    public void setMabaiviet(int mabaiviet) {
        this.mabaiviet = mabaiviet;
    }

    public String getTenbaiviet() {
        return tenbaiviet;
    }

    public void setTenbaiviet(String tenbaiviet) {
        this.tenbaiviet = tenbaiviet;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getNguyenlieu() {
        return nguyenlieu;
    }

    public void setNguyenlieu(String nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }

    public String getCachlam() {
        return cachlam;
    }

    public void setCachlam(String cachlam) {
        this.cachlam = cachlam;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
}
