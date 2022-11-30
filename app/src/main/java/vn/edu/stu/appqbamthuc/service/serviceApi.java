package vn.edu.stu.appqbamthuc.service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import vn.edu.stu.appqbamthuc.model.BaiViet;
import vn.edu.stu.appqbamthuc.model.TaiKhoan;


public interface serviceApi {
    Gson gson = new GsonBuilder().setDateFormat("yyyy/mm/dd HH:mm:ss").create();
    serviceApi api= new Retrofit.Builder()
            .baseUrl("http://192.168.0.113:8080/appdoan/rest/").addConverterFactory(GsonConverterFactory.create(gson)).build().create(serviceApi.class);

    @GET("taikhoan")
    Call<TaiKhoan> getTaikhoan();

    @POST("taikhoan")
    Call<Void> dangkitk(@Query("user")String user,@Query("password") String password);

    @POST("taikhoanid/dangky")
    Call<Boolean>dangki(@Query("tennguoidung")String tennguoidung,@Query("soDT")String soDT
            ,@Query("tendangnhap")String tendangnhap,@Query("matkhau")String matkhau);

   @GET("taikhoanid/dangnhap")
    Call<Boolean> dangnhap(@Query("username")String tendangnhap,@Query("password")String matkhau);

   @GET("baiviet/xembaiviet")
    Call<List<BaiViet>>getAllbaiviet();
}
