
//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class newmain extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newmain frame = new newmain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public newmain() {
		setTitle("Calculator and Notepad Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 100);
		contentPane = new JPanel();
	
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Notepad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Notepad.main(new String[]{});
			}
		});
	
	contentPane.add(btnNewButton);
		
		JButton button = new JButton("Calculator");
	button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyCalculator.main(new String[]{});
			}
		});
	contentPane.add(button);

	contentPane.setLayout(new GridLayout(2,2));
	}
}
