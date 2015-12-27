package prak.mobpro.inteneksplisit;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    public Button btnform, btnrelative, btnlinear, btntablelayout,btnabsoulute,btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnform = (Button) findViewById(R.id.btnform);
        btnrelative = (Button) findViewById(R.id.btnrelative);
        btnlinear = (Button) findViewById(R.id.btnlinear);
        btntablelayout = (Button) findViewById(R.id.btntablelayout);
        btnabsoulute = (Button) findViewById(R.id.btnabsoulute);
        btnexit = (Button) findViewById(R.id.btnexit);

        btnform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intentform = new Intent(getApplicationContext(),FormActivity.class);
                startActivity(intentform);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
