package fr.esilv.SmartFinance;

import androidx.appcompat.app.AppCompatActivity;  // linear layout: "div" widgets into it

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SmartFinance");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {getMenuInflater().inflate(R.menu.menu,menu);
    return true;}

    @Override

    public boolean onOptionsItemSelected(MenuItem item)
    {switch(item.getItemId()){ case R.id.action_connection://
        return true;
        case R.id.action_inscription://
            return true;
        case R.id.action_monnaies://
            return true;
        case R.id.action_cryptos:
            //
            return true;}
        return super.onOptionsItemSelected(item);}

}
