package com.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-10-30
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Map mainMap = new Map();
        mainMap.init();



        int[][] form = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        int count = 0;
        int x = 4;
        int y = 4;
        while (form[0][0]!=1){
            form[x][y] = 1;
            if (y==0){
                x--;
                y=4;
            }else{
                y--;
            }
            String formstr= FormPrinter.print(form);
            mainMap.setLabel(formstr);
            count++;
            Thread.sleep(1000);
        }
        System.out.println("执行"+count+"次");
    }
}
