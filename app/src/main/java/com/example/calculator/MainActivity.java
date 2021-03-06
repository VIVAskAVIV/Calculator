package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Calculator calculator = new Calculator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.calcucatorText);
        textView.setText("");

        /* Много кода который обрабатывает кнопки */
        Button button = findViewById(R.id.number1);
        button.setOnClickListener(v -> {
                    textView.append("1");
                    calculator.addNumber(1);
                });
        button = findViewById(R.id.number2);
        button.setOnClickListener(v -> {
            textView.append("2");
            calculator.addNumber(2);
        });
        button = findViewById(R.id.number3);
        button.setOnClickListener(v -> {
            textView.append("3");
            calculator.addNumber(3);
        });
        button = findViewById(R.id.number4);
        button.setOnClickListener(v -> {
            textView.append("4");
            calculator.addNumber(4);
        });
        button = findViewById(R.id.number5);
        button.setOnClickListener(v -> {
            textView.append("5");
            calculator.addNumber(5);
        });
        button = findViewById(R.id.number6);
        button.setOnClickListener(v -> {
            textView.append("6");
            calculator.addNumber(6);
        });
        button = findViewById(R.id.number7);
        button.setOnClickListener(v -> {
            textView.append("7");
            calculator.addNumber(7);
        });
        button = findViewById(R.id.number8);
        button.setOnClickListener(v -> {
            textView.append("8");
            calculator.addNumber(8);
        });
        button = findViewById(R.id.number9);
        button.setOnClickListener(v -> {
            textView.append("9");
            calculator.addNumber(9);
        });
        button = findViewById(R.id.number0);
        button.setOnClickListener(v -> {
            textView.append("0");
            calculator.addNumber(0);
        });
        button = findViewById(R.id.plus);
        button.setOnClickListener(v -> {
            textView.append("+");
            calculator.setOperation(Operations.SUM);
        });
        button = findViewById(R.id.minus);
        button.setOnClickListener(v -> {
            textView.append("-");
            calculator.setOperation(Operations.SUBTRACTION);
        });
        button = findViewById(R.id.division);
        button.setOnClickListener(v -> {
            textView.append("/");
            calculator.setOperation(Operations.DIVISION);
        });
        button = findViewById(R.id.multi);
        button.setOnClickListener(v -> {
            textView.append("+");
            calculator.setOperation(Operations.MULTIPLICATION);
        });
        button = findViewById(R.id.equal);
        button.setOnClickListener(v -> {
            String result = calculator.operate();
            if (!result.equals("E"))
                textView.setText(result);
        });
        button = findViewById(R.id.clear);
        button.setOnClickListener(v -> {
            textView.setText("");
            calculator.clear();
        });
    }

}