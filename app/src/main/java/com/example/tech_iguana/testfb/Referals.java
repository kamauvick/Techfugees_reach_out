package com.example.tech_iguana.testfb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.UUID;

public class Referals extends AppCompatActivity {
    EditText etname, etage, etreason, ettreatment, etcomments;
    Button btpush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referals);

        etname = findViewById(R.id.etUser);
        etage = findViewById(R.id.referalsAgeET);
        etreason = findViewById(R.id.etReason);
        ettreatment = findViewById(R.id.etTreatments);
        etcomments = findViewById(R.id.etComments);
        btpush = findViewById(R.id.buttonSend);

        referral_data refdata = new referral_data();


        //Firestore
        btpush.setOnClickListener(v -> {
            refdata.setName(etname.getText().toString());
            refdata.setAge(etage.getText().toString());
            refdata.setReason(etreason.getText().toString());
            refdata.setTreatment(ettreatment.getText().toString());
            refdata.setComments(etcomments.getText().toString());
            FirebaseFirestore firestore = FirebaseFirestore.getInstance();
            firestore.collection("Referals").document(UUID.randomUUID().toString()).set(refdata, SetOptions.merge());
            Toast.makeText(getApplicationContext(), "Data saved succesfully", Toast.LENGTH_LONG).show();

        });


    }

}
