
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Personaje { 
    Laberinto lab = new Laberinto();
    private int x = 40;
    private int y = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;
    

    
    public void paint(Graphics grafico){
        //CUERPO
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
         grafico.setColor(Color.black);
        grafico.drawOval(x, y, ancho, alto);
      
        //OJO
        grafico.setColor(Color.white);
        grafico.fillOval(x+7, y+8, 13, 13);
        grafico.fillOval(x+21, y+8, 13, 13);
        grafico.setColor(Color.black);
        grafico.fillOval(x+11, y+12, 5, 5);
        grafico.fillOval(x+25, y+12, 5, 5);
        
        //BOCA
        
        grafico.setColor(Color.black);
        grafico.fillOval(x+7, y+24, 27, 7);
        
        
      
    }
   
            
    public void teclaPresionada(KeyEvent evento){
        int[][]laberinto=lab.obtieneLaberinto();
        
        
     if(evento.getKeyCode()==39){//IZQUIERDA
            if(laberinto[y/40][(x/40)+1]==2){
                JOptionPane.showMessageDialog(null, "MUCHO POR HOY, BYE, BYE");
            System.exit(0);
            }
        }
      if(evento.getKeyCode()==40){//ABAJO
            if(laberinto[(y/40)+1][x/40]==2){
                JOptionPane.showMessageDialog(null, "MUCHO POR HOY, BYE, BYE");
            System.exit(0);
            }
        }
        
        
        
        if(evento.getKeyCode()==37){
            if(laberinto[y/40][(x/40)-1]!=1){
                x=x-movimiento; 
            }    
        }
        if(evento.getKeyCode()==39){//IZQUIERDA
            if(laberinto[y/40][(x/40)+1]!=1){
            x=x+movimiento;
            }
        }
        if(evento.getKeyCode()==38){
            if(laberinto[(y/40)-1][x/40]!=1){
            y=y-movimiento;
            }
        }
        if(evento.getKeyCode()==40){//ABAJO
            if(laberinto[(y/40)+1][x/40]!=1){
            y=y+movimiento;
            }
        }
       
        
    }
    
}
 
    

