package Zsgs;

public class Pattern {
public static void main(String[] args) {
	
	String s="1234";
	
	s.equals("123");
	char m[][]=new char[7][7];
	
	for(int i=0;i<m.length;)
	{
		int j;
		int length=s.length()-2;
		if(i<m.length/2)
		{
		j=m.length/2;	
		while(j>=0 && i<s.length())
		{
			m[i][j]=s.charAt(i);
			j--;
			i++;
		}
		}
		else
		{
			j=1;
			while(j<=m.length/2 && length>=0 )
			{
				m[i][j]=s.charAt(length);
				j++;
				i++;
				length--;
			}
		}
		
	}
	
	for(int i=0;i<m.length;i++)
	{
		for(int j=0;j<m.length;j++)
		{
			System.out.print(m[i][j]);
		}
		System.out.println();
	}
	
}
}
