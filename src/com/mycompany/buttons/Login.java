package com.mycompany.buttons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Login extends JFrame{
    private JPanel tp,bp,cp;
    private JButton b1,b2;
    private JLabel lbl,lbl2,lbl3,lbl4,piclbl;
    
    
    Login(){
        super("Login Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FlowLayout flow = new FlowLayout();
        this.setBackground(Color.MAGENTA);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        
        
        Intializer();
        
        
        
        
        setVisible(true);
                }
    
    private void Intializer(){
        tp = new JPanel(new GridLayout(3,1,0,0));
        bp = new JPanel();
        cp = new JPanel();
        b1 = new JButton("Login");
        b2 = new JButton("Sign Up");
        
        
        lbl = new JLabel("ENTER USERNAME",SwingConstants.CENTER);
        lbl2 = new JLabel("ENTER PASSWORD",SwingConstants.CENTER);
        lbl3 =  new  JLabel ("Hi There...!",SwingConstants.LEADING);
        lbl4 = new JLabel("Choose The Best One Doctor",SwingConstants.CENTER);
        
        
        JPasswordField pass = new JPasswordField("Password",10);
        JTextField txt = new JTextField("Username",10);
        
        Icon pic = new ImageIcon(getClass().getResource("pic.png"));
        piclbl = new JLabel(pic,JLabel.CENTER);
      
        
        lbl3.setFont(new Font("impact",Font.ITALIC,35));
        lbl4.setFont(new Font("impact",Font.ROMAN_BASELINE,18));
        
        tp.setLayout(new GridLayout(2,1));
        bp.setLayout(new GridLayout(2,1));
        cp.setLayout(new GridLayout(2,2));
        
        //tp.setSize(1000, 500);
        //bp.setSize(1000,500);
        tp.setBackground(Color.pink);
        cp.setBackground(Color.LIGHT_GRAY);
        //tp.add(tp)
        
        
        //Add on panels
        tp.add(piclbl);
        tp.add(lbl3);
        tp.add(lbl4,BorderLayout.BEFORE_LINE_BEGINS);
        
        cp.add(lbl,BorderLayout.CENTER);
        cp.add(txt);
        
        cp.add(lbl2);
        cp.add(pass);
        
        bp.add(b1,BorderLayout.SOUTH);
        bp.add(b2,BorderLayout.WEST);
        
        
        
                    //add panel
        add(cp,BorderLayout.CENTER);
        add(bp,BorderLayout.SOUTH);
        add(tp,BorderLayout.NORTH);
    
        TextHandler h=new TextHandler();
        b1.addActionListener(h);
    
    }
    public class TextHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(b1)){
          Buttons b = new Buttons();
           }
        }
    }
}
