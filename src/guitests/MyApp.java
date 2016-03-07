package guitests;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyApp extends JFrame {

	private JPanel contentPane;
	private JTextField myname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp frame = new MyApp();
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
	public MyApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myname = new JTextField();
		myname.setText("Your name");
		myname.setBounds(152, 24, 86, 20);
		contentPane.add(myname);
		myname.setColumns(10);
		
		JButton Submit = new JButton("Submit");
		Submit.setBounds(152, 148, 89, 23);
		contentPane.add(Submit);
	}
}
