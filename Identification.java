package projet_bulles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Identification extends JFrame {

	private JPanel fenetre;

	JLabel myLabel;
	private JButton bouton_seconnecter;
	private static String a;
	JPanel top;
	private JPanel container = new JPanel();
	private JTextField jtf = new JTextField();
	private JLabel label = new JLabel("Identifiant");
	private static Utilisateur utilisateur;

	public Identification() {
		this.setTitle("La case à bulles");
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		// container.setLayout(new BorderLayout());
		Font police = new Font("Arial", Font.BOLD, 20);
		jtf.setFont(police);
		jtf.setPreferredSize(new Dimension(150, 30));
		this.bouton_seconnecter = new JButton("Se connecter");
		this.bouton_seconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utilisateur = new Utilisateur(jtf.getText() == null ? "" : jtf
						.getText());
				try {
					utilisateur.Identification();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(utilisateur.toString());
			}
		});
		// jtf.setForeground(Color.BLACK);
		container.add(jtf, BorderLayout.CENTER);
		container.add(bouton_seconnecter, BorderLayout.SOUTH);
		this.setContentPane(container);
		this.setVisible(true);
	}

	public String execute() {
		bouton_seconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utilisateur = new Utilisateur(jtf.getText());
				try {
					utilisateur.Identification();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println(utilisateur.toString());
			}
		});
		return a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Identification id1 = new Identification();
		// id1.execute();
	}
}
