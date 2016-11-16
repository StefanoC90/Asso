class newgame{

	public static void newgame(){
		int i,j;
		Asso.cor=0;
		Asso.turno=true;
		Asso.preso=1;
		Asso.pausa=0;
		Asso.fine=0;
	 	Asso.punti[0]=0;
	 	Asso.punti[1]=0;
	    for(j=0;j<3;j++)
	    for(i=0;i<10;i++)
	    	Asso.cm[j][i]=40;
	    	
		regole.inizio();
		regole.idistribuisci();
		regole.distribuisci();
	
	 	new ThreadSleep().start();
		
	}
}