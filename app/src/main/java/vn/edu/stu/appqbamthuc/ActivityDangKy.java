
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

public class ActivityDangKy extends AppCompatActivity {
EditText ten, sdt, tendn, mk;
TextView btndk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        ten=findViewById(R.id.editt_hotendangky);
        sdt=findViewById(R.id.editt_sdtdangky);
        tendn=findViewById(R.id.editt_tendndangky);
        mk=findViewById(R.id.editt_passdndangky);
        btndk=findViewById(R.id.buttondangky);
        addControl();
    }
    private void addControl() {
     btndk.setOnClickListener(v -> {
         serviceApi.api.dangki(ten.getText().toString(),sdt.getText().toString(),tendn.getText().toString(),mk.getText().toString()).enqueue(new Callback<Boolean>() {
             @Override
             public void onResponse(Call<Boolean> call, Response<Boolean> response) {
                 try{
                     Boolean result = response.body();
                     if(result==true){
                         Intent i = new Intent(ActivityDangKy.this,MainActivity.class);
                         startActivity(i);
                         Toast.makeText(ActivityDangKy.this,"dang nhap thanh cong",Toast.LENGTH_SHORT).show();
                     }
                     else {
                         Toast.makeText(ActivityDangKy.this,"that bai 1",Toast.LENGTH_SHORT).show();
                     }
                 }catch (Exception  ex){
                     Toast.makeText(ActivityDangKy.this,"that bai 2",Toast.LENGTH_SHORT).show();
                 }
             }
             @Override
             public void onFailure(Call<Boolean> call, Throwable t) {
                     Toast.makeText(ActivityDangKy.this,"that bai 3",Toast.LENGTH_SHORT).show();
             }
         });
     });
    }
}