// The previous code gives an output of:
// 150
// 150

public class HW26PartC {
   public static int lastSerialUsed = 0;

   private double totalSales;

public HW26PartC(String name) {
    this(name, 0);
   }

   public HW26PartC(String name, int regionCode) {
        lastSerialUsed++;
        totalSales = 0;
   }

   public void addSale(double amount) {
        totalSales += amount;
   }

   public double getSales() {
        return totalSales;
   }


   public static void main(String[] args) {
       HW26PartC.lastSerialUsed = 100;
       HW26PartC c1 = new HW26PartC("Sal's Deli");
       c1.addSale(100);
       HW26PartC c2 = c1;
       c2.addSale(50);
       System.out.println(c1.getSales());
       System.out.println(c2.getSales());
   }

}