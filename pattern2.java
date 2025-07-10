package Pattern_Questions;

public class pattern2 {
    /*
     * inner loop count the lines
     * outer loop count the star in each line
     * line1 i=1 ---> 1<=4---> ****
     * line2 i=2 --> 2<=4-->   ***
     * line3 i=3 --> 3<=4--->  **
     * line4 i=4 --> 4<=4-->   *
    */
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=i;j<=4;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
