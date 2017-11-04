package com.example.raj.myapplication4;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import static com.example.raj.myapplication4.MainActivity.text1;

/**
 * Created by Raj on 11/3/2017.
 */

public class MyTask extends AsyncTask<String,String,List<String>> {

    List<String> mList = new ArrayList<>();
    Activity mainActivity;
ImageView image;
    public MyTask(Activity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    protected List<String> doInBackground(String... params) {

        for(int i =0; i < 5; i++){
            for (int j = 0; j < 1000; j++) {
                mList.add(i + ":" + j);
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(List<String> s) {
        super.onPostExecute(s);
        ((MainActivity)mainActivity).showMsg(s.get(0));
    }
}
