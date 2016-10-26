import java.awt.Color;

public class Ball extends Thread{
	public static final int SIZE = 20;
	public static final int INTERVAL = 10;
	private int x, y;
	private int xInterval, yInterval;
	private DirectionStrategy directionStrategy;
	private DrawStrategy drawStrategy;
	private Color color;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.xInterval = this.yInterval = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getxInterval() {
		return this.xInterval;
	}
	
	public int getyInterval() {
		return this.yInterval;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setIntervals(int xInterval, int yInterval) {
		this.xInterval = xInterval;
		this.yInterval = yInterval;
	}
	
	public void setxInterval(int xInterval) {
		this.xInterval = xInterval;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setDirectionStrategy(DirectionStrategy directionStrategy) {
		this.directionStrategy = directionStrategy;
	}

	public void setDrawStrategy(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}
	
	public void draw() {
		drawStrategy.draw(this);
	}
	
	public void move() {
		directionStrategy.move(this);
	}
	
	public void run() {
		draw();
		move();
	}
}