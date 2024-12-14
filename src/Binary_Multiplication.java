import java.util.Arrays;
import java.util.Scanner;

class binary{

    int binaryToDecimal(int[] a){
        int decimal=0;
        for (int i=0; i<a.length; i++){
            decimal=decimal*2+a[i];
        }
        return decimal;
    }
    String decimalToBinary(int decimal){
        String binary="";
        while (decimal>0){
            int remainder=decimal%2;
            decimal=decimal/2;
            binary=remainder+binary;
        }
        return binary;
    }
    binary(int[] a, int[] b){
        int decA=binaryToDecimal(a);
        int decB=binaryToDecimal(b);
        int result=decA*decB;

        String finalBinary=decimalToBinary(result);  //Result(decimal) to binary
        System.out.println(finalBinary);
    }
}
public class Binary_Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,1,0,1};
        int[] b={0,1,0,1};

        binary binary=new binary(a,b);
    }
}
