package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.ac.polinema.uts.kegiatan_kopdar.Video1;
import id.ac.polinema.uts.kegiatan_kopdar.Video2;

public class kegiatankopdar extends AppCompatActivity {

    Button kembaliButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kegiatankopdar);

        kembaliButton = findViewById(R.id.button10);

        kembaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kegiatankopdar.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    public void handlerVideo1(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.video,new Video1());
        fragmentTransaction.commit();
    }

    public void handlerVideo2(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.video,new Video2());
        fragmentTransaction.commit();
    }

}
