public class ThreadSleep extends Thread { 
	public void run() { /*Procedurà per fare generare il ritardo di risposta del computer*/
		
		long tempo=0;
		
			try {
				while(Asso.fine==0){
					
					if(Asso.pausa==0)
						tempo=100;	
					if(Asso.pausa==1)	
						tempo=100;
					
					if(Asso.pausa==2)
						tempo=100;
					if(Asso.pausa==3)
						tempo=600;
					
					Thread.sleep(tempo);
					
					if(Asso.pausa==3){
				   	  	Asso.pausa=0;
				   	  	ia.ia();
		   	  	}
				if(Asso.pausa==1){
			   	  	Asso.t.repaint();
			   	  	Asso.pausa=3;
			   	 }
		   	  	
		   	  	
		   	  	if(Asso.pausa==2){
			   	  	Asso.t.repaint();  
			   	  	Asso.pausa=0; 	  	
		   	  	}
			}
		}
			
		
		catch (InterruptedException e) { return; }
	}
}