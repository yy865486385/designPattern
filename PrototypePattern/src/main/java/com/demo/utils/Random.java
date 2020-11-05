package com.demo.utils;

import com.demo.question.ChoiceQuestion;

import java.util.*;
import java.util.stream.Collectors;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class Random {

    /**
     * 选择题 乱序
     * @param choiceQuestion 选择题
     */
    public static void mapRandom(ChoiceQuestion choiceQuestion){
        Map<String,String> map = choiceQuestion.getChoices();
        String key = choiceQuestion.getAnswer();


        Set<String> keySet = map.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);

        Collections.shuffle(keyList);
        Map<String,String> newMap = new HashMap<>();
        int x = 0;
        String newKey = "";
        for (String keySetKey : keySet) {
            newMap.put(keyList.get(x),map.get(keySetKey));
            if (keySetKey.equals(key)){
                newKey=keyList.get(x);
            }
            x++;
        }

        choiceQuestion.setAnswer(newKey);
        choiceQuestion.setChoices(newMap);
    }
}
