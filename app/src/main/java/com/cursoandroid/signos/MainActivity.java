package com.cursoandroid.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = { "Áries", "Touro","Gêmeos","Câncer","Leão","Virgem",
            "Libra","Escorpião","Sagitário","Capricórnio","Aquário",
            "Peixes" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listview);

    }
}
