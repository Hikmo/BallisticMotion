public class Ball {
    double v;
    double theta;
    double ballSize;
    private final double GRAVITATIONAL_CONST = 9.8;

    public Ball(double v, double theta, double ballSize) {
        this.v = v;
        this.theta = theta;
        this.ballSize = ballSize;
    }

    public double getBallSize() {
        return ballSize;
    }

    public double getCurrentX(double x0, double t) {
        return x0 + getVx() * t;
    }

    public double getCurrentY(double y0, double t) {
        return y0 + getVy() * t - 0.5 * GRAVITATIONAL_CONST * (Math.pow(t, 2));
    }

    private double getVy() {
        return v * Math.sin(Math.toRadians(theta));
    }

    private double getVx() {
        return v * Math.cos(Math.toRadians(theta));
    }

}
