package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TraerFrame();
    }
    public void TraerFrame(){
        Fragment f= new ContactoFragment2();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contacto2,f).commit();
    }
}