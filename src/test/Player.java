package test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class Player implements KeyListener{
	
	ImageView character;
    private boolean up,
    down,
    left,
    right;
    
    public static final int SPEED = 5;
    private int vX, // velocity x
                vY, // vel y
                x,  // pos x
                y;  // pos y
    
	public Player(ImageView character) {
		this.character = character;
		x = (int) character.getTranslateX();
		y = (int) character.getTranslateY();
		System.out.println(x);
		System.out.println(y);
	}
	
    public void go() {
        x += vX;
        y += vY;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        // etc...
    }
    
    private void update() {
	    vX = 0;
	    vY = 0;
	    if(down) vY = SPEED;
	    if(up) vY = -SPEED;
	    if(left) vX = -SPEED;
	    if(right) vX = SPEED;
	}
	@Override
	public void keyPressed(KeyEvent e) {
	    switch(e.getKeyCode()) {
	        case KeyEvent.VK_DOWN: down = true; 
	        System.out.println("GO LEFT");
	        break;
	        case KeyEvent.VK_UP: up = true;
	        System.out.println("GO LEFT");
	        break;
	        case KeyEvent.VK_LEFT: left = true; 
	        System.out.println("GO LEFT");
	        break;
	        case KeyEvent.VK_RIGHT: right = true; 
	        System.out.println("GO LEFT");
	        break;
	    }
	    update();
	}
	
	   public void keyReleased(KeyEvent e) {
			switch(e.getKeyCode()) {
			    case KeyEvent.VK_DOWN: down = false; 
			    System.out.println("GO LEFT");
			    break;
			    case KeyEvent.VK_UP: up = false; 
			    System.out.println("GO LEFT");
			    break;
			    case KeyEvent.VK_LEFT: left = false;
			    System.out.println("GO LEFT");
			    break;
			    case KeyEvent.VK_RIGHT: right = false; 
			    System.out.println("GO LEFT");
			    break;
			}
			update();
	
	   }

	

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
