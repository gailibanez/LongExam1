package Portfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/img/1.jpg")));
		lblNewLabel.setBounds(10, 0, 1920, 1080);
		contentPane.add(lblNewLabel);
		
		JButton btnAboutMe = new JButton("");
		btnAboutMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			AboutMe1.main(null);
			}
	});
		
		btnAboutMe.setBounds(898, 564, 391, 76);
		contentPane.add(btnAboutMe);
		btnAboutMe.setOpaque(false);
		
		JButton btnMyWorks = new JButton("New button");
		btnMyWorks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			MyWorks1.main(null);
			}
	});
		btnMyWorks.setBounds(920, 689, 369, 86);
		contentPane.add(btnMyWorks);
		btnMyWorks.setOpaque(false);

		
		JButton btnSkills = new JButton("New button");
		btnSkills.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			Skills.main(null);
			}
	});
		btnSkills.setBounds(1361, 550, 296, 76);
		contentPane.add(btnSkills);
		btnSkills.setOpaque(false);

		
		JButton btnExperiences = new JButton("New button");
		btnExperiences.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			Experiences.main(null);
			}
	});
		btnExperiences.setBounds(1361, 706, 461, 69);
		contentPane.add(btnExperiences);
		btnExperiences.setOpaque(false);

	}

}
