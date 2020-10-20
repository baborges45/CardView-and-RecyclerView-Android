package com.brab.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.brab.cardview.R;
import com.brab.cardview.adapter.PostagemAdapter;
import com.brab.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager( layoutManager );

        //define adapter
        this.prepararPostagem();//chama o metodo que cria as postagens
        PostagemAdapter adapter = new PostagemAdapter(postagem);
        recyclerPostagem.setAdapter( adapter );
    }
  //método que cria as postagens
    public void prepararPostagem(){

        Postagem p = new Postagem("Bruno Borges", "Viagem Bacana", R.drawable.imagem1);
        this.postagem.add(p);
        p = new Postagem("Carolina Lobo", "Viagem Maravilhosa", R.drawable.imagem2);
        this.postagem.add(p);
        p = new Postagem("Fernanada Kelly", "Show de Lugar", R.drawable.imagem3);
        this.postagem.add(p);
        p = new Postagem("Harry Potter", "Lugar Mágico", R.drawable.imagem4);
        this.postagem.add(p);
    }
}