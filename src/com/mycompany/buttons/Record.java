
package com.mycompany.buttons;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Record {

private JTextField dt,st,mt;    
private JLabel Title,dl,sl,ml;    
private JFrame frame;
private JPanel cp,bp;
private JButton sbmitbtn,backbtn;

Record(){
frame=new JFrame();
frame.setTitle("Your Record");
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
    Title=new JLabel("Hi User",SwingConstants.CENTER);
    Title.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,25));
    tp.add(Title,BorderLayout.CENTER);
   
    frame.add(tp,BorderLayout.NORTH);
    
    
    
    cp=new JPanel(new GridLayout(3,1));
    cp.setBackground(new Color(245,218,223));
   
    
    dt=new JTextField("");
    st=new JTextField("");
    mt=new JTextField("");
    
    
    bp= new JPanel(new GridLayout(2,1,4,4));
    
    
    sbmitbtn = new JButton("Submit"); 
    backbtn = new JButton("Back"); 
    
    
    bp.add(sbmitbtn);
    bp.add(backbtn);
 
        dl=new JLabel("Enter Dieseas",SwingConstants.CENTER);
        sl=new JLabel("Enter Symptoms",SwingConstants.CENTER);
        ml=new JLabel("Medicane used",SwingConstants.CENTER);
        
        
    cp.add(dl);
    cp.add(dt);
    cp.add(sl);
    cp.add(st);
    cp.add(ml);
    cp.add(mt);
  
    
    frame.add(cp,BorderLayout.CENTER);
    frame.add(bp,BorderLayout.SOUTH);
    

    TextHandler h=new TextHandler();
    backbtn.addActionListener(h);
    sbmitbtn.addActionListener(h);

}


class TextHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(backbtn))
        {
            frame.dispose();
        }
        else if (e.getSource().equals(sbmitbtn))
        {
            JOptionPane.showMessageDialog(null, "Successfully Submitted");
        }

}
}   
}
