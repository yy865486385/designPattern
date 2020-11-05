package com.demo;

import com.demo.papers.ExaminationPaper;
import com.demo.question.ChoiceQuestion;
import com.demo.question.QuestionAndAnswer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class PaperGetter {

    public ExaminationPaper createPaper() {
        // 选择题
        Map<String, String> map1 = new HashMap<>();
        map1.put("A", "答案A");
        map1.put("B", "答案B");
        map1.put("C", "答案C");
        map1.put("D", "答案D");
        ChoiceQuestion choiceQuestion1 = new ChoiceQuestion("题目1", map1, "A");
        ChoiceQuestion choiceQuestion2 = new ChoiceQuestion("题目2", map1, "B");
        ChoiceQuestion choiceQuestion3 = new ChoiceQuestion("题目3", map1, "C");
        ChoiceQuestion choiceQuestion4 = new ChoiceQuestion("题目4", map1, "D");
        // 问答题
        QuestionAndAnswer questionAndAnswer1 = new QuestionAndAnswer("问答题1","答案1");
        QuestionAndAnswer questionAndAnswer2 = new QuestionAndAnswer("问答题2","答案2");
        QuestionAndAnswer questionAndAnswer3 = new QuestionAndAnswer("问答题3","答案3");

        ExaminationPaper paper = new ExaminationPaper();
        paper.addChoice(choiceQuestion1)
                .addChoice(choiceQuestion2)
                .addChoice(choiceQuestion3)
                .addChoice(choiceQuestion4);
        paper.addAnswerQuest(questionAndAnswer1)
                .addAnswerQuest(questionAndAnswer2)
                .addAnswerQuest(questionAndAnswer3);
        return paper;
    }

}
