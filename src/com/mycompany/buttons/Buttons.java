/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.buttons;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Buttons {
private JButton btnsearch,btnbook,btnrecord,btnavailabedoc,btnsetting;
private JLabel Title;    
private static JFrame frame;
public Buttons(){
    
frame=new JFrame();
frame.setTitle("MENU/FUNCTIONS");
frame.setLayout(new BorderLayout());
frame.setSize(400,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
initializer();   
frame.setVisible(true);

}

void initializer(){
    
    
    JPanel tp=new JPanel(new BorderLayout());
    tp.setPreferredSize(new Dimension(400,100));
    tp.setBackground(Color.pink);
    Title=new JLabel("WELCOME",SwingConstants.CENTER);
    Title.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
    tp.add(Title,BorderLayout.CENTER);
   
    frame.add(tp,BorderLayout.NORTH);
    
    
    
    JPanel cp=new JPanel(new GridLayout(5,1,5,5));
    cp.setBackground(new Color(251, 175, 187));
    btnsearch=new JButton("SEARCH DOCTOR");
    btnbook=new JButton("BOOKING APPOINTMENT");
    btnrecord=new JButton("RECORD");
    btnavailabedoc=new JButton("AVAILABLE DOCTOR");
    btnsetting=new JButton("SETTINGS");
    
    cp.add(btnsearch);
    cp.add(btnbook);
    cp.add(btnrecord);
    cp.add(btnavailabedoc);
    cp.add(btnsetting);
    
    frame.add(cp,BorderLayout.CENTER);
    
    buttonHandler h=new buttonHandler();
    btnsearch.addActionListener(h);
    btnbook.addActionListener(h);
    btnrecord.addActionListener(h);
    btnavailabedoc.addActionListener(h);
    btnsetting.addActionListener(h);
    
}

public class buttonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(btnsearch)){
           new searchDoctor();
           }
           else if(e.getSource().equals(btnbook)){
           new Booking();
           }
           else if(e.getSource().equals(btnrecord)){
           new Record();
           }
           else if(e.getSource().equals(btnavailabedoc)){
           new availableDoctor();
           }
           else if(e.getSource().equals(btnsetting)){
           new setting();
           }
        
        }

}

    public static void disposeButton(){
        frame.dispose();
}
}



