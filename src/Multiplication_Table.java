//Write a Java program that takes a number as input and prints its multiplication table up to 10

class table{
    public static void table_formate(int a){
        for (int i=1;i<=10;i++){
            System.out.println(a+"x"+i+" = "+a*i);
        }
    }
}
public class Multiplication_Table {
    public static void main(String[] args) {
        table.table_formate(2);
    }
}
