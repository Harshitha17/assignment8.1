package com.example.harshitha.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Initialization Variables
    ArrayAdapter<String> AscAdaptor;
    ArrayAdapter<String>DesAdaptor;
    ListView List;
    String[] Months = new String[] {"Jan","Feb","March","April","May","June","July","August","November"};
    Button asce;
    Button desc;
    ListView asc;
    ListView dsc;
    String[] Ascen = new String[] {"April","August","Feb","July","June","March","May","November"};
    String[] Descen = new String[] {"November","May","March","June","July","Feb","August","April"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining  ArrayAdapter  to the taken list
        List = (ListView)findViewById(R.id.lstv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,Months);
        //setting Adapter
        List.setAdapter(adapter);
        //defining Variables
        asce =(Button)findViewById(R.id.Ascend);
        desc =(Button)findViewById(R.id.dsndgbtn);
        asc = (ListView)findViewById(R.id.dynamic);
        dsc = (ListView)findViewById(R.id.dynamic2);

        //Ascending Button Onclick event
        asce.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setting ArrayAdapter,arranging in ascending order and making a Toast for better usage
                AscAdaptor = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,Ascen);
                Toast.makeText(MainActivity.this,"Ascending button is clicked",Toast.LENGTH_SHORT).show();
                asc.setAdapter(AscAdaptor);
            }
        });

        desc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //setting ArrayAdapter,arranging list elements in descending order and making a toast
                DesAdaptor = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_expandable_list_item_1,Descen);
                Toast.makeText(MainActivity.this,"Descending button is clicked",Toast.LENGTH_SHORT).show();
                dsc.setAdapter(DesAdaptor);

            }
        });

    }
}
