package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.*;
//import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import OCSF.MyClient;
import prsPackage.*;

public class DoctorHome extends JFrame
{
	private JPanel dHomeTopPanel;
	private JLabel dHomeTopLabel;
	private JLabel dLoggedin;
	private JButton dMakeAppointment;
	private JButton dViewDoctorSchedule;
	private JButton dViewPatientReferral;
	private JButton dViewPatientRecords;
	private JButton dMakeDiagnosis;
	private JButton dMakeReferral;
	
	private MyClient client;
	private Doctor user;
	
	
	public DoctorHome(Doctor user, MyClient client)
	{
		super("Doctor Home");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().setBackground(Color.white);
		
		dHomeTopPanel = new JPanel();
		dHomeTopPanel.setBackground(Color.blue);
		dHomeTopPanel.setPreferredSize(new Dimension(500,30));
		add(dHomeTopPanel);
		
		dHomeTopLabel = new JLabel();
		dHomeTopLabel.setText("ESOF3050 Hospital PRS System: Doctor Home");
		dHomeTopLabel.setForeground(Color.white);
		dHomeTopPanel.add(dHomeTopLabel);
		
		dLoggedin = new JLabel();
		dLoggedin.setText("Logged in as Doctor");
		dLoggedin.setForeground(Color.blue);
		add(dLoggedin);
		
		dMakeAppointment = new JButton("Make Appointment");
		dMakeAppointment.setPreferredSize(new Dimension(200,60));
		add(dMakeAppointment);
		
		dViewDoctorSchedule = new JButton("View Doctor Schedules");
		dViewDoctorSchedule.setPreferredSize(new Dimension(200,60));
		add(dViewDoctorSchedule);
		
		dViewPatientReferral = new JButton("View Patient Referrals");
		dViewPatientReferral.setPreferredSize(new Dimension(200,60));
		add(dViewPatientReferral);
		
		dViewPatientRecords = new JButton("View Patient Records");
		dViewPatientRecords.setPreferredSize(new Dimension(200,60));
		add(dViewPatientRecords);
		
		dMakeDiagnosis = new JButton("Create a Record");
		dMakeDiagnosis.setPreferredSize(new Dimension(200,60));
		add(dMakeDiagnosis);
		
		dMakeReferral = new JButton("Make Referral");
		dMakeReferral.setPreferredSize(new Dimension(200,60));
		add(dMakeReferral);
		
		//Adding Listeners onto buttons
		DoctorHandler1 dhandler1 = new DoctorHandler1();
		dMakeAppointment.addActionListener(dhandler1);
		
		DoctorHandler2 dhandler2 = new DoctorHandler2();
		dViewDoctorSchedule.addActionListener(dhandler2);
		
		DoctorHandler3 dhandler3 = new DoctorHandler3();
		dViewPatientReferral.addActionListener(dhandler3);
		
		DoctorHandler4 dhandler4 = new DoctorHandler4();
		dViewPatientRecords.addActionListener(dhandler4);
		
		DoctorHandler5 dhandler5 = new DoctorHandler5();
		dMakeDiagnosis.addActionListener(dhandler5);
		
		DoctorHandler6 dhandler6 = new DoctorHandler6();
		dMakeReferral.addActionListener(dhandler6);
		
		//set user and client
		this.client = client;
		this.user = user;
	}
	
	//Listeners for each button
	private class DoctorHandler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dMakeAppointment)
			{
				MakeAppointment makeAppointment = new MakeAppointment();
				makeAppointment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeAppointment.setSize(600, 400);
				makeAppointment.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dViewDoctorSchedule)
			{
				ViewDoctorSchedules doctorSchedules = new ViewDoctorSchedules();
				doctorSchedules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				doctorSchedules.setSize(600, 400);
				doctorSchedules.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler3 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dViewPatientReferral)
			{
				PatientReferrals patientReferrals = new PatientReferrals();
				patientReferrals.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientReferrals.setSize(600, 400);
				patientReferrals.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler4 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dViewPatientRecords)
			{
				ViewRecords patientHistory = new ViewRecords();
				patientHistory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				patientHistory.setSize(600, 400);
				patientHistory.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler5 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dMakeDiagnosis)
			{
				CreateRecords createRecords = new CreateRecords();
				createRecords.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				createRecords.setSize(600, 400);
				createRecords.setVisible(true);
			}
		}
	}
	
	private class DoctorHandler6 implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == dMakeReferral)
			{
				MakeReferral makeReferral = new MakeReferral(null, user, client);
				makeReferral.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				makeReferral.setSize(600, 400);
				makeReferral.setVisible(true);
			}
		}
	}	
}
