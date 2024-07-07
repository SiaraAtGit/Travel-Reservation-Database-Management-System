package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackage,viewpackage,viewhotels,destinations,bookhotel,viewBookHotel,notepad,calculators,about,deletePersonalDetails;
    
Dashboard(String username){
    this.username=username;
    setBounds(0,0,1600,1000);
    setLayout(null);
    
    JPanel p1=new JPanel();
        p1.setBackground(new Color(0, 0, 102));	
        p1.setBounds(0, 0, 1600, 65);
        p1.setLayout(null);
        add(p1);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
     JLabel heading = new JLabel("Dashboard");
	heading.setBounds(80, 10, 300, 40);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 30));
        heading.setForeground(Color.WHITE);
        p1.add(heading);
            
    JPanel p2=new JPanel();
        p2.setBackground(new Color(0, 0, 102));	
        p2.setBounds(0, 65, 300, 900);
        p2.setLayout(null);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
	addPersonalDetails.setForeground(Color.WHITE);
	addPersonalDetails.setBackground(new Color(0, 0, 102));
	addPersonalDetails.setBounds(0, 0, 300,50);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
	updatePersonalDetails.setForeground(Color.WHITE);
	updatePersonalDetails.setBackground(new Color(0, 0, 102));
	updatePersonalDetails.setBounds(0, 50, 300,50);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
      
        viewPersonalDetails = new JButton("View Details");
	viewPersonalDetails.setForeground(Color.WHITE);
	viewPersonalDetails.setBackground(new Color(0, 0, 102));
	viewPersonalDetails.setBounds(0, 100, 300,50);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
	deletePersonalDetails.setForeground(Color.WHITE);
	deletePersonalDetails.setBackground(new Color(0, 0, 102));
	deletePersonalDetails.setBounds(0, 150, 300,50);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        
        checkpackages = new JButton("Check Package");
	checkpackages.setForeground(Color.WHITE);
	checkpackages.setBackground(new Color(0, 0, 102));
	checkpackages.setBounds(0, 200, 300,50);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Package");
	bookpackage.setForeground(Color.WHITE);
	bookpackage.setBackground(new Color(0, 0, 102));
	bookpackage.setBounds(0, 250, 300,50);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton(" View Package");
	viewpackage.setForeground(Color.WHITE);
	viewpackage.setBackground(new Color(0, 0, 102));
	viewpackage.setBounds(0, 300, 300,50);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
	viewhotels.setForeground(Color.WHITE);
	viewhotels.setBackground(new Color(0, 0, 102));
	viewhotels.setBounds(0, 350, 300,50);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        destinations = new JButton("Destinations");
	destinations.setForeground(Color.WHITE);
	destinations.setBackground(new Color(0, 0, 102));
	destinations.setBounds(0, 400, 300,50);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.setMargin(new Insets(0,0,0,130));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        bookhotel = new JButton("Book Hotel");
	bookhotel.setForeground(Color.WHITE);
	bookhotel.setBackground(new Color(0, 0, 102));
	bookhotel.setBounds(0, 450, 300,50);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewBookHotel = new JButton("View Booked Hotel");
	viewBookHotel.setForeground(Color.WHITE);
	viewBookHotel.setBackground(new Color(0, 0, 102));
	viewBookHotel.setBounds(0, 500, 300,50);
        viewBookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookHotel.setMargin(new Insets(0,0,0,70));
        viewBookHotel.addActionListener(this);
        p2.add(viewBookHotel);
       
        
        notepad = new JButton("Notepad");
	notepad.setForeground(Color.WHITE);
	notepad.setBackground(new Color(0, 0, 102));
	notepad.setBounds(0, 550, 300,50);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        calculators = new JButton("Calculator");
	calculators.setForeground(Color.WHITE);
	calculators.setBackground(new Color(0, 0, 102));
	calculators.setBounds(0, 600, 300,50);
        calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculators.setMargin(new Insets(0,0,0,145));
        calculators.addActionListener(this);
        p2.add(calculators);
        
        about = new JButton("About");
	about.setForeground(Color.WHITE);
	about.setBackground(new Color(0, 0, 102));
	about.setBounds(0, 650, 300,50);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
    ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
     JLabel text = new JLabel("Travel Reservation Management System");
	text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
	image.add(text);
   
        setVisible(true);
}

public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==addPersonalDetails){
        new AddCustomer(username);
    }else if(ae.getSource()==viewPersonalDetails){
        new ViewCustomer(username);
    }else if(ae.getSource()==updatePersonalDetails){
        new UpdateCustomer(username);
    }else if(ae.getSource()==checkpackages){
        new CheckPackage();
    }else if(ae.getSource()==bookpackage){
        new BookPackage(username);
    }else if(ae.getSource()==viewpackage){
        new ViewPackage(username);
    }else if(ae.getSource()==viewhotels){
        new CheckHotels();
    }else if(ae.getSource()==destinations){
        new Destinations();
    }else if(ae.getSource()==bookhotel){
        new BookHotel(username);
    }else if(ae.getSource()==viewBookHotel){
        new ViewBookedHotel(username);
    }else if(ae.getSource()==calculators){
        try{
           Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }else if(ae.getSource()==notepad){
        try{
           Runtime.getRuntime().exec("notepad.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }else if(ae.getSource()==about){
        new About();
    }else if(ae.getSource()==deletePersonalDetails){
        new DeleteDetails(username);
    }
}
public static void main(String[] args){
new Dashboard("");
}
}