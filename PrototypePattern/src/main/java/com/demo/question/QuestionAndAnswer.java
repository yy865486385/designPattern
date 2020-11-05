package com.demo.question;

/**
 * 问答题
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class QuestionAndAnswer {

    private String question;

    private String answer;

    public QuestionAndAnswer(String question,String answer){
        this.question = question;
        this.answer = answer;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}
