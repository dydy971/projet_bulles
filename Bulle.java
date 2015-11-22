import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Bulle {
	private JLabel label;	
	private int larg;
	private int haut;
	private int x;
	private int y;
	private static Icon image = new ImageIcon("bulle.png");
	
							
	public Bulle(int x, int y, int larg, int haut){
		this.label =new JLabel(image); 
		this.x=x;
		this.y=y;
		this.larg=larg;
		this.haut=haut;
		  this.label.addMouseListener(new MouseAdapter(){  public void mousePressed(MouseEvent me){
	          
              System.out.println("lol");
          	  label.setVisible(false);
                   //Do action here    	
   }});	
	  		 

	}

	public void afficherBulle(JPanel pan){
		pan.add(this.label);
		this.label.setBounds(this.x,this.y,this.larg,this.haut);
	}
	public void animer(JPanel pan){
		int x,y;
		x=500;
		y=0;
		int bi=0;
		while(true){
				
				if(x==800){
					y++;
				}
				if(y==150){
					x--;
					bi=150;
				}
				
				if(x==500 && bi==150){
					y--;
				}
				if(y==0){
					x++;				
				}
				
					
				label.setBounds(x,y,151,151);
				
				pan.repaint();
										
				try {

					Thread.sleep(3);

				} catch (InterruptedException e) {

					e.printStackTrace();

				}
				}	// fin tant que
		}



}
