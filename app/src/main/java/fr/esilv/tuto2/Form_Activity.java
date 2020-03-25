package fr.esilv.tuto2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;



public class Form_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);
        setTitle("Inscription");
    }
}
