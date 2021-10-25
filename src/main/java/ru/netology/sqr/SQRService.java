package ru.netology.sqr;

public class SQRService {

    public int takeTheRoot(int border1, int border2) {

        int numberOfSquares = 0;
        for (int i = 10; i < 99; i++) {

            int square = i * i;
            if ((square >= border1) && (square <= border2)) {
                numberOfSquares++;

            }
        }
        System.out.println(numberOfSquares);
        return numberOfSquares;
    }
}
