import java.awt.event.MouseListener;
import java.awt.*;
import java.awt.event.*;

class mouse  implements MouseListener{
    
    public void mouseClicked(MouseEvent e){    	}
    public void mousePressed(MouseEvent e){ }
    public void mouseReleased(MouseEvent e){
 		Point p=new Point(e.getX(), e.getY());	
			if(Asso.fine!=0){
				if((p.y>=350) && (p.y<=400) && (p.x>=250 ) && (p.x<=550))
				newgame.newgame();
		}

    	int n=4;
 		if((p.y>=425) && (p.y<=550) && (Asso.pausa==0)){
 			if((p.x>250)&& (p.x<335) && (Asso.cm[1][0]!=40))
 					n=0;

	    	if((p.x>340)&& (p.x<425) && (Asso.cm[1][1]!=40))    	   	
	    		n=1;
	    		  	
	    	if((p.x>430)&& (p.x<515) && (Asso.cm[1][2]!=40)) 
	    		n=2;
	    				
	    	if(n!=4){
	    	  	regole.controllo(n);
	    	}
    	}
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
 
}