package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.InputDevice;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcola;
    private EditText number1;
    private EditText number2;

    private EditText operando;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalcola = (Button) findViewById(R.id.btnCalcola);
        txtResult = (TextView)findViewById(R.id.txtResult);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        operando = (EditText)findViewById(R.id.operando);
    }


   public void calcola(View v)
    {
        String strNum1 = number1.getText().toString();
        String strNum2 = number2.getText().toString();
        String oper = operando.getText().toString();
        if(oper.equals("+") || oper.equals("-") || oper.equals("/") || oper.equals("*")) {
            int res = 0;
            if (oper.equals("+")) {
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                res = n1 + n2;
            } else if (oper.equals("-")) {
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                res = n1 - n2;
            } else if (oper.equals("*")) {
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                res = n1 * n2;
            } else if (oper.equals("/")) {
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                res = n1 / n2;
            }
            String strStr = String.valueOf(res);
            txtResult.setText(strStr);
        }else{
            String error = String.valueOf("Operando Errato");
            txtResult.setText(error);
        }
    }
}
