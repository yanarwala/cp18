
public class RandomArray {
   public static void main(String[] args) {

      int[] array1 = new int[20];
   
for (int i = 0; i < array1.length; i++){
    array1[i] =(int) (Math.random() * 101);
System.out.println(array1);
}for (int i = 0; i < array1.length; i++){
    System.out.println(array1[i]); 
   }
}


