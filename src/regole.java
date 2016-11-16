
class regole{
	
static int r;
	public static void inizio(){ /*mischia le carte*/
		int i,j,cont;
		boolean c[][]=new boolean[4][10]; /*matrice del mazzo di carte,se il valore è vero, la carta si trova ancora nel mazzo*/

    	for(i=0;i<4;i++)
    		for(j=0;j<10;j++)
    			c[i][j]= true;
		for(cont=0;cont<40;){
		
		r=(int)(Math.random()*40);

		i=r/10;
		j=r%10;
		if(c[i][j]==true){

			c[i][j]=false;
			Asso.or[cont]=r;
			cont++;}
	}
	

	}

	
	
	
	public static void idistribuisci(){  /*prima distribuzione*/
	int i;
	for(i=0;i<4;i++)
		Asso.cm[0][i]=Asso.or[i];	
	Asso.cor=4;
		
		
		
	}
	
	public static void distribuisci(){
			int i,j;
		if(Asso.cor==40){ /* controlla se sono finite le carte*/
			for(i=0,j=0;i<10;i++)
				if(Asso.cm[0][i]!=40){
					j++;
					Asso.cm[0][i]=40;}
					
			Asso.punti[Asso.preso-1]=Asso.punti[Asso.preso-1]+j;
			Asso.t.repaint();
			
			if(Asso.punti[0]>Asso.punti[1]){
				Asso.fine=1;
				System.out.print("Hai vinto!");
			}
			if(Asso.punti[0]<Asso.punti[1]){
				Asso.fine=2;
				System.out.print("Hai perso!");
			}
			
			if(Asso.punti[0]==Asso.punti[1]){
				Asso.fine=3;
				System.out.print("Pareggio!");
			}			
				Asso.t.repaint();
			
			}
		
	else{
	

		for(j=1;j<3;j++)
		for(i=0;i<3;i++){
			Asso.cm[j][i]=Asso.or[Asso.cor];			
			Asso.cor++;}
			Asso.t.repaint();
		
	}
	}
	
	public static void controllo(int n){
		int i,j,c;

		if(Asso.turno==true)	
			j=1;
				
				
		else
			j=2;
				
			if(Asso.cm[j][n]%10==1){	/*se la carta buttata è l'asso*/
				
				for(i=0;i<10;i++)
					if(Asso.cm[0][i]!=40){
						Asso.punti[j-1]=Asso.punti[j-1]+1;	
						Asso.cm[0][i]=40;
						
					}
					Asso.cm[j][n]=40;
					Asso.punti[j-1]=Asso.punti[j-1]+1;	
					Asso.preso=j;
				
				}
				if(Asso.cm[j][n]!=40)
					for(i=0;i<10;i++)
						if((Asso.cm[0][i]!=40) && (Asso.cm[0][i]%10==Asso.cm[j][n]%10)){	/*controla se la carta buttata ha lo stesso valore di una su un tavolo*/
								Asso.cm[0][i]=40;
								Asso.cm[j][n]=40;
								Asso.punti[j-1]=Asso.punti[j-1]+2;
								i=10;
								Asso.preso=j;
						}
			if(Asso.cm[j][n]!=40) /*se la carta buttata viene messa sul tavolo*/
				for(i=0;i<10;i++)
					if(Asso.cm[0][i]==40){
					Asso.cm[0][i]=Asso.cm[j][n];	
					Asso.cm[j][n]=40;
					i=10;}

		
		if(j==1){
		
			Asso.turno=false;
			Asso.pausa=1;
			
		}
		else{
		
			Asso.pausa=2;
			Asso.turno=true;
			for(i=0,c=0;i<3;i++)
				if(Asso.cm[2][i]!=40)
					c=1;
				if(c==0)
					distribuisci();}

		    
	}
	
}