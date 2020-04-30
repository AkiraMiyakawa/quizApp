package com.example.android.quizapp;

public class QuestionLibrary {

    private String mQuestions[] []= {
            {"Sentence of question for checkBoxes"}
    };

    private String mChoices[] []= {
            {"choice1","choice2","choice3","choice4"}
    };

    private String mCorrectAnswer [] = {"choice3"};


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[0];
        return answer;
    }

}
