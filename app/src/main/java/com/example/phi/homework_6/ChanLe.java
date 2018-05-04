package com.example.phi.homework_6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChanLe extends AppCompatActivity {

    Button btnKiemTra;
    Button btnBack;
    EditText edtInput;
    TextView tvChanLe;
    TextView tvHistory;
    String his = "Dãy số đã nhập: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chan_le);
        btnKiemTra = (Button) findViewById(R.id.btnKiemTra);
        btnBack = (Button) findViewById(R.id.btnBack);
        edtInput = (EditText) findViewById(R.id.edtInput);
        tvChanLe = (TextView) findViewById(R.id.tvChanLe);
        tvHistory = (TextView) findViewById(R.id.tvHistory);
        btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = edtInput.getText().toString();
                int value = Integer.parseInt(s);
                if (value % 2 == 0)
                {
                    tvChanLe.setText("CHẴN/LẺ: CHẴN");
                    tvHistory.setText(his);
                }
                else tvChanLe.setText("CHẴN/LẺ: LẺ");

                his += s;
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
