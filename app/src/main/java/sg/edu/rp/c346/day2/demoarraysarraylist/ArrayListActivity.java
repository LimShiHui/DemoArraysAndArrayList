package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        // Q2b
        fruits.add("durian");
        // Q2c
        String theFruit = fruits.get(1);
        // Q2d
        fruits.remove(0);
        // Q2e
        fruits.set(fruits.size() - 1, "dragon fruit");



        String msg = "Fruits \n ===== \n";
        for (int i = 0; i < fruits.size(); i++) {
            msg += fruits.get(i) + "\n";
        }

        tv.setText(msg);



    }
}