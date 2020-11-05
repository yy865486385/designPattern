package com.demo.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 选择题
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class ChoiceQuestion {

    private String quest;
    private Map<String,String> choices = new HashMap<>();
    private String answer;

    public ChoiceQuestion(String quest,Map<String,String> choices,String answer){
        this.quest=quest;
        this.choices=choices;
        this.answer=answer;
    }


    public void setChoices(Map<String, String> choices) {
        this.choices = choices;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getAnswer() {
        return answer;
    }

    public Map<String, String> getChoices() {
        return choices;
    }

    public String getQuest() {
        return quest;
    }
}
