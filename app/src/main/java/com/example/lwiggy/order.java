package com.example.lwiggy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class order extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4;
    Button order;
    TextView bill;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        cb1=findViewById(R.id.biriyani);
        cb2=findViewById(R.id.poori);
        cb3=findViewById(R.id.dosa);
        cb4=findViewById(R.id.sambar);
        order=findViewById(R.id.place);
        bill=findViewById(R.id.bill);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int total=0;
               if(cb1.isChecked()){
                   total=total+150;
               }
                if(cb2.isChecked()){
                    total=total+50;
                }
                if(cb3.isChecked()){
                    total=total+60;
                }
                if(cb4.isChecked()){
                    total=total+35;
                }

                bill.setText("your Bill amount is Rs"+ String.valueOf(total));
                Toast.makeText(order.this,"Order placed",Toast.LENGTH_SHORT).show();
            }
        });



    }
}