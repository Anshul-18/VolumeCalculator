package com.example.multiscreenapppracticesetq1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  String[] questions = {"java is a person?" ,
            "Java was introduced in 1823", "Java was created by humans?",
            "Java has abstract classes?",
            "Java supports interfaces?"};

    private boolean ans[] = {false, false, true, true, true};
    TextView que;
    private int score = 0;
    private int index = 0;
    Button yes;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.Yes);
        no = findViewById(R.id.No);
        que = findViewById(R.id.que);
        que.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index < questions.length){
                    //for correct answer
                    if(ans[index]){ //ans[index] == true
                        score++;
                    }
                   //go to the next question
                    index++;
                    if(index < questions.length){
                        que.setText(questions[index]);
                    }else {
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Restart the app to attempt quiz.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index < questions.length){
                    //for correct answer
                    if(!ans[index]){ //ans[index] == false
                        score++;
                    }
                    //go to the next question
                    index++;
                    if(index < questions.length){
                            que.setText(questions[index]);
                    }else {
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Restart the app to attempt quiz.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}










