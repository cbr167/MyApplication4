package com.example.raj.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
     TextView text1;
    String msg;

    public static TextView getText1() {
        return text1;
    }

    public static void setText1(TextView text1) {
        MainActivity.text1 = text1;
    }

    private List<String> mitems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //efdcevegredgvrevrevrvreved
        String jsv;
        setContentView(R.layout.activity_main);
showMsg(msg);

    }
    public void eatMemory(View view){
        MyTask myTask = new MyTask(MainActivity.this);
        myTask.execute();
    }
    public  void showMsg( String msg){
        text1.setText(this.msg);
    }
}
