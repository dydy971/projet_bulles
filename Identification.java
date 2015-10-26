package projet_bulles;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Identification {

	JFrame fenetre;
	JPanel p;
	JPanel p3;
	JTextField input;
	JLabel myLabel;
	JButton bouton_seconnecter;
	Utilisateur utilisateur;

	public Identification() {
		this.fenetre = new JFrame();
		// fenetre.setSize(200, 100);
		this.fenetre.pack();
		this.fenetre.setDefaultLookAndFeelDecorated(true);
		this.fenetre.setExtendedState(this.fenetre.MAXIMIZED_BOTH);
		fenetre.setTitle("La case à bulles");
		this.p = new JPanel(new BorderLayout());
		this.p3 = new JPanel(new GridLayout(1, 3));
		this.input = new JTextField();
		this.bouton_seconnecter = new JButton("Se connecter");
		this.bouton_seconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myLabel.setText(" Input : " + (input.getText() == null ? "" : input.getText()));
			}
		});
		p3.add(input);
		p3.add(bouton_seconnecter);
		fenetre.setContentPane(p3);
		fenetre.setVisible(true);
	}

	public void execute() {

	}

	public static void main(String[] args) {
		Identification id1 = new Identification();
		id1.execute();
	}
}
