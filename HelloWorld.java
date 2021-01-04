public class HelloWorld {
  public static void main (String[] args) {
    if (args.length != 1) {
      System.out.println("引数ない");
      return;
    }
    outputArgLength(args[0]);
    return;
  }
  public static void outputArgLength(String first_args) {
    int arg_leng = first_args.length();
    System.out.println(arg_leng);
    if (arg_leng == 0) {
      System.out.println("hoge!");
      return;
    }
    System.out.println(first_args);
    return;
  }
}

