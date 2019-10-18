package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class detailprofil4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailprofil4);
    }

    public void button20(View view) {
        Intent i = new Intent(detailprofil4.this, ActitvityBiodata.class);
        startActivity(i);
    }
}
