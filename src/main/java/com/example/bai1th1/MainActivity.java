package com.example.bai1th1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button cong,tru,nhan,chia,chiaphantram;
    EditText A,B;
    TextView kqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        A = findViewById(R.id.X);
        B = findViewById(R.id.Y);
        cong = findViewById(R.id.btncong);
        tru = findViewById(R.id.btntru);
        nhan = findViewById(R.id.btnnhan);
        chia = findViewById(R.id.btnchia);
        chiaphantram = findViewById(R.id.btnchiaphantram);
        kqua = findViewById(R.id.kq);
        cong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(A.getText().toString());
                double y = Integer.parseInt(B.getText().toString());
                double result = x + y;
                kqua.setText(String.valueOf(result));
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(A.getText().toString());
                double y = Integer.parseInt(B.getText().toString());
                double result = x - y;
                kqua.setText(String.valueOf(result));
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(A.getText().toString());
                double y = Integer.parseInt(B.getText().toString());
                double result = x * y;
                kqua.setText(String.valueOf(result));
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(A.getText().toString());
                double y = Integer.parseInt(B.getText().toString());
                double result = x / y;
                kqua.setText(String.valueOf(result));
            }
        });
        chiaphantram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double x = Integer.parseInt(A.getText().toString());
                double y = Integer.parseInt(B.getText().toString());
                double result = x % y;
                kqua.setText(String.valueOf(result));
            }
        });
    }
}