package com.sware.hyb.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.sware.hyb.domain.Student;
import com.sware.hyb.service.StudentService;

import javax.swing.*;

public class AddStudent extends JFrame implements ActionListener {
	
	private JButton addBtn,clearBtn;
	private JLabel rollNoLbl,nameLbl,courseLbl,MarksLbl;
	JTextField rollNoTxt,nameTxt,courseTxt,marksTxt;
	
	public AddStudent() {
		prepareUI();
	}
	
	public void prepareUI(){
		
		this.setVisible(true);
		this.setSize(800, 500);
		this.setLocation(300,150);
		this.setLayout(null);
		this.show();
		
		// Creating UI for the Add Student page
		int height=40,width=200,x=100,y=50,margin=30;
		
		rollNoLbl=new JLabel("Roll No:"); 	rollNoLbl.setSize(width,height);	rollNoLbl.setLocation(x, y);	y=y+height+margin;
		nameLbl=new JLabel("Name:");		nameLbl.setSize(width,height);		nameLbl.setLocation(x,y);		y=y+height+margin;
		courseLbl=new JLabel("Course:");	courseLbl.setSize(width,height);	courseLbl.setLocation(x, y);	y=y+height+margin;
		MarksLbl=new JLabel("Marks:");		MarksLbl.setSize(width,height);		MarksLbl.setLocation(x,y);		y=y+height+margin;
		
		addBtn=new JButton("Add Student");	addBtn.setSize(width,height);		addBtn.setLocation(x,y+20);		y=50;x=x+width+margin;
		
		
		rollNoTxt=new JTextField();			rollNoTxt.setSize(width,height);	rollNoTxt.setLocation(x, y);	y=y+height+margin;
		nameTxt=new JTextField();			nameTxt.setSize(width,height);		nameTxt.setLocation(x, y);		y=y+height+margin;
		courseTxt=new JTextField();			courseTxt.setSize(width,height);	courseTxt.setLocation(x, y);	y=y+height+margin;
		marksTxt=new JTextField();			marksTxt.setSize(width,height);		marksTxt.setLocation(x, y);		y=y+height+margin;
		
		clearBtn=new JButton("CLEAR");		clearBtn.setSize(width,height);		clearBtn.setLocation(x,y+20);		
		
		this.add(rollNoLbl);	this.add(rollNoTxt);
		this.add(nameLbl);		this.add(nameTxt);
		this.add(courseLbl);	this.add(courseTxt);
		this.add(MarksLbl);		this.add(marksTxt);
		this.add(addBtn);		this.add(clearBtn);
		
		//Register the listener for each button
		addBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		
		//SET ACTIOIN COMMANDS
		addBtn.setActionCommand("SAVE STUDENT");
		clearBtn.setActionCommand("CLEAR");
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		try 
		{
			if(ae.getActionCommand().equals("SAVE STUDENT")){
				Student s= new Student(Integer.parseInt(rollNoTxt.getText()),nameTxt.getText(),courseTxt.getText(),Float.parseFloat(marksTxt.getText()));
				if(StudentService.saveStudent(s))
				{
					  JOptionPane.showMessageDialog(this,"Student Successfully Saved.","DB Operation",JOptionPane.INFORMATION_MESSAGE);     
				}
				else{
					 JOptionPane.showMessageDialog(this,"Failed to Save Student.","DB Operation",JOptionPane.ERROR_MESSAGE); 
				}
			}
			else if(ae.getActionCommand().equals("CLEAR")){
				rollNoTxt.setText(""); nameTxt.setText(""); courseTxt.setText("");marksTxt.setText("");
			}
			
		} catch (Exception e) {
			System.out.println("Action handling Exception:"+e.getMessage());
		}
		
		
	}
	
	
	

}
