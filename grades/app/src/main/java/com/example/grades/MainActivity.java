package com.example.grades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView resultnum = findViewById(R.id.resultnum);
        EditText quizzes = findViewById(R.id.quizzes);
        EditText homework = findViewById(R.id.homework);
        EditText midterm = findViewById(R.id.midterm);
        EditText finals = findViewById(R.id.finals);
        Button calculate = findViewById(R.id.calculate);
        Button reset = findViewById(R.id.reset);





        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (TextUtils.isEmpty(quizzes.getText().toString()))
                {
                    quizzes.setError("This field is required");
                    return;
                }

                if (TextUtils.isEmpty(homework.getText().toString()))
                {
                    homework.setError("This field is required");
                    return;
                }

                if (TextUtils.isEmpty(midterm.getText().toString()))
                {
                    midterm.setError("This field is required");
                    return;
                }

                if (TextUtils.isEmpty(finals.getText().toString()))
                {
                    finals.setError("This field is required");
                    return;
                }


                double quizgrade = Double.parseDouble(quizzes.getText().toString());
                double homeworkgrade = Double.parseDouble(homework.getText().toString());
                double midtermgrade = Double.parseDouble(midterm.getText().toString());
                double finalsgrade = Double.parseDouble(finals.getText().toString());
                double totalgrade = quizgrade + homeworkgrade + midtermgrade + finalsgrade;

                resultnum.setText(String.valueOf(totalgrade));





            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quizzes.setText("");
                homework.setText("");
                midterm.setText("");
                finals.setText("");
                resultnum.setText("");
            }
        });



    }
}