package Pattern_Questions;

public class patter4 {
    /*
     * 1 1 1 1
     * 2 2 2
     * 3 3
     * 4
     */
    public static void main(String args[]){
        int count=1;
        for(int line=1;line<=4;line++){
            for(int j=4;j>=line;j--){
                System.out.print(count + " ");
                
            }
            count++;
            System.out.println();
        }
    }
    
}
