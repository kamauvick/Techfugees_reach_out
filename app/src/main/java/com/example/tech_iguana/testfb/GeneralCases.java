package com.example.tech_iguana.testfb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.UUID;

public class GeneralCases extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_cases);
        EditText etname = findViewById(R.id.generalnameET);
        EditText etage = findViewById(R.id.generalageeET);
        EditText etgender = findViewById(R.id.generalgenderET);
        EditText etlocation = findViewById(R.id.generallocationET);
        EditText ettime = findViewById(R.id.generaltimeET);
        EditText etsymptoms = findViewById(R.id.generalsymptomsET);
        EditText ettag = findViewById(R.id.generaltagET);
        EditText etaction = findViewById(R.id.generalactionET);
        EditText etrefer = findViewById(R.id.generalreferalsET);
        EditText etUrgency = findViewById(R.id.generalurgencyET);
        Button btnPush = findViewById(R.id.referalsbtnpush);

        gen_data generaldata = new gen_data();

        //Firestore

        btnPush.setOnClickListener(v -> {
            generaldata.setrefname(etname.getText().toString());
            generaldata.setRefAge(etage.getText().toString());
            generaldata.setRefgender(etgender.getText().toString());
            generaldata.setlocation(etlocation.getText().toString());
            generaldata.setTtime(ettime.getText().toString());
            generaldata.setRefsymptomps(etsymptoms.getText().toString());
            generaldata.settag(ettag.getText().toString());
            generaldata.setActiontaken(etaction.getText().toString());
            generaldata.setReferref(etrefer.getText().toString());
            generaldata.setUrgency(etUrgency.getText().toString());

            FirebaseFirestore firestore = FirebaseFirestore.getInstance();
            firestore.collection("generalCases").document(UUID.randomUUID().toString()).set(generaldata, SetOptions.merge());
            Toast.makeText(getApplicationContext(), "Data saved succesfully", Toast.LENGTH_LONG).show();
//            etname.setText("");
//            etage.setText("");
//            etgender.setText("");
//            etlocation.setText("");
//            ettime.setText("");
//            etsymptoms.setText("");
//            ettag.setText("");
//            etaction.setText("");
//            etrefer.setText("");
//            etUrgency.setText("");

        });

    }
}
