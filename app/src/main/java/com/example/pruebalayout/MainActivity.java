package com.example.pruebalayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);
        int k=0;
        for (int i = 0; i<table.getChildCount(); i++){
            TableRow row = (TableRow)table.getChildAt(i);
            for (int j = 0; j < row.getChildCount(); j++) {
                if(row.getChildAt(j) instanceof Button){
                    Button btn = (Button)row.getChildAt(j);
                    btn.setText(String.valueOf(++k));
                   btn.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {

                       }
                   });
                }
            }
        }
    }
}
