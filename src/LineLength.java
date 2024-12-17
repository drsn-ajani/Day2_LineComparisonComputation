public class LineLength {
    private final double x1, y1, x2, y2;

    public LineLength(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        LineLength line = new LineLength(1, 2, 4, 6);
        double length = line.calculateLength();
        System.out.println("The length of the line is: " + length);
    }
}
