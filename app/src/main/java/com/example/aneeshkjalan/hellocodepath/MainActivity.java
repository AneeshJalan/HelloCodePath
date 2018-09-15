package com.example.aneeshkjalan.hellocodepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.yellow));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.holo_blue_bright));

                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimaryDark));

                ((TextView) findViewById(R.id.textView)).setText("Hello from Aneesh!");
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();

                if (TextUtils.isEmpty(newText)) {
                    newText = "Hello from Aneesh!";
                }

                ((TextView) findViewById(R.id.textView)).setText(newText);
            }
        });
    }
}
