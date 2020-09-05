public class HelloWorld {
  public static void main (String[] args) {
    if (args.length != 1) {
      System.out.println("引数ない");
      return;
    }
    int arg_leng = args[0].length();
    System.out.println(arg_leng);
    if (arg_leng == 0) {
      System.out.println("hoge!");
      return;
    }
    System.out.println(args[0]);
    return;
  }
}

