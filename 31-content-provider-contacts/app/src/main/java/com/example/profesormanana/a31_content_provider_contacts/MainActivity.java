package com.example.profesormanana.a31_content_provider_contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> contactos = new ContactosProvider(this).getContactos();
        Log.d("Contactos",contactos.toString());
    }
}