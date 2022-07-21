package Basics;
 
class program020
{
static double calculateArea(int x, int y)
{
    double pi = 3.1415926536; 
    
    double arx = pi * x * x;
 
    double ary = pi * y * y;
 
    return arx - ary;
}
public static void main (String[] args)
{
    int x = 8;
    int y = 5;
    System.out.println (calculateArea(x, y));
}
}

