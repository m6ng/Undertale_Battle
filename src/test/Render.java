/**

package test;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class Render {
	
	final Duration oneFrameAmt = Duration.millis(1000/60);
	final KeyFrame oneFrame = new KeyFrame(oneFrameAmt,
	   new EventHandler() {
	 
	   @Override
	   public void handle(javafx.event.ActionEvent event) {
	 
	      // update actors
	      updateSprites();
	 
	      // check for collision
	      checkCollisions();
	 
	      // removed dead things
	      cleanupSprites();
	 
	   }
	}); // oneFrame
	 
	// sets the game world's game loop (Timeline)
	

}
**/
