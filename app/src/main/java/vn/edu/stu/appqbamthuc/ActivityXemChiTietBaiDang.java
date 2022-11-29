package vn.edu.stu.appqbamthuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityXemChiTietBaiDang extends AppCompatActivity {
    Button btnhome,btntimkiem,btnthembai,btntaikhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_chi_tiet_bai_dang);
        addControls();
        addEvents();
    }
    private void addControls() {
        btnhome.findViewById(R.id.btnhome);
        btntimkiem.findViewById(R.id.btntimhome);
        btnthembai.findViewById(R.id.btnThemBai);
        btntaikhoan.findViewById(R.id.btntaikoan);
    }
    private void  addEvents(){
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityXemChiTietBaiDang.this,MainActivity.class);
                startActivity(i);
            }
        });
        btntimkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityXemChiTietBaiDang.this,ActivityTimKiem.class);
                startActivity(i);
            }
        });
        btnthembai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityXemChiTietBaiDang.this,ActivityDangBai.class);
                startActivity(i);
            }
        });
        btntaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityXemChiTietBaiDang.this,ActivityTaiKhoan.class);
                startActivity(i);
            }
        });
    }
}