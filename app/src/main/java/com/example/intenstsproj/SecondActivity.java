package com.example.intenstsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    Button buttonPlus , buttonMin, buttonMult , buttondiv;
    TextView tv1 , tv2 , answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        tv1 = (TextView)findViewById(R.id.textviewnum1);
        tv2 = (TextView)findViewById(R.id.textviewnum2);
        answer = (TextView)findViewById(R.id.answer);
/*
        tv1.setText(getIntent().getStringExtra("num1"));
        tv2.setText(getIntent().getStringExtra("num2"));
*/
        String no1 = intent.getStringExtra("num1");
        tv1.setText(no1);

        String no2 = intent.getStringExtra("num2");
        tv2.setText(no2);

        buttonPlus = (Button) findViewById(R.id.add);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 + oper2;
                Integer result = s1 + s2;
                answer.setText(tv1.getText() + "+" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );

        buttonMin = (Button) findViewById(R.id.sub);

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 - oper2;
                Integer result = s1 - s2;
                answer.setText(tv1.getText() + "-" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );
        buttonMult = (Button) findViewById(R.id.mul);

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 - oper2;
                Integer result = s1 * s2;
                answer.setText(tv1.getText() + "*" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );
        buttondiv = (Button) findViewById(R.id.div);

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 / oper2;
                Integer result = s1 / s2;
                answer.setText(tv1.getText() + "/" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );
    }
}

