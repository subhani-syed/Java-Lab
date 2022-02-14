import javax.swing.*;
import java.awt.*;
class gui implements ActionListner {
    public static void main(String args[]){
        JFrame frame = new JFrame("Ny Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        JButton button = new JButton("Click");
        frame.getContentPane().add(button);
        JTextField t1 = new JTextField("Num1",10);
        JTextField t2 = new JTextField("Num2",10);
        JTextField t3 = new JTextField("Result",10);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        button.addActionListner(this);
        void actionPerformed(ActionEvent e){
            t3.setText("SUp!!");
        }
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER));
    }
}