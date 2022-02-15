import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class calc{
	public static void main(String args[]){
		Calc c=new Calc();
	}
}
class Calc extends JFrame implements ActionListener{
	JTextField t1,t2,t3;
	JButton b,b2;
	public Calc(){
		t1=new JTextField(20);		
		t2=new JTextField(20);
		t3=new JTextField(20);
		add(t1);
		add(t2);
        add(t3);
        t1.setText("Please enter a number");
        t2.setText("Please enter a number");
        t3.setText("Result");
		b=new JButton("ADD");
		b2 = new JButton("SUB");
		add(b);
		add(b2);
		b.addActionListener(this);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int sum=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
				t3.setText(sum+"");
			}
		});		
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent e){
		int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()); 
		t3.setText(sum+"");
	}

}