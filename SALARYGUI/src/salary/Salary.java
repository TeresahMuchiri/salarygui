package salary;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salary {

	private JFrame frame;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldRateperhour;
	private JTextField textFieldHourperday;
	private JTextField textFieldNoofdays;
	private JTextField textFieldTax;
	private JTextField textFieldPhilHealth;
	private JTextField textFieldSSS;
	private JTextField textFieldGrossSalary;
	private JTextField textFieldDeduction;
	private JTextField textFieldGS;
	private JTextField textFieldTS;
	private JTextField textFieldNS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salary window = new Salary();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Salary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel HeadingLabel = new JLabel("Simple Payroll System");
		HeadingLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		HeadingLabel.setBounds(215, 11, 190, 19);
		frame.getContentPane().add(HeadingLabel);
		
		JLabel EmployeeLabel = new JLabel("Employee Name:");
		EmployeeLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		EmployeeLabel.setBounds(47, 63, 88, 14);
		frame.getContentPane().add(EmployeeLabel);
		
		JLabel RateperhourLabel = new JLabel("Rate per Hour:");
		RateperhourLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		RateperhourLabel.setBounds(57, 88, 88, 14);
		frame.getContentPane().add(RateperhourLabel);
		
		JLabel HourperdayLabel = new JLabel("Hour per Day:");
		HourperdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		HourperdayLabel.setBounds(59, 113, 88, 14);
		frame.getContentPane().add(HourperdayLabel);
		
		JLabel DaysworkedLabel = new JLabel("Number of days worked:");
		DaysworkedLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		DaysworkedLabel.setBounds(10, 138, 125, 14);
		frame.getContentPane().add(DaysworkedLabel);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(141, 60, 86, 20);
		frame.getContentPane().add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		textFieldRateperhour = new JTextField();
		textFieldRateperhour.setBounds(141, 85, 86, 20);
		frame.getContentPane().add(textFieldRateperhour);
		textFieldRateperhour.setColumns(10);
		
		textFieldHourperday = new JTextField();
		textFieldHourperday.setBounds(141, 113, 86, 20);
		frame.getContentPane().add(textFieldHourperday);
		textFieldHourperday.setColumns(10);
		
		textFieldNoofdays = new JTextField();
		textFieldNoofdays.setBounds(141, 138, 86, 20);
		frame.getContentPane().add(textFieldNoofdays);
		textFieldNoofdays.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DEDUCTION OF SALARY");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(279, 62, 146, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel TaxLabel = new JLabel("TAX 15% of monthly wage");
		TaxLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		TaxLabel.setBounds(237, 88, 137, 14);
		frame.getContentPane().add(TaxLabel);
		
		JLabel PhilHealthLabel = new JLabel("PhilHealth 5%");
		PhilHealthLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		PhilHealthLabel.setBounds(300, 113, 74, 14);
		frame.getContentPane().add(PhilHealthLabel);
		
		JLabel SSSLabel = new JLabel("SSS 2%");
		SSSLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		SSSLabel.setBounds(330, 138, 44, 14);
		frame.getContentPane().add(SSSLabel);
		
		textFieldTax = new JTextField();
		textFieldTax.setEditable(false);
		textFieldTax.setBounds(373, 85, 86, 20);
		frame.getContentPane().add(textFieldTax);
		textFieldTax.setColumns(10);
		
		textFieldPhilHealth = new JTextField();
		textFieldPhilHealth.setEditable(false);
		textFieldPhilHealth.setBounds(373, 110, 86, 20);
		frame.getContentPane().add(textFieldPhilHealth);
		textFieldPhilHealth.setColumns(10);
		
		textFieldSSS = new JTextField();
		textFieldSSS.setEditable(false);
		textFieldSSS.setBounds(373, 135, 86, 20);
		frame.getContentPane().add(textFieldSSS);
		textFieldSSS.setColumns(10);
		
		JLabel GrossSalaryLabel = new JLabel("Gross Salary:");
		GrossSalaryLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		GrossSalaryLabel.setBounds(469, 88, 74, 14);
		frame.getContentPane().add(GrossSalaryLabel);
		
		JLabel DeductionLabel = new JLabel("Deduction:");
		DeductionLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		DeductionLabel.setBounds(479, 113, 64, 14);
		frame.getContentPane().add(DeductionLabel);
		
		textFieldGrossSalary = new JTextField();
		textFieldGrossSalary.setEditable(false);
		textFieldGrossSalary.setBounds(533, 85, 86, 20);
		frame.getContentPane().add(textFieldGrossSalary);
		textFieldGrossSalary.setColumns(10);
		
		textFieldDeduction = new JTextField();
		textFieldDeduction.setEditable(false);
		textFieldDeduction.setBounds(533, 110, 86, 20);
		frame.getContentPane().add(textFieldDeduction);
		textFieldDeduction.setColumns(10);
		
		JLabel GSLabel = new JLabel("GROSS SALARY:");
		GSLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		GSLabel.setBounds(27, 199, 108, 14);
		frame.getContentPane().add(GSLabel);
		
		JLabel TDLabel = new JLabel("TOTAL DEDUCTION:");
		TDLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		TDLabel.setBounds(249, 199, 125, 14);
		frame.getContentPane().add(TDLabel);
		
		JLabel NSLabel = new JLabel("NET SALARY:");
		NSLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		NSLabel.setBounds(469, 199, 88, 14);
		frame.getContentPane().add(NSLabel);
		
		textFieldGS = new JTextField();
		textFieldGS.setEditable(false);
		textFieldGS.setBounds(141, 197, 86, 20);
		frame.getContentPane().add(textFieldGS);
		textFieldGS.setColumns(10);
		
		textFieldTS = new JTextField();
		textFieldTS.setEditable(false);
		textFieldTS.setBounds(373, 197, 86, 20);
		frame.getContentPane().add(textFieldTS);
		textFieldTS.setColumns(10);
		
		textFieldNS = new JTextField();
		textFieldNS.setEditable(false);
		textFieldNS.setBounds(555, 199, 64, 18);
		frame.getContentPane().add(textFieldNS);
		textFieldNS.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Rateperhour, Hourperday, Noofdays;
				double grosssalary;
				double tax;
				double phil;
				double sss;
				double deduction;
				double netsalary;
				
				Rateperhour = textFieldRateperhour.getText();
				Hourperday = textFieldHourperday.getText();
				Noofdays = textFieldNoofdays.getText();
				
				double rate = Double.parseDouble(Rateperhour);
				double hours = Double.parseDouble(Hourperday);
				double days = Double.parseDouble(Noofdays);
				
				grosssalary = (rate*hours*days);
				tax = (0.15*grosssalary);
				phil = (0.05*grosssalary);
				sss = (0.02*grosssalary);
				deduction = (tax+phil+sss);
				netsalary = (grosssalary-deduction);
				
				textFieldGrossSalary.setText(Double.toString(grosssalary));
				textFieldTax.setText(Double.toString(tax));
				textFieldPhilHealth.setText(Double.toString(phil));
				textFieldSSS.setText(Double.toString(sss));
				textFieldDeduction.setText(Double.toString(deduction));
				textFieldGS.setText(Double.toString(grosssalary));
				textFieldTS.setText(Double.toString(deduction));
				textFieldNS.setText(Double.toString(netsalary));
			}
		});
		btnCompute.setForeground(new Color(0, 0, 0));
		btnCompute.setBackground(new Color(0, 128, 128));
		btnCompute.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCompute.setBounds(241, 239, 133, 35);
		frame.getContentPane().add(btnCompute);
	}
}
