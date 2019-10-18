package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detailprofil2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailprofil2);
    }

    public void button17(View view) {
        Intent i = new Intent(detailprofil2.this, ActitvityBiodata.class);
        startActivity(i);
    }
}
