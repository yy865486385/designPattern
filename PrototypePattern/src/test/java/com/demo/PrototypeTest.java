package com.demo;

import com.demo.papers.ExaminationPaper;
import org.junit.Test;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        PaperGetter paperGetter = new PaperGetter();

        ExaminationPaper examinationPaper1 = paperGetter.createPaper();
        ExaminationPaper examinationPaper2 = (ExaminationPaper) examinationPaper1.clone();
        ExaminationPaper examinationPaper3 = (ExaminationPaper) examinationPaper1.clone();
        ExaminationPaper examinationPaper4 = (ExaminationPaper) examinationPaper1.clone();
        System.out.println(examinationPaper1.toString());
        System.out.println(examinationPaper2.toString());
        System.out.println(examinationPaper3.toString());
        System.out.println(examinationPaper4.toString());


    }
}
