
import java.awt.*;
class Asso {
	public static Frame f=new Frame("  Asso piglia tutto  ");
	public static graf t=new graf(); /*classe grafica*/
	/*vettore che contiene le carte possedute dai giocatore e le carte sul tavolo, in forma intera */
	public static int cm[][]=new int[3][10];
	/*ordine delle successioni delle carte, le carte sono formati da numeri che vanno ada una a 39, le decine indicano,il seme della carta: 
	0: Picche, 1:quadri, 2: fiori, 3: cuori e le unitra indicano il valore della carta, se la carta ha unita 0, allora es
	sa varrò 10*/
	public static int or[]=new int[40]; 
	public static int cor=0; /*numero di carte date*/
	public static int punti[]=new int[2];
	public static boolean turno=true;
	public static int preso=1;
	public static int pausa=0;
	public static int fine=0;
	
	    public static void main (String[] args) {
	    	int i,j;
	    	
			t.addMouseListener(new mouse());
		 	f.addWindowListener(new GestoreFinestra());
		 	punti[0]=0;
		 	punti[1]=0;
		    for(j=0;j<3;j++)
			    for(i=0;i<10;i++)
			    	cm[j][i]=40;
			f.setSize(800,600);
			f.setLocation(300,200);
			regole.inizio();
			regole.idistribuisci();
			regole.distribuisci();
			f.add(t);
			f.setVisible(true);
		 	new ThreadSleep().start();
	    }
    
    
}