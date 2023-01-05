public class Point {

    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Point(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int deltaX () {
        return this.x2 - this.x1;
    }

    public int deltaY () {
        return this.y2 - this.y1;
    }

    public int deltaSum () {
        return deltaX() + deltaY();
    }

    public double result () {
        return Math.sqrt(Math.pow(deltaX(),2) + (Math.pow(deltaY(),2)));
    }

}