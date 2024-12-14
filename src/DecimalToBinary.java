class Decimal{
    Decimal(int decimal){
        String binary="";
        while (decimal >0){
            int remainder=decimal%2;
            decimal=decimal/2;
            binary=remainder+binary;
        }
        System.out.println(binary);
    }
}
public class DecimalToBinary {
    public static void main(String[] args) {
        Decimal nn=new Decimal(13);
    }
}
