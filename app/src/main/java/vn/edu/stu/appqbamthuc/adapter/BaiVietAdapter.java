package vn.edu.stu.appqbamthuc.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import vn.edu.stu.appqbamthuc.R;
import vn.edu.stu.appqbamthuc.model.BaiViet;

public class BaiVietAdapter extends RecyclerView.Adapter<BaiVietAdapter.recyViewHoder>  {
    private List<BaiViet> dsbv;

    public BaiVietAdapter(List<BaiViet>dsbv){
        this.dsbv=dsbv;
    }
    @NonNull
    @Override
    public recyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new recyViewHoder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mon_an,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull recyViewHoder holder, int position) {
        holder.setData(dsbv.get(position));
    }

    @Override
    public int getItemCount() {
        return dsbv.size();
    }

    class recyViewHoder extends RecyclerView.ViewHolder {

        ImageView imgmonan;
        TextView tenmonan;
        public recyViewHoder(@NonNull View itemView) {
            super(itemView);
            imgmonan = itemView.findViewById(R.id.img_item_monan);
            tenmonan = itemView.findViewById(R.id.tv_item_ten_monan);
        }
        void setData(BaiViet bv){
            tenmonan.setText(bv.getTenbaiviet());
            //String to byte
            byte[] bt= Base64.decode(bv.getHinh(),0);
            //byte to Bitmap
            Bitmap bm = BitmapFactory.decodeByteArray(bt,0,bt.length,null);
            imgmonan.setImageBitmap(bm);
        }
    }
}
