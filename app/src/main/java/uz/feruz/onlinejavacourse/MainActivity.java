package uz.feruz.onlinejavacourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton Ulashish,Muallif,Hudud,Duo;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ulashish=(MaterialButton)findViewById(R.id.ulashish);
        Muallif=(MaterialButton)findViewById(R.id.muallif);
        Hudud=(MaterialButton)findViewById(R.id.hududtanla);
        Duo=(MaterialButton)findViewById(R.id.duo);
        Muallif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Muallif.setText("t.me/feruzjan_1");
            }
        });

        Hudud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,HududActivity.class);
                startActivity(intent);
            }
        });
        Ulashish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body="Yuklab olish";
                String Sub="Ramazon taqvimi 2022(Hijriy 1443)      Yuklab olish: t.me/feruzjan_2 ";
                intent.putExtra(Intent.EXTRA_TEXT,Body);
                intent.putExtra(Intent.EXTRA_TEXT,Sub);
                startActivity(Intent.createChooser(intent,"Share"));
            }
        });
        Duo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DuolarActivity.class);
                startActivity(intent);
            }
        });
    }
}