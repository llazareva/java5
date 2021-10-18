package ru.netology.sqr;

public class SQRService {
    int border1 = 200;
    int border2 = 300;
    public void squares(int border1, int border2) {

        int k = 0;
        for (int i = 10; i < 100; i++) {
            if (((i * i) >= border1) && ((i * i) <= border2))
                System.out.println(i * i);
            k++;
        }
        System.out.println(k);
    }

}
