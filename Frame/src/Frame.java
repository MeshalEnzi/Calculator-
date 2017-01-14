import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; import javax.swing.JLabel; import javax.swing.JPanel; import javax.swing.JTextField;


public class Frame extends JFrame  implements ActionListener  {

	
	    JButton b1 , b2 , b3 , b4 , n0 , n1 , n2 , n3 , n4 , n5 ,n6 , n7 , n8 , n9 ; 
        JLabel L1 , L2 , L3 , L4 ; 
        JPanel p1 , p2 ; 
        JTextField Txt1,Txt2,Txt3 ;

        
        public Frame (){
			this.setTitle("calculator ");
			this.setVisible(true);
			this.setSize(400, 500);
			this.setResizable(false);//no one can change the frame size 
             this.setLayout(new GridLayout(20,20));
 			this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));// orgnize the size of boutton 

			b1= new JButton (" +") ; 
			b2= new JButton (" *") ; 
			b3= new JButton (" /") ; 
			b4= new JButton (" -") ; 
			
			n0= new JButton ("0") ; 
			n1= new JButton ("1") ; 
			n2= new JButton ("2") ; 
			n3= new JButton ("3") ; 
			n4= new JButton ("4") ; 
			n5= new JButton ("5") ; 
			n6= new JButton ("6") ; 
			n7= new JButton ("7") ; 
			n8= new JButton ("8") ; 
			n9= new JButton ("9") ; 

			Txt1 = new JTextField (10) ;

			
			L1= new JLabel (" click here ");

			p1 = new JPanel ();
			p2 = new JPanel ();

            
			
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			
			add(L1);
			add(Txt1);
		
			
			add(n0);
			add(n1);
			add(n2);
			add(n3);
			add(n4);
			add(n5);
			add(n6);
			add(n7);
			add(n8);
			add(n9);

			
			
			add(p1);
			add(p2); 
			

			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
         


		}
		
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == b1)
			Txt1.setText("111");
			
			
}
		
		
		}
		
		
		
		
		
		
		
		
		

	
	

