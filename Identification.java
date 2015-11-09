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

	// private JPanel fenetre;

	JLabel myLabel;
	private JButton bouton_seconnecter;
	private static String a;
	JPanel top;
	private JPanel fenetre = new JPanel();
	private JTextField champ_saisie = new JTextField();
	private JLabel label = new JLabel("Identifiant");
	private static Utilisateur utilisateur;

	public Identification() {
		this.setTitle("La case à bulles"); //Donne un titre à la fenêtre
		this.setExtendedState(Frame.MAXIMIZED_BOTH); //Met la fenêtre en plein écran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Si on clic sur la croix rouge, le process se termine
		this.setLocationRelativeTo(null); //La fenêtre est "independante"
		fenetre.setBackground(Color.white); //Le fond est bleu
		// fenetre.setLayout(new BorderLayout());
		Font police = new Font("Arial", Font.BOLD, 20); //Définition de la police d'écriture et de sa taille
		champ_saisie.setFont(police); //On active la police dans le champ
		champ_saisie.setPreferredSize(new Dimension(150, 30));
		this.bouton_seconnecter = new JButton("Se connecter");
		this.bouton_seconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utilisateur = new Utilisateur(champ_saisie.getText() == null ? "" : champ_saisie
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
		// champ_saisie.setForeground(Color.BLACK);
		fenetre.add(champ_saisie, BorderLayout.CENTER);
		fenetre.add(bouton_seconnecter, BorderLayout.SOUTH);
		this.setContentPane(fenetre);
		this.setVisible(true);
	}

	public String execute() {
		bouton_seconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utilisateur = new Utilisateur(champ_saisie.getText());
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
