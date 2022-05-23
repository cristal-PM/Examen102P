package com.example.examen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecicleAdapter extends RecyclerView.Adapter<RecicleAdapter.ViewHolder> {

public static class ViewHolder extends RecyclerView.ViewHolder{
    private Button nombre;
    ImageView foto;
    public ViewHolder(View itemView){
        super(itemView);
        nombre=(Button)itemView.findViewById(R.id.button3);
        foto=(ImageView) itemView.findViewById(R.id.imageView);
    }
}
public List<MascotaModelo> M;

    public RecicleAdapter(List<MascotaModelo> m) {
        M = m;
    }
    @Override
    public int getItemCount(){
        return M.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutmdelo,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder , final int position){
        holder.nombre.setText(M.get(position).getNombre());
        holder.foto.setImageResource(M.get(position).getFoto());
    }
}
