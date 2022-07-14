package com.example.mynilai_putry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputnilai extends AppCompatActivity {
    EditText nim, nama, kehadiran, tugas, uts, uas;
    Button Bsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnilai);

        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.Nama);
        kehadiran = findViewById(R.id.Kehadiran);
        tugas = findViewById(R.id.Tugas);
        uts = findViewById(R.id.UTS);
        uas = findViewById(R.id.UAS);

        Bsubmit = findViewById(R.id.submit);
        Bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(inputnilai.this, bobotnilai.class);
                i.putExtra( "kehadiran", kehadiran.getText().toString());
                i.putExtra("tugas", tugas.getText().toString());
                i.putExtra("uts", uts.getText().toString());
                i.putExtra("uas", uas.getText().toString());
                startActivity(i);

                Intent intent = new Intent(inputnilai.this , hasil.class);
                i.putExtra("nama", nama.getText().toString());
                i.putExtra("nim", nim.getText().toString());
                startActivity(i);


            }
        });

    }


}