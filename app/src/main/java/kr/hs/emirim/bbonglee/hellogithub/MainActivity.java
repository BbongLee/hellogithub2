package kr.hs.emirim.bbonglee.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button) findViewById(R.id.btnHello); //R esource
        btnHello.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(this, "안녕!\n나는 뽀로로야!*^^*", Toast.LENGTH_SHORT).show();
    }
}