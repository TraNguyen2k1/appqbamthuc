package vn.edu.stu.appqbamthuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDangBai extends AppCompatActivity {
    Button btnhome,btntimkiem,btnthembai,btntaikhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_bai);
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
                Intent i = new Intent(ActivityDangBai.this,MainActivity.class);
                startActivity(i);
            }
        });
        btntimkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityDangBai.this,ActivityTimKiem.class);
                startActivity(i);
            }
        });
        btnthembai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityDangBai.this,ActivityDangBai.class);
                startActivity(i);
            }
        });
        btntaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ActivityDangBai.this,ActivityTaiKhoan.class);
                startActivity(i);
            }
        });
    }
}