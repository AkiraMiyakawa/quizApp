package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;
    private int scoreUpQuizOne = 0;
    private int scoreUpQuizTwo = 0;
    private int scoreUpQuizThree = 0;
    private int scoreUpQuizFour = 0;
    private String quizOneAnswer = "Audi";
    private String quizOneALtAnswer = "audi";
    private String quizTwoAnswer = "Ingolstadt";
    private String quizTwoALtAnswer = "ingolstadt";
    private String quizFourAnswer = "California";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checkAnswer(View view) {
        /**
         * Fetch on/off state of each check box in Quiz 3.
         */

        CheckBox stateCheckBoxOne = (CheckBox) findViewById(R.id.quizThree_CheckBoxOne);
        boolean IsCheckBoxOne = stateCheckBoxOne.isChecked();

        CheckBox stateCheckBoxTwo = (CheckBox) findViewById(R.id.quizThree_CheckBoxTwo);
        boolean IsCheckBoxTwo = stateCheckBoxTwo.isChecked();
        ;
        CheckBox stateCheckBoxThree = (CheckBox) findViewById(R.id.quizThree_CheckBoxThree);
        boolean IsCheckBoxThree = stateCheckBoxThree.isChecked();

        CheckBox stateCheckBoxFour = (CheckBox) findViewById(R.id.quizThree_CheckBoxFour);
        boolean IsCheckBoxFour = stateCheckBoxFour.isChecked();

        Log.v("MainActivity", "CheckBox states(1 2 3 4): " + IsCheckBoxOne + IsCheckBoxTwo + IsCheckBoxThree + IsCheckBoxFour);

        /**
         * to calculate score of quiz Three if correct answer is selected.
         */

        if ((IsCheckBoxOne == true) && (IsCheckBoxTwo == false) && (IsCheckBoxThree == true) && (IsCheckBoxFour == false)) {
            {
                if (scoreUpQuizThree >= 1) {
                    scoreUpQuizThree = 0;
                }
            }
            scoreUpQuizThree = ++scoreUpQuizThree;
        } else {
            if (scoreUpQuizThree >= 1) {
                scoreUpQuizThree = 0;
            }
        }

        /**
         * to calculate score of quiz one if correct answer is written.
         */

        EditText quizOneEditText = (EditText) findViewById(R.id.quizOne_inputText);
        String quizOneTextValue = quizOneEditText.getText().toString();

        if (quizOneTextValue.equals(quizOneAnswer) || quizOneTextValue.equals(quizOneALtAnswer)) {
            {
                if (scoreUpQuizOne >= 1) {
                    scoreUpQuizOne = 0;
                }
            }
            scoreUpQuizOne = ++scoreUpQuizOne;
        } else {
            if (scoreUpQuizOne >= 1) {
                scoreUpQuizOne = 0;
            }
        }

        /**
         * to calculate score of quiz two if correct answer is written.
         */

        EditText quizTwoEditText = (EditText) findViewById(R.id.quizTwo_inputText);
        String quizTwoTextValue = quizTwoEditText.getText().toString();

        if (quizTwoTextValue.equals(quizTwoAnswer) || quizOneTextValue.equals(quizTwoALtAnswer)) {
            {
                if (scoreUpQuizTwo >= 1) {
                    scoreUpQuizTwo = 0;
                }
            }
            scoreUpQuizTwo = ++scoreUpQuizTwo;
        } else {
            if (scoreUpQuizTwo >= 1) {
                scoreUpQuizTwo = 0;
            }
        }

        /**
         * to calculate score of quiz Four if correct answer is selected.
         */

        RadioButton stateRadio = (RadioButton) findViewById(R.id.quizFour_radio1);
        boolean IsCheckQ4radio1 = stateRadio.isChecked();

        if (IsCheckQ4radio1) {
            {
                if (scoreUpQuizFour >= 1) {
                    scoreUpQuizFour = 0;
                }
            }
            scoreUpQuizFour = ++scoreUpQuizFour;
        } else {
            if (scoreUpQuizFour >= 1) {
                scoreUpQuizFour = 0;
            }
        }

        Context context = getApplicationContext();
        CharSequence text = "your score is: " + (score = scoreUpQuizOne + scoreUpQuizTwo + scoreUpQuizThree + scoreUpQuizFour);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Log.v("MainActivity", "score: " + score + "score of quiz one: " + scoreUpQuizOne + ", score of quiz Two: " + scoreUpQuizTwo + ", score of quiz Three: " + scoreUpQuizThree + ", score of quiz four: " + scoreUpQuizFour);


    }
}
