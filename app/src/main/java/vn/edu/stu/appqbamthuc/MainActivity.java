package vn.edu.stu.appqbamthuc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.edu.stu.appqbamthuc.adapter.BaiVietAdapter;
import vn.edu.stu.appqbamthuc.model.BaiViet;
import vn.edu.stu.appqbamthuc.service.serviceApi;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewBV;
    BaiVietAdapter adapter;
    List<BaiViet> dsBaiViets= new ArrayList<>();;
    TextView btnhome,btntimkiem,btnthembai,btntaikhoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serviceApi.api.getAllbaiviet().enqueue(new Callback<List<BaiViet>>() {
            @Override
            public void onResponse(Call<List<BaiViet>> call, Response<List<BaiViet>> response) {
                //lay dc kq
            }

            @Override
            public void onFailure(Call<List<BaiViet>> call, Throwable t) {
                //ket noi fail
            }
        });
        addControls();
       addEvents();
    }
    private void addControls() {
        btnhome=findViewById(R.id.btnhome);
        btntimkiem=findViewById(R.id.btntimhome);
        btnthembai=findViewById(R.id.btnThemBai);
        btntaikhoan=findViewById(R.id.btntaikoan);
        recyclerViewBV = findViewById(R.id.recycleMonAnPBHome);
        adapter = new BaiVietAdapter(dsBaiViets);
        recyclerViewBV.setAdapter(adapter);
    }
    private void  addEvents(){
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        btntimkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityTimKiem.class);
                startActivity(i);
            }
        });
        btnthembai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityDangBai.class);
                startActivity(i);
            }
        });
        btntaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ActivityTaiKhoan.class);
                startActivity(i);
            }
        });
    }
}