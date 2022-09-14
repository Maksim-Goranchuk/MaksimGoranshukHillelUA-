public class stringReverse {

  public static void main(String[] args) {
    String input = "Maksim";

    char[] in = input.toCharArray();

    for (int i = in.length - 1; i >= 0; i--) {
      System.out.print(in[i]);
    }
  }

}
