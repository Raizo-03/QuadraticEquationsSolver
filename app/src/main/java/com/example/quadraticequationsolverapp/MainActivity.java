package com.example.quadraticequationsolverapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.quadraticequationsolverapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    TextView title, result;
    EditText etVal1;
    EditText etVal2;
    EditText etVal3;
    Button btnSolve;
    ImageView imageView;



    ActivityMainBinding mainBinding;
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

        title = findViewById(R.id.title);
        result = findViewById(R.id.tvResult);
        etVal1 = findViewById(R.id.etVal1);
        etVal2 = findViewById(R.id.etVal2);
        etVal3 = findViewById(R.id.etVal3);
        btnSolve = findViewById(R.id.btnSolve);
        imageView = findViewById(R.id.imageView);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MyEquation equation = new MyEquation(mainBinding);
        mainBinding.setMyEquation(equation);


    }
}