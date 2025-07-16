package Pattern_Questions;

public class pattern5 {
    /*
     * A A A A
     * B B B
     * C C
     * D
     */
    public static void main(String args[]){
        char ch='A';
        for(int line=1;line<=4;line++){
            for(int j=4;j>=line;j--){
                System.out.print(ch + " ");
            } ch ++;
            System.out.println();
        }
    }
    
}
