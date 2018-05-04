package com.example.phi.homework_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Total extends AppCompatActivity {

    Button btnTieptuc;
    Button btnTinhTien;
    Button btnThoat;
    EditText edtSL;
    EditText edtGia;
    EditText edtThue;
    TextView tvThanhTien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        btnTieptuc = (Button) findViewById(R.id.btnTieptuc);
        btnTinhTien = (Button) findViewById(R.id.btnTinhTien);
        btnThoat = (Button) findViewById(R.id.btnThoat);
        edtSL = (EditText) findViewById(R.id.edtSL);
        edtGia = (EditText) findViewById(R.id.edtGia);
        edtThue = (EditText) findViewById(R.id.edtThue);
        tvThanhTien = (TextView) findViewById(R.id.tvThanhTien);

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnTieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtSL.setText("");
                edtGia.setText("");
                edtThue.setText("");
            }
        });
        btnTinhTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sl = Integer.parseInt(edtSL.getText().toString());
                int gia = Integer.parseInt(edtGia.getText().toString());
                int thue = Integer.parseInt(edtThue.getText().toString());

                float total = (sl*gia) - (sl*gia)/thue;

                tvThanhTien.setText("" + total);
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
