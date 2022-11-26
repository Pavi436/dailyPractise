public class Pattern {

    public static void innerPattern(int n)
    {

        int size = 7;
        int row = 0;
        int col = size - 1;//7-1=6
        int a[][] = new int[size][size];
        while (n != 0) {//4!=0(T)
            for (int i = row; i <= col; i++) {//int i=0;0<=6(T)
                for (int j = row; j <= col;j++) {//int j=0;0<=6(T)
                    if (i == row || i == col||
                            j == row || j == col)//0==0(T)||0==6(F)||0==0(T)||0==6(F)

                        a[i][j] = n;//a[0][0]=4
                }
            }
            ++row;
            --col;
            --n;
        }
        print(a, size);
    }
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {//i=0;0<6(T)
           System.out.print("*");
            for (int j = 0; j < size; j++) {//j=0;0<6(T)
                System.out.print(a[i][j]);
            }
            System.out.print("*");
            System.out.println(" ");
        }


    }
    public static void main(String[] args)
    {
        int n = 4;
        innerPattern(n);
    }
}
