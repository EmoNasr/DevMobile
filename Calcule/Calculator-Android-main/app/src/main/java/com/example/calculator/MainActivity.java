package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmult,bdiv,beq,bac,bc,bdot,bsin,bcos,btan,bpl,bpr;
    TextView tvmain;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        bplus = findViewById(R.id.buttonplus);
        bminus = findViewById(R.id.buttonminus);
        bmult = findViewById(R.id.buttonmult);
        bdiv = findViewById(R.id.buttondiv);
        beq = findViewById(R.id.buttoneq);
        bac = findViewById(R.id.buttonac);
        bc = findViewById(R.id.buttonc);
        bdot = findViewById(R.id.buttondot);
        /*bsin = findViewById(R.id.buttonsin);
        bcos = findViewById(R.id.buttoncos);
        btan = findViewById(R.id.buttontan);
        bpl = findViewById(R.id.buttonparl);
        bpr = findViewById(R.id.buttonparr);*/



        tvmain = findViewById(R.id.tvmain);

        //onClick listeners
        b0.setOnClickListener((evt)->{
            //tvmain.setText(String.valueOf(Float.parseFloat((String) tvmain.getText())*10) );
            String tempText = tvmain.getText().toString();
            if (!tempText.equals("0"))
                tvmain.setText(tempText + "0");
        });
        b1.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("1");
            else
                tvmain.setText(tempText + "1");
        });
        b2.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("2");
            else
                tvmain.setText(tempText + "2");
        });
        b3.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("3");
            else
                tvmain.setText(tempText + "3");
        });
        b4.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("4");
            else
                tvmain.setText(tempText + "4");
        });
        b5.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("5");
            else
                tvmain.setText(tempText + "5");
        });
        b6.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("6");
            else
                tvmain.setText(tempText + "6");
        });
        b7.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("7");
            else
                tvmain.setText(tempText + "7");
        });
        b8.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("8");
            else
                tvmain.setText(tempText + "8");
        });
        b9.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if (tempText.startsWith("0") & tempText.indexOf(".")==-1)
                tvmain.setText("9");
            else
                tvmain.setText(tempText + "9");
        });

/*
        bsin.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            tvmain.setText(tempText + "sin(");
        });



        bcos.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            tvmain.setText(tempText + "cos(");
        });

        btan.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            tvmain.setText(tempText + "tan(");
        });
        bpr.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            tvmain.setText(tempText + ")");
        });
        bpl.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            tvmain.setText(tempText + "(");
        });*/


        bdot.setOnClickListener((evt)->{
            //if (tvmain.getText().toString().indexOf(".")==-1)
                tvmain.setText(tvmain.getText() + ".");
        });
        bac.setOnClickListener((evt)->{
            tvmain.setText("");
        });
        bc.setOnClickListener((evt)->{
            String tempText = tvmain.getText().toString();
            if(!tempText.equals(""))
                tvmain.setText(tempText.subSequence(0,tempText.length() - 1));
        });
        bplus.setOnClickListener((evt)->{
            tvmain.setText(tvmain.getText()+"+");
        });
        bminus.setOnClickListener((evt)->{
            tvmain.setText(tvmain.getText()+"-");
        });
        bmult.setOnClickListener((evt)->{
            tvmain.setText(tvmain.getText()+"*");
        });
        bdiv.setOnClickListener((evt)->{
            tvmain.setText(tvmain.getText()+"/");
        });


        beq.setOnClickListener((evt)->{
            //
            String val = tvmain.getText().toString();
            val = val.replace('÷','/').replace('×','*');
            Expression exp = new Expression(val);
            tvmain.setText(String.valueOf(exp.calculate()));
        });
    }
}