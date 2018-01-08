package com.example.administrator.myapplication20171231;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber,secondNumber;
    private Button addBtn;
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber=(EditText) findViewById(R.id.firstNumber);
        secondNumber=(EditText) findViewById(R.id.secondNumber);
        addBtn=(Button) findViewById(R.id.addBtn);
        resultTv=(TextView) findViewById(R.id.resultTv);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=firstNumber.getText().toString();
                String value2=secondNumber.getText().toString();
                int result=Integer.parseInt(value1)+Integer.parseInt(value2);//String强制转换成int类型
                Log.i("AUTO","the result is:"+result);
                resultTv.setText(result+"");
                resultTv.setVisibility(View.VISIBLE);
            }
        });
    }
}
