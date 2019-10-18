package id.ac.polinema.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActitvityBiodata extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

    }
    public void button9(View view) {
        Intent i = new Intent(ActitvityBiodata.this, detailprofil1.class);
        startActivity(i);
    }
    public void button11(View view) {
        Intent i = new Intent(ActitvityBiodata.this, detailprofil2.class);
        startActivity(i);
    }

    public void button12(View view) {
        Intent i = new Intent(ActitvityBiodata.this, detailprofil3.class);
        startActivity(i);
    }

    public void button13(View view) {
        Intent i = new Intent(ActitvityBiodata.this, detailprofil4.class);
        startActivity(i);
    }

    public void button14(View view) {
        Intent i = new Intent(ActitvityBiodata.this, detailprofil5.class);
        startActivity(i);
    }

    public void button15(View view) {
        Intent i = new Intent(ActitvityBiodata.this, detailprofil6.class);
        startActivity(i);
    }

    public void button18(View view) {
        Intent i = new Intent(ActitvityBiodata.this, MainActivity.class);
        startActivity(i);
    }
}
