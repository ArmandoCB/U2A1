package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static unam.fca.dmoviles.MainActivity.EXTRA_MESSAGE;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        final TextView tv = findViewById(R.id.tv);
        tv.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
            }
}
