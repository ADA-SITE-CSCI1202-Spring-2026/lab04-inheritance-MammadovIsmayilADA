package week5;

public class ex7 {
public static void main(String[] args) {
    MathDemo math= new MathDemo();
    int [] array={50,70,90,55,67,34,42,52,69};
    System.out.println("Min="+MathDemo.min(50,70)); //static
    System.out.println("Max="+math.max(52,42));     //normal
    System.out.println("Sum="+math.sum(array));
    System.out.println("Mean="+math.mean(array));

}
}