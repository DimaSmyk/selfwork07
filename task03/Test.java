package selfwork07.task03;

public class Test {
    public static void main(String[] args) {

        Color redCol = Color.RED;
        Color greenCol = Color.GREEN;
        Color blueCol = Color.BLUE;
        Color whiteCol = Color.WHITE;
        Color blackCol = Color.BLACK;

        System.out.println(redCol.getR() + ", " + redCol.getG() + ", " + redCol.getB());
        System.out.println(greenCol.getHex());
        System.out.println(blueCol.getHex());
        System.out.println(whiteCol.getHex());
        System.out.println(blackCol.getHex());
    }

}
