package peleg.com.testing125;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    String[] floor = {"Floor 1", "Floor 2", "Floor 3", "Floor 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.lst);
        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,floor);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);


    }

    @Override

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position == 0){
            Intent myintent = new Intent(view.getContext(),Main2Activity.class);
            startActivityForResult(myintent,0);
        }
        if(position == 1){
            Intent myintent = new Intent(view.getContext(),Main3Activity.class);
            startActivityForResult(myintent,1);
        }
        if(position == 2){
            Intent myintent = new Intent(view.getContext(),Main4Activity.class);
            startActivityForResult(myintent,2);
        }
        if(position == 3){
            Intent myintent = new Intent(view.getContext(),Main5Activity.class);
            startActivityForResult(myintent,3);
        }

    }
}
