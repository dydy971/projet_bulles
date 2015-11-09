package projet_bulles;

import java.io.File;

public class Score {
	private int nombre_clic;
	private int nombre_bulle;
	private static File fichier = new File("D:\\utilisateurs.txt");

	public Score() {
		this.nombre_clic = 0;
		this.nombre_bulle = 0;
	}

	void recupScore(StringBuilder ligne) {
		ligne.delete(0, 1);
		int i = 0;
		StringBuilder nombre_clic = new StringBuilder();
		StringBuilder nombre_bulle = new StringBuilder();
		while (ligne.charAt(i) != '-') {
			nombre_clic.append(ligne.charAt(i));
			i++;
		}
		i++;
		while (ligne.charAt(i) != '|') {
			nombre_bulle.append(ligne.charAt(i));
			i++;
		}
		this.nombre_clic = Integer.parseInt(nombre_clic.toString());
		this.nombre_bulle = Integer.parseInt(nombre_bulle.toString());
		ligne.delete(0, i);
	}

	public String toString() {
		StringBuilder score = new StringBuilder();
		score.append("clics : ");
		switch (String.valueOf(this.nombre_clic).length()) {
		case 1:
			score.append(this.nombre_clic + "  ");
			break;
		case 2:
			score.append(this.nombre_clic + " ");
			break;
		case 3:
			score.append(this.nombre_clic);
			break;
		}
		score.append(" - ");
		switch (String.valueOf(this.nombre_bulle).length()) {
		case 1:
			score.append("  " + this.nombre_bulle);
			break;
		case 2:
			score.append(" " + this.nombre_bulle);
			break;
		case 3:
			score.append(this.nombre_bulle);
			break;
		}
		score.append(" : bulles");
		return score.toString();
	}

	public static void main(String[] Args) {
		Score s1 = new Score();
		Score s2 = new Score();
		Score s3 = new Score();
		System.out.println(s1.toString());
		StringBuilder str = new StringBuilder();
		str.append("|4-1|12-145|4-13|||||");
		s1.recupScore(str);
		s2.recupScore(str);
		s3.recupScore(str);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
