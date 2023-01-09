package com.example.a243newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

  ListView listView = findViewById(R.id.listview);

  HashMap<String, String>hashMap = new HashMap<>();
  ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // we have to create and imaginary table using hashMap

        createTable();

        //calling MyAdapter
        MyAdapter myAdapter = new MyAdapter(); // here we assign a variable called "myAdapter" and we put our created "MyAdapter" into it.
        listView.setAdapter(myAdapter);  // listView only eats adapter , so we set adapter into listview and pass our myAdapter into it.






    }
    //=================================================================

            private class MyAdapter extends BaseAdapter {


                @Override
                public int getCount() {
                   return arrayList.size();
                }

                @Override
                public Object getItem(int position) {
                    return null;
                }

                @Override
                public long getItemId(int position) {
                    return 0;
                }

                @Override
                public View getView(int position, View convertView, ViewGroup viewGroup) {

                    LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    View myView = inflater.inflate(R.layout.item, viewGroup,false);

                    return myView;
                }
            }


    //=================================================================

    //=================================================================

            //Creating a table function for our HashMap

      private void createTable(){

            hashMap = new HashMap<>();
            hashMap.put("cat", "Tech");
            hashMap.put("image_url", "https://www.dasding.de/whatsapp/1673008656064,whatsapp-icon-100~_v-1x1@2dL_-029cdd853d61a51824ed2ee643deeae504b065c1.jpg");
            hashMap.put("title", "হোয়াটসঅ্যাপের নতুন চমক, চলবে ইন্টারনেট ছাড়াই");
            hashMap.put("des", "দ্রুত যোগাযোগের অন্যতম মাধ্যম হোয়াটসঅ্যাপ। সারাবিশ্বেই এটি জনপ্রিয়। অন্যান্য যোগাযোগ মাধ্যমের মতো এটি ব্যবহার করতেও ইন্টারনেট সংযোগ অত্যাবশ্যক। তবে এ নির্ভরতা কাটিয়ে উঠেছে প্লাটফর্মটি। ইন্টারনেট বন্ধ থাকলেও প্রক্সি সার্ভারের মাধ্যমে হোয়াটসঅ্যাপ ব্যবহারের সুবিধা চালু করা হয়েছে।");

            // so our hashMap creation is done, now we have to put our hashMap into arrayList

            arrayList.add(hashMap);


      }










    //=================================================================


}