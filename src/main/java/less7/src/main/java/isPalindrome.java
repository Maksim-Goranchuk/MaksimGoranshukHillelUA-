public class isPalindrome {
  public static void main(String[] args) {

    String str = "Maksim", reverseStr = "";

    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.equalsIgnoreCase(reverseStr)) {
      System.out.println(str + " true ");
    }
    else {
      System.out.println(str + " false ");
    }
  }

}
