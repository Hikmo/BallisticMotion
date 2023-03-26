public class BallisticMotion {
    public static void main(String[] args) {

        final double GRAVITY = 9.8;
        final double VELOCITY = 75.0;
        final double THETA = 60.0;
        final double BALL_SIZE = 3;
        final int PAUSE_DURATION = 20;
        final double INIT_X = 0;
        final double INIT_Y = 0;

        StdDraw.setCanvasSize(500, 500);
        StdDraw.enableDoubleBuffering();
        StdDraw.setXscale(0, 500);
        StdDraw.setYscale(0, 500);

        final double INIT_TIME = System.currentTimeMillis();

        boolean over = false;

        Ball ball = new Ball(VELOCITY, THETA, BALL_SIZE);

         while (!over) {
             double currentTime = (System.currentTimeMillis() - INIT_TIME) / 1000;
             double posX = ball.getCurrentX(INIT_X, currentTime);
             double posY = ball.getCurrentY(INIT_Y, currentTime);
             //StdDraw.setPenColor(120, 120, 120);

             StdDraw.filledCircle(posX, posY, BALL_SIZE);
             StdDraw.show();
             StdDraw.pause(PAUSE_DURATION);
             //StdDraw.clear();
             if (posY < 0) {
                 over = true;
             }
         }
    }
}
