package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class detailprofil1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailprofil1);

    }

    public void button16(View view) {
        Intent i = new Intent(detailprofil1.this, ActitvityBiodata.class);
        startActivity(i);
    }
}

