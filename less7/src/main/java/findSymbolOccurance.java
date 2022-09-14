public class findSymbolOccurance {
  public static void main(String[] args) {
    String str = "Добрый день дни д";
    char ch = 'д';
    int cnt = 0;

    for ( int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch)
        cnt++;
    }
    System.out.println("буква "+ch+" количество   " +cnt);
  }
}


