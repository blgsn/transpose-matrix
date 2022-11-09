import java.util.Scanner;  
public class Main  
{  
    public static void main(String args[])    
    {  
    int i, j;  
    System.out.println("Satır ve sutün sayısını giriniz: ");  //asks the user enter row and column of the matrix
    Scanner input = new Scanner(System.in);  //creates the object named input
    int row = input.nextInt();  //reads the row and column values
    int column = input.nextInt();  
    int array[][] = new int[row][column];  //creates array object according to row and column
    System.out.println("Matris elemanlarını giriniz: "); //asks the user enter matrix elements 
    for(i = 0; i < row; i++)  
    {  
        for(j = 0; j < column; j++)   
            {  
            array[i][j] = input.nextInt();  //takes values of row and column from the user 
            }  
    }  
    System.out.println("Matris");  
    for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
            System.out.print(array[i][j]+" ");  //prints the matrix
            }  
            System.out.println(" ");  //puts the space between the matrix elements
        }  
    System.out.println("Tranzpoze ");  
    for(i = 0; i < column; i++)  
        {  
            for(j = 0; j < row; j++)  
            {  
                System.out.print(array[j][i]+" ");  //prints the transpose matrix
            }  
            System.out.println(" ");  //puts the space between the transpose matrix elements
        }  
    }  
}