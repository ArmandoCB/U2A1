package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


import java.lang.String;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "message";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.btn);
        btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick( View v ) {
                Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
                intent.putExtra(EXTRA_MESSAGE, "Mensaje");
                startActivity(intent);
            }
        });
    }
}
