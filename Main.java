import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[30];
        fillList(nums);
        System.out.println(Arrays.toString(nums));
        sisyphusSort(nums);

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
        int maxVal = list[0];

        for (int i = 0; i < list.length; i++){
            if (list[i] >= maxVal) {
                adaptableList.add(list[i]);
                maxVal = list[i];
            }
        }
        
        for (int i = 1; i < adaptableList.size(); i++){
            int currentElement = adaptableList.get(i);
            int k = i - 1;
            
            while (k >= 0 && (adaptableList.get(k) - currentElement) > 0) {
                    adaptableList.set(k + 1, adaptableList.get(k));
                    k--;
                }
                list[k + 1] = currentElement;
                adaptableList.set(k + 1, currentElement);
        }

    }



    public static void sisyphusSort(int[] list) {
        //tries to sort the array but at the very end a new random element is inserted at the front
        ArrayList<Integer> adaptableList = new ArrayList<>();
        for (int val : list) {
            adaptableList.add(val);
        }
        
        while (true) {
            for (int i = 1; i < adaptableList.size(); i++){
            int currentElement = adaptableList.get(i);
            int k = i - 1;
            
            while (k >= 0 && (adaptableList.get(k) - currentElement) > 0) {
                    adaptableList.set(k + 1, adaptableList.get(k));
                    k--;
                }
                adaptableList.set(k + 1, currentElement);
            }
            int newElement = (int)(Math.random() * 101);
            adaptableList.add(0, newElement);
            System.out.println(adaptableList);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
        }
    }

    public static void medusaSort(int[] list) {
        //if the element 1 for I is in the array the sort stops
        for (int i = 1; i < list.length; i++){
            if (list[i] == 1){
                break;
            }
            int currentElement = list[i];
            int k = i - 1;

            while (k >= 0 && (list[k] - currentElement) > 0) {
                list[k + 1] = list[k];
                k--;
            }

            list[k + 1] = currentElement;
            System.out.println("Iteration" + i + ": " + Arrays.toString(list));
        }
    }

}
