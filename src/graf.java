import java.awt.*;

public class graf extends Canvas{
	

	private static final long serialVersionUID = 1L;
	Image immagine,c0,c1,c2,c3,f,ri;

	public void paint(Graphics g){
	 	int i,j,x,y,q,r,d;
	 	Font car1=new Font("Monospaced",Font.PLAIN,72);
	 	Font car2=new Font("Monospaced",Font.PLAIN,36);
		Toolkit defToolKit = Toolkit.getDefaultToolkit();
		immagine = defToolKit.getImage("carta.JPG");

		c0 = defToolKit.getImage("img/picche.JPG");
		c1 = defToolKit.getImage("img/quadri.JPG");	
		c2 = defToolKit.getImage("img/fiori.JPG");
		c3 = defToolKit.getImage("img/cuori.JPG");
		ri = defToolKit.getImage("img/retro.jpg");
		
		g.fillRect(0,0,800,600);
		g.setColor(Color.white);
		g.drawString("Carte",40,40);
		g.drawString("Tu",40,70);
		g.drawString("Computer",40,100);
		g.drawString(""+Asso.punti[0],110,70);/*stampa area alto a sinistra di conta punteggio*/
		g.drawString(""+Asso.punti[1],110,100);		
		
		
		g.drawRect(200,-10,400,150);
		g.drawRect(200,420,400,200);	
		
		for(j=0,x=0,y=0;j<3;j++) /*disegno grafico delle carte*/
			for(i=0;i<10;i++)			
			if(Asso.cm[j][i]!=40){
				
					if(j==0){
						if(i<2){
							y=150;	
							x=285+i*90;	
						}
						if((i>=2) && (i<4)){
						
							y=290;	
							x=285+(i-2)*90;	}
							
						if((i>=4) && (i<6)){
							y=150;
							x= 195+(i-4)*270;
								
						}		
						
						if((i>=6) && (i<8)){
							y=290;
							x= 195+(i-6)*270;	
		
					}
					}
					
					
					if(j==1){
						y=425;
						x=250+i*90;
					}
					
					if(j==2){
						y=10;
						x=250+i*90;
					}
				g.setColor(Color.white);		
				g.fillRect(x,y,85,125); /*stampa il controrno della carta*/
				q=Asso.cm[j][i]/10; /*controlla il seme della carta*/
				if(q==0)	
					f=c0;
				if(q==1)	
					f=c1;
				if(q==2)	
					f=c2;
				if(q==3)	
					f=c3;
				r=Asso.cm[j][i]%10;
				d=20;/*dimensione carta*/
				
				
				if(j!=2){ /*disegna le carte che si trovano sul tavolo e nella mano*/
				
						
								
					if(r==1)
						g.drawImage(f,x+32,y+50,d,d,this);	
					if(r==2){
						
						g.drawImage(f,x+32,y+10,d,d,this);
						g.drawImage(f,x+32,y+90,d,d,this);
					}
		
					if(r==3){
						g.drawImage(f,x+32,y+10,d,d,this);
						g.drawImage(f,x+32,y+50,d,d,this);
						g.drawImage(f,x+32,y+90,d,d,this);					
					}
					
					if(r==4){
						g.drawImage(f,x+10,y+10,d,d,this);
						g.drawImage(f,x+50,y+10,d,d,this);
						g.drawImage(f,x+10,y+90,d,d,this);
						g.drawImage(f,x+50,y+90,d,d,this);	
								
				}
				
				if(r==5){
					g.drawImage(f,x+10,y+10,d,d,this);
					g.drawImage(f,x+50,y+10,d,d,this);
					g.drawImage(f,x+32,y+50,d,d,this);			
					g.drawImage(f,x+10,y+90,d,d,this);
					g.drawImage(f,x+50,y+90,d,d,this);				
				}			
							
				if(r==6){
					g.drawImage(f,x+10,y+10,d,d,this);
					g.drawImage(f,x+50,y+10,d,d,this);
					g.drawImage(f,x+10,y+50,d,d,this);
					g.drawImage(f,x+50,y+50,d,d,this);			
					g.drawImage(f,x+10,y+90,d,d,this);
					g.drawImage(f,x+50,y+90,d,d,this);				
				}
				
				if(r==7){
					g.drawImage(f,x+10,y+10,d,d,this);
					g.drawImage(f,x+50,y+10,d,d,this);
					g.drawImage(f,x+10,y+50,d,d,this);
					g.drawImage(f,x+32,y+30,d,d,this);
					g.drawImage(f,x+50,y+50,d,d,this);			
					g.drawImage(f,x+10,y+90,d,d,this);
					g.drawImage(f,x+50,y+90,d,d,this);				
				}	
							
				if(r==8){
					g.drawImage(f,x+10,y+10,d,d,this);
					g.drawImage(f,x+50,y+10,d,d,this);
					g.drawImage(f,x+10,y+50,d,d,this);
					
					g.drawImage(f,x+32,y+30,d,d,this);
					g.drawImage(f,x+32,y+70,d,d,this);			
					g.drawImage(f,x+50,y+50,d,d,this);			
					g.drawImage(f,x+10,y+90,d,d,this);
					g.drawImage(f,x+50,y+90,d,d,this);				
				}			
				
				if(r==9){
					g.drawImage(f,x+10,y+10,d,d,this);
					g.drawImage(f,x+50,y+10,d,d,this);
					g.drawImage(f,x+10,y+35,d,d,this);
					g.drawImage(f,x+50,y+35,d,d,this);				
					g.drawImage(f,x+32,y+25,d,d,this);
					g.drawImage(f,x+50,y+65,d,d,this);				
					g.drawImage(f,x+10,y+65,d,d,this);
					g.drawImage(f,x+10,y+90,d,d,this);
					g.drawImage(f,x+50,y+90,d,d,this);	
	
				}	
					
				if(r==0){
					g.drawImage(f,x+10,y+10,d,d,this);
					g.drawImage(f,x+50,y+10,d,d,this);
					g.drawImage(f,x+10,y+35,d,d,this);
					g.drawImage(f,x+50,y+35,d,d,this);				
					g.drawImage(f,x+32,y+20,d,d,this);
					g.drawImage(f,x+32,y+75,d,d,this);	
					g.drawImage(f,x+50,y+65,d,d,this);				
					g.drawImage(f,x+10,y+65,d,d,this);
					g.drawImage(f,x+10,y+90,d,d,this);
					g.drawImage(f,x+50,y+90,d,d,this);	
					
				}
				
				if((q==0) || (q==2))
				g.setColor(Color.black);
				else
				g.setColor(Color.red);
				if(r==0){
					g.drawString("10",x+68,y+11);
					g.drawString("10",x+68,y+120);					
					
					
					
				}
				
					else{					
					g.drawString(""+r,x+73,y+11);
					g.drawString(""+r,x+73,y+120);}				
				if(r==0)
					r=10;
					g.drawString(""+r,x+3,y+11);
					g.drawString(""+r,x+3,y+120);
	   
			}		
			else{ /*disegna le carte dell'avversario*/
				g.drawImage(ri,x,y,85,125,this);
				
			}
				
	}
	g.setFont(car1);
	if(Asso.fine==1){  
		g.setColor(Color.green);
		g.fillRect(0,0,800,600);
		g.setColor(Color.BLACK);	
		g.drawString("Hai vinto!",140,180);
	}
	if(Asso.fine==2){  
		g.setColor(Color.red);
		g.fillRect(0,0,800,600);
		g.setColor(Color.BLACK);	
		g.drawString("Hai perso!",140,180);
	}	
			
	if(Asso.fine==3){  
		g.setColor(Color.GRAY);
		g.fillRect(0,0,800,600);
		g.setColor(Color.BLACK);	
		g.drawString("Pareggio!",150,180);
	}
	
	if(Asso.fine!=0){
	
		g.setColor(Color.white);
		g.fillRect(250,350,300,50);
		g.setFont(car2);
		g.setColor(Color.black);
		g.drawString("Gioca ancora?",260,380);	
	}	
		
	
	
	
	}} 
