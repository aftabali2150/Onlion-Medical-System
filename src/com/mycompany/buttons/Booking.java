
package com.mycompany.buttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Booking {
    


//private JTextField searchbar;    
private JLabel Title,j1,j2,j3,j4;    
private JFrame frame;
private JPanel cp,backp;
private JCheckBox b1,b2,b3,b4;
private JButton backbtn,submitbtn;

Booking(){
frame=new JFrame();
frame.setTitle("Appointment ");
frame.setLayout(new BorderLayout());
frame.setSize(800,400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLocationRelativeTo(null);
initializer();
frame.setVisible(true);

}

void initializer(){
    
    
    JPanel tp=new JPanel(new BorderLayout());
    tp.setPreferredSize(new Dimension(400,100));
    tp.setBackground(Color.pink);
    Title=new JLabel("Book Appointment",SwingConstants.CENTER);
    Title.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
    tp.add(Title,BorderLayout.CENTER);
   
    frame.add(tp,BorderLayout.NORTH);
    backp= new JPanel(new FlowLayout());
    
    
    cp=new JPanel(new GridLayout(5,1,5,5));
    cp.setBackground(new Color(245,218,223));
    
    
  
    b1= new JCheckBox("Book Dr Muhammad");
    b2= new JCheckBox("Book Dr Bangash");
    b3= new JCheckBox("Book Dr Ali");
    b4= new JCheckBox("Book Dr Masood");
    backbtn = new JButton("Back");
    submitbtn = new JButton("Submit");
    
        j1=new JLabel("",SwingConstants.CENTER);
        j2=new JLabel("",SwingConstants.CENTER);
        j3=new JLabel("",SwingConstants.CENTER);
        j4=new JLabel("",SwingConstants.CENTER);
    cp.add(j1);
    cp.add(b1);
    cp.add(j2);
    cp.add(b2);
    cp.add(j3);
    cp.add(b3);
    cp.add(j4);
    cp.add(b4);
    backp.add(submitbtn);
    backp.add(backbtn);
    
     JPanel bp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("NAME : DR MUHAMMAD      FREE SLOT : 4pm-8pm");
        j2.setText("NAME : DR BANGASH       FREE SLOT : 8am-1pm");
        j3.setText("NAME : DR ALI           FREE SLOT : 9am-3pm");
        j4.setText("NAME : DR MASOOD        FREE SLOT : 2pm-6pm");
     
    frame.add(cp,BorderLayout.CENTER);
     frame.add(backp,BorderLayout.SOUTH);
    

    TextHandler h=new TextHandler();
    
    
    submitbtn.addActionListener(h);
    b1.addActionListener(h);
    b2.addActionListener(h);
    b3.addActionListener(h);
    b4.addActionListener(h);
    backbtn.addActionListener(h);
    

}




class TextHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            {
                if(e.getSource().equals(backbtn))
        {
            frame.dispose();
        }
                 
                else if (e.getSource().equals(submitbtn)){
                    JOptionPane.showMessageDialog(null, "Successfully submitted");
                }
               
                else if (e.getSource().equals(b1)){
                    JOptionPane.showMessageDialog(null, "Successfully Booked Appointment With Dr MUHAMMAD");
                }
               
                else if (e.getSource().equals(b2)){
                    JOptionPane.showMessageDialog(null, "Successfully Booked Appointment With Dr BANGASH");
                }
                else if (e.getSource().equals(b3)){
                    JOptionPane.showMessageDialog(null, "Successfully Booked Appointment With Dr ALI");
                }
                else if (e.getSource().equals(b4)){
                    JOptionPane.showMessageDialog(null, "Successfully Booked Appointment With Dr MASOOD");
                }
         else{
             // JPanel cp=new JPanel(new GridLayout(4,1,2,2));
        j1.setText("Not Found");
        }
              
        }

   

}
}   
}
