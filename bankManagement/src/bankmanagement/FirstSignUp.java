package bankmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class FirstSignUp 
{
    FirstSignUp()
    {
        Random ran = new Random();
        long random= Math.abs((ran.nextLong() % 9000L + 1000L));
        JFrame j = new JFrame();
        
        JLabel form = new JLabel("APPLICATION FORM NO     "+ random);
        form.setBounds(75,20,250,20);
        form.setFont(new Font("Arial",Font.BOLD,14));
        
        
        
//        Add personal details here
        
        JLabel name = new JLabel("Name:  ");
        name.setBounds(50,50,100,20);
        form.setFont(new Font("Arial",Font.BOLD,14));
        JTextField nameText = new JTextField();
        nameText.setBounds(200,50,150,20);
        
        JLabel DOB = new JLabel("DOB:  ");
        DOB.setBounds(50,75,100,20);
        DOB.setFont(new Font("Arial",Font.BOLD,14));
        JTextField DOBText = new JTextField();
        DOBText.setBounds(200,75,150,20);
        
        
        JLabel EmailAdd = new JLabel("Email:  ");
        EmailAdd.setFont(new Font("Arial",Font.BOLD,14));
        EmailAdd.setBounds(50,100,100,20);
        JTextField EmailText = new JTextField();
        EmailText.setBounds(200,100,150,20);
        j.add(EmailAdd); j.add(EmailText);
        
        
        JLabel PhoneNo = new JLabel("Phone Number:  ");
        PhoneNo.setFont(new Font("Arial",Font.BOLD,14));
        PhoneNo.setBounds(50,125,125,20);
        JTextField PhoneText = new JTextField();
        PhoneText.setBounds(200,125,150,20);
        j.add(PhoneNo); j.add(PhoneText);
        
        
        
        JLabel Add = new JLabel("Address:  ");
        Add.setFont(new Font("Arial",Font.BOLD,14));
        Add.setBounds(50,150,100,20);
        JTextField AddText = new JTextField();
        AddText.setBounds(200,150,150,20);
        j.add(Add); j.add(AddText);
        
        JLabel City = new JLabel("City:  ");
        City.setFont(new Font("Arial",Font.BOLD,14));
        City.setBounds(50,175,100,20);
        JTextField CityText = new JTextField();
        CityText.setBounds(200,175,150,20);
        j.add(City); j.add(CityText);
        
        
        JLabel PinCode = new JLabel("Pin Code:  ");
        PinCode.setFont(new Font("Arial",Font.BOLD,14));
        PinCode.setBounds(50,200,100,20);
        JTextField PinText = new JTextField();
        PinText.setBounds(200,200,150,20);
        j.add(PinCode); j.add(PinText);
        
        
             
        JLabel State = new JLabel("State:  ");
        State.setFont(new Font("Arial",Font.BOLD,14));
        State.setBounds(50,225,100,20);
        JTextField StateText = new JTextField();
        StateText.setBounds(200,225,150,20);
        j.add(State); j.add(StateText);
        
        
        JLabel Gender = new JLabel("Gender: ");
        Gender.setFont(new Font("Arial",Font.BOLD,14));
        Gender.setBounds(50,250,100,20);
        JRadioButton o1 = new JRadioButton("Male");
        JRadioButton o2 = new JRadioButton("Female");
        JRadioButton o3 = new JRadioButton("Other");
        o1.setBounds(50,275,100,20);
        o2.setBounds(150,275,100,20);
        o3.setBounds(250,275,100,20);
        ButtonGroup bd = new ButtonGroup();
        bd.add(o1);bd.add(o2);bd.add(o3);
        j.add(Gender);j.add(o1);j.add(o2);j.add(o3);
        
           
        JLabel aadharNo = new JLabel("Aadhar Number:  ");
        aadharNo.setBounds(50,300,150,20);
        JTextField aadharText = new JTextField();
        aadharText.setBounds(200,300,150,20);
        j.add(aadharNo); j.add(aadharText);
        
        JLabel PanNo = new JLabel("Pan Number:  ");
        PanNo.setBounds(50,325,100,20);
        PanNo.setFont(new Font("Arial",Font.BOLD,14));
        JTextField PanText = new JTextField();
        PanText.setBounds(200,325,150,20);
        j.add(PanNo); j.add(PanText);
        
        JLabel Occu = new JLabel("Occupation:  ");
        Occu.setFont(new Font("Arial",Font.BOLD,14));
        Occu.setBounds(50,350,100,20);
        JTextField OccuText = new JTextField();
        OccuText.setBounds(200,350,150,20);
        j.add(Occu); j.add(OccuText);
        
        
        
//        account details
        JLabel AD = new JLabel("Enter Account services You Require");
        AD.setBounds(75,375,250,20);
        AD.setFont(new Font("Arial",Font.BOLD,14));
        j.add(AD);
        
        JLabel AccountType = new JLabel("Select Account Type:");
        AccountType.setBounds(50,400,250,20);
        AccountType.setFont(new Font("Arial",Font.BOLD,14));
        j.add(AccountType);
        JRadioButton o4 = new JRadioButton("Savings");
        JRadioButton o5 = new JRadioButton("Current");
        o4.setBounds(50,425,100,20);
        o5.setBounds(150,425,100,20);
        ButtonGroup at = new ButtonGroup();
        at.add(o4);at.add(o5);
        j.add(o4);j.add(o5);
        
        JLabel Pin = new JLabel("Generate Pin Number: ");
        Pin.setBounds(50,450,200,20);
        Pin.setFont(new Font("Arial",Font.BOLD,14));
        JTextField AtmPinText = new JTextField();
        AtmPinText.setBounds(200,450,150,20);
        j.add(Pin); j.add(AtmPinText);
        
        
        
        
        JButton b1 = new JButton();
        b1.setBounds(50,500,10,10);
        JLabel b2 = new JLabel("I agree that the information entered by me is correct.");
        b2.setBounds(100,500,400,20);
        b2.setFont(new Font("Arial",Font.BOLD,14));
        j.add(b1);j.add(b2);
        
        
        
        JButton Next1 = new JButton("Submit");
        Next1.setFont(new Font("Arial",Font.BOLD,14));
        Next1.setBounds(100,520,100,20);
        Next1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String formNo = "" + random;
                String Name = nameText.getText();
                String DOB = DOBText.getText();
                String Email = EmailText.getText();
                String Phone = PhoneText.getText();
                String City = CityText.getText();
                String Pin = PinText.getText();
                String State = StateText.getText();
                String Gender = null;
                String Pan = PanText.getText();
                String Aadhar = aadharText.getText();
                String Occu = OccuText.getText();
                String AtmPin = AtmPinText.getText();
                
                
                Random ran = new Random();
                long cn = (ran.nextLong() % 90000000L) + 5040936000000000L;
                String CardNo = "" + Math.abs(cn);
                String AType =null;
               
                if(o1.isSelected())
                    {Gender = "male";}
                else if(o2.isSelected())
                    {Gender = "female";}
                else
                    {Gender = "other";}
                
                if(o4.isSelected())
                {
                    AType ="Savings";
                }
                else AType = "Current";
                try
            {
                if(Phone.length()!=10)
                    {
                        JOptionPane.showMessageDialog(null, "Number should be of 10 digits.");
                    }
                if(Name.equals("") || DOB.equals("") || Phone.equals("") || City.equals("") || Pin.equals("") || State.equals("") || Pan.equals("")|| Aadhar.equals("")|| AtmPin.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "You are requested to complete the form.");
                }
                
                else
                {
                  DataBase cp = new DataBase();
                  String q1 = "insert into signup values('"+Name+"', '"+DOB+"','"+Email+"','"+Phone+"','"+City+"','"+Pin+"','"+State+"','"+Gender+"','"+formNo+"','"+Pan+"','"+Aadhar+"','"+Occu+"','"+AType+"','"+AtmPin+"','"+CardNo+"')";
                  String q2 = "insert into login values('"+Name+"','"+formNo+"','"+CardNo+"','"+AtmPin+"')";
                  cp.st.executeUpdate(q1);
                  cp.st.executeUpdate(q2);
                  
                  JOptionPane.showMessageDialog(null, "Card Number: " + CardNo + "\n Pin:"+ AtmPin);
                  new Login();
                }
                
            }
            catch(Exception f)
            {
                System.out.println(f);
            }
            }
            
        });
        
        JButton Clear = new JButton("Clear");
        Clear.setFont(new Font("Arial",Font.BOLD,14));
        Clear.setBounds(250,520,75,20);
        Clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent f)
            {
               System.exit(0); 
            }
        });

        j.add(Next1);j.add(Clear);
        
        
        
        j.add(form);
        j.add(name);j.add(nameText);
        j.add(DOB);j.add(DOBText);
        
        
        
        j.getContentPane().setBackground(Color.white);
        j.setSize(500,600);
        j.setLocation(400,50);
        j.setLayout(null);
        j.setVisible(true);
    }
    public static void main(String args[])
    {
        new FirstSignUp();
    }
}
