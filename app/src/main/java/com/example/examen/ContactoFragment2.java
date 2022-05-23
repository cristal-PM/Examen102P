package com.example.examen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactoFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactoFragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private EditText nom;
    private EditText cor;
    private EditText com;
    private Button enviar;

    public ContactoFragment2() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ContactoFragment2 newInstance(String param1, String param2) {
        ContactoFragment2 fragment = new ContactoFragment2();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_contacto2,container,false);
        nom=v.findViewById(R.id.EditTextName);
        cor=v.findViewById(R.id.EditTextEmail);
        com=v.findViewById(R.id.EditTextFeedbackBody);
        enviar=v.findViewById(R.id.ButtonSendFeedback);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Enviar();
            }
        });
        return v;
    }
    private void Enviar(){
        Intent email=new Intent(Intent.ACTION_SENDTO);
        email.setData(Uri.parse("mailto:"));
        email.setType("message/rfc822");
        email.putExtra(Intent.EXTRA_EMAIL,cor.getText().toString());
        email.putExtra(Intent.EXTRA_SUBJECT,nom.getText().toString());
        email.putExtra(Intent.EXTRA_TEXT,com.getText().toString());
        startActivity(Intent.createChooser(email,"send email"));

    }

}