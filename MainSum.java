package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.*;


public class MainSum {
    Font font1,font2;
    JFrame main;
    JPanel panel,down;
    JTextField str1,str2,sumStr;
//    JTextArea tShowArry;
    JButton sum,clear,add,dark,language;
    JLabel firstName,lastName;
    String  st1 , st2;
    overriden v = new overriden();

    public MainSum() {
        font1 = new Font("Serif", Font.BOLD, 25);
        font2 = new Font("Serif", Font.PLAIN, 18);

        main = new JFrame();
        panel = new JPanel();
        down = new JPanel();
        str1 = new JTextField();
        str2 = new JTextField();
        sumStr = new JTextField();
        //tShowArry = new JTextArea();
        firstName = new JLabel("First  String : ");
        lastName = new JLabel("Last  String : ");
        sum = new JButton("sum String");
        clear = new JButton(" clear ");
        add = new JButton(" add "); ///   Add to output window
        dark = new JButton("dark mood");
        language = new JButton("English");
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setSize(400,500);
        main.setResizable(false);
        main.setVisible(true);
        main.setLocation(730,330);
        panel.setBounds(0,0,400,420);
        down.setBounds(0,420,400,80);
        main.setLayout(null);
        main.add(panel);
        main.add(down);
        main.setTitle("Main");

        panel.setLayout(null);
        firstName.setBounds(20,15,200,30);
        firstName.setFont(font2);
        lastName.setBounds(210,15,200,30);
        lastName.setFont(font2);
        str1.setBounds(20,40,170,35);
        str1.setFont(font1);
        str2.setBounds(210,40,170,35);
        str2.setFont(font1);
        sum.setBounds(20,120,120,30);
        sum.setFont(font2);
        clear.setBounds(150,120,100,30);
        clear.setFont(font2);
        add.setBounds(260,120,120,30);
        sumStr.setBounds(50,180,300,40);
        sumStr.setFont(font1);
//        dark.setBounds(0,430,150,35);
//        language.setBounds(0,430,170,35);
        down.setBackground(Color.darkGray);




        //tShowArry.setBounds(50,250,300,200);
        panel.add(firstName); panel.add(lastName);
        panel.add(str1); panel.add(str2); panel.add(sum); panel.add(clear); panel.add(sumStr);
        /*panel.add(tShowArry);*/  panel.add(add);
        down.add(dark);   down.add(language);
        sum.addActionListener(v);
        clear.addActionListener(v);
        add.addActionListener(v);
        dark.addActionListener(v);

    }

    private class overriden  implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            st1 = str1.getText().toString();
            st2 = str2.getText().toString();
            if (e.getSource() == sum) {
                sumStr.setText(st1 + " " + st2);
            }
            if (e.getSource() == clear) {
                str1.setText("");
                str2.setText("");
                sumStr.setText("");
            }
            if (e.getSource() == add) {
                if (st1.length() > 0 && st2.length() > 0) {
                    System.out.println(st1 + "  " + st2);
                    str1.setText("");
                    str2.setText("");
                }
            }
            if (e.getSource()==dark) {
                 if (dark.getText().equals("Light mood")) {
                    panel.setBackground(Color.white);
                     firstName.setForeground(Color.black);
                     lastName.setForeground(Color.black);
                     sum.setBackground(Color.lightGray);
                     sum.setForeground(Color.black);
                     clear.setBackground(Color.lightGray);
                     clear.setForeground(Color.black);
                     add.setBackground(Color.lightGray);
                     add.setForeground(Color.black);

                    dark.setText("dark mood");
                }else{
                     panel.setBackground(Color.gray);
                      firstName.setForeground(Color.white);
                      lastName.setForeground(Color.white);
                     sum.setBackground(Color.darkGray);
                     sum.setForeground(Color.white);
                     clear.setBackground(Color.darkGray);
                     clear.setForeground(Color.white);
                     add.setBackground(Color.darkGray);
                     add.setForeground(Color.white);
                     dark.setText("Light mood");
                 }

            }


        }


    }
}

