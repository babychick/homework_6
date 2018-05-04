package com.example.phi.homework_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;

public class DecBin extends AppCompatActivity {

    Button btnBack;
    Button btnDec;
    Button btnBin;
    EditText edtInput;
    TextView tvDec;
    TextView tvBin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dec_bin);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnDec = (Button) findViewById(R.id.btnDec);
        btnBin = (Button) findViewById(R.id.btnBin);
        edtInput = (EditText) findViewById(R.id.edtInput);
        tvDec = (TextView) findViewById(R.id.tvDec);
        tvBin = (TextView) findViewById(R.id.tvBin);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDec.setText("");
                tvBin.setText("");
                String s = edtInput.getText().toString();
                int dec = Integer.parseInt(s);
                String bin = Integer.toBinaryString(dec);
                tvDec.setText(s);
                tvBin.setText(bin);
            }
        });
        btnBin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDec.setText("");
                tvBin.setText("");
                String s = edtInput.getText().toString();
                int l = s.length() - 1;
                int dec = 0;
                int x = 0;
                for(int i = 0; i < s.length(); i++)
                {
                    x = s.charAt(i) - 48;
                    if (x != 0 && x != 1)
                    {
                        Toast.makeText(getBaseContext(), "Vui lòng nhập số Nhị phân", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    else
                    {
                        dec += x*pow(2,l-i);
                    }
                }

                tvDec.setText("" + dec);
                tvBin.setText(s);
            }
        });

    }
}
