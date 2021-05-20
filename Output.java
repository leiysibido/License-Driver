package com.example.driversl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Output extends AppCompatActivity {

    private TextView firstn, lastn, midn, ext3, nation4, birthdate, sexuality2, htgt, wtgt, add3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        firstn = findViewById(R.id.fnameview);
        lastn = findViewById(R.id.lnameview);
        midn = findViewById(R.id.mnameview);
        ext3 = findViewById(R.id.extensionview);
        nation4 = findViewById(R.id.nationview);
        birthdate = findViewById(R.id.bdayview);
        sexuality2 = findViewById(R.id.sexview);
        htgt = findViewById(R.id.htview);
        wtgt = findViewById(R.id.wtview);
        add3 = findViewById(R.id.addview);

        String firstname3 = getIntent().getStringExtra("keyfname");
        String lastname3 = getIntent().getStringExtra("keylname");
        String middlename3 = getIntent().getStringExtra("keymname");
        String extension4 = getIntent().getStringExtra("keyexten");
        String birthday4 = getIntent().getStringExtra("keybirth");
        String sextuality3 = getIntent().getStringExtra("keysex");
        String nation5 = getIntent().getStringExtra("keyfnation");
        String weight4 = getIntent().getStringExtra("keywt");
        String height4 = getIntent().getStringExtra("keyht");
        String add5 = getIntent().getStringExtra("keyadd");

        firstn.setText(firstname3);
        lastn.setText(lastname3);
        midn.setText(middlename3);
        ext3.setText(extension4);
        nation4.setText(nation5);
        birthdate.setText(birthday4);
        sexuality2.setText(sextuality3);
        wtgt.setText(weight4);
        htgt.setText(height4);
        add3.setText(add5);
    }

    public void btnreturn(View view) {
        Intent ret = new Intent(this, MainActivity.class);
        startActivity(ret);
        Toast.makeText(getApplicationContext(), "Thank for applying Driver's License!", Toast.LENGTH_SHORT).show();
    }
}