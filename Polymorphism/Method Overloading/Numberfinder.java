class Numberfinder{
private String formatNumber(int value) {
  return String.format("%d", value);
}
private String formatNumber(double value) {
 return String.format("%.3f", value);
}
private String formatNumber(String value) {
  return String.format("%.2f", Double.parseDouble(value));
}
public static void main(String[] args) {
   Numberfinder hs = new Numberfinder();
   System.out.println(hs.formatNumber(50));
   System.out.println(hs.formatNumber(52.8965));
   System.out.println(hs.formatNumber("50"));
  }
}
