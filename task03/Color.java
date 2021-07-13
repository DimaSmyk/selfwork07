package selfwork07.task03;


public enum Color {

    RED(2,5,1),
    GREEN("#69f420"),
    BLUE("#597dff"),
    WHITE("#fffff0"),
    BLACK("#514d4b");

    private String hex;
    private int r;
    private int g;
    private int b;

    Color(String hex) {
        this.hex = hex;
//        r=  Integer.valueOf( hex.substring( 1, 3 ), 16 );
//        g=  Integer.valueOf( hex.substring( 3, 5 ), 16 );
//        b=  Integer.valueOf( hex.substring( 5, 7 ), 16 );
        //тут я пытался написать логику вычесления r,g,b по gex, но неудачно
    }

    public String getHex() {
        return hex;
    }

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
