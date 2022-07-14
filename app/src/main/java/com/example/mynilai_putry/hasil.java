package com.example.mynilai_putry;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class hasil extends AppCompatActivity {

    EditText Enim, Enama, nakhir, gnilai;
    Spinner smatkul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        Enim = findViewById(R.id.dnim);
        Enama = findViewById(R.id.dnama);
        nakhir= findViewById(R.id.Akhir);
        gnilai = findViewById(R.id.dGrade);

        String akhir = getIntent().getExtras().getString("akhir");
        String grade = getIntent().getExtras().getString("grade");

        nakhir.findViewById(R.id.Akhir);
        nakhir.setText(akhir);

        gnilai.findViewById(R.id.dGrade);
        gnilai.setText(grade);

        String nim = getIntent().getExtras().getString("nim");
        String nama = getIntent().getExtras().getString("nama");


        Enim.findViewById(R.id.dnim);
        Enim.setText(nim);

        Enama.findViewById(R.id.dnama);
        Enama.setText(nama);





    }
}