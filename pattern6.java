package Pattern_Questions;

public class pattern6 {
    /* skip 2from a series
     * 1 1 1 1
     * 3 3
     * 4
     */
    public static void main(String args[]){
        int count=4;
        int  num=1;
        for(int line=1;line<=4;line++){
        if(line==2){
            num++;
            count--;
            continue;
        }
        for(int j=4; j>=line;j--){
            System.out.print(num + " ");
        }
        num++;
        count --;
        System.out.println();
        }
    }
    
}
