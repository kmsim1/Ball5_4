
public class Client {
	private static final int INIT_LOCATION[] = {50, 100, 150};
	public static void main(String[] args) {
		Ball[] balls = new Ball[3];
		
		balls[0] = new Ball(INIT_LOCATION[0], INIT_LOCATION[0]);
		balls[0].setDirectionStrategy(new HorizonalMoveStrategy());
		balls[0].setDrawStrategy(new BlueDrawStrategy());
		balls[0].start();
		
		balls[1] = new Ball(INIT_LOCATION[1], INIT_LOCATION[1]);
		balls[1].setDirectionStrategy(new VerticalMoveStrategy());
		balls[1].setDrawStrategy(new RedDrawStrategy());
		balls[1].start();
		
		balls[2] = new Ball(INIT_LOCATION[2], INIT_LOCATION[2]);
		balls[2].setDirectionStrategy(new DiagonalMoveStrategy());
		balls[2].setDrawStrategy(new YelloDrawStrategy());
		balls[2].start();
		
		new BallFrame(balls);
	}
}
