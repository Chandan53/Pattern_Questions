package Pattern_Questions;

public class pattern3 {
    /*
     * A
     * B C
     * D E F
     * G H I J
     */
    public static void main(String args[]){
        char ch='A';
        for(int line=1;line<=4;line++){
            for(int j=1;j<=line;j++){
                System.out.print(ch + " ");
                ch ++;
            }
            System.out.println();
        }
    }
    
}
