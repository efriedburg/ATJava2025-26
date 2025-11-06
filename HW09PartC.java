public class HW09PartC {
    
    public static void main(String[] args) {
        
        int totalNumbers = 10;
        int sum = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int randomNum = (int) (Math.random() * 10) + 1;
            System.out.println(randomNum + " ");
            sum += randomNum;
        }
        double average = (double) sum / totalNumbers;
        System.out.println("The average of these 10 random numbers between 1 and 10 is: " + average);
    }

}

// As the amount of numbers are increased to 1000, the number of decimal places in the average increases, because this is what happens when more numbers are averaged together. The average becomes more precise with a larger sample size. 
// Additionally, when running the program multiple times, the average tends to generally always be close to 5.5, which is the expected average of numbers uniformly distributed between 1 and 10.
