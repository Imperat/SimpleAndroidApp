package com.example.stronger.finalrelise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView var;
    Button btnOk;
    Button btnExit;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();

        btnOk = (Button)findViewById(R.id.button);
        var = (TextView)findViewById(R.id.textView2);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText3);
        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this
                        , Main2Activity.class);
                startActivity(intent);
                if (editText.getText().toString().equals("1")){
                    Labs.var = 1;
                } else
                if (editText.getText().toString().equals("2")){
                    Labs.var = 2;
                } else
                if (editText.getText().toString().equals("3")){
                    Labs.var = 3;
                } else
                if (editText.getText().toString().equals("4")){
                    Labs.var = 4;
                } else
                if (editText.getText().toString().equals("5")){
                    Labs.var = 5;
                } else {
                    Labs.var = 6;
                }

                if (editText2.getText().toString().equals("1")){
                    Labs.tsk = 1;
                } else
                if (editText2.getText().toString().equals("2")){
                    Labs.tsk = 2;
                } else
                if (editText2.getText().toString().equals("3")){
                    Labs.tsk = 3;
                } else
                if (editText2.getText().toString().equals("4")){
                    Labs.tsk = 4;
                } else
                if (editText2.getText().toString().equals("5")){
                    Labs.tsk = 5;
                } else
                {
                    Labs.tsk = 6;
                }
                    Labs.returnVar();

            }
        };
        btnOk.setOnClickListener(oclBtnOk);
    }


}
