class ia{
	public static void ia(){

		int i, c, a, j;
		a=-1;

		for(c=0,i=0;i<10;i++)
			if(Asso.cm[0][i]!=40)
				c++;
					
		if(c>4)			
		for(i=0;i<3;i++)
			if(Asso.cm[2][i]%10==1)
				a=i;
		
		for(i=0,c=0;(i<3) && (a==-1);i++){
			if(Asso.cm[2][i]!=40)
				for(j=0;j<10;j++){
					if((Asso.cm[0][j]%10==Asso.cm[2][i]%10) && (Asso.cm[2][i]%10%10!=1)) { /*prendi la carta sul tavolo se ha lo stesso valore esluso che la carta sia un asso*/
						a=i;
						break;}
						
				
				}
				}
		if(c>2)	/*prendi con l'asso se non hai carte da buttare	*/	
		for(i=0;i<3;i++)
			if(Asso.cm[2][i]%10==1)
				a=i;
				
		if(a==-1) /*butta una carta qualsiasi diversa dall'asso*/
			for(i=0;i<3;i++)
				if((Asso.cm[2][i]!=40) && (Asso.cm[2][i]%10!=1)){
					a=i;
					
					break;
					}
		if(a==-1) /*se non esitono carte diverso dall'asso da buttare, butta l'asso*/
			for(i=0;i<3;i++)
				if((Asso.cm[2][i]!=40)){
					a=i;
					break;
					}
						
		regole.controllo(a);

	}

}