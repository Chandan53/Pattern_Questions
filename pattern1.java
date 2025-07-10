package Pattern_Questions;

public class pattern1 {
    // outer loop will print the lines
    // inner loop will print for in a line how many start present

    /* * ---> inner loop 1star --> outer loop L1
       ** ---> inner loop 2 star --> outer loop L2
       *** --> inner loop 3 star --> outer loop L3
       **** --> inner loop 4 star --> outer loop L4
     */
    public static void main(String args[]){
        for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
