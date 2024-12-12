class addition{

    static int c=0;
    public static void binary(int[] a, int[] b){

        for (int i= a.length-1; i>=0 ;i--){
            if (a[i]==0& b[i]==0){
                if (c==0){
                    c=0;
                    System.out.print(0+" ");
                }else {
                    c=0;
                    System.out.print(1+" ");
                }
            } else if (a[i]==0& b[i]==1) {
                if (c==0){
                    c=0;
                    System.out.print(1+" ");
                }else {
                    c=1;
                    System.out.print(0+" ");
                }
            } else if (a[i]==1& b[i]==0) {
                if (c==0){
                    c=0;
                    System.out.print(1+" ");
                }else {
                    c=1;
                    System.out.print(0+" ");
                }
            } else if (a[i]==1& b[i]==1) {
                if (c==0){
                    c=1;
                    System.out.print(0+" ");
                }else {
                    c=1;
                    System.out.print(1+" ");
                }
            }else {
                System.out.print("error");
            }
        }
        if (c==1){
            System.out.print(1);
        }
    }
}
public class Binary_Addition {
    public static void main(String[] args) {
        int[] a={1,0,1,0,1};
        int[] b={1,1,1,0,0};
        addition.binary(a,b);
    }
}
