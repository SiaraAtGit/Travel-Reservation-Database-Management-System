package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
   JButton create,back;
   JTextField tfname,tfusername,tfpassword,tfanswer;
   Choice security;
   
    Signup(){
    setBounds(350,200,900,360);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
        JPanel p1 = new JPanel();
	p1.setBackground(new Color(133,193,233));
	p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblUsername = new JLabel("Username :");
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(50,20,125,25);
	p1.add(lblUsername);
        
        tfusername = new JTextField();
	tfusername.setBounds(190, 20, 180, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name:");
	lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblname.setBounds(50,60,125,25);
	p1.add(lblname);
        
        tfname = new JTextField();
	tfname.setBounds(190, 60, 180, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfname);
        
        JLabel lblpassword = new JLabel("Password:");
	lblpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblpassword.setBounds(50,100,125,25);
	p1.add(lblpassword);
        
        tfpassword = new JTextField();
	tfpassword.setBounds(190, 100, 180, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfpassword);
        
        JLabel lblsecurity = new JLabel("Security Question :");
	lblsecurity.setForeground(Color.DARK_GRAY);
	lblsecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblsecurity.setBounds(50,140,125,25);
	p1.add(lblsecurity);
        
        security = new Choice();
        security.add("Fav Character from Harry Potter");
        security.add("Fav Marvel Superhero");
        security.add("Your lucky number");
        security.add("Your childhood nick name");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        JLabel lblanswer = new JLabel("Answer:");
	lblanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblanswer.setBounds(50,180,125,25);
	p1.add(lblanswer);
        
        tfanswer = new JTextField();
	tfanswer.setBounds(190, 180, 180, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
	p1.add(tfanswer);
        
        
	create = new JButton("Create");
	create.setFont(new Font("Tahoma", Font.BOLD, 13));
	create.setBounds(80, 250, 100, 30);
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
	create.addActionListener(this);
        p1.add(create);
        
        back = new JButton("Back");
	back.setFont(new Font("Tahoma", Font.BOLD, 13));
	back.setBounds(250, 250, 100, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
	back.addActionListener(this);
        p1.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);
        
        setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==create){
        String username=tfusername.getText();
        String name=tfname.getText();
        String password=tfpassword.getText();
        String question=security.getSelectedItem();
        String answer=tfanswer.getText();

        if (password.length() < 4) {
                JOptionPane.showMessageDialog(null, "Password must contain at least 4 characters.");
                return; 
            }
        
        if (!isValidUsername(username)) {
            JOptionPane.showMessageDialog(null, "Invalid username format. Please enter a valid username.");
            return; 
        }
        
        String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
        try {
            Conn c=new Conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Account Created Successfully");
            setVisible(false);
            new Login();
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    }else if(ae.getSource()==back){
        setVisible(false);
        new Login();
    }
    }
    
    private boolean isValidUsername(String username) {
    return username.matches("[a-zA-Z ]{3,}");
}

public static void main(String[] args) {
        new Signup();
    }
}
