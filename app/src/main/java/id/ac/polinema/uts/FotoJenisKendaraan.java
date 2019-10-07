package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoJenisKendaraan extends AppCompatActivity {

    Button kembaliButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_jenis_kendaraan);

        kembaliButton = findViewById(R.id.button7);


        kembaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FotoJenisKendaraan.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
