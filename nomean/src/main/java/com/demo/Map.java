package com.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-10-30
 */
public class Map extends JFrame {

    private JLabel jLabel=new JLabel();

    private Controller controller=new Controller();

    public void init() {
        super.frameInit();
        this.setSize(400,400);
        this.setVisible(true);
        this.add(jLabel);
        jLabel.setSize(200,200);
        jLabel.setAlignmentX(0.5F);

        jLabel.setText("text");
        jLabel.setLocation(200,200);
        this.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                jLabel.setText(String.valueOf(e.getKeyChar()));
            }

            public void keyPressed(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public void setLabel(String lable){
        jLabel.setText(lable);
    }
}
