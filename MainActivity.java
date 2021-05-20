package com.example.driversl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name1, name2, name3, ext1, bday1, sex1, nation1, weit, heit, add1;
    private Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1 = findViewById(R.id.fname);
        name2 = findViewById(R.id.lname);
        name3 = findViewById(R.id.mi);
        ext1 = findViewById(R.id.ext);
        bday1 = findViewById(R.id.birth);
        sex1 = findViewById(R.id.sex);
        nation1 = findViewById(R.id.nation);
        weit = findViewById(R.id.weight);
        heit = findViewById(R.id.height);
        add1 = findViewById(R.id.add);

        btnsubmit = findViewById(R.id.submit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstname = name1.getText().toString();
                String lastname = name2.getText().toString();
                String middlename = name3.getText().toString();
                String extension2 = ext1.getText().toString();
                String birthday = bday1.getText().toString();
                String sexuality = sex1.getText().toString();
                String nationality = nation1.getText().toString();
                String weight2 = weit.getText().toString();
                String height2 = heit.getText().toString();
                String address = add1.getText().toString();

                Intent intent = new Intent(MainActivity.this, Output.class);
                intent.putExtra("keyfname", firstname);
                intent.putExtra("keylname", lastname);
                intent.putExtra("keymname", middlename);
                intent.putExtra("keyexten", extension2);
                intent.putExtra("keybirth",birthday);
                intent.putExtra("keysex", sexuality);
                intent.putExtra("keynation", nationality);
                intent.putExtra("keywt", weight2);
                intent.putExtra("keyht", height2);
                intent.putExtra("keyadd", address);

                if (firstname.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (lastname.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (middlename.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (birthday.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (sexuality.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (nationality.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (weight2.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (height2.isEmpty()){
                    alert("Empty Information!!!");
                }
                else if (address.isEmpty()){
                    alert("Empty Information!!!");
                }
                else
                    startActivity(intent);
            }
        });
    }
    private void alert(String message){
        AlertDialog dlg = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Note")
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
                dlg.show();
    }
}