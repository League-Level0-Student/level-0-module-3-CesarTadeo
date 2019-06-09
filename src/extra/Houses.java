package extra;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
Robot bot = new Robot();
bot.setX(20);
bot.setY(500);
for (int i = 0; i < 10; i++) {
bot.setSpeed(500);
bot.setPenColor(5,5,5);
bot.penDown();
bot.move(100);
bot.turn(45);
bot.move(35);
bot.turn(90);
bot.move(35);
bot.turn(45);
bot.move(100);
bot.turn(270);
bot.setPenColor(0,200,0);
bot.move(35);
bot.turn(270);
}

}
}
