import javax.swing.*;

public class table {
    JFrame j;
    JTable t;
    table(){
        j=new JFrame("JTable");

        String col_names[]={"Name","Age","Phone Number"};
        String data[][]={{"Mahesh","20","9515479704"},{"Akshay","20","8978937353"},{"Uday","20","923456789"},
                            {"Ajay","18","9123456741"}};
        t=new JTable(data,col_names);
        t.setBounds(40,40,50,50);
        j.add(t);

        JScrollPane sp = new JScrollPane(t);
        j.add(sp);

        j.setSize(400,150);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
    public static void main(String[] args) {
        new table();
    }
}
