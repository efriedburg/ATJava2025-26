public class HW10PartA {
  public static void main(String[] args) {
        String name = "Harry";
        System.out.println("The last letter of the name is " +
          name.charAt(name.length() - 1)); // Fixed the index to length() - 1; This is a runtime error.
}

}