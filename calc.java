import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class calc{
	public static void main(String args[]){
		Calc c=new Calc();
	}
}
class Calc implements ActionListener{
	JTextField t1,t2,t3;
	JButton b,b2;
	JFrame frame;
	public Calc(){
		frame = new JFrame("Calculator");
		t1=new JTextField(20);		
		t2=new JTextField(20);
		t3=new JTextField(20);
        t1.setText("Please enter a number");
        t2.setText("Please enter a number");
        t3.setText("Result");
		b=new JButton("ADD");
		b2 = new JButton("SUB");
		frame.add(t1);
		frame.add(t2);
		frame.add(b);
		frame.add(b2);
        frame.add(t3);
		b.addActionListener(this);
		// b.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
		// 		t3.setText(sum+"");
		// 	}
		// });
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int sum=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
				t3.setText(sum+"");
			}
		});		
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent e){
		int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()); 
		t3.setText(sum+"");
	}

}