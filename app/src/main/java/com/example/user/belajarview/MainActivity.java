package com.example.user.belajarview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button tambah, kurang, kali, bagi, bersihkan, akar, pangkat;
    EditText getAngkaPertama, getAngkaKedua;
    TextView hasil;
    String angka01, angka02;

    double angka1, angka2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAngkaPertama = (EditText) findViewById(R.id.angka1);
        getAngkaKedua    = (EditText) findViewById(R.id.angka2);
        hasil            = (TextView) findViewById(R.id.hasil);

    }

    public void setString(){
        angka01 = getAngkaPertama.getText().toString();
        angka02 = getAngkaKedua.getText().toString();

    }
    public void setNilai(){
        angka1 = Double.parseDouble(getAngkaPertama.getText().toString());
        angka2 = Double.parseDouble(getAngkaKedua.getText().toString());
    }
    public void tambah(View view) {
        setString();

        if (TextUtils.isEmpty(angka01) || TextUtils.isEmpty(angka02)) {
            Toast.makeText(this, "Isi Setiap Angka", Toast.LENGTH_SHORT).show();
        }
        else {
            setNilai();
            result = angka1 + angka2;
            hasil.setText(Double.toString(result));
        }
    }


    public void kurang(View view){
        setString();
        if (TextUtils.isEmpty(angka01) || TextUtils.isEmpty(angka02)) {
            Toast.makeText(this, "Isi Setiap Angka", Toast.LENGTH_SHORT).show();
        }
        else {
            setNilai();
            result = angka1 - angka2;
            hasil.setText(Double.toString(result));
        }

    }
    public void bagi(View view){
        setString();
        if (TextUtils.isEmpty(angka01) || TextUtils.isEmpty(angka02)) {
            Toast.makeText(this, "Isi Setiap Angka", Toast.LENGTH_SHORT).show();
        }
        else {
            setNilai();
            result = angka1 / angka2;
            hasil.setText(Double.toString(result));
        }

    }
    public void kali(View view){
        setString();
        if (TextUtils.isEmpty(angka01) || TextUtils.isEmpty(angka02)) {
            Toast.makeText(this, "Isi Setiap Angka", Toast.LENGTH_SHORT).show();
        }
        else {
            setNilai();
            result = angka1 * angka2;
            hasil.setText(Double.toString(result));
        }

    }
    public void bersihkan(View view){
        getAngkaPertama.setText("");
        getAngkaKedua.setText("");
        hasil.setText("0");


    }

    public  void akar (View view){
        angka1 = Double.parseDouble(getAngkaPertama.getText().toString());

        hasil.setText(Double.toString(Math.sqrt(angka1)));
    }

    public void pangkat(View view){
        setNilai();
        hasil.setText(Double.toString(Math.pow(angka1,angka2)));
    }



}
