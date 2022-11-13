package com.cursoandroid.cardview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.activity.adapter.Adapter;
import com.cursoandroid.cardview.activity.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        prepararPostagens();

        //define adapter
        Adapter adapter = new Adapter(postagens);
        recyclerPostagem.setAdapter(adapter);


    }

    public void prepararPostagens(){

        Postagem p1 = new Postagem("Jamilton Damasceno", "#tbt #viagem Legal", R.drawable.imagem1);
        Postagem p2 = new Postagem("André Gomides", "#tbt #viagem Legal", R.drawable.imagem2);
        Postagem p3 = new Postagem("Cláudio H", "#tbt #viagem Legal", R.drawable.imagem3);
        Postagem p4 = new Postagem("Gustavo Daniel", "#tbt #viagem Legal", R.drawable.imagem4);
        this.postagens.add(p1);
        this.postagens.add(p2);
        this.postagens.add(p3);
        this.postagens.add(p4);



    }
}