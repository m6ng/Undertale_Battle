



//CLICK RUN, AND THEN USE MOUSE TO PROGRESS DIALOGUE AND ARROW KEYS TO CONTROL
//HEART

//IF IT'S AT THE GAME OVER SCREEN, CLOSE WINDOW OUT AND THEN RUN AGAIN AND CLICK
//SCREEN


//IT TAKES A WHILE TO LOAD!!!!!





















package test;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyCode;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.AnimationTimer;
import javafx.animation.FadeTransition;
import javafx.animation.TimelineBuilder;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
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
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;


import javafx.scene.paint.Paint;


public class Fight extends Application implements EventHandler<ActionEvent>, KeyListener {
	
	Text bt2;
	Text bt3;
	String b2;
	
	Scene selection;
	Stage primaryStage = new Stage();
	
	//Sound effects
	String path3 = new String("src/test/damagetaken.wav");
	File audio = new File(path3);
	AudioClip damageTaken = new AudioClip(audio.toURI().toString());
	
	String path4 = new String("src/test/battlestart.wav");
	File audio2 = new File(path4);
	AudioClip battleStartAu = new AudioClip(audio2.toURI().toString());
	
	String path5 = new String("src/test/mettatonSound2.wav");
	File audio3 = new File(path5);
	AudioClip mettatonSpeakAu = new AudioClip(audio3.toURI().toString());
	
	String path6 = new String("src/test/alphys.wav");
	File audio4 = new File(path6);
	AudioClip alphysSpeakAu = new AudioClip(audio4.toURI().toString());
	
	String path7 = new String("src/test/normaltext.wav");
	File audio5 = new File(path7);
	AudioClip normalSpeakAu = new AudioClip(audio5.toURI().toString());
	
	String path8 = new String("src/test/click.wav");
	File audio6 = new File(path8);
	AudioClip click = new AudioClip(audio6.toURI().toString());
	
	String path9 = new String("src/test/falling.wav");
	File audio7 = new File(path9);
	AudioClip fall = new AudioClip(audio7.toURI().toString());
	
	String path10 = new String("src/test/deluxeitem.wav");
	File audio8 = new File(path10);
	AudioClip deluxeitem = new AudioClip(audio8.toURI().toString());
	
	String path11 = new String("src/test/heartbreak.wav");
	File audio9 = new File(path11);
	AudioClip heartbreak1 = new AudioClip(audio9.toURI().toString());
	
	String path12 = new String("src/test/heartbreak2.wav");
	File audio10 = new File(path12);
	AudioClip heartbreak2 = new AudioClip(audio10.toURI().toString());
	
	String path13 = new String("src/test/asgore.wav");
	File audio11 = new File(path13);
	AudioClip asgoreSpeakAu = new AudioClip(audio11.toURI().toString());
	
	String path14 = new String("src/test/tem4.wav");
	File audio12 = new File(path14);
	AudioClip temSpeakAu = new AudioClip(audio12.toURI().toString());
	
	String path15 = new String("src/test/fanfare.wav");
	File audio13 = new File(path15);
	AudioClip fanfare = new AudioClip(audio13.toURI().toString());
	
	String path16 = new String("src/test/ohmy.mp3");
	File audio14 = new File(path16);
	AudioClip ohmy = new AudioClip(audio14.toURI().toString());
	
	String path17 = new String("src/test/death.mp3");
	File audio15 = new File(path17);
	//AudioClip death = new AudioClip(audio15.toURI().toString());
	
	String path18 = new String("src/test/mettatonEXappears.wav");
	File audio16 = new File(path18);
	AudioClip appear = new AudioClip(audio16.toURI().toString());
	
	
	//Music
	String mediaPath = new String("src/test/metalcrusher.mp3");
	Media media = new Media(new File(mediaPath).toURI().toString());
	String mediaPath2 = new String("src/test/showtime.mp3");
	Media media2 = new Media(new File(mediaPath2).toURI().toString());
	String mediaPath3 = new String("src/test/determination.mp3");
	Media media3 = new Media(new File(mediaPath3).toURI().toString());
	String mediaPath4 = new String("src/test/tem.mp3");
	Media media4 = new Media(new File(mediaPath4).toURI().toString());
	String mediaPath5 = new String("src/test/end1.mp3");
	Media media5 = new Media(new File(mediaPath5).toURI().toString());
	String mediaPath6 = new String("src/test/end2.mp3");
	Media media6 = new Media(new File(mediaPath6).toURI().toString());
	String mediaPath7 = new String("src/test/ohmy.mp3");
	Media media7 = new Media(new File(mediaPath7).toURI().toString());
	String mediaPath8 = new String("src/test/death.mp3");
	Media media8 = new Media(new File(mediaPath8).toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(media);
	MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
	MediaPlayer mediaPlayer3 = new MediaPlayer(media3);
	MediaPlayer mediaPlayer4 = new MediaPlayer(media4);
	MediaPlayer mediaPlayer5 = new MediaPlayer(media5);
	MediaPlayer mediaPlayer6 = new MediaPlayer(media6);
	MediaPlayer death = new MediaPlayer(media8);

	
	

	public Timeline timeline = new Timeline();
	public Timeline timeline2 = new Timeline();
	public Timeline timeline3 = new Timeline();
	public Timeline timeline4 = new Timeline();
	public Timeline timeline5 = new Timeline();
	public Timeline timeline6 = new Timeline();
	public boolean isBombAttack = false;
	public int chance;
	public int CLICKS = 1;
	public int ENDCLICKS = 0;
	public int PRECLICKS = 0;
	public boolean fightClicked = false;
	public int actClicked = 0;
	public double WIDTH = 50;
	public static boolean UP, DOWN, LEFT, RIGHT;
	public boolean invulnerability = false;
	public int invulnTimeLeft = 0;
	private int vX, vY;
	public static final int SPEED = 2;
	public int imageX = 0;
	public int imageY = 0;
	public int HEALTH = 20;
	public boolean isInvincible = false;
	public int invincibilityTimeLeft = 0;
	static final int INVINCIBILITY_TIME = 400;
	public Text healthText = new Text(HEALTH + "  /  " + 20);
	public Text healthText2 = new Text(HEALTH + "  /  " + 20);
	//public Text d1 = new Text("*   Mettaton attacks!");
	
	Rectangle REDBOX = new Rectangle(350, 500, 50, 25);
	Rectangle YELLOWBOX = new Rectangle(350, 500, 50, 25);
	Rectangle REDBOX2 = new Rectangle(350, 500, 50, 25);
	Rectangle YELLOWBOX2 = new Rectangle(350, 500, 50, 25);
	
	final static Image OPENBG = new Image ("test/black.png");
	final static Image ALPHYS = new Image ("test/alphyssmaller.png");
	final static Image mettaton = new Image ("test/Mettaton.gif");
	final static Image BATTLEBG = new Image ("test/battleboxredux2.png");
	final static Image SELECTIONBG = new Image ("test/selectionbg.png");
	final static Image METTATONAPPEAR = new Image ("test/mettatonappear.gif");
	final static Image METTATONEX = new Image("test/MettatonEX.gif");
	final static Image METTATONEXDANCING = new Image ("test/mettatondancing.gif");
	final static Image GAMEOVER = new Image ("test/gameoverScreen.png");
	final static Image LINEHORI = new Image ("test/horizLine.png");
	final static Image LINEVERT = new Image ("test/verticLine.png");
	final static Image BOX = new Image ("test/box.png");
	final static Image FRISK = new Image("test/heart.png");
	final static Image ADAM = new Image("test/adamcropped.png");
	final static Image PETER = new Image("test/peterborder.png");
	final static Image TEMMIE = new Image("test/temmie.png");
	final static Image PRESELECTIONBG = new Image("test/preselectionbg.png");
	final static ImageView preSelectionBackground = new ImageView(PRESELECTIONBG);
	final static ImageView FRISK2 = new ImageView(FRISK);
	
	final static Image BOMB = new Image("test/bombtransparent.png");
	final static Image METTAMINI = new Image("test/metaminitransparentthird.png");
	final static Image LEG = new Image("test/legtransparentthird.png");
	
	final static Image FIGHT = new Image ("test/fight.png");
	final static Image ACT = new Image ("test/act.png");
	final static Image ITEM = new Image ("test/item.png");
	final static Image MERCY = new Image ("test/mercy.png");

	final static Image FIGHTL = new Image ("test/fighthighlight.png");
	final static Image ACTL = new Image ("test/acthighlight.png");
	final static Image ITEML = new Image ("test/itemhighlight.png");
	final static Image MERCYL = new Image ("test/mercyhighlight.png");
	
	@Override
	public void start(Stage notStage) throws IOException, InterruptedException {
		
		Random rand = new Random();
		chance = 0;
		
		death.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer6.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer4.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer3.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer2.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		
		String s1 = "QUIZ TIME!";
		GameText opg1 = new GameText("", 37);
		Text op1 = opg1.getGameText();
		op1.relocate(100, 150);
		
		String s2 = "HOW IS IT THAT A STAR LIKE ME COMES TO GRACE YOUR EXISTENCE?";
		GameText opg2 = new GameText("", 37);
		Text op2 = opg2.getGameText();
		op2.relocate(100, 150);
		
		String s3 = "THAT'S RIGHT! PROGRAMMING! AND ALPHYS WAS AN INCREDIBLE "
				+ "STUDENT BACK IN HER COLLEGE DAYS.";
		GameText opg3 = new GameText("", 37);
		Text op3 = opg3.getGameText();
		op3.relocate(100, 150);
		
		String s4 = "I-I'm self taught..";
		GameText opg4 = new GameText("", 20);
		Text op4 = opg4.getGameText();
		op4.relocate(150, 100);
		
		String s5 = "NOW LET'S SEE HOW THINGS GO WHEN ALPHYS ISN'T THE ONE "
				+ "BEHIND THE WHEEL.";
		GameText opg5 = new GameText("", 37);
		Text op5 = opg5.getGameText();
		op5.relocate(100, 150);
		
		String s6 = "DOES THE AUDIENCE TRUST EACH AND EVERY KEYSTROKE? CAN I "
				+ "BE TRULY EMULATED IN ALL MY BEAUTY?";
		GameText opg6 = new GameText("", 37);
		Text op6 = opg6.getGameText();
		op6.relocate(100, 150);
		
		String s7 = "TIME TO TEST IT OUT!";
		GameText opg7 = new GameText("", 37);
		Text op7 = opg7.getGameText();
		op7.relocate(100, 150);
		
		String s7c = "*   Mmm...";
		GameText opg7c = new GameText("", 37);
		Text op7c = opg7c.getGameText();
		op7c.relocate(100, 345);
		
		String s7d = "*   SHOWTIME!";
		GameText opg7d = new GameText("", 37);
		Text op7d = opg7d.getGameText();
		op7d.relocate(100, 345);
		
		String s8 = "You cannot give up just yet...";
		GameText opg8 = new GameText("", 37);
		Text op8 = opg8.getGameText();
		op8.relocate(210, 400);
		
		String s9 = "Frisk! Stay determined...";
		GameText opg9 = new GameText("", 37);
		Text op9 = opg9.getGameText();
		op9.relocate(210, 400);
		
		String s10 = "hOI!!! human DONT giv up!! (pets u)";
		GameText opg10 = new GameText("", 37);
		Text op10 = opg10.getGameText();
		
		String s11 = "determin..........";
		GameText opg11 = new GameText("", 37);
		Text op11 = opg11.getGameText();
		
		String s13a = "...";
		GameText opg13a = new GameText("", 37);
		Text op13a = opg13a.getGameText();
		op13a.relocate(100, 150);
		
		//TO BE IMPLEMENTED
		String s13 = "YOU PASS!";
		GameText opg13 = new GameText("YOU PASS!", 37);
		Text op13 = opg13.getGameText();
		op13.relocate(100, 150);
		
		String s14 = "Looks like all went smoothly, wouldn't you say? ";
		GameText opg14 = new GameText("", 37);
		Text op14 = opg14.getGameText();
		op14.relocate(100, 150);
		
		String s14a = "Good to know that the world can still hold up even if Alphys "
				+ "isn't the one programming it.";
		GameText opg14a = new GameText("", 37);
		Text op14a = opg14a.getGameText();
		op14a.relocate(100, 150);
		
		String s15 = "We've reached the end of our dance now. Join me on the "
				+ "stage again some time darling!";
		GameText opg15 = new GameText("", 37);
		Text op15 = opg15.getGameText();
		op15.relocate(100, 150);
		
		//flavor text
		String s16 = "Work the crowd dear, work the crowd!";
		GameText opg16 = new GameText("", 37);
		Text op16 = opg16.getGameText();
		op16.relocate(100, 150);
		
		String s17 = "My turn!";
		GameText opg17 = new GameText("", 37);
		Text op17 = opg17.getGameText();
		op17.relocate(100, 150);
		
		String s18 = "Can this cup of java handle me?";
		GameText opg18 = new GameText("", 37);
		Text op18 = opg18.getGameText();
		op18.relocate(100, 150);
		
		//TO BE IMPLEMENTED
		//b for battle, bt for battle text
		String b1 = "*   Mettaton attacks!";
		GameText bg1 = new GameText("", 37);
		Text bt1 = bg1.getGameText();
		
		String b4 = "*   Mettaton is looking for an exception.";
		GameText bg4 = new GameText("", 37);
		Text bt4 = bg4.getGameText();
		
		String b5 = "*   Mettaton realizes there's a programming assignment due. "
				+ "Panic.";
		GameText bg5 = new GameText("", 37);
		Text bt5 = bg5.getGameText();
		
		String b6 = "*   Mettaton winks at you.";
		GameText bg6 = new GameText("", 37);
		Text bt6 = bg6.getGameText();
		
		b2 = "*   His devilishly good looks render him invulnerable to attack!";
		GameText bg2 = new GameText("", 37);
		bt2 = bg2.getGameText();
		
		op1.setWrappingWidth(600);
		op2.setWrappingWidth(600);
		op3.setWrappingWidth(600);
		op4.setWrappingWidth(600);
		op5.setWrappingWidth(600);
		op6.setWrappingWidth(600);
		op7.setWrappingWidth(600);
		op13a.setWrappingWidth(600);
		op13.setWrappingWidth(600);
		op14.setWrappingWidth(600);
		op14a.setWrappingWidth(600);
		op15.setWrappingWidth(600);
		op1.setTextAlignment(TextAlignment.CENTER);
		op2.setTextAlignment(TextAlignment.CENTER);
		op3.setTextAlignment(TextAlignment.CENTER);
		op4.setTextAlignment(TextAlignment.LEFT);
		op5.setTextAlignment(TextAlignment.CENTER);
		op6.setTextAlignment(TextAlignment.CENTER);
		op7.setTextAlignment(TextAlignment.CENTER);
		op13a.setTextAlignment(TextAlignment.CENTER);
		op13.setTextAlignment(TextAlignment.CENTER);
		op14.setTextAlignment(TextAlignment.CENTER);
		op14a.setTextAlignment(TextAlignment.CENTER);
		op15.setTextAlignment(TextAlignment.CENTER);
		
		bt2.setWrappingWidth(600);
		
		GameText b3 = new GameText("*   Mettaton", 37);
		bt3 = b3.getGameText();
		bt3.setId("battle1");
		
		GameText act1 = new GameText("*   Check", 37);
		Text actb1 = act1.getGameText();
		actb1.setId("check1");
		
		String act2 = "*   METTATON 8 ATK 1 DEF";
		GameText actg2 = new GameText("", 37);
		Text actb2 = actg2.getGameText();
		
		GameText item1 = new GameText("*   Glamburger", 37);
		Text itemb1 = item1.getGameText();
		itemb1.setId("item1");
		
		String item2 = "*   You eat the Glamburger. Health maxed out!";
		GameText itemg2 = new GameText("", 37);
		Text itemb2 = itemg2.getGameText();
		
		String item3 = "*   You feel a little like garbage, but the good kind "
				+ "of garbage.";
		GameText itemg3 = new GameText("", 37);
		Text itemb3 = itemg3.getGameText();
		
		String item4 = "*   Your HP was maxed out.";
		GameText itemg4 = new GameText("", 37);
		Text itemb4 = itemg4.getGameText();
		
		GameText item5 = new GameText("*   No items!", 37);
		Text itemb5 = item1.getGameText();
		itemb5.setId("item2");
		
		GameText mercy1 = new GameText("*   Spare", 37);
		Text mercyb1 = mercy1.getGameText();
		mercyb1.setId("mercy1");
		
		String mercy2 = "*   Mettaton laughs and pets your head.";
		GameText mercyg2 = new GameText("", 37);
		Text mercyb2 = mercyg2.getGameText();
		
		//GameText act2 = new GameText("*   Cry", 37);
		//Text actb2 = act2.getGameText();
		
		YELLOWBOX.setStroke(Color.YELLOW);
		YELLOWBOX.setFill(Color.YELLOW);
		REDBOX.setStroke(Color.RED);
		REDBOX.setFill(Color.RED);
		
		YELLOWBOX2.setStroke(Color.YELLOW);
		YELLOWBOX2.setFill(Color.YELLOW);
		REDBOX2.setStroke(Color.RED);
		REDBOX2.setFill(Color.RED);
		
		
		Thread thread2 = new Thread();
		healthText.setFont(Font.loadFont ("file:src/test/8bitoperator_jve.ttf", 37));
		healthText.setFill(Color.WHITE);
		healthText.relocate(433,491);
		
		healthText2.setFont(Font.loadFont ("file:src/test/8bitoperator_jve.ttf", 37));
		healthText2.setFill(Color.WHITE);
		healthText2.relocate(433,491);

		ToggleButton fightButton = new ToggleButton();
		fightButton.setId("btn-fight");
		ToggleButton actButton = new ToggleButton();
		actButton.setId("btn-act");
		ToggleButton itemButton = new ToggleButton();
		itemButton.setId("btn-item");
		ToggleButton mercyButton = new ToggleButton();
		mercyButton.setId("btn-mercy");
		
		fightButton.setTranslateX(40);
		fightButton.setTranslateY(535);
		actButton.setTranslateX(230);
		actButton.setTranslateY(535);
		itemButton.setTranslateX(435);
		itemButton.setTranslateY(535);
		mercyButton.setTranslateX(625);
		mercyButton.setTranslateY(535);
		
		final ImageView alphysSprite = new ImageView(ALPHYS);
		alphysSprite.relocate(-200, 0);
		final ImageView mettatonEXSprite = new ImageView(METTATONEX);
		final ImageView mettatonEXSprite2 = new ImageView(METTATONEX);
		final ImageView mettatonAppear = new ImageView(METTATONAPPEAR);
		final ImageView mettatonSprite = new ImageView(mettaton);
		final ImageView mettatonSprite2 = new ImageView(mettaton);
		final ImageView mettatonSprite3 = new ImageView(mettaton);
		final ImageView mettatonSprite4 = new ImageView(METTATONEX);
		final ImageView player = new ImageView(FRISK);
		final ImageView adamSprite = new ImageView(ADAM);
		final ImageView peterSprite = new ImageView(PETER);
		final ImageView temSprite = new ImageView(TEMMIE);
		adamSprite.relocate(120, 388);
		peterSprite.relocate(120, 388);
		temSprite.relocate(120, 388);
		mettatonSprite3.relocate(300, -100);
		mettatonSprite4.relocate(-100, 300);
		mettatonAppear.relocate(70, 40);
		
		//alphySprite.relocate()
		FRISK2.relocate(388, 375);

		mettatonSprite.relocate(300,40);
		mettatonSprite2.relocate(300,40);
		mettatonEXSprite.relocate(300, 40);
		mettatonEXSprite2.relocate(300, 40);
		//mettatonSprite.setTranslateY(100);
		final ImageView blackImage = new ImageView(OPENBG);
		final ImageView openingBackground = new ImageView(OPENBG);
		final ImageView closingBackground = new ImageView(OPENBG);
		final ImageView selectionBackground = new ImageView(SELECTIONBG);
		final ImageView battleBackground = new ImageView(BATTLEBG);
		final ImageView battleBox = new ImageView(BOX);
		final ImageView gameOverScreen = new ImageView(GAMEOVER);
		final ImageView verticalLine1 = new ImageView(LINEVERT);
		final ImageView horizontalLine1 = new ImageView(LINEHORI);
		final ImageView verticalLine2 = new ImageView(LINEVERT);
		final ImageView horizontalLine2 = new ImageView(LINEHORI);
		final ImageView bombSprite = new ImageView(BOMB);
		final ImageView bombSprite2 = new ImageView(BOMB);
		final ImageView bombSprite3 = new ImageView(BOMB);
		final ImageView bombSprite4 = new ImageView(BOMB);
		final ImageView bombSprite5 = new ImageView(BOMB);
		final ImageView bombSprite6 = new ImageView(BOMB);
		final ImageView legSprite = new ImageView(LEG);
		final ImageView mettaminiSprite = new ImageView(METTAMINI);
		bombSprite.relocate(388, 0);
		bombSprite2.relocate(368, 3);
		bombSprite3.relocate(398, 4);
		bombSprite4.relocate(358, 2);
		bombSprite5.relocate(408, 7);
		bombSprite6.relocate(377, 2);
		
		//battleBox.relocate(268, 265);
		verticalLine1.relocate(268, 265);
		verticalLine2.relocate(268 + 264, 265);
		horizontalLine1.relocate(268, 265);
		horizontalLine2.relocate(268, 265 + 216);
		//battleBox.setTranslateY(265);
		
		//Player friskSprite = new Player (FRISK2);
	
		timeline.setCycleCount(1);
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.2), 
				new KeyValue(mettatonEXSprite.xProperty(), 200 )));
		timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), 
				new KeyValue(mettatonEXSprite.xProperty(), 0 )));
		//timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.7), 
				//new KeyValue(bombSprite.yProperty(), 600 )));
		
		//timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1.2), 
				//new KeyValue(bombSprite2.yProperty(), 600 )));
		//timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.2), 
				//new KeyValue(bombSprite3.yProperty(), 600 )));
		//timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), 
				//new KeyValue(bombSprite4.yProperty(), 600 )));
		
		timeline2.setCycleCount(1);
		timeline2.getKeyFrames().add(new KeyFrame(Duration.seconds(1.5), 
				new KeyValue(alphysSprite.xProperty(), 200 )));
		
		timeline3.setCycleCount(1);
		timeline3.getKeyFrames().add(new KeyFrame(Duration.seconds(0.75), 
				new KeyValue(mettatonSprite3.yProperty(), 400 )));
		timeline3.getKeyFrames().add(new KeyFrame(Duration.seconds(0.5), 
				new KeyValue(mettatonSprite3.yProperty(), 370 )));
		timeline3.getKeyFrames().add(new KeyFrame(Duration.seconds(0.25), 
				new KeyValue(mettatonSprite3.yProperty(), 400 )));
		timeline3.getKeyFrames().add(new KeyFrame(Duration.seconds(0.20), 
				new KeyValue(mettatonSprite3.yProperty(), 380 )));
		timeline3.getKeyFrames().add(new KeyFrame(Duration.seconds(0.15), 
				new KeyValue(mettatonSprite3.yProperty(), 400 )));
		
		timeline4.setCycleCount(1);
		timeline4.getKeyFrames().add(new KeyFrame(Duration.seconds(1), 
				new KeyValue(alphysSprite.xProperty(), -400 )));
		
		timeline5.setCycleCount(1);
		timeline5.getKeyFrames().add(new KeyFrame(Duration.seconds(1.5), 
				new KeyValue(alphysSprite.xProperty(), 100 )));
		
		timeline6.setCycleCount(1);
		timeline6.getKeyFrames().add(new KeyFrame(Duration.seconds(4), 
				new KeyValue(mettatonSprite4.xProperty(), 400 )));
		//timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(3), 
		//		new KeyValue(mettatonSprite.xProperty(), 0)));
		
		//timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(1), 
				//new KeyValue(bombSprite.yProperty(), 600 )));
		
		//use timeline to animate objects + object detection for health drops, projectiles
		//use new scene as cutscene plus game over 
		
		final Group blackGroup = new Group(blackImage);
		final Group openingGroup = new Group(openingBackground);
		final Group openingForeground = new Group(mettatonSprite3);
		final Group openingText = new Group(op1, op2, op3, op4, op5, op6, op7);
		final Group gameOverGroup = new Group(gameOverScreen, op8, op9, op10, op11);
		final Group projectileGroup = new Group(bombSprite, bombSprite2, bombSprite3, bombSprite4, bombSprite5, bombSprite6);
		final Group textGroupBattle = new Group(healthText);
		final Group textGroupSelection = new Group(bt1, bt2, actb2, itemb2,mercyb2, healthText2);
		final Group heartBounds = new Group(verticalLine1, horizontalLine1, verticalLine2, horizontalLine2);
		final Group buttonGroup = new Group(fightButton, actButton, itemButton, mercyButton);
		final Group playerGroup = new Group(FRISK2);
		final Group foregroundBattle = new Group(REDBOX, YELLOWBOX);
		final Group foregroundSelection = new Group(mettatonEXSprite2, REDBOX2, YELLOWBOX2);
		final Group selectionBackgroundGroup = new Group(selectionBackground);
		final Group preSelectionBackgroundGroup = new Group(preSelectionBackground, mettatonAppear);
		final Group preSelectionTextGroup = new Group(op7c, op7d);
		final Group endGroup = new Group(closingBackground, mettatonSprite4);
		final Group endTextGroup = new Group(op14, op14a, op15);
		
		
		final Group blackRoot = new Group(blackGroup);
		final Group openingRoot = new Group(openingGroup, openingForeground, openingText);
		final Group battleRoot = new Group(battleBackground, foregroundBattle, playerGroup, buttonGroup, heartBounds, textGroupBattle);
		final Group gameOverRoot = new Group(gameOverGroup);
		final Group preSelectionRoot = new Group(preSelectionBackgroundGroup, preSelectionTextGroup );
		final Group selectionRoot = new Group(selectionBackgroundGroup, foregroundSelection, buttonGroup, textGroupSelection);
		final Group endRoot = new Group(endGroup, endTextGroup);
		
        primaryStage.setTitle("UNDERTALE");
        Scene black = new Scene(blackRoot, 800, 600);
        Scene opening = new Scene(openingRoot, 800, 600);
        //Scene opening2 = new Scene(openingRoot, 788, 588);
        selection = new Scene(selectionRoot, 800, 600);
        Scene preSelection = new Scene(preSelectionRoot, 800, 600);
        Scene battle = new Scene(battleRoot, 800,600);
        Scene gameOverScene = new Scene(gameOverRoot, 800, 600);
        Scene endScene = new Scene(endRoot, 800, 600);
        
        opening.getStylesheets().addAll("test/test4.css");
        battle.getStylesheets().addAll("test/test4.css");
        selection.getStylesheets().addAll("test/test4.css");
        ///timeline.setOnFinished( e -> {
        //primaryStage.setScene(selection);
        //timeline.stop();
        //});   
        
    	FadeTransition ft = new FadeTransition(Duration.millis(1500), 
	   			 gameOverScreen);
    	ft.setFromValue(0);
    	ft.setToValue(1);
    	ft.setCycleCount(1);
    	ft.setAutoReverse(false);
        
    	 Animation mettatonTransform = new Transition() {
             {
                 setCycleDuration(Duration.millis(800));
             }
         
             protected void interpolate(double frac) {
            	mettatonSpeakAu.play();
            	final int length = s7c.length();
                final int n = Math.round(length * (float) frac);
                op7c.setText(s7c.substring(0, n));
             }
           
         };
         
         Animation mettatonTransform2 = new Transition() {
             {
                 setCycleDuration(Duration.millis(800));
             }
         
             protected void interpolate(double frac) {
            	mettatonSpeakAu.play();
            	final int length = s7d.length();
                final int n = Math.round(length * (float) frac);
                op7d.setText(s7d.substring(0, n));
             }
           
         };
    	
        Animation endText1 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = s13a.length();
                final int n = Math.round(length * (float) frac);
                op13a.setText(s13a.substring(0, n));
            }
          
        };
        
        Animation endText2 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = s13.length();
                final int n = Math.round(length * (float) frac);
                op13.setText(s13.substring(0, n));
            }
          
        };
        
        Animation endText3 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = s14.length();
                final int n = Math.round(length * (float) frac);
                op14.setText(s14.substring(0, n));
            }
          
        };
        
        Animation endText3a = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = s14a.length();
                final int n = Math.round(length * (float) frac);
                op14a.setText(s14a.substring(0, n));
            }
          
        };
        
        Animation endText4 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = s15.length();
                final int n = Math.round(length * (float) frac);
                op15.setText(s15.substring(0, n));
            }
          
        };
    	
        Animation battleText1 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = b1.length();
                final int n = Math.round(length * (float) frac);
                bt1.setText(b1.substring(0, n));
                //selection.setOnMouseClicked(e2 -> {
            		//primaryStage.setScene(battle);
            		//fightButton.setDisable(false);
            	//	fightClicked = false;
            	//}); 
            }
          
        };
        
        //glamburger problem
        Animation fightText1 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = b2.length();
                final int n = Math.round(length * (float) frac);
                bt2.setText(b2.substring(0, n));
                selection.setOnMouseClicked(e2 -> {
            		primaryStage.setScene(Attack(battle));
            		//stop();
            		b2 = "";
            		//textGroupSelection.getChildren().remove(bt2);
            		//textGroupSelection.getChildren().add(bt2);
            		timeline.play();
            		setEnableFour(fightButton, actButton, itemButton, mercyButton);
            	}); 
            }
          
        };
        
        
        Animation actText1 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = act2.length();
                final int n = Math.round(length * (float) frac);
                actb2.setText(act2.substring(0, n));
                selection.setOnMouseClicked(e2 -> {
                	//fanfare.play();
                	//mediaPlayer6.play();
            		//primaryStage.setScene(endScene);
            		//endTextGroup.getChildren().add(op13);
            		//timeline6.play();
                	primaryStage.setScene(Attack(battle));
                	setEnableFour(fightButton, actButton, itemButton, mercyButton);
            	}); 
            }
          
        };
        
        Animation itemText1 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = item2.length();
                final int n = Math.round(length * (float) frac);
                itemb2.setText(item2.substring(0, n));
                selection.setOnMouseClicked(e2 -> {
            		primaryStage.setScene(Attack(battle));
            		setEnableFour(fightButton, actButton, itemButton, mercyButton);
            	}); 
            }
          
        };
        
        Animation mercyText1 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
            	normalSpeakAu.play();
            	final int length = mercy2.length();
                final int n = Math.round(length * (float) frac);
                mercyb2.setText(mercy2.substring(0, n));
                selection.setOnMouseClicked(e2 -> {
            		primaryStage.setScene(Attack(battle));
            		setEnableFour(fightButton, actButton, itemButton, mercyButton);
            	}); 
            }
          
        };
        
        Animation animation2 = new Transition() {
            {
                setCycleDuration(Duration.millis(500));
            }
        
            protected void interpolate(double frac) {
            	mettatonSpeakAu.play();
            	final int length = s1.length();
                final int n = Math.round(length * (float) frac);
                op1.setText(s1.substring(0, n));
                //System.out.println(op1);
                /**
                if(n > frac ){
                	mettatonSpeakAu.play();
                }
                **/
            }
          
        };
        
        Animation animation3 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
                mettatonSpeakAu.play();
                final int length = s2.length();
                final int n = Math.round(length * (float) frac);
                op2.setText(s2.substring(0, n));
            }
          
        };
        
        Animation animation4 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
                mettatonSpeakAu.play();
                final int length = s3.length();
                final int n = Math.round(length * (float) frac);
                op3.setText(s3.substring(0, n));
            }
          
        };
        
        Animation animation5 = new Transition() {
            {
                setCycleDuration(Duration.millis(1000));
            }
        
            protected void interpolate(double frac) {
                alphysSpeakAu.play();
                final int length = s4.length();
                final int n = Math.round(length * (float) frac);
                op4.setText(s4.substring(0, n));
            }
          
        };
        
        Animation animation6 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
                mettatonSpeakAu.play();
                final int length = s5.length();
                final int n = Math.round(length * (float) frac);
                op5.setText(s5.substring(0, n));
            }
          
        };
        
        Animation animation7 = new Transition() {
            {
                setCycleDuration(Duration.millis(800));
            }
        
            protected void interpolate(double frac) {
                mettatonSpeakAu.play();
                final int length = s6.length();
                final int n = Math.round(length * (float) frac);
                op6.setText(s6.substring(0, n));
            }
          
        };
        
        Animation animation8 = new Transition() {
            {
                setCycleDuration(Duration.millis(1500));
            }
        
            protected void interpolate(double frac) {
                mettatonSpeakAu.play();
                final int length = s7.length();
                final int n = Math.round(length * (float) frac);
                op7.setText(s7.substring(0, n));
            }
          
        };
        
        animation3.setAutoReverse(true);
        animation4.setAutoReverse(true);
        animation5.setAutoReverse(true);
        animation6.setAutoReverse(true);
        animation7.setAutoReverse(true);
        animation8.setAutoReverse(true);
 
        
        
        Animation animationGameOver = new Transition() {
            {
                setCycleDuration(Duration.millis(3000));
            }
        
            protected void interpolate(double frac) {
            	asgoreSpeakAu.play();
                final int length = s8.length();
                final int n = Math.round(length * (float) frac);
                op8.setText(s8.substring(0, n));
            }
          
        };
        
         Animation animationGameOver2 = new Transition() {
            {
                setCycleDuration(Duration.millis(3000));
            }
        
            protected void interpolate(double frac) {
            	asgoreSpeakAu.play();
                final int length = s9.length();
                final int n = Math.round(length * (float) frac);
                op9.setText(s9.substring(0, n));
                //gameOverScene.setOnMouseClicked(e -> {
                	//primaryStage.setScene(opening);
                	//CLICKS = 0;
                //});
            }
          
        };
        
        Animation animationGameOver3 = new Transition() {
            {
                setCycleDuration(Duration.millis(1000));
            }
        
            protected void interpolate(double frac) {
            	temSpeakAu.play();
                final int length = s10.length();
                final int n = Math.round(length * (float) frac);
                op10.setText(s10.substring(0, n));
            }
          
        };
        
        Animation animationGameOver4 = new Transition() {
            {
                setCycleDuration(Duration.millis(1000));
            }
        
            protected void interpolate(double frac) {
            	temSpeakAu.play();
                final int length = s11.length();
                final int n = Math.round(length * (float) frac);
                op11.setText(s11.substring(0, n));
                //gameOverScene.setOnMouseClicked(e -> {
                	//primaryStage.setScene(opening);
                	//CLICKS = 0;
                //});
            }
          
        };
       
        black.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
        	primaryStage.setScene(opening);
        	timeline3.play();
        	animation2.play();
        	mediaPlayer2.play();
        	
        });
        
 
        opening.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
        	CLICKS++;
        	//System.out.println(CLICKS);
        	primaryStage.setScene(opening);
        	switch(CLICKS) {
        		case 2: 
        			openingText.getChildren().remove(op1);
        			animation3.play();
        			break;
        		case 3:
        			animation3.stop();
        			openingText.getChildren().remove(op2);
        			openingText.getChildren().add(alphysSprite);
        			timeline2.play();
        			animation4.play();
        			break;
        		case 4:
        			animation4.stop();
        			openingText.getChildren().remove(op3);
        			animation5.play();
        			break;
        		case 5:
        			animation5.stop();
         			timeline4.play();
        			openingText.getChildren().remove(op4);
        			animation6.play();
        			break;
        		case 6:
        			//alphysSprite.relocate(-200, 0);
        			animation6.stop();
        			timeline5.play();
        			openingText.getChildren().remove(op5);
        			animation7.play();
        			break;
        		case 7:
        			animation7.stop();
        			openingText.getChildren().remove(op6);
        			animation8.play();
        			break;
        		case 8:
        			animation8.stop();
        			openingText.getChildren().remove(alphysSprite);
        			openingText.getChildren().remove(op7);
        			openingText.getChildren().addAll(op1, op2, op3, op4, op5, op6, op7);
        			setTextToBlank(op1);
        			setTextToBlank(op2);
        			setTextToBlank(op3);
        			setTextToBlank(op4);
        			setTextToBlank(op5);
        			setTextToBlank(op6);
        			setTextToBlank(op7);
        			mediaPlayer2.stop();
        			if(HEALTH > 0 ){
        			primaryStage.setScene(preSelection);}
        			battleStartAu.play();
        			ohmy.setPriority(1);
        			ohmy.play();
        			mettatonTransform.play();
        		 	setDisableFour(fightButton, actButton, itemButton, mercyButton);
        			preSelection.addEventFilter(MouseEvent.MOUSE_CLICKED, e2 -> {
        				PRECLICKS++;
        				switch (PRECLICKS) {
        					case 1:
        						ohmy.stop();
		        				death.play();
		        				appear.play();
		        				mettatonTransform2.play();
		        				setEnableFour(fightButton, actButton, itemButton, mercyButton);
		        				preSelectionTextGroup.getChildren().remove(op7c);
		                    	preSelectionBackgroundGroup.getChildren().remove(mettatonAppear);
		                    	preSelectionBackgroundGroup.getChildren().add(mettatonEXSprite);
		        				//battleText1.play();
		                    	mediaPlayer2.stop();
		                    	mediaPlayer.setVolume(0.5);
		                    	break;
        					case 2:
        						primaryStage.setScene(selection);
        						battleText1.play();
        						
        				}
        			});
        			/**
        			battleText1.play();
                	mediaPlayer2.stop();
                	battleStartAu.play();
                	mediaPlayer.setVolume(0.5);
                	**/
                	//mediaPlayer.play();
        			break;
        	}
        	});
        	
        endScene.addEventFilter(MouseEvent.MOUSE_CLICKED, e -> {
        	ENDCLICKS++;
        	System.out.println(ENDCLICKS);
        	//System.out.println(CLICKS);
        	switch(ENDCLICKS) {
	        	case 1:
	        		endTextGroup.getChildren().remove(op13);
	        		endText3.play();
	        		break;
	        	case 2:
	        		endTextGroup.getChildren().remove(op14);
	        		endText3a.play();
	        		break;
	        	case 3:
	        		endTextGroup.getChildren().remove(op14a);
	        		endText4.play();
	        		break;
        	}

        	
        });
        
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                int dx = 0, dy = 0;              
                if (UP && checkCollision(FRISK2, horizontalLine1)) dy -= SPEED;
                if (DOWN && checkCollision(FRISK2, horizontalLine2)) dy += SPEED;
                if (RIGHT && checkCollision(FRISK2, verticalLine2))  dx += SPEED;
                if (LEFT && checkCollision(FRISK2, verticalLine1))  dx -= SPEED;
                
                /**
                if(checkCollision(FRISK2, verticalLine1)&& checkCollision(FRISK2, verticalLine2)&&
                checkCollision(FRISK2, horizontalLine1)&&
                checkCollision(FRISK2, horizontalLine2)) {
                **/
                moveHeroBy(dx, dy);
                projectileCheck(projectileGroup);
                
                if(HEALTH <= 0){
                	death.stop();
                	timeline.stop();
                	timeline2.stop();
                	timeline3.stop();
                	timeline4.stop();
                	timeline5.stop();
                	timeline6.stop();
                	setEnableFour(fightButton, actButton, itemButton, mercyButton);
                   	heartbreak2.play();
            		heartbreak1.setPriority(2);
            		heartbreak1.play();
                	primaryStage.setScene(gameOverScene);
                	ft.play();
                	ft.setOnFinished(e -> {
                		if(chance == 1){ gameOverGroup.getChildren().add(peterSprite); }
                		//if(chance == 2){ gameOverGroup.getChildren().add(adamSprite); }
                		if(chance == 3){ 
                			gameOverGroup.getChildren().add(temSprite);
                			mediaPlayer4.play();
                			animationGameOver3.play();
                		} else { 
                			mediaPlayer3.play();
                			animationGameOver.play();
                		}

                		ft.stop();
                		stop();
                		gameOverScene.addEventFilter(MouseEvent.MOUSE_CLICKED, e2 -> {
                			if(chance == 3) {
                				animationGameOver3.stop();
                				gameOverGroup.getChildren().remove(op10);
                				animationGameOver4.play();
                				
                			} else {
                			animationGameOver.stop();
                			gameOverGroup.getChildren().remove(op8);
                			animationGameOver2.play();
                			}
                		});
                	});
                	stop();
                }
                
            }
        };
        timer.start();
    
        fightButton.setOnAction(e -> {
        	timer.start();
        	click.play();
        	setEnableFour(fightButton, actButton, itemButton, mercyButton);
        	fightButton.setDisable(true);
        	textGroupSelection.getChildren().remove(bt1);
        	textGroupSelection.getChildren().remove(actb1);
        	textGroupSelection.getChildren().remove(itemb1);
        	textGroupSelection.getChildren().remove(mercyb1);
        	textGroupSelection.getChildren().add(bt3);
        	bt3.setOnMouseClicked(e2 -> {
        		textGroupSelection.getChildren().remove(bt3);
        		setDisableFour(fightButton, actButton, itemButton, mercyButton);
        		fightText1.play();
        		timeline.setOnFinished(e3 ->
        		bt2.setText(""));
        	});
        	//primaryStage.setScene(battle);
        	//timeline.play();
        	//System.out.println("fight");
        });
        
        //returning to other buttons function
        actButton.setOnAction(e -> {
        	click.play();
        	setEnableFour(fightButton, actButton, itemButton, mercyButton);
        	actButton.setDisable(true);
        	textGroupSelection.getChildren().remove(bt1);
        	textGroupSelection.getChildren().remove(bt3);
        	textGroupSelection.getChildren().remove(itemb1);
        	textGroupSelection.getChildren().remove(mercyb1);
        	textGroupSelection.getChildren().add(actb1);
        	actb1.setOnMouseClicked(e2 -> {
        		setDisableFour(fightButton, actButton, itemButton, mercyButton);
        		click.play();
        		textGroupSelection.getChildren().remove(actb1);
        		actText1.play();
        		timeline.setOnFinished(e3 ->{
        		actb2.setText("");}
        		);
        	});
        	//System.out.println("act");
        });
        
        itemButton.setOnAction(e -> {
        	click.play();
        	setEnableFour(fightButton, actButton, itemButton, mercyButton);
        	itemButton.setDisable(true);
        	textGroupSelection.getChildren().remove(bt1);
        	textGroupSelection.getChildren().remove(bt3);
        	textGroupSelection.getChildren().remove(actb1);
        	textGroupSelection.getChildren().remove(mercyb1);
        	textGroupSelection.getChildren().add(itemb1);
        	itemb1.setOnMouseClicked(e2 -> {
        		deluxeitem.play();
        		setDisableFour(fightButton, actButton, itemButton, mercyButton);
        		click.play();
        		textGroupSelection.getChildren().remove(itemb1);
        		itemText1.play();
        		timeline.setOnFinished(e3 -> {
        			itemb2.setText("");
        		});
        		HEALTH = 20;
        	});
        	//System.out.println("item");
        });
        
        mercyButton.setOnAction(e -> {
        	click.play();
        	setEnableFour(fightButton, actButton, itemButton, mercyButton);
        	mercyButton.setDisable(true);
        	textGroupSelection.getChildren().remove(bt1);
        	textGroupSelection.getChildren().remove(bt3);
        	textGroupSelection.getChildren().remove(actb1);
        	textGroupSelection.getChildren().remove(itemb1);
        	textGroupSelection.getChildren().add(mercyb1);
        	mercyb1.setOnMouseClicked(e2 -> {
        		setDisableFour(fightButton, actButton, itemButton, mercyButton);
        		click.play();
        		textGroupSelection.getChildren().remove(mercyb1);
        		mercyText1.play();
        		timeline.setOnFinished(e3 -> {
        			mercyb2.setText("");
        		});
        	});
        	//System.out.println("mercy");
        });
        
        battle.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
      
        	
			 if (e.getCode().equals(KeyCode.RIGHT)) {
                RIGHT = true;
				 
				//imageX += 5;
                //System.out.println(imageX);
                //System.out.println("GO RIGHT");
                
            } else if (e.getCode().equals(KeyCode.LEFT)) {
            	LEFT = true;
            	
                //imageX -= 5;
                ////System.out.println(imageX);
                //System.out.println("GO LEFT");
            } else if (e.getCode().equals(KeyCode.UP)) {
            	UP = true;
            	
                //imageY -= 5;
                ////System.out.println(imageY);
                //System.out.println("GO UP");
            } else if (e.getCode().equals(KeyCode.DOWN)) {
            	DOWN = true;
            	
                //imageY += 5;
                ////System.out.println(imageY);
                //System.out.println("GO DOWN");
            }
            updateImageView();
		});
        
	
	 battle.addEventFilter(KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>()  {
	      public void handle(KeyEvent e1) {
     	
			 if (e1.getCode().equals(KeyCode.RIGHT)) {
             RIGHT = false;
				 
				//imageX += 5;
             ////System.out.println(imageX);
             //System.out.println("release RIGHT");
             
         } else if (e1.getCode().equals(KeyCode.LEFT)) {
         	LEFT = false;
         	
             //imageX -= 5;
             ////System.out.println(imageX);
             //System.out.println("release LEFT");
         } else if (e1.getCode().equals(KeyCode.UP)) {
         	UP = false;
         	
             //imageY -= 5;
             ////System.out.println(imageY);
             //System.out.println("release UP");
         } else if (e1.getCode().equals(KeyCode.DOWN)) {
         	DOWN = false;
         	
             //imageY += 5;
             ////System.out.println(imageY);
             //System.out.println("release DOWN");
         }
         updateImageView();
	      }
	      });
     
		
        primaryStage.setResizable(false);
        primaryStage.setScene(black);
        primaryStage.show();
      
        //timeline.play();
       
        
    

	
	}

	public void reset(Animation animation) {
		//animation.res
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	   public void go() {
		   imageX += vX;
		   imageY += vY;
	   }
	   
	   private void updateImageView() {
		 
		 
		    if(DOWN) vY = SPEED;
		    if(UP) vY = -SPEED;
		    if(LEFT) vX = -SPEED;
		    if(RIGHT) vX = SPEED;
		    
		    imageX += vX;
			imageY += vY;
			   
           //FRISK2.setX(vX);
           //FRISK2.setY(vY);
           
           
       }
	   
	   private void moveHeroBy(int dx, int dy) {
	        if (dx == 0 && dy == 0) return;
	 
	        final double cx = FRISK2.getBoundsInLocal().getWidth()  / 2;
	        final double cy = FRISK2.getBoundsInLocal().getHeight() / 2;
	 
	        double x = cx + FRISK2.getLayoutX() + dx;
	        double y = cy + FRISK2.getLayoutY() + dy;
	 
	        moveHeroTo(x, y);
	    }
	   
	   private void moveHeroTo(double x, double y) {
	        final double cx = FRISK2.getBoundsInLocal().getWidth()  / 2;
	        final double cy = FRISK2.getBoundsInLocal().getHeight() / 2;
	        
	        if (x - cx >= 0 &&
	            x + cx <= 788 &&
	            y - cy >= 0 &&
	            y + cy <= 588) {
	            FRISK2.relocate(x - cx, y - cy);
	        }
	        //System.out.println(x + "," + y);
	    }

	   private boolean checkCollision (ImageView firstOb, ImageView secondOb) { 
		  boolean noCollision = true;
		   if (firstOb.getBoundsInParent().intersects(secondOb.getBoundsInParent())) {
			   noCollision = false;
		   }
		   return noCollision;
	   }
	 
		public void projectileCheck(Group projectile) {
			   ObservableList<Node> projectileList;
			   projectileList = projectile.getChildren();
			   // boolean check = true;
			   
			   for(int projectileNum = 0; projectileNum < projectileList.size(); projectileNum++){
				   if(!checkCollision(FRISK2, (ImageView) projectileList.get(projectileNum))
						   && !isInvincible) {
					   HEALTH = HEALTH-2;
					   YELLOWBOX.setWidth(2.5*HEALTH);
					   healthText.setText(HEALTH + " / " + 20);
					   
					   YELLOWBOX2.setWidth(2.5*HEALTH);
					   healthText2.setText(HEALTH + " / " + 20);
					   
					   invincibilityTimeLeft = INVINCIBILITY_TIME;
					   isInvincible = true;
					   damageTaken.setPriority(2);
				   }
				   
				   if(isInvincible) {
					   updateInvincibility();
				   }
			   }
		   }
		
		
		private void updateInvincibility() {
			   if(invincibilityTimeLeft != 0) {
				   invincibilityTimeLeft--;
				   //System.out.println("Invincibility Timer: " + invincibilityTimeLeft);
				   if(invincibilityTimeLeft % 20 >= 10) {
					   FRISK2.setOpacity(0.0);
				   } else {
					   FRISK2.setOpacity(1.0);
				   }
				   
			   } else { 
				   isInvincible = false;
			   }
		   }
		
	  
	public void setTextToBlank(Text text){
		text.setText("");
	}
	
	public int damageCalc(int currentHealth) {
		currentHealth--;
		return currentHealth;
	}
	
	public void invulnerability() throws InterruptedException {
		invulnTimeLeft = 500;
		invulnerability = true;
		
	}

	public void addIntoForeground(Text[] textArray, Group textGroup) {
		for(int x = 0; x < textArray.length; x++) {
			textGroup.getChildren().add(textArray[x]);
		}
	} 

	public void setDisableFour(ToggleButton fightButton2, ToggleButton actButton2, ToggleButton itemButton2, ToggleButton mercyButton2) {
		fightButton2.setDisable(true);
		actButton2.setDisable(true);
		itemButton2.setDisable(true);
		mercyButton2.setDisable(true);
	} 
	
	public void setEnableFour(ToggleButton fightButton, ToggleButton actButton, ToggleButton itemButton, ToggleButton mercyButton) {
		fightButton.setDisable(false);
		actButton.setDisable(false);
		itemButton.setDisable(false);
		mercyButton.setDisable(false);
	} 
	public Scene Attack(Scene battle) {
		final ImageView bombSprite11 = new ImageView(BOMB);
		final ImageView bombSprite12 = new ImageView(BOMB);
		final ImageView bombSprite21 = new ImageView(BOMB);
		final ImageView bombSprite22 = new ImageView(BOMB);
		final ImageView bombSprite31 = new ImageView(BOMB);
		final ImageView bombSprite32 = new ImageView(BOMB);
		final ImageView bombSprite33 = new ImageView(BOMB);
		final ImageView legSprite1 = new ImageView(LEG);
		final ImageView legSprite2 = new ImageView(LEG);
		final ImageView legSprite3 = new ImageView(LEG);
		final ImageView legSprite4 = new ImageView(LEG);
		final ImageView metaminiSprite1 = new ImageView(METTAMINI);
		final ImageView metaminiSprite2 = new ImageView(METTAMINI);
		final ImageView metaminiSprite3 = new ImageView(METTAMINI);
		final ImageView metaminiSprite4 = new ImageView(METTAMINI);
		
		//final ImageView bombThrow1 = new ImageView(BOMB);
		//final ImageView bombThrow2 = new ImageView(BOMB);
		
		Group battleRoot = (Group) battle.getRoot();
		//battleRoot.getChildren().remove(6,7);
		final Group projectiles =
				new Group(bombSprite11,bombSprite12,bombSprite21,bombSprite22,
						bombSprite31, bombSprite32, bombSprite33,
						legSprite1, legSprite2, legSprite3, legSprite4,
						metaminiSprite1, metaminiSprite2, metaminiSprite3,
						metaminiSprite4);
		
		battleRoot.getChildren().add(projectiles);
		battle.setRoot(battleRoot);
		System.out.println("Attack start");
		Random rand = new Random();
		
		//player's initial position
		FRISK2.relocate(388, 375);
		
		// bombs' initial positions
		bombSprite11.relocate(-75 + rand.nextInt(150), -50);
		bombSprite12.relocate(750 + rand.nextInt(150), -50);
		bombSprite21.relocate(-50 , 250 + rand.nextInt(100));
		bombSprite22.relocate(800 , 400 + rand.nextInt(100));
		bombSprite31.relocate(250 + rand.nextInt(150), -50);
		bombSprite32.relocate(350 + rand.nextInt(150), -50);
		bombSprite33.relocate(325 + rand.nextInt(150), 600);
		
		// legs' initial positions
		legSprite1.relocate(370, -100);
		legSprite2.setRotate(180);
		legSprite2.relocate(230, -200);
		legSprite3.relocate(370, -300);
		legSprite4.setRotate(180);
		legSprite4.relocate(230, -400);
		
		//verticalLine2.relocate(268 + 264, 265);
		//horizontalLine1.relocate(268, 265);
		//horizontalLine2.relocate(268, 265 + 216);
		
		// metaminis' initial positions
		metaminiSprite1.relocate(275, -300);
		metaminiSprite2.relocate(275, -450);
		metaminiSprite3.relocate(475, -300);
		metaminiSprite4.relocate(475, -450);
		
		
		
		Timeline timeline = new Timeline();
		timeline.setCycleCount(2);
		//timeline.setAutoReverse(true);
		
		KeyFrame[] legAttack = {
				new KeyFrame(Duration.seconds(8),
						new KeyValue(legSprite1.yProperty(), 900 )),
				new KeyFrame(Duration.seconds(8), 
						new KeyValue(legSprite2.yProperty(), 900 )),
				new KeyFrame(Duration.seconds(8), 
						new KeyValue(legSprite3.yProperty(), 900 )),
				new KeyFrame(Duration.seconds(8), 
						new KeyValue(legSprite4.yProperty(), 900 ))
		};
		
		KeyFrame[] bombAttack = {
				//pauses
				new KeyFrame(Duration.seconds(1),
						new KeyValue(bombSprite11.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(1), 
						new KeyValue(bombSprite11.yProperty(), 0 )),
				new KeyFrame(Duration.seconds(1),
						new KeyValue(bombSprite12.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(1), 
						new KeyValue(bombSprite12.yProperty(), 0 )),
				new KeyFrame(Duration.seconds(2),
						new KeyValue(bombSprite21.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(2),
						new KeyValue(bombSprite21.yProperty(), 0 )),
				new KeyFrame(Duration.seconds(2),
						new KeyValue(bombSprite22.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(2),
						new KeyValue(bombSprite22.yProperty(), 0 )),
				new KeyFrame(Duration.seconds(3.5),
						new KeyValue(bombSprite31.yProperty(), 0 )),
				new KeyFrame(Duration.seconds(3.5),
						new KeyValue(bombSprite32.yProperty(), 0 )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(bombSprite33.yProperty(), 0 )),
				// first wave attacks
				new KeyFrame(Duration.seconds(3),
						new KeyValue(bombSprite11.xProperty(), 800 )),
				new KeyFrame(Duration.seconds(3), 
						new KeyValue(bombSprite11.yProperty(), 800 )),
				new KeyFrame(Duration.seconds(3),
						new KeyValue(bombSprite12.xProperty(), -800 )),
				new KeyFrame(Duration.seconds(3), 
						new KeyValue(bombSprite12.yProperty(), 800 )),
				// second wave attacks
				new KeyFrame(Duration.seconds(5), 
						new KeyValue(bombSprite21.xProperty(), 1000 )),
				new KeyFrame(Duration.seconds(4.5), 
						new KeyValue(bombSprite22.xProperty(), -1000 )),
				//third wave attacks
				new KeyFrame(Duration.seconds(6),
						new KeyValue(bombSprite31.yProperty(), 700 )),
				new KeyFrame(Duration.seconds(6),
						new KeyValue(bombSprite32.yProperty(), 850 )),
				new KeyFrame(Duration.seconds(6),
						new KeyValue(bombSprite33.yProperty(), -500 )),
				new KeyFrame(Duration.seconds(6.5),
						new KeyValue(bombSprite33.yProperty(), -50 )),
				new KeyFrame(Duration.seconds(8),
						new KeyValue(bombSprite33.yProperty(), 700 ))
		};
		
		KeyFrame[] metaminiAttack = {
				// gets into position
				new KeyFrame(Duration.seconds(1.5),
						new KeyValue(metaminiSprite1.yProperty(), 750 )),
				new KeyFrame(Duration.seconds(1.5),
						new KeyValue(metaminiSprite2.yProperty(), 700 )),
				new KeyFrame(Duration.seconds(1.5),
						new KeyValue(metaminiSprite3.yProperty(), 750 )),
				new KeyFrame(Duration.seconds(1.5),
						new KeyValue(metaminiSprite4.yProperty(), 700 )),
				// pause for 1 second
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite1.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite2.xProperty(), 0)),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite3.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite4.xProperty(), 0 )),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite1.yProperty(), 750 )),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite2.yProperty(), 700)),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite3.yProperty(), 750 )),
				new KeyFrame(Duration.seconds(2.5),
						new KeyValue(metaminiSprite4.yProperty(), 700 )),
				//goes to random part of box
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite1.xProperty(), 100 + rand.nextInt(250) )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite2.xProperty(), 100 + rand.nextInt(250) )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite3.xProperty(), -100 - rand.nextInt(250) )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite4.xProperty(), -100 - rand.nextInt(250) )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite1.yProperty(), 800 - rand.nextInt(250))),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite2.yProperty(), 850 + rand.nextInt(250) )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite3.yProperty(), 800 - rand.nextInt(250) )),
				new KeyFrame(Duration.seconds(4),
						new KeyValue(metaminiSprite4.yProperty(), 850 + rand.nextInt(250) ))
		};
		
		//timeline = new Timeline(metaminiAttack);
		
		isBombAttack = false;
		
		//boolean isBombAttack = false;
		// randomly determine what kind of attack will come
		int attackNumber = rand.nextInt(3);
		switch(attackNumber) {
			case 0:  //legs attack
				timeline.setAutoReverse(true);
				timeline = new Timeline(legAttack);
				break;
			case 1: //metamini's attack
				timeline = new Timeline(metaminiAttack);
				break;
			case 2: //bombs attack
				timeline = new Timeline(bombAttack);
				isBombAttack = true;
				break;
		}
		
		timeline.play();
		
		System.out.println("HI");
		
		// projectile check not working
		// checkCollision() returning no collision even when intersectin
		
		AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if(isBombAttack) {
	            	bombSprite11.setScaleX(bombSprite11.getScaleX() + 0.01);
	            	bombSprite11.setScaleY(bombSprite11.getScaleY() + 0.01);
	            	bombSprite12.setScaleX(bombSprite12.getScaleX() + 0.01);
	            	bombSprite12.setScaleY(bombSprite12.getScaleY() + 0.01);
	            	bombSprite21.setScaleX(bombSprite21.getScaleX() + 0.008);
	            	bombSprite21.setScaleY(bombSprite21.getScaleY() + 0.008);
	            	bombSprite22.setScaleX(bombSprite22.getScaleX() + 0.008);
	            	bombSprite22.setScaleY(bombSprite22.getScaleY() + 0.008);
	            	bombSprite31.setScaleX(bombSprite31.getScaleX() + 0.006);
	            	bombSprite31.setScaleY(bombSprite31.getScaleY() + 0.006);
	            	bombSprite32.setScaleX(bombSprite32.getScaleX() + 0.006);
	            	bombSprite32.setScaleY(bombSprite32.getScaleY() + 0.006);
	            	bombSprite33.setScaleX(bombSprite33.getScaleX() + 0.005);
	            	bombSprite33.setScaleY(bombSprite33.getScaleY() + 0.005);
            	}
                projectileCheck(projectiles);
                System.out.println("TEST");
                }     
        };
		timer.start();
		
        System.out.println("HI");
        
		timeline.setOnFinished(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent arg0) {
				timer.stop();
				battleRoot.getChildren().remove(projectiles);
				System.out.println("SOMEWHERE OVER THE RAINBOW");
				if(HEALTH > 0){
				primaryStage.setScene(selection);
				}
			}
			
		});
		
		return battle;
		
	}
	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	   public static void main(String[] args) {
	        launch(args);
	    }
 

}
