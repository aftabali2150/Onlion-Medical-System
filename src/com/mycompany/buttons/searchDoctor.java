package com.mycompany.buttons;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class searchDoctor {
private JTextField searchbar;    
private JLabel Title,j1,j2,j3,j4;    
private JFrame frame;
private JPanel cp,backp;
private JButton backbtn;

searchDoctor(){
frame=new JFrame();
frame.setTitle("searchDoctor");
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
    Title=new JLabel("SEARCH THE DOCTOR HERE",SwingConstants.CENTER);
    Title.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
    tp.add(Title,BorderLayout.CENTER);
   frame.add(tp,BorderLayout.NORTH);
   
   backp= new JPanel(new FlowLayout());
    
    
    
    cp=new JPanel(new GridLayout(5,1,5,5));
    cp.setBackground(new Color(245,218,223));
    
    searchbar=new JTextField("Search here");
    cp.add(searchbar);
    
    backbtn = new JButton("Back");
    
        j1=new JLabel("",SwingConstants.CENTER);
        j2=new JLabel("",SwingConstants.CENTER);
        j3=new JLabel("",SwingConstants.CENTER);
        j4=new JLabel("",SwingConstants.CENTER);
    cp.add(j1);
    cp.add(j2);
    cp.add(j3);
    cp.add(j4);
    backp.add(backbtn);
    
    frame.add(cp,BorderLayout.CENTER);
    frame.add(backp,BorderLayout.SOUTH);
    

    TextHandler h=new TextHandler();
    searchbar.addActionListener(h);
    backbtn.addActionListener(h);
    

}


class TextHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(searchbar)&&e.getActionCommand().equals("MUHAMMAD"))
        {
            JPanel bp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("NAME : DR MUHAMMAD");
        j2.setText("PHONE NO : +92 311 0364545");
        j3.setText("SPECIALIZATION : HEART SPECIALIST");
        j4.setText("FREE SLOT : 4pm-8pm");
     
        }
        else if(e.getSource().equals(searchbar)&&e.getActionCommand().equals("BANGASH"))
        {
            
            JPanel bp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("NAME : DR BANGASH");
        j2.setText("PHONE NO : +92312 986590");
        j3.setText("SPECIALIZATION : BRAIN SPECIALIST");
        j4.setText("FREE SLOT : 8am-1pm");
        }
        
        else if(e.getSource().equals(searchbar)&&e.getActionCommand().equals("ALI"))
        {
            
            JPanel bp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("NAME : DR ALI");
        j2.setText("PHONE NO : +92306 9087122");
        j3.setText("SPECIALIZATION : KIDNEY SPECIALIST");
        j4.setText("FREE SLOT : 9am-3pm");
        }
         else if(e.getSource().equals(searchbar)&&e.getActionCommand().equals("MASOOD"))
        {
            
           // JPanel bp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("NAME : DR MASOOD");
        j2.setText("PHONE NO : +92333 7641233");
        j3.setText("SPECIALIZATION : SURGEN SPECIALIST");
        j4.setText("FREE SLOT : 2PM-6PM");
        }
         else if(e.getSource().equals(backbtn))
        {
            frame.dispose();
        }
          else{
            // JPanel cp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("Not Found");
        }

   

        }
      
}   
}
