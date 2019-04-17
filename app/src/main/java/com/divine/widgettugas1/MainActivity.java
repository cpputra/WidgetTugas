package com.divine.widgettugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {
    Button buttonsimpan ;
    EditText judul,isi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Paper.init(this);

        buttonsimpan = (Button) findViewById(R.id.save) ;
        judul = (EditText) findViewById(R.id.title) ;
        isi = (EditText) findViewById(R.id.content) ;

        buttonsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Paper.book().write("Judul", judul.getText().toString()) ;
                Paper.book().write("isi", isi.getText().toString()) ;

                Toast.makeText(MainActivity.this, "Save", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
