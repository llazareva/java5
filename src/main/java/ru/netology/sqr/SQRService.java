package ru.netology.sqr;

public class SQRService {

    public long takeTheRoot(int border1, int border2) {

        int k = 0;
        int i = 10;
        int m = i * i;
        for (i = 10; i < 99; i++) ;
        {   if ((m >= border1) && (m <= border2))
                k++;
            System.out.println(k);
            return k;
        }

    }

}
