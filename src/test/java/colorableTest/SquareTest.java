package colorableTest;

import colorable.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        square = new Square(2.1, "back", false);
        System.out.println(square);
        square.howToColor();
        Square[] squares = new Square[3];
        squares[0] = new Square(12, "back", true);
    }
}
