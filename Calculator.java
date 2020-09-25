import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

  boolean addoperatorClicked=false;
  boolean suboperatorClicked=false;
  boolean muloperatorClicked=false;
  boolean divoperatorClicked=false;
 int operator=0;
 float result=0;
   String oldValue;
   String newValue;
   String suboldValue;
   String subnewValue;
  JFrame jf;
  JLabel displayLabel;
  JButton sevenButton;
  JButton eightButton;
  JButton nineButton;
  JButton fourButton;
  JButton fiveButton;
  JButton sixButton;
  JButton oneButton;
  JButton twoButton;
  JButton threeButton;
  JButton zeroButton;
  JButton dotButton;
  JButton equalButton,clearButton;
  JButton addButton;
  JButton subButton;
  JButton mulButton;
  JButton divButton;
    
    public Calculator()
    {
        jf=new JFrame();
        jf.setLayout(null);
        jf.setSize(640,650);
        jf.setLocation(400,100);
        
         jf.getContentPane().setBackground(Color.GRAY);
        
         displayLabel=new JLabel();
        displayLabel.setBounds(30, 20, 560,90);
        displayLabel.setBackground(Color.black);
        displayLabel.setOpaque(true);
         displayLabel.setHorizontalAlignment(SwingConstants.LEFT);
         displayLabel.setForeground(Color.lightGray);
         displayLabel.setFont(new Font("Arial",Font.BOLD,50));
        jf.add(displayLabel);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 90, 90);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
      // sevenButton.setBackground(Color.DARK_GRAY);
       // sevenButton.setOpaque(true);
       sevenButton.addActionListener(this);
        jf.add(sevenButton);
        

        eightButton=new JButton("8");
        eightButton.setBounds(150, 130, 90, 90);
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
        eightButton.addActionListener(this);
         jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(270, 130, 90, 90);
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
        nineButton.addActionListener(this);
         jf.add(nineButton);

         fourButton=new JButton("4");
         fourButton.setBounds(30, 250, 90, 90);
         fourButton.setFont(new Font("Arial",Font.PLAIN,40));
         fourButton.addActionListener(this);
         jf.add(fourButton);

         fiveButton=new JButton("5");
         fiveButton.setBounds(150, 250, 90, 90);
         fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
         fiveButton.addActionListener(this);
         jf.add(fiveButton);

         sixButton=new JButton("6");
         sixButton.setBounds(270, 250, 90, 90);
         sixButton.setFont(new Font("Arial",Font.PLAIN,40));
         sixButton.addActionListener(this);
         jf.add(sixButton);

         oneButton=new JButton("1");
         oneButton.setBounds(30, 370, 90, 90);
         oneButton.setFont(new Font("Arial",Font.PLAIN,40));
         oneButton.addActionListener(this);
         jf.add(oneButton);

         twoButton=new JButton("2");
         twoButton.setBounds(150, 370, 90, 90);
         twoButton.setFont(new Font("Arial",Font.PLAIN,40));
         twoButton.addActionListener(this);
         jf.add(twoButton);

         threeButton=new JButton("3");
         threeButton.setBounds(270, 370, 90, 90);
         threeButton.setFont(new Font("Arial",Font.PLAIN,40));
         threeButton.addActionListener(this);
         jf.add(threeButton);
                //////
         zeroButton=new JButton("0");
         zeroButton.setBounds(30, 490, 90, 90);
         zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
         zeroButton.addActionListener(this);
         jf.add(zeroButton);

         dotButton=new JButton(".");
         dotButton.setBounds(150, 490, 90, 90);
         dotButton.setFont(new Font("Arial",Font.PLAIN,40));
         dotButton.addActionListener(this);
         jf.add(dotButton);

         equalButton=new JButton("=");
         equalButton.setBounds(270, 490, 90, 90);
         equalButton.setFont(new Font("Arial",Font.PLAIN,40));
         equalButton.addActionListener(this);
         jf.add(equalButton);

         clearButton=new JButton("CLR");
         clearButton.setBounds(385, 490, 90, 90);
         clearButton.setFont(new Font("Arial",Font.BOLD,25));
         clearButton.addActionListener(this);
         jf.add(clearButton);
                 
          ////////

         addButton=new JButton("+");
         addButton.setBounds(500, 130, 90, 90);
         addButton.setFont(new Font("Arial",Font.PLAIN,40));
         addButton.addActionListener(this);
          jf.add(addButton);                   
                    
          subButton=new JButton("-");
          subButton.setBounds(500, 250, 90, 90);
          subButton.setFont(new Font("Arial",Font.PLAIN,40));
          subButton.addActionListener(this);
           jf.add(subButton);  
         
           mulButton=new JButton("x");
           mulButton.setBounds(500, 370, 90, 90);
           mulButton.setFont(new Font("Arial",Font.PLAIN,40));
           mulButton.addActionListener(this);
            jf.add(mulButton);                   
                      
             divButton=new JButton("/");
            divButton.setBounds(500, 490, 90, 90);
            divButton.setFont(new Font("Arial",Font.PLAIN,40));
            divButton.addActionListener(this);
             jf.add(divButton);












         
    }
    public static void main(String[] args) {
        new Calculator();
      // Calculator();
    }
    
    public void actionPerformed(ActionEvent e)
    {
     if(e.getSource()==sevenButton)
     {
       if(addoperatorClicked==true)
       {
         displayLabel.setText("7");
         addoperatorClicked=false;
         
      } // else{
       // displayLabel.setText(displayLabel.getText()+"7");
        
      //}

      else if(suboperatorClicked==true)
       {
         displayLabel.setText("7");
         suboperatorClicked=false;
       }
       else{
       displayLabel.setText(displayLabel.getText()+"7");
       }
       
      }

     else if(e.getSource()==eightButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("8");
        addoperatorClicked=false;
     } //else{
      // displayLabel.setText(displayLabel.getText()+"8");
     //}
     else if(suboperatorClicked)
       {
         displayLabel.setText("8");
         suboperatorClicked=false;
       }
       else{
        displayLabel.setText(displayLabel.getText()+"8");
       }

     }

     else if(e.getSource()==nineButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("9");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"9");
     }
     }

     else if(e.getSource()==fourButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("4");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"4");
     }
     }

     else if(e.getSource()==fiveButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("5");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"5");
     }
     }
     
     else if(e.getSource()==sixButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("6");
       addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"6");
     }
     }
     //
     else if(e.getSource()==oneButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("1");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"1");
     }
     }


     else if(e.getSource()==twoButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("2");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"2");
     }
     }


     else if(e.getSource()==threeButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("3");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"3");
     }
     }


     else if(e.getSource()==zeroButton)
     {
      if(addoperatorClicked)
      {
        displayLabel.setText("0");
        addoperatorClicked=false;
     }else{
       displayLabel.setText(displayLabel.getText()+"0");
     }
     }


     else if(e.getSource()==dotButton)
     {
      displayLabel.setText(displayLabel.getText()+".");
     }
     else if(e.getSource()==clearButton)
     {
      displayLabel.setText(" ");
     }
     

     else if(e.getSource()==addButton)
     {
      //displayLabel.setText(displayLabel.getText()+"+");
      addoperatorClicked=true;
      oldValue=displayLabel.getText();
      operator=1;
      displayLabel.setText("");
     }
     else if(e.getSource()==subButton)
     {
     suboperatorClicked=true;
     suboldValue=displayLabel.getText();
     operator=2;
     displayLabel.setText("");
     }

     else if(e.getSource()==mulButton)
     {
     // displayLabel.setText("x");
     }
     else if(e.getSource()==divButton)
     {
      //displayLabel.setText("/");
     }
     else if(e.getSource()==equalButton)
     {
       
      newValue=displayLabel.getText();
      float oldValueF=Float.parseFloat(oldValue);
      float newValueF=Float.parseFloat(newValue);
      //float result=newValueF+oldValueF;
      //displayLabel.setText(result+"");
       float result;
       subnewValue=displayLabel.getText();
       float suboldValueF=Float.parseFloat(suboldValue);
       float subnewValueF=Float.parseFloat(subnewValue);

      switch(operator)
      {
        case 1: result=oldValueF+newValueF;
        break;
        case 2: result=suboldValueF-subnewValueF;
        break;
        default:result=0;
      }
      displayLabel.setText(result+"");

       

       
     }






     


    }
}