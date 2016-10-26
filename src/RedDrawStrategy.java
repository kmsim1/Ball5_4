import java.awt.Color;

public class RedDrawStrategy extends DrawStrategy {
	public void draw(Ball ball) {
		ball.setColor(Color.red);
	}
}
