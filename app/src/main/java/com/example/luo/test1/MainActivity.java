package com.example.luo.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private TextView txtview1;
    private CheckBox ChkLed1,ChkLed2,ChkLed3,ChkLed4;
    private boolean f1 = false;
    private boolean f2 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btn_one);
        ChkLed1 = (CheckBox)findViewById(R.id.LED1);
        ChkLed2 = (CheckBox)findViewById(R.id.LED2);
        ChkLed3 = (CheckBox)findViewById(R.id.LED3);
        ChkLed4 = (CheckBox)findViewById(R.id.LED4);
        txtview1 = (TextView)findViewById(R.id.txt1);
        //findViewById(R.id.button_click_one).setOnClickListener(onClickListener);
    }
    public void click(View v){
        switch (v.getId()){
            case R.id.btn_one:
                f1 = !f1;
                if(f1)
                {
                    button1.setText("b1 turn on");
                    txtview1.setText("led all on");
                    ChkLed1.setChecked(true);
                    ChkLed2.setChecked(true);
                    ChkLed3.setChecked(true);
                    ChkLed4.setChecked(true);
                }
                else
                {
                    button1.setText("b1 turn off");
                    txtview1.setText("led all off");
                    ChkLed1.setChecked(false);
                    ChkLed2.setChecked(false);
                    ChkLed3.setChecked(false);
                    ChkLed4.setChecked(false);
                }
               // Toast.makeText(MainActivity.this,"Button点击事件1",Toast.LENGTH_LONG).show();
                break;
            case R.id.LED1:
                if(ChkLed1.isChecked())
                    txtview1.setText("led1 checked");
                else
                    txtview1.setText("led1 not checked");
                break;
            case R.id.LED2:
                if(ChkLed2.isChecked())
                    txtview1.setText("led2 checked");
                else
                    txtview1.setText("led2not checked");
                break;
            case R.id.LED3:
                if(ChkLed3.isChecked())
                    txtview1.setText("led3 checked");
                else
                    txtview1.setText("led3 not checked");
                break;
            case R.id.LED4:
                if(ChkLed4.isChecked())
                    txtview1.setText("led4 checked");
                else
                    txtview1.setText("led4 not checked");
                break;
        }
    }
    /*
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v){
            Toast.makeText(MainActivity.this,"Button点击事件1",Toast.LENGTH_LONG).show();
        }
    };
    */
}
