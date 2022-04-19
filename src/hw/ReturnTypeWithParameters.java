package hw;

public class ReturnTypeWithParameters {
    public static int mulNumber(int a){
        int ans = a *7;
        return ans;
    }


    public static void main(String[] args) {
        int num1 = 11;
        int ans ;
       // ans = mulNumber(num1);

        System.out.println("The ans is " + mulNumber(num1));
    }
}

