package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button biodataButton, spekButton, fotoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        biodataButton = findViewById(R.id.button);
        spekButton = findViewById(R.id.button2);
        fotoButton = findViewById(R.id.button3);

        biodataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActitvityBiodata.class);
                startActivity(i);
            }
        });

        spekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SpesifikasiKendaraan.class);
                startActivity(i);
            }
        });

        fotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FotoJenisKendaraan.class);
                startActivity(i);
            }
        });
    }
}
