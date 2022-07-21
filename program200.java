package Basics;

import java.util.Scanner;

public class program200 {
public static void main(String[] args) {
Scanner obj = new Scanner(System.in);
System.out.println("Radius : ");
double r = obj.nextDouble();
System.out.println("Height : ");
double hgt = obj.nextDouble();
double surface_area = 2 * Math.PI * r * (r + hgt);
double vol = Math.PI * r * r * hgt;
System.out.println("Surface area = " + surface_area);
System.out.println("Volume = "+ vol);
}
}