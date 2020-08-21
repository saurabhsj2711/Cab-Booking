package cab_booking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Ad_Show_Customer_Data extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad_Show_Customer_Data frame = new Ad_Show_Customer_Data();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ad_Show_Customer_Data() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNOfCustomer = new JLabel("No Of Customer Travelled  :-");
		lblNOfCustomer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNOfCustomer.setBounds(45, 66, 229, 14);
		contentPane.add(lblNOfCustomer);
		
		JLabel label = new JLabel("0");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(306, 66, 48, 14);
		contentPane.add(label);
		
		JLabel lblTotalFairAmount = new JLabel("Total Fair Amount  :-");
		lblTotalFairAmount.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalFairAmount.setBounds(45, 108, 229, 14);
		contentPane.add(lblTotalFairAmount);
		
		JLabel label_1 = new JLabel("0");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_1.setBounds(306, 110, 48, 14);
		contentPane.add(label_1);
		
		JLabel lblTotalNoOf = new JLabel("Total No of Driver :-");
		lblTotalNoOf.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblTotalNoOf.setBounds(45, 153, 229, 14);
		contentPane.add(lblTotalNoOf);
		
		JLabel lblNumberOfDriver = new JLabel("Number of Driver Free Now  :-");
		lblNumberOfDriver.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNumberOfDriver.setBounds(45, 195, 247, 14);
		contentPane.add(lblNumberOfDriver);
		
		JLabel label_2 = new JLabel("0");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_2.setBounds(306, 155, 48, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_3.setBounds(306, 197, 48, 14);
		contentPane.add(label_3);
	}
}
