public class findWordPosition {

  public static void main(String[] args) {
    String target = "hello";
    String source = "hello0123456789hello0123456789hello1234567890hello3423243423232";
    int i = 0;
    while ((i = (source.indexOf(target, i) + 1)) > 0) {
      System.out.println(target);

      System.out.println(source);

      System.out.println(i);
    }

  }
}
