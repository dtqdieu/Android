package com.example.administrator.flexplayer;

import java.util.ArrayList;

public class SinhVien {
    public String ten;
    public ArrayList<Float> diemDT = new ArrayList<Float>();
    public Float ketQua;

    public SinhVien(String ten, ArrayList<Float> diemDT) {
        this.ten = ten;
        this.diemDT = diemDT;
        this.ketQua = DTB();
    }

    public Float DTB(){
        float sum = 0 ;
        int size = diemDT.size();
        if(size <= 5){
            for(int i=0; i<size; i++){
                sum += diemDT.get(i);
            }
            return sum/size;
        }
        else{
            for(int i=0; i<size-1; i++){
                sum += diemDT.get(i);
            }
            return(sum + diemDT.get(size-1)*2)/size;
        }
    }
}
