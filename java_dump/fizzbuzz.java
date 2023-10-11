public class fizzbuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 15; i++) {
      fizzbuz(i);
    }
  }
  static void fizzbuz(int num){
    if (num%3==0 && num%5==0) {
      System.out.println("fizz buzz");
    }
    else if(num%5==0){
      System.out.println("buzz");
    }
    else if(num%3==0){
      System.out.println("fizz");
    }
    else{
      System.out.println(num);
    }
  }
}
