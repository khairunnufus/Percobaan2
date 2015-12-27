package prak.mobpro.inteneksplisit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends Activity {
    public EditText nim, nama ,kelas, angkatan;
    public Button btnsubmit, btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        nim = (EditText) findViewById(R.id.editnim);
        nama = (EditText) findViewById(R.id.editnama);
        kelas = (EditText) findViewById(R.id.editkelas);
        angkatan = (EditText) findViewById(R.id.editangkatan);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);
        btnReset = (Button) findViewById(R.id.btnReset);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nimanda = nim.getText().toString();
                String namaanda = nama.getText().toString();
                String kelasanda = kelas.getText().toString();
                String angkatanda = angkatan.getText().toString();

                Toast.makeText(getApplicationContext(), nimanda + "\n " + namaanda + "\n " + kelasanda + "\n " + angkatanda + "\n ",
                        Toast.LENGTH_LONG).show();

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nim.setText("");
                nama.setText("");
                kelas.setText("");
                angkatan.setText("");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form, menu);
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
