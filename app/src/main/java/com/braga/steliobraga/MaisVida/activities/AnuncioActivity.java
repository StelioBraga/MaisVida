package com.braga.steliobraga.MaisVida.activities;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.braga.steliobraga.MaisVida.R;
import com.braga.steliobraga.MaisVida.entities.Anunciar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class AnuncioActivity extends AppCompatActivity {
    private Anunciar anunciar;


    // Views
    SeekBar quantidade;
    TextInputLayout til_descricao;
    MaterialButton btn_anunciar;
    MaterialButton btn_goback;
    MaterialButton btn_anuncio;


    // Firebase:
    FirebaseDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncio);
        ButterKnife.bind(this);


        // Init Views:
        til_descricao = findViewById(R.id.til_descricao);
        btn_anunciar = findViewById(R.id.btn_anunciar);
        btn_anuncio = findViewById(R.id.btn_anuncio);
        quantidade =findViewById(R.id.quantidade);

        //ir fazer um poste



        // Firebase
        database = FirebaseDatabase.getInstance();
        final DatabaseReference rootRef = database.getReference("users");



//recebe valor da database
         btn_anunciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                anunciar =new Anunciar();
                anunciar.setComentario(til_descricao.getEditText().toString());
                //  anunciar.setQuantidadesangue(quantidade.getProgress().);

               String descricao = til_descricao.getEditText().getText().toString();
              //  String quantidadedesag = quantidade.getProgress().().toString();

                DatabaseReference nomeDeNickiMinaj = rootRef.child("2f").child("fo");

                ValueEventListener postListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Get Post object and use the values to update the UI
                        String nomeDeNi = dataSnapshot.getValue().toString();
                        btn_anunciar.setText(nomeDeNi);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Getting Post failed, log a message
                        // ...
                    }
                };
                nomeDeNickiMinaj.addValueEventListener(postListener);
            }
        });

//        editTextsList.get(0).setText("Kishan");

    }


}
