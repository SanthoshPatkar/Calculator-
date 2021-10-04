import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marks  extends JFrame {
    JTextField s1,s2,s3,s4,s5;
    JLabel ls1,ls2,ls3,ls4,ls5,lTitle,total,percentage,grade;
    JButton result;

    public Marks(){
        lTitle=new JLabel("Enter the Student Marks");
        lTitle.setBounds(80,20,150,30);

        ls1=new JLabel(" Subject 1");
        ls1.setBounds(50,60,100,30);

        s1=new JTextField();
        s1.setBounds(150,60,100,30);

        ls2=new JLabel(" Subject 2");
        ls2.setBounds(50,100,100,30);

        s2=new JTextField();
        s2.setBounds(150,100,100,30);

        ls3=new JLabel(" Subject 3");
        ls3.setBounds(50,140,100,30);

        s3=new JTextField();
        s3.setBounds(150,140,100,30);

        ls4=new JLabel(" Subject 4");
        ls4.setBounds(50,180,100,30);

        s4=new JTextField();
        s4.setBounds(150,180,100,30);

        ls5=new JLabel(" Subject 5");
        ls5.setBounds(50,220,100,30);

        s5=new JTextField();
        s5.setBounds(150,220,100,30);

        result=new JButton("Result");
        result.setBounds(100,270,100,30);

        total=new JLabel();
        total.setBounds(80,330,200,30);

        percentage=new JLabel();
        percentage.setBounds(80,370,150,30);

        grade=new JLabel();
        grade.setBounds(80,410,150,30);

        result.addActionListener(new ActionListener() {
                                     @Override
                                     public void actionPerformed(ActionEvent e) {
                                         int m1 = Integer.parseInt(s1.getText());
                                         int m2 = Integer.parseInt(s2.getText());
                                         int m3 = Integer.parseInt(s3.getText());
                                         int m4 = Integer.parseInt(s4.getText());
                                         int m5 = Integer.parseInt(s5.getText());
                                         int t = m1 + m2 + m3 + m4 + m5;
                                         double per = t / 5;
                                         total.setText(" Total Marks: "+t);
                                         percentage.setText("Percentage: "+per);
                                         if (per >= 90)
                                             grade.setText("Grade: A+");
                                         else if (per >= 75)
                                             grade.setText("Grade: A");
                                         else if (per >= 60)
                                             grade.setText("Grade: B+");
                                         else if (per >= 50)
                                             grade.setText("Grade: B");
                                         else if (per >= 35)
                                             grade.setText("Grade: C+");
                                         else
                                             grade.setText("Grade: Fail");
                                     }
                                 }
        );

        add(lTitle);
        add(ls1);
        add(s1);
        add(ls2);
        add(s2);
        add(ls3);
        add(s3);
        add(ls4);
        add(s4);
        add(ls5);
        add(s5);
        add(result);
        add(total);
        add(percentage);
        add(grade);
        setSize(500,700);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Marks();
    }
}
