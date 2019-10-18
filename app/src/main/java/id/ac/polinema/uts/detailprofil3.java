package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detailprofil3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailprofil3);
    }

    public void button19(View view) {
        Intent i = new Intent(detailprofil3.this, ActitvityBiodata.class);
        startActivity(i);
    }
}
