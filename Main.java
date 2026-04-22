import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int[] nums = new int[30];
        fillList(nums);
        System.out.println(Arrays.toString(nums));
        assasinSort(nums);

    }

    public static void fillList(int[] list){
        for(int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 101);
        }
    }

    public static void philCollinsSort(int[] list) {
        //goes for a maximum of 12 iterations because after that he doesn't care anymore
        for (int i = 1; i <= 12; i++){
            int currentElement = list[i];
            int k = i - 1;

            while (k >= 0 && (list[k] - currentElement) > 0) {
                list[k + 1] = list[k];
                k--;
            }

            list[k + 1] = currentElement;
        }
    }

    public static void zingZingZingbahSort(int[] list){
        //Shows like none of the execution and just goes to the sorted array because he is perfect
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k = i - 1;

            while (k >= 0 && (list[k] - currentElement) > 0) {
                list[k + 1] = list[k];
                k--;
            }

            list[k + 1] = currentElement;
        }
    }

    public static  void captialismSort(int[] list) {
        //large elements get larger and smaller elements get smaller
        int total = 0;
        for(int num: list) {total+= num;}
        int average = (total / list.length);

        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k = i - 1;

            if(currentElement >= average){
                currentElement *= 2;
            }
            else{
                currentElement *= -2;
            }
            while (k >= 0 && (list[k] - currentElement) > 0) {
                list[k + 1] = list[k];
                k--;
            }
            list[k + 1] = currentElement;
        }
    }

    public static void communismSort(int[] list) {
        //all the elements get evenly distributed
        int total = 0;
        for(int num: list) {total+= num;}
        int average = (total / list.length);

        for(int i = 0; i < list.length; i++){
            list[i] = average;
            System.out.println("Iteration" + i + ": " + Arrays.toString(list));
        }
    }

    public static void assasinSort(int[] list) {
        //if the element in the next position is not larger it gets deleted
        ArrayList<Integer> adaptableList = new ArrayList<>(list.length);
        for(int val: list){adaptableList.add(val);}


        for (int i = 0; i < adaptableList.size(); i++){
            int currentElement = adaptableList.get(i);
            System.out.println("Current index: " + i);
            int k = i - 1;

            if(adaptableList.get(i) > adaptableList.get(i + 1)){
                while (k >= 0 && (adaptableList.get(k) - currentElement) > 0) {
                    adaptableList.set(k + 1, k);
                    k--;
                }
                list[k + 1] = currentElement;
                adaptableList.set(k + 1, currentElement);
                System.out.println("Didn't remove anything");
            }
            else {
                System.out.println("Removing element: " + adaptableList.get(i));
                adaptableList.remove(i);
            }
            System.out.println("Iteration " + i + ": " + adaptableList);
        }

    }

    public static void carrierPigeonSort(int[] list) {
        //take the element out of the array, encapsulates it, deencapsulates it, then places it in the sorted position
    }

    public static void dmvSort(int[] list) {
        //you have to answer a series of questions and give your DLN and if you can't do that it won't sort your array
        //even if it sorts your array it'll take a while
    }

    public static void infiniteImperminanceSort(int[] list) {
        //generates number of X^10 where x is the size of the array and recurses
    }

    public static void adhdSort(int[] list) {
        //sort but it gets distracted randomly and takes a while to sort
    }

    public static void sisyphusSort(int[] list) {
        //tries to sort the array but at the very end a new random element is inserted at the front
    }

    public static void medusaSort(int[] list) {
        //if the element 1 for I is in the array the sort stops
    }

}