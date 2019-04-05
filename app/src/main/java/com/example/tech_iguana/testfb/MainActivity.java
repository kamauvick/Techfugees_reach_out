package com.example.tech_iguana.testfb;

import android.content.Intent;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    CardView cardgen, cardref, carddefaulter, cardemergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MultiDex.install(this);

        cardgen = findViewById(R.id.cardViewgen);
        cardref = findViewById(R.id.cardref);
        carddefaulter = findViewById(R.id.cardViewdefaulter);
        cardemergency = findViewById(R.id.cardemergencies);

        Map<String, String> users = new HashMap<>();
        users.put("name", "victor waichigo");
        users.put("id", "1");
        users.put("phone", "0712115461");
        users.put("location", "Kasarani");
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();

        firestore.collection("chvs").document(UUID.randomUUID().toString()).set(users);

        Map<String, Cordinates> coords = new HashMap<>();
        coords.put("Kakuma 1", new Cordinates(23.44, 43.89));
        coords.put("Kakuma 2", new Cordinates(23.44, 43.89));
        coords.put("Kakuma 3", new Cordinates(23.44, 43.89));
        coords.put("kakuma 3", new Cordinates(21.98, 23.1));

        FirebaseFirestore firestore1 = FirebaseFirestore.getInstance();
        firestore1.collection("coordinates").document(UUID.randomUUID().toString()).set(coords);


        click();

    }

    //Add a chv
    private void writeNewUser(String userId, String name, String phonenumber, String location) {
        Chv chv = new Chv(userId, name, phonenumber, location);

    }

    public void click() {
        cardgen.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), GeneralCases.class);
            startActivity(i);
        });

        cardref.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), Referals.class);
            startActivity(i);
        });

        carddefaulter.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), DefaulterTracing.class);
            startActivity(i);
        });

        cardemergency.setOnClickListener(v -> {
            Emergencies em = new Emergencies();
            Toast.makeText(getApplicationContext(), "New Emergency reported", Toast.LENGTH_LONG).show();
        });
    }


}
