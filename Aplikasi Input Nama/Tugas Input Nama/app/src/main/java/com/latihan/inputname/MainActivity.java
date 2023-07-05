package com.latihan.inputname;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nama,umur;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        nama = findViewById(R.id.ed_nama);
        umur = findViewById(R.id.ed_umur);
        submit = findViewById(R.id.btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog(nama.getText().toString(),umur.getText().toString());
            }
        });

    }

    private void dialog(String nama , String umur) {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_hasil);
        TextView hasilNama = dialog.findViewById(R.id.tv_Hasilnama);
        TextView hasilUmur = dialog.findViewById(R.id.tv_Hasilumur);
        Button close = dialog.findViewById(R.id.close);
        hasilNama.setText(nama);
        hasilUmur.setText(umur);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}