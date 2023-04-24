package bankmanagement;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
public class Login 
{
    Login()
    {
        JFrame j = new JFrame();
        j.setTitle("Bank Management System");
        
        JLabel l1 = new JLabel("Welcome to the bank");
        l1.setBounds(100,25,400,100);
        l1.setFont(new Font("Verdana", Font.BOLD, 18));
        
///       asking user to enter their card number and pin number
        JLabel card = new JLabel("Enter Name");
        card.setFont(new Font("Verdana", Font.BOLD, 10));
        card.setBounds(100,100,400,100);
        JTextField c = new JTextField();
        c.setBounds(225,145,100,15);
        
//        asking user to enter pinNum
        JLabel pin = new JLabel("Enter Pin number");
        pin.setFont(new Font("Verdana", Font.BOLD, 10));
        pin.setBounds(100,125,400,100);
        JPasswordField p = new JPasswordField();      
        p.setBounds(225,170,100,15);

//        SubmitIn button
        JButton submitB = new JButton("Sign in");
        submitB.setBounds(98,225,100,20);
        submitB.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        try
                        {
                            DataBase cp = new DataBase();
                            String n = c.getText();
                            char [] getPin= p.getPassword();
                            String Pin = new String(getPin);
                            String q = "select * from login where Name = '"+n+"' and AtmPin = '"+Pin+"'";
                            ResultSet rs = cp.st.executeQuery(q);
                            if(rs.next())
                            {
                                j.setVisible(false);
                                new Operations(Pin);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Incorrect Name or PIN");
                            }
                        }
                        catch(Exception m)
                        {
                            System.out.println(m);
                        }
                    }
                });
        
//        SignUp button
        JButton SignUpB = new JButton("Sign Up");
        SignUpB.setBounds(99,250,202,20);
        SignUpB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                j.setVisible(false);
                new FirstSignUp();
            }
        });  
          
//        Clear button
        JButton clearB = new JButton("Reset");
        clearB.setBounds(202,225,100,20);
        clearB.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                c.setText("");
                p.setText("");
            }
        });
        
        
        
        //getcontentpane is in container class.
        j.getContentPane().setBackground(Color.white);
        
        
        //frame
        j.add(l1); j.add(card); j.add(pin);
        j.add(c);j.add(p);j.add(submitB);j.add(clearB);
        j.add(SignUpB);
        
        
        j.setSize(400,400);
        j.setLocation(400,200);
        j.setLayout(null);
        j.setVisible(true);
        
        
    }
    public static void main(String args[])
    {
        new Login();
    }
}
