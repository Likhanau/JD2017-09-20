package by.it.likhanau.jd01_05;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.abs;


public class TaskA {

    static void writeDownArithmeticExpression() {
        double a = 756.13;
        double x = 0.3;
        double p1 = cos(pow(x * x + PI / 6, 5));
        double p2 = sqrt(x * pow(a, 3));
        double p3 = log(abs((a - 1.12 * x) / 4));
        double res = p1 - p2 - p3;
        System.out.println("Task A1 Result with part = " + res);
        double res2 = cos(pow(x * x + PI / 6, 5)) - sqrt(x * pow(a, 3)) - log(abs((a - 1.12 * x) / 4));
        System.out.println("Task A1 Result with one expression = " + res2);
    }

    static void solveTheFunction(){
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=0.371;
        double res=tan(pow(a+b,2))-cbrt(a+1.5)+a*pow(b,5)-b/log(a*a);
        System.out.println("Task A2 result = "+res);
    }

    static void tabulateFunction(){
        double x=12.1;
        for (double a=-5;a<=12;a=a+3.75){
            double f=Math.exp(a*x)-3.45*a;
            System.out.printf("If a=%6.2f f=%10g\n",a,f);
        }
    }

}
