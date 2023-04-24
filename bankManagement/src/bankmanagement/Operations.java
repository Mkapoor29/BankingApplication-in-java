/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class Operations 
{
    String Pin;
    Operations(String Pin)
    {
        this.Pin = Pin;
        JFrame j = new JFrame();
        j.setTitle("Bank Facilities");
        j.setSize(400,400);
        j.setLocation(400,200);
        j.setLayout(null);
        j.setVisible(true);
        j.setForeground(Color.WHITE);
        j.getContentPane().setBackground(Color.white);
        
        JLabel info = new JLabel("Please Select the operation you want to perform: ");
        info.setBounds(10,25,400,100);
        info.setFont(new Font("System", Font.BOLD, 16));
          
        JButton Deposit = new JButton("DEPOSIT");
        JButton CashWithdraw = new JButton("CASH WITHDRAWAL");
        JButton changePin = new JButton("PIN CHANGE");
        JButton BalanceCheck = new JButton("Check Balance");
        JButton Exit = new JButton("EXIT");
        
        Deposit.setBounds(100,100,200,30);
        CashWithdraw.setBounds(100,150,200,30);
        changePin.setBounds(100,200,200,30);
        BalanceCheck.setBounds(100,250,200,30);
        Exit.setBounds(100,300,200,30);
        
        Deposit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent m)
            {
                j.setVisible(false);
                new Deposit(Pin);
            }
        });
        CashWithdraw.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent m)
            {
                j.setVisible(false);
                new Withdraw(Pin);
            }
        });
        BalanceCheck.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent m)
            {
                try
                {
                DataBase cp = new DataBase();
                String sql = "select Amt from amount where Atmpin = '"+Pin+"' ";
                        ResultSet rs = cp.st.executeQuery(sql);
                        rs.next();
//                        cp.st.executeUpdate("insert into amount values( '"+Pin+"','"+amount+"' ");
                        float money = rs.getFloat("Amt");
                        JOptionPane.showMessageDialog(null,"Your balance is: "+Float.toString(money));
                        j.setVisible(false);
                        new Operations(Pin);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        });
        changePin.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent m)
            {
                j.setVisible(false);
                new PinChange(Pin);
            }
        });
        Exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent m)
            {
                System.exit(0);
            }
        });
        
        j.add(info);
        j.add(Deposit);j.add(CashWithdraw);j.add(changePin);j.add(BalanceCheck);j.add(Exit);
    }   
        public static void main(String args[])
    {
        new Operations("");
    }
}
