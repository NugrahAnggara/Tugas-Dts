package com.latihan.kalkulator;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText angkaSatu,angkaDua;
    TextView hasil;
    float kalkulasi;
    Button tambah,kurang,kali,bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil = findViewById(R.id.tv_hasilKalkulasi);
        angkaSatu = findViewById(R.id.angkaPertama);
        angkaDua = findViewById(R.id.angkaKedua);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        bagi = findViewById(R.id.bagi);
        kali = findViewById(R.id.kali);



        tambah.setOnClickListener(v -> {
            float angka1 = Float.parseFloat(angkaSatu.getText().toString());
            float angka2 = Float.parseFloat(angkaDua.getText().toString());
            kalkulasi = angka1 + angka2;
            String hasilTambah = String.valueOf(kalkulasi);
            hasil.setText(hasilTambah);
        });

        kurang.setOnClickListener(v -> {
            float angka1 = Float.parseFloat(angkaSatu.getText().toString());
            float angka2 = Float.parseFloat(angkaDua.getText().toString());
            kalkulasi = angka1 - angka2;
            String hasilTambah = String.valueOf(kalkulasi);
            hasil.setText(hasilTambah);
        });

        bagi.setOnClickListener(v -> {
            float angka1 = Float.parseFloat(angkaSatu.getText().toString());
            float angka2 = Float.parseFloat(angkaDua.getText().toString());
            kalkulasi = angka1/angka2;
            String hasilTambah = String.valueOf(kalkulasi);
            hasil.setText(hasilTambah);
        });

        kali.setOnClickListener(v -> {
            float angka1 = Float.parseFloat(angkaSatu.getText().toString());
            float angka2 = Float.parseFloat(angkaDua.getText().toString());
            kalkulasi = angka1 * angka2;
            String hasilTambah = String.valueOf(kalkulasi);
            hasil.setText(hasilTambah);
        });
    }
}