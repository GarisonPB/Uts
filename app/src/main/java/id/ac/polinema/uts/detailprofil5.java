package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detailprofil5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailprofil5);
    }

    public void button21(View view) {
        Intent i = new Intent(detailprofil5.this, ActitvityBiodata.class);
        startActivity(i);
    }
}
