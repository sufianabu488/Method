package hw;

public class NoParametersNoReturnType {

   public double getTotalPrice(int quantity, double price ){
       double result;
       result= quantity * price;
       return result;


   }

    public void doubleMyNumber(int number){
        int result;
        result = number * 2;

        System.out.println("The result is :" + result);



    }

    public void printHello() {



        System.out.println("Hello");


    }

    public static void main(String[] args) {
        NoParametersNoReturnType obj = new NoParametersNoReturnType();
        obj.printHello();
        System.out.println("**************************************************");
        System.out.println("Welcome to java");
        System.out.println("**************************************************");
        obj.doubleMyNumber(12);
        System.out.println("**************************************************");
       int quantity =12;
       double price =15.2;
      double result  = obj.getTotalPrice(12,15.);
        System.out.println("The value returned from getTotalPrice is " + result);
    }
}
