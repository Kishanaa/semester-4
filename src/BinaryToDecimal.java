class Dec{
    Dec(int[] binary){
        int decimal=0;
        for (int i=0;i<binary.length;i++){
            decimal=decimal*2+binary[i];
        }
        System.out.println(decimal);
    }
}
public class BinaryToDecimal {
    public static void main(String[] args) {
        int[] abc={1,1,0,1};
        Dec nn=new Dec(abc);
    }
}
