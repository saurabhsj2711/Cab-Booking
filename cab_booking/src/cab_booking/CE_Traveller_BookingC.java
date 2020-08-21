package cab_booking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class CE_Traveller_BookingC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CE_Traveller_BookingC frame = new CE_Traveller_BookingC();
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
	public CE_Traveller_BookingC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("!!!!  THANK YOU !!!!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(87, 22, 266, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblName.setBounds(36, 107, 82, 14);
		contentPane.add(lblName);
		
		JLabel lblSource = new JLabel("Source :");
		lblSource.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSource.setBounds(36, 147, 82, 14);
		contentPane.add(lblSource);
		
		JLabel lblDestination = new JLabel("Destination :");
		lblDestination.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDestination.setBounds(36, 184, 111, 14);
		contentPane.add(lblDestination);
		
		JLabel lblAmountPaid = new JLabel("Amount Paid :");
		lblAmountPaid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAmountPaid.setBounds(36, 223, 150, 14);
		contentPane.add(lblAmountPaid);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(196, 109, 143, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(196, 147, 143, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(196, 186, 143, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(196, 225, 143, 14);
		contentPane.add(label_2);
		
		JLabel lblRideCompleted = new JLabel("::::: Ride Completed ::::");
		lblRideCompleted.setForeground(Color.BLACK);
		lblRideCompleted.setFont(new Font("Snap ITC", Font.BOLD, 18));
		lblRideCompleted.setBounds(80, 47, 236, 24);
		contentPane.add(lblRideCompleted);
	}

}
