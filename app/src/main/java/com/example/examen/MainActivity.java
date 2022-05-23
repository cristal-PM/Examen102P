package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private RecyclerView rm;
private RecicleAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rm=(RecyclerView) findViewById(R.id.mascotarecicle);
        rm.setLayoutManager(new LinearLayoutManager(this));
        ad=new RecicleAdapter(obtenerMascota());
        rm.setAdapter(ad);
    }
    public List<MascotaModelo> obtenerMascota(){
        List<MascotaModelo>mas=new ArrayList<MascotaModelo>();
        mas.add(new MascotaModelo("picu",R.drawable.bone));
        mas.add(new MascotaModelo("rico",R.drawable.boxer));
        mas.add(new MascotaModelo("caru",R.drawable.cat));
        mas.add(new MascotaModelo("bebe",R.drawable.braco));
        mas.add(new MascotaModelo("cari",R.drawable.dog));
        mas.add(new MascotaModelo("roger",R.drawable.hamster));
        mas.add(new MascotaModelo("alfa",R.drawable.bulldog));
        mas.add(new MascotaModelo("foca",R.drawable.pet));
        return mas;
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
        }
        public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.item1){
            Intent i=new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);
        }
        else if(id==R.id.item2){
            Intent i=new Intent(getApplicationContext(),acercadeActivity2.class);
            startActivity(i);
        }
        return true;
        }
}