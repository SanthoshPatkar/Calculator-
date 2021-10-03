import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame {
    JTextField t1,t2;
    JLabel l1,l2,result;
    JButton btnAdd,btnSub,btnMul,btnDiv;

    public calculator(){
        t1=new JTextField();
        t1.setBounds(200,50,150,30);

        t2=new JTextField();
        t2.setBounds(200,100,150,30);

        l1=new JLabel(" Enter First Number");
        l1.setBounds(50,50,160,30);

        l2=new JLabel(" Enter Second Number");
        l2.setBounds(50,100,160,30);

        result=new JLabel();
        result.setBounds(130,280,100,80);
        
        btnAdd = new JButton("+");
        btnAdd.setBounds(80,180,100,20);

        btnSub = new JButton("-");
        btnSub.setBounds(80,230,100,20);
                
        btnMul = new JButton("*");
        btnMul.setBounds(220,180,100,20);

        btnDiv = new JButton("/");
        btnDiv.setBounds(220,230,100,20);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int res=num1+num2;
                result.setText("Result "+ res);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt( t1.getText());
                int num2 = Integer.parseInt( t2.getText());
                int res = num1 - num2;
                result.setText("Result "+ res);
            }
        });
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt( t1.getText());
                int num2 = Integer.parseInt( t2.getText());
                int res = num1 * num2;
                result.setText("Result "+ res);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt( t1.getText());
                int num2 = Integer.parseInt( t2.getText());
                int res = num1 / num2;
                result.setText("Result "+ res);
            }
        });

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(result);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);
        setSize(500,800);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new calculator();
    }
}
