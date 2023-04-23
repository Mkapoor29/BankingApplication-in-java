/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PinChange 
{
    String Pin;
    PinChange(String Pin)
    {
        this.Pin = Pin;
        JFrame j = new JFrame();
        j.setTitle("Change Pin");

        JLabel info = new JLabel("Change your Pin ");
        JPasswordField newPinText = new JPasswordField();
        JLabel rePin = new JLabel("Re-Enter pin: ");
        JPasswordField rePinText = new JPasswordField();
        info.setFont(new Font("Verdana", Font.BOLD, 10));
        info.setBounds(50, 100, 100, 20);
        newPinText.setBounds(200, 100, 100, 20);
        rePin.setFont(new Font("Verdana", Font.BOLD, 10));
        rePin.setBounds(50, 150, 100, 20);
        rePinText.setBounds(200, 150, 100, 20);
        
        JButton submit = new JButton("Change Pin");
        JButton exit = new JButton("Exit");
        submit.setBounds(100, 300, 200, 20);
        exit.setBounds(100, 325, 200, 20);

        submit.addActionListener( new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    char [] getPin1= newPinText.getPassword();
                    String nPin = new String(getPin1);
                    
                    char [] getPin2= newPinText.getPassword();
                    String rPin = new String(getPin2);
                    
                    if((nPin.equals("") || rPin.equals(""))&& (nPin.equals(rPin)))
                    {
                        JOptionPane.showMessageDialog(null,"Please enter correct pin.");
                        rePinText.setText("");
                        newPinText.setText("");
                    }
                    else
                    {
                        DataBase cp = new DataBase();
                        
                        String q1 = "update amount set AtmPin = '"+rPin+"' where AtmPin = '"+Pin+"' ";
                        String q2 = "update login set AtmPin = '"+rPin+"' where AtmPin = '"+Pin+"' ";
                        String q3 = "update signup set AtmPin = '"+rPin+"' where AtmPin = '"+Pin+"' ";
                        cp.st.executeUpdate(q1);
                        cp.st.executeUpdate(q2);
                        cp.st.executeUpdate(q3);
                        JOptionPane.showMessageDialog(null,"Pin updated successfully.");
                        
                         new Login();
                         j.setVisible(false);
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
                new Operations(Pin);
                j.setVisible(false);
            }
        });
        


        j.add(submit);
        j.add(exit);

        j.add(info);j.add(rePin);
        j.add(newPinText);j.add(rePinText);
        j.setSize(400, 400);
        j.setLocation(400, 200);
        j.setLayout(null);
        j.setVisible(true);
        j.setForeground(Color.WHITE);
        j.getContentPane().setBackground(Color.white);
    }
    public static void main(String args[])
    {
        new PinChange("");
    }
}
    

