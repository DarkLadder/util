/**
 * Created by serio on 11.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Util.factorial(5));
        System.out.println(Util.maxNumber(11156789, Util.Max));
        System.out.println(Util.minNumber(132453495, Util.Min));
        System.out.println(Util.sumNumber(123456789, Util.Sum));
        System.out.println(Util.multiplicationNumber(1045, Util.Mult));
        System.out.println(Util.searchNumeral(432431542, 1));
        int[] arr1 = new int[20];
        int[] arr = new int[20];
        for (int i = 0; i < 19; i++) {
            arr[i] = (int)(Math.random()*100);

        }
        Util.inArr(arr, 120, 4);
        for (int i = 0; i <20; i++) {
            System.out.print(arr[i]+", ");

        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        arr1[4] = 9;
        for (int i = 0; i <20; i++) {
            System.out.print(arr1[i] + ", ");
        }
        Util.outArr(arr1, 5);
        System.out.println("");
        for (int i = 0; i <20; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(Util.sub(12,2));
        System.out.println(Util.div1(4,12,0,12));
        System.out.println(Util.mod(45, 10));
    }
}
