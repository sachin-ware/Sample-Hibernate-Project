package com.sware.hyb.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;

import com.sware.hyb.domain.Student;
import com.sware.hyb.service.StudentService;

import javax.swing.*;

public class MainPage extends JFrame implements ActionListener {
	
	JButton createBtn,updateBtn,deleteBtn,listBtn;
	
	JTable studentTable;

	public MainPage() {
		
		prepareUI();
		
	}
	
	public void prepareUI(){
		
		this.setVisible(true);
		this.setSize(800, 300);
		this.setLocation(200,150);
		
		
		// Creating UI for the main page
		createBtn=new JButton("Add Student");
		updateBtn=new JButton("Update Student");
		deleteBtn=new JButton("Delete Student");
		listBtn=new JButton("List Students");
		
		
		//createBtn.setPreferredSize(;
		createBtn.setSize(200,50);
		updateBtn.setSize(200,50);
		deleteBtn.setSize(200,50);
		listBtn.setSize(200,50);
	
	//	this.setLayout(new GridLayout(4, 1));
		this.setLayout(new FlowLayout());
		this.add(createBtn);
		this.add(updateBtn);
		this.add(deleteBtn);
		this.add(listBtn);
		
		//Register the listener for each button
		createBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		listBtn.addActionListener(this);
		
		//SET ACTIOIN COMMANDS
		createBtn.setActionCommand("ADD");
		updateBtn.setActionCommand("UPDATE");
		deleteBtn.setActionCommand("DELETE");
		listBtn.setActionCommand("LIST");
	
//		ArrayList<Student> studentList=(ArrayList<Student> )StudentService.getAllStudents();
//		String tableHeaders[]={"Roll No","Name","Course","Marks"};
//		studentTable=new JTable();
//		JTableHeader header=new JTableHeader().add;
//		studentTable.setTableHeader(header);
//	//	studentLIst=new JTable(arg0, arg1)
		
		
		this.show();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		try 
		{
			if(ae.getActionCommand().equals("ADD")){
				new AddStudent();
			}
			else if(ae.getActionCommand().equals("UPDATE")){
				
			}
			else if(ae.getActionCommand().equals("DELETE")){
				
			}
			else if(ae.getActionCommand().equals("LIST")){
				JOptionPane.showMessageDialog(this,StudentService.getAllStudents().toArray(),"DB Operation",JOptionPane.INFORMATION_MESSAGE); 
			}
			
		} catch (Exception e) {
			System.out.println("Action handling Exception:"+e.getMessage());
		}
		
		
	}
	
	
	

}
