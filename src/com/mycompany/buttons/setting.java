
package com.mycompany.buttons;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class setting {

private JButton backbtn,btnchng,btnfvrt,btnprofile,btnlogout;
private JLabel Title;    
private static JFrame frame;
public setting(){
    
frame=new JFrame();
frame.setTitle("SETTING");
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
    Title=new JLabel("Setting",SwingConstants.CENTER);
    Title.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
    tp.add(Title,BorderLayout.CENTER);
   
    frame.add(tp,BorderLayout.NORTH);
    
    
    
    JPanel cp=new JPanel(new GridLayout(5,1,5,5));
    cp.setBackground(new Color(251, 175, 187));
    
    JPanel backp = new JPanel(new FlowLayout());

    btnchng=new JButton("Change Password");
    btnfvrt=new JButton("Favorite");
    btnprofile=new JButton("Profile");
    btnlogout=new JButton("Logout");
    backbtn= new JButton("Back");
    
    
 
    cp.add(btnchng);
    cp.add(btnfvrt);
    cp.add(btnprofile);
    cp.add( btnlogout);
    backp.add(backbtn);
    
    
    frame.add(cp,BorderLayout.CENTER);
    frame.add(backp,BorderLayout.SOUTH);
    
    buttonHandler h=new buttonHandler();
   
    btnchng.addActionListener(h);
    btnfvrt.addActionListener(h);
    btnprofile.addActionListener(h);
    btnlogout.addActionListener(h);
    backbtn.addActionListener(h);
    
}

public class buttonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(backbtn)){
           frame.dispose();
           }
           else if(e.getSource().equals(btnfvrt)){
           //new Record();
           }
           else if(e.getSource().equals(btnprofile)){
           //new availableDoctor();
           }
           else if(e.getSource().equals(btnlogout)){
            frame.dispose();
            Buttons.disposeButton();
            
           
           }
           
        
        }

}


    
}



