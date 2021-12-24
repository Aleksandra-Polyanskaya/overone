package Lesson13;

public class MaxNumber {
    public int max(int a, int b){
        int maxNum = 0;
        if (a > b){
            maxNum = a;
        }
        if (b>a) {
            maxNum = b;
        }
        return maxNum;
    }
    public void print (){
        System.out.println(max(5, 7));
    }
}
