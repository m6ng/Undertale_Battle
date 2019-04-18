package test;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyCode;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.AnimationTimer;
import javafx.animation.TimelineBuilder;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameText {
	public static String line;
	public Text gameTextConverted;
	
	GameText(String line, int size) {
		Text placeHolder = new Text(line);
		gameTextConverted = placeHolder;
		//String conversion  = new String("*   " + line);
		//System.out.print(conversion);
		//gameTextConverted.setText(conversion);
		gameTextConverted.setFont(Font.loadFont ("file:src/test/8bitoperator_jve.ttf", size));
		gameTextConverted.setFill(Color.WHITE);
		gameTextConverted.relocate(100, 345);
	}
	
	
	public void printGameText() {
		//for(int currentChar = 0; currentChar < lineArray.length; currentChar= currentChar+2){
			//System.out.println(Arrays.copyOfRange(lineArray, currentChar, currentChar+2));
		
		
	}
	
	public Text getGameText() {
		return gameTextConverted;
	}
	
	public Text[] separateAndReturn(String line) {
		Text[] textArray = new Text[line.length()];
			for(int x = 0; x < line.length(); x++){
				Text placeHolderText = new Text(line.substring(x));
				textArray[x] = placeHolderText;
			}
		return textArray;
		
	}
	
	
}


