package com.cursoandroid.cardview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.cardview.R;
import com.cursoandroid.cardview.activity.model.Postagem;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyviewHolder> {
    private List<Postagem> postagens;

    public Adapter(List<Postagem> p){
        this.postagens = p;

    }


    @NonNull
    @Override
    public Adapter.MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_layout, parent, false);

        return new MyviewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyviewHolder holder, int position) {
        Postagem postagem = postagens.get(position);
        holder.nome.setText(postagem.getNome());
        holder.mensagem.setText(postagem.getPostagem());
        holder.imagem.setImageResource(postagem.getImagem());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyviewHolder extends RecyclerView.ViewHolder{

        TextView nome, mensagem;
        ImageView imagem;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textNome);
            imagem = itemView.findViewById(R.id.imagePostagem);
            mensagem = itemView.findViewById(R.id.textPostagem);

        }
    }
}
