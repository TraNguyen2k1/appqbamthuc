package vn.edu.stu.appqbamthuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.edu.stu.appqbamthuc.service.serviceApi;

public class ActivityDangNhap extends AppCompatActivity {
EditText tendn, mk;
TextView btnDN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        tendn=findViewById(R.id.editt_tendangnhap);
        mk=findViewById(R.id.editt_passdangnhap);
        btnDN=findViewById(R.id.buttondangnhap);
        addEnvent();
    }





    private void addEnvent() {
        btnDN.setOnClickListener(v -> {
            serviceApi.api.dangnhap(tendn.getText().toString(),mk.getText().toString()).enqueue(new Callback<Boolean>() {
                @Override
                public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                    try{
                        Boolean result = response.body();
                        if(result==true){
                            Intent i = new Intent(ActivityDangNhap.this,MainActivity.class);
                            startActivity(i);
                           // Toast.makeText(ActivityDangNhap.this,"thanh cong",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(ActivityDangNhap.this,"that bai",Toast.LENGTH_SHORT).show();
                        }
                    }catch (Exception  ex){
                        Toast.makeText(ActivityDangNhap.this,"that bai abc",Toast.LENGTH_SHORT).show();
                    }
                }
                @Override
                public void onFailure(Call<Boolean> call, Throwable t) {
                    Toast.makeText(ActivityDangNhap.this,"that bai 1",Toast.LENGTH_SHORT).show();
                }
            });
        });
    }
}


