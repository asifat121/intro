package com.gamecodeschool.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etn1, etn2, etn3;
    private Button bt1,bt2,bt3,bt4;
    double Res1,Res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);

        etn1 = findViewById(R.id.editTextText);
        etn2 = findViewById(R.id.editTextText2);
        etn3 = findViewById(R.id.editTextText3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Res1=Double.parseDouble(etn1.getText()+"");
                Res2=Double.parseDouble(etn2.getText()+"");
                etn3.setText(Res1+Res2+"");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Res1=Double.parseDouble(etn1.getText()+"");
                Res2=Double.parseDouble(etn2.getText()+"");
                etn3.setText(Res1-Res2+"");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Res1=Double.parseDouble(etn1.getText()+"");
                Res2=Double.parseDouble(etn2.getText()+"");
                etn3.setText(Res1*Res2+"");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Res1=Double.parseDouble(etn1.getText()+"");
                Res2=Double.parseDouble(etn2.getText()+"");
                etn3.setText(Res1/Res2+"");
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
