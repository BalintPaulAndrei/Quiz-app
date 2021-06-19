package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class NewActivity extends AppCompatActivity {
    private TextView questionTV, questionNumberTV;
    private Button option1Btn, option2Btn, option3Btn, option4Btn;
    private ArrayList<QuizModel> quizModelArrayList;
    Random random;
    int currentScore = 0, questionAttempted = 1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        questionTV = findViewById(R.id.idTvQuestion);
        questionNumberTV = findViewById(R.id.idTvQuestionAttempted);
        option1Btn = findViewById(R.id.idBtnOption1);
        option2Btn = findViewById(R.id.idBtnOption2);
        option3Btn = findViewById(R.id.idBtnOption3);
        option4Btn = findViewById(R.id.idBtnOption4);
        quizModelArrayList = new ArrayList<>();
        random = new  Random();
        getQuizQuestion(quizModelArrayList);
        currentPos = random.nextInt(quizModelArrayList.size());
        setDataToViews(currentPos);
        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase()))
                {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });

    }
    private void setDataToViews(int currentPos){
        questionNumberTV.setText("Questions Attempted : "+questionAttempted + "/10");
        questionTV.setText(quizModelArrayList.get(currentPos).getQuestion());
        option1Btn.setText(quizModelArrayList.get(currentPos).getOption1());
        option2Btn.setText(quizModelArrayList.get(currentPos).getOption2());
        option3Btn.setText(quizModelArrayList.get(currentPos).getOption3());
        option4Btn.setText(quizModelArrayList.get(currentPos).getOption4());


    }
    private void getQuizQuestion(ArrayList<QuizModel> quizModelArrayList) {
        quizModelArrayList.add(new QuizModel("How GFG is used?", "To solve DSA Problems", "To learn new languages","To learn Android", "All of the above", "All of the above"));
        quizModelArrayList.add(new QuizModel("Intrebarea 2?", "Raspunsul1", "Raspunsul2","Raspunsul3", "Raspunsul4", "Raspunsul1"));
        quizModelArrayList.add(new QuizModel("Intrebarea 3?", "Raspunsul1", "Raspunsul2","Raspunsul3", "Raspunsul4", "Raspunsul1"));
        quizModelArrayList.add(new QuizModel("Intrebarea 4?", "Raspunsul1", "Raspunsul2","Raspunsul3", "Raspunsul4", "Raspunsul1"));

    }
}