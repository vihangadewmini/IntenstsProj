package com.example.intenstsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonListner();

        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));


        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();

    }
    public void OnClickButtonListner(){
       button = (Button)findViewById(R.id.Ok);

        final EditText num1 = (EditText) findViewById(R.id.textviewnum1);
        final EditText num2 = (EditText) findViewById(R.id.textviewnum2);


        button.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       Toast toast ;

                       Context context = getApplicationContext();
                       CharSequence text = "Sending Messages...";
                       int duration = Toast.LENGTH_SHORT;
                       toast = Toast.makeText(context , text, duration);
                       toast.setGravity(Gravity.CENTER_VERTICAL| Gravity.CENTER_HORIZONTAL, 0, 0);

                       toast.show();

                       Intent intent = new Intent(".SecondActivity");

                       final String no1 = num1.getText().toString();
                       final String no2 = num2.getText().toString();


                       intent.putExtra("num1",no1);
                       intent.putExtra("num2",no2);
                       startActivity(intent);
                   }
               }
       );

    }
}