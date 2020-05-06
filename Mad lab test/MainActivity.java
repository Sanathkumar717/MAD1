package com.example.a1bm17cs087;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    TextView tv;
    int font1=40;
    int ch=1;
    public void showMessage(String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setMessage(message);
        builder.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.font);
        b2=findViewById(R.id.colour);
        tv=findViewById(R.id.tv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                font1=font1-10;
                if(font1==0)
                {
                    font1=40;
                    showMessage("DONE");
                }
                tv.setTextSize(font1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch)
                {
                    case 1:tv.setTextColor(Color.RED);break;
                    case 2:tv.setTextColor(Color.BLUE);break;
                    case 3:tv.setTextColor(Color.YELLOW);break;
                    case 4:tv.setTextColor(Color.GREEN);break;
                    case 5:tv.setTextColor(Color.MAGENTA);break;

                }
                ch++;
                if(ch==6)
                    ch=1;
            }
        });
    }
}
