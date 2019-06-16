package extra;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
Robot bot = new Robot();
bot.setX(20);
bot.setY(590);
Random random = new Random();
int height= 0;

bot.setWindowColor(62, 62, 62);

for (int i = 0; i < 10; i++) {
height = new Random().nextInt(400)+100;
if (height<=300) {
bot.setSpeed(500);	
bot.setRandomPenColor();
bot.penDown();
bot.move(height);
bot.turn(45);
bot.move(45);
bot.turn(90);
bot.move(45);
bot.turn(45);
bot.move(height);
bot.turn(270);
bot.setPenColor(0,200,0);
bot.move(35);
bot.turn(270);
}
else {
	bot.setSpeed(500);
	bot.setRandomPenColor();
	bot.penDown();
	bot.move(height);
	bot.turn(90);
	bot.move(45);
	bot.turn(90);
	bot.move(height);
	bot.turn(270);
	bot.setPenColor(0,200,0);
	bot.move(35);
	bot.turn(270);
}
}
}
}