class Main {
  public static void main(String[] args) {
   int number1 = 5, number2 = 9, number3 = 3;
        if( number1 >= number2 && number1 >= number3)
            System.out.println(number1 + " is the greatest number.");
        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2 + " is the greatest number.");
        else
            System.out.println(number3 + " is the greatest number.");
    }
}