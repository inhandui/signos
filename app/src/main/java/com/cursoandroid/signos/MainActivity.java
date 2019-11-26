package com.cursoandroid.signos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos = { "Áries", "Touro","Gêmeos","Câncer","Leão","Virgem",
            "Libra","Escorpião","Sagitário","Capricórnio","Aquário",
            "Peixes" };

    private String[] perfis = { "Os astros não ditam a sua vida!", "Seu comportamento não está ligado ao movimento das estrelas!",
            "A cor do dia é a cor que você quiser usar!", "Hoje é um bom dia para fazer o que você quiser. As estrelas não ligam!",
            "Um evento cósmico não muda o seu dia hoje! Você sim!","Não espere a sorte bater a sua porta. Sorte não existe!",
            "Libra","Escorpião","Sagitário","Capricórnio","Aquário",
            "Peixes" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = findViewById(R.id.listview);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, signos);

        listaSignos.setAdapter(adaptador);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }
}
