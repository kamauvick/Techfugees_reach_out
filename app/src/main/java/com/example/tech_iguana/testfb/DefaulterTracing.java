package com.example.tech_iguana.testfb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.UUID;

public class DefaulterTracing extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defaulter_tracing);


        EditText et1 = findViewById(R.id.etdfname);
        EditText et2 = findViewById(R.id.etdflocation);
        EditText et3 = findViewById(R.id.etdfreason);
        EditText et4 = findViewById(R.id.etdftreatment);
        EditText et5 = findViewById(R.id.etdfcomments);
        Button btn = findViewById(R.id.btndfsave);

        Defaulters df = new Defaulters();
        df.setDname(et1.getText().toString());
        df.setLocation(et2.getText().toString());
        df.setReason(et3.getText().toString());
        df.setTreatment(et4.getText().toString());
        df.setComments(et5.getText().toString());

        btn.setOnClickListener(v -> {
            FirebaseFirestore firestore = FirebaseFirestore.getInstance();
            firestore.collection("defaulters").document(UUID.randomUUID().toString()).set(df, SetOptions.merge());
            Toast.makeText(getApplicationContext(), "Data saved succesfully", Toast.LENGTH_LONG).show();
        });


    }
}
