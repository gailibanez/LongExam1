package Portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class AboutMe2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe2 frame = new AboutMe2();
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
	public AboutMe2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AboutMe2.class.getResource("/img/3.jpg")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		getContentPane().add(lblNewLabel);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AboutMe1.main(null);
				}
	});
		btnBack.setBounds(1621, 924, 77, 69);
		getContentPane().add(btnBack);
		btnBack.setOpaque(false);
		
		JButton btnNext = new JButton("");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AboutMe3.main(null);
				}
	});
		btnNext.setBounds(1734, 924, 77, 69);
		getContentPane().add(btnNext);
		btnNext.setOpaque(false);
		
	}
}
