
package bankmanagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Deposit 
{
    String Pin;
    Deposit(String Pin)
    {
       this.Pin = Pin;
       
        JFrame j = new JFrame();
        j.setTitle("Bank Facilities");
        
        
        
        
        
        JLabel info = new JLabel("Enter the amount you want to deposit: ");
        JTextField amt = new JTextField();
        info.setFont(new Font("Verdana", Font.BOLD, 10));
        info.setBounds(100,100,500,20);
        amt.setBounds(100,125,100,15);
        
        JButton submit = new JButton("Deposit");
        JButton exit = new JButton("Exit");
        submit.setBounds(100, 300, 100, 20);
        exit.setBounds(200, 300, 100, 20);
        
        
        submit.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    
                    String Amt = amt.getText();
                    if(Amt.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,"Please Enter Amount");
                    }
                    else
                    {
                        DataBase cp = new DataBase();
                        
                        String sql = "select Amt from amount where Atmpin = '"+Pin+"' ";
                        ResultSet rs = cp.st.executeQuery(sql);
                        if(rs.absolute(1))
                        {
//                        rs.next();

                        float money = rs.getFloat("Amt")+ Float.parseFloat(Amt);
                        String sql2 = "update amount set Amt = '"+String.valueOf(money)+"' where AtmPin = '"+Pin+"' ";
                        cp.st.executeUpdate(sql2);
                        JOptionPane.showMessageDialog(null,"Money Deposited Successfully");
                        new Operations(Pin);
                        }
                        else
                        {
                            cp.st.executeUpdate("insert into amount values('"+Pin+"', '"+Amt+"')");
                        }
                        
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });

        exit.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                System.exit(0);
            }
        });
        
        
        
        
        
        j.add(submit);j.add(exit);
        j.add(info); j.add(amt);
        j.setSize(400,400);
        j.setLocation(400,200);
        j.setLayout(null);
        j.setVisible(true);
        j.setForeground(Color.WHITE);
        j.getContentPane().setBackground(Color.white);
    }
    
    public static void main(String args[])
    {
        new Deposit("");
    }
}
