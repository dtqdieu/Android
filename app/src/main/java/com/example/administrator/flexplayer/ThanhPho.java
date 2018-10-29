package com.example.administrator.flexplayer;

import android.util.Log;

public class ThanhPho {
    String ten;
    float danSo;
    float soLuongLD;

    public ThanhPho(String ten, float danSo, float soLuongLD) {
        this.ten = ten;
        this.danSo = danSo;
        this.soLuongLD = soLuongLD;
    }

    public void DanhGia(){
        if (this.soLuongLD/this.danSo > 0.5){
            Log.e("DanhGia", "TOT");
        }
        else if (this.soLuongLD/this.danSo > 0.5){
            Log.e("DanhGia", "TOT");
        }
        else {
            Log.e("DanhGia", "TOT");
        }

    }

}
