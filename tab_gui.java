import java.util.*;
import javax.swing.*;
public class tab_gui{
    JFrame frame;
    JTable table;
    tab_gui(){
        frame = new JFrame("My Frame");
        String label[] = {"N1","N2"};
        String data[][] = {{"name","one"},{"name2","two"}};
        table = new JTable(data,label);
        frame.add(table);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new tab_gui();
    }
}