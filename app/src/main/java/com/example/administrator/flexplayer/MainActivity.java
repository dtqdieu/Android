package com.example.administrator.flexplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("GiaiThua", String.valueOf(GiaiThua(1)));

        for (int i = 0; i <= 100; i++) {
            if (NguyenTo(i)) {
                Log.d("NguyenTo", "" + i);
            }
        }

        Log.d("ChiaHet5", String.valueOf(ChiaHet5()));

        for (int i = 0; i <= 1000; i++) {
            if (SoHoanThien(i)) {
                Log.d("SoHoanThien", "" + i);
            }
        }

        Log.d("TinhTongChuSo", String.valueOf(TinhTongChuSo(8545604)));

        int[] n = new int[5];
        n[0] = 3;
        n[1] = 6;
        n[2] = 5;
        n[3] = 4;
        n[4] = 2;
        Log.d("DemLe", String.valueOf(DemLe(n)));
        SapXep(n);
        InMang(n);


        int[][] m = new int[3][3];
        m[0][0] = 1;
        m[0][1] = 3;
        m[0][2] = 4;
        //8

        m[1][0] = 1;
        m[1][1] = 1;
        m[1][2] = 1;
        //3

        m[2][0] = 1;
        m[2][1] = 5;
        m[2][2] = 1;
        //7

        TongHang(m, 3,3);



    }

    public int GiaiThua(int n) {
        int giaithua = 1;
        if (n == 0 || n == 1)
            return n;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        return giaithua;
    }

    public boolean NguyenTo(int n) {
        if (n == 1 || n == 2) return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public int ChiaHet5() {
        int dem = 0, dem1 = 0, dem2 = 0, dem3 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0)
                dem++;
        }
        return dem;
    }

    public boolean SoHoanThien(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) tong += i;
        }
        return tong == n ? true : false;
    }

    public int TinhTongChuSo(int n) {
        int tong = 0;
        while(n>0){
            tong += n%10;
            n=n/10;
        }
        return tong;
    }

    public int DemLe(int[] n){
        int dem = 0;
        for (int i=0;i<n.length;i++){
            if(n[i]%2 == 1) dem++;
        }
        return dem;
    }

    public void SapXep (int [] a){
        for (int i=0;i<a.length -1; i++){
            for (int j=i+1;j<a.length; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
    }
    public void InMang (int [] a){
        for (int i=0;i<a.length; i++){
            Log.d("InMang", ""+ a[i]);
        }
    }

    public void TongHang( int a[][], int m, int n){
        for (int i=0;i<m; i++){
            int sum = 0;
            for (int j=0;j<n; j++)
                sum += a[i][j];
            Log.d("TongHang", "Tong hang thu " + i + " = " + sum);
        }

    }
}
