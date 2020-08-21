package cab_booking;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CE_Traveller_PBook extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CE_Traveller_PBook frame = new CE_Traveller_PBook();
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
	public CE_Traveller_PBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAmountToBe = new JLabel("Amount To be Paid : ");
		lblAmountToBe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAmountToBe.setBounds(31, 48, 213, 33);
		contentPane.add(lblAmountToBe);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(241, 59, 82, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CE_Traveller_BookingC c =  new CE_Traveller_BookingC();
				c.setVisible(true);
			}
		});
		btnPay.setBounds(155, 131, 89, 23);
		contentPane.add(btnPay);
		
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CE_Traveller_CancelTrip ct = new CE_Traveller_CancelTrip();
				ct.setVisible(true);
			}
		});
		btnCancel.setBounds(155, 195, 89, 23);
		contentPane.add(btnCancel);
	}

}
