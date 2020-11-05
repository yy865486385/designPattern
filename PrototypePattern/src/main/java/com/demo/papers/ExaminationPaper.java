package com.demo.papers;

import com.demo.question.ChoiceQuestion;
import com.demo.question.QuestionAndAnswer;
import com.demo.utils.Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 试卷
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class ExaminationPaper implements Cloneable{

    private ArrayList<ChoiceQuestion> choicePart = new ArrayList<>();

    private  ArrayList<QuestionAndAnswer> answersQuestPart = new ArrayList<>();


    public ExaminationPaper addChoice(ChoiceQuestion choiceQuestion) {
        this.choicePart.add(choiceQuestion);
        return this;
    }

    public ExaminationPaper addAnswerQuest(QuestionAndAnswer questionAndAnswer){
        this.answersQuestPart.add(questionAndAnswer);
        return this;
    }

    // 重写clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        ExaminationPaper examinationPaper = (ExaminationPaper) super.clone();
        examinationPaper.answersQuestPart = (ArrayList<QuestionAndAnswer>) answersQuestPart.clone();
        examinationPaper.choicePart = (ArrayList<ChoiceQuestion>) choicePart.clone();
        // 乱序题目
        Collections.shuffle(examinationPaper.answersQuestPart);
        Collections.shuffle(examinationPaper.choicePart);
        // 乱序选择题的选项
        for (int i = 0; i < examinationPaper.choicePart.size(); i++) {
            ChoiceQuestion choiceQuestion = examinationPaper.choicePart.get(i);
            Random.mapRandom(choiceQuestion);
        }
        return examinationPaper;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("--------------------------------\n");
        sb.append("一、选择题\n");
        for (int i = 0; i < this.choicePart.size(); i++) {
            ChoiceQuestion choiceQuestion = this.choicePart.get(i);
            sb.append(i+1+"."+choiceQuestion.getQuest()+"\n");
            for (String s : choiceQuestion.getChoices().keySet()) {
                sb.append(s+"."+choiceQuestion.getChoices().get(s)+"\n");
            }
            sb.append("答案:"+choiceQuestion.getAnswer()+"\n");
        }
        sb.append("二、问答题\n");
        for (int i = 0; i < this.answersQuestPart.size(); i++) {
            QuestionAndAnswer questionAndAnswer = this.answersQuestPart.get(i);
            sb.append(i+1+"."+questionAndAnswer.getQuestion()+"\n");
            sb.append("答："+questionAndAnswer.getAnswer()+"\n");
        }
        return sb.toString();
    }
}
