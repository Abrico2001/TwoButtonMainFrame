package twoButtonMainFrame;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;




      

public class Twobuttontest extends JFrame {
	static JButton b1= new  JButton("B1");
	static JButton b2= new  JButton("B2");
	static JButton b3= new  JButton("Edit");
	int key=1;
Object c;
	public Twobuttontest()  
	{
		c=HidingAndCooprationCombo.Coo;
		//Create and set up the window.
		JPanel pa = new JPanel(); 
		  
        // set the layout 
        pa.setLayout(new BorderLayout()); 
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
     //   JLabel label = new JLabel("Hello World");
        
        pa.add(b1,BorderLayout.NORTH);
        pa.add(b2,BorderLayout.CENTER);
        pa.add(b3,BorderLayout.SOUTH);
frame.add(pa);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        
        
        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
           
            	
          		 Object Coo=HidingAndCooprationCombo.Coo;
          			Object Hid=HidingAndCooprationCombo.Hid;
          
          		 HidingAndCooprationCombo frame2= new HidingAndCooprationCombo(Coo,Hid);
            }  
            });  
        
        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
            	
          		 Object Coo=HidingAndCooprationCombo.Coo;
          			Object Hid=HidingAndCooprationCombo.Hid;
         			 
          		 HidingAndCooprationCombo frame2= new HidingAndCooprationCombo(Coo,Hid);
            }  
            }); 
        
        
        
        b3.setAction(new EditButtonAction(key));
        
    }

    public static void main(String[] args) {
    new 	Twobuttontest();
      
    }
    
    
    
    protected class EditButtonAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public int key;

		public EditButtonAction(int key) {
			super("Edit");
			this.key = key;
		}

		public void actionPerformed(ActionEvent e) {
		//	DistributionsEditor editor = DistributionsEditor.getInstance(
			//		getParent(), (Distribution) current.getParameter(key)
						//	.getValue(), true);
			// Sets editor window title
			//editor.setTitle("Editing "+ current.getParameter(key).getDescription());
			// Shows editor window
			//editor.show();
			// Sets new Distribution to selected class

		//	current.getParameter(key).setValue(editor.getResult());

			//refreshValues();
			
			
			

     		 Object Coo=HidingAndCooprationCombo.Coo;
     			Object Hid=HidingAndCooprationCombo.Hid;
     
     		 HidingAndCooprationCombo frame2= new HidingAndCooprationCombo(Coo,Hid);
		}
	};
    
}