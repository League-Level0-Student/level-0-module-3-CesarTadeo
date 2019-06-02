package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
public static void main(String[] args) {

String color =JOptionPane.showInputDialog("what color shape do you want, red, blue, or green");
if (color.equals("red")) {
	bot.setPenColor(200,0,0);
}
if (color.equals("green")) {
	bot.setPenColor(0,200,0);
}
if (color.equals("blue")) {
	bot.setPenColor(0,0,200);
}
String shape =JOptionPane.showInputDialog("what shape do you want, square, triangle or circle.");
if (shape.equals("square")) {
	drawSquare();	
}	
if (shape.equals("triangle")) {
	drawTriangle();	
}
if (shape.equals("circle")) {
	drawCircle();
}
}






static Robot bot = new Robot();
static void drawSquare() {
bot.setSpeed(500);
bot.penDown();
bot.move(200);
bot.turn(90);
bot.move(200);
bot.turn(90);
bot.move(200);
bot.turn(90);
bot.move(200);
bot.turn(90);
}		
static void drawTriangle() {
bot.setSpeed(500);
bot.penDown();
bot.move(200);
bot.turn(60);
bot.move(200);
bot.turn(60);
bot.move(200);
}
static void drawCircle() {
for (int i = 0; i<36; i++) {
bot.setSpeed(500);
bot.penDown();
bot.move(10);	
bot.turn(10);	
}
}
}
