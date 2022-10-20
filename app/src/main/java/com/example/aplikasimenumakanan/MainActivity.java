package com.example.aplikasimenumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan =findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));

    }

    public void initData()
    {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan
                (
                        "Pecel Lele",
                        "15.000",
                        "Pecel Lele Spesial Menggunakan Lele Dumbo",
                        R.drawable.pecel_lele
                )
        );

        listMakanan.add(new Makanan
                (
                        "Gado-Gado",
                        "13.000",
                        "Gado-Gado Dengan Berbagai Macam Campuran Sayur Di Dalamnya",
                        R.drawable.gado_gado
                )
        );

        listMakanan.add(new Makanan
                (
                        "Gudeg",
                        "17.000",
                        "Gudeg Khas Jogja Yang Dibumbui Dengan Citra Khas Unik Ala Kota Jogja",
                        R.drawable.gudeg
                )
        );

        listMakanan.add(new Makanan
                (
                        "Lunpia",
                        "20.000",
                        "Lunpia Khas Semarang Dibuat Dengan Bahan-Bahan Spesial dan Berkualitas",
                        R.drawable.lunpia
                )
        );

        listMakanan.add(new Makanan
                (
                        "Mie Ayam",
                        "14.000",
                        "Mie Ayam Spesial yang Dibuat Menggunakan Bumbu Spesial Turun Temurun",
                        R.drawable.mie_ayam
                )
        );

        listMakanan.add(new Makanan
                (
                        "Soto Ayam",
                        "12.000",
                        "Soto Ayam Spesial Menggunakan Racikan Bumbu Spesial",
                        R.drawable.soto_ayam
                )
        );
    }
}