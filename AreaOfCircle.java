import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircle extends JFrame {
    JTextField radius;
    JLabel radiusTitle,result;
    JButton btnCal;

     public AreaOfCircle(){
        radius=new JTextField();
        radius.setBounds(230,80,100,30);

        radiusTitle= new JLabel("Enter the Radius of the Circle ");
        radiusTitle.setBounds(50,80,250,30);

        btnCal=new JButton("Calculate");
        btnCal.setBounds(130,150,150,30);

        result=new JLabel();
        result.setBounds(120,220,200,80);

        btnCal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r=Integer.parseInt(radius.getText());
                double area=3.142*r*r;
                result.setText("Area of Circle is "+ area);
            }
        });
        add(radius);
        add(radiusTitle);
        add(btnCal);
        add(result);
        setSize(500,800);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AreaOfCircle();
    }

}
