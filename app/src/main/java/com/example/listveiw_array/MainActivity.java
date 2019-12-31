package com.example.listveiw_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView ListView_1;
    private TextView tv1;

    String[] Item_x = new String[]{
            "Item_1",
            "Item_2",
            "Item_3",
            "Item_4"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        tv1=findViewById(R.id.tv1);




        ListView_1=findViewById(R.id.listveiw);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,Item_x);
        ListView_1.setAdapter(adapter);
        ListView_1.setOnItemClickListener(click);



    }

    private AdapterView.OnItemClickListener click=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
            Toast.makeText(MainActivity.this,"點選第 "+(position +1) +" 個 \n內容："+Item_x[position], Toast.LENGTH_SHORT).show();
            tv1.setText("你選擇了"+Item_x[position]);


        }
    };

}
