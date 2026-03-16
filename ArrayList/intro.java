import java.util.ArrayList;
// import java.util.Collections;
public class intro{

    //1. reverse an arraylist
    public static void reverse(ArrayList<Integer> l1){
        int i = 0, j = l1.size()-1; 
        while(i <= j){
            // swap
            Integer temp = l1.get(i);
            l1.set(i, l1.get(j));
            l1.set(j,temp);
            i++; j--;
        }
    }


    //2. find max
    public static void max(ArrayList<Integer> list){
        int j = list.size()-1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<j; i++){
            Integer curr = list.get(i);
            if(max < curr){
                max = curr;
            }
            //max = Math.max(max, list.get(i));
        }
        System.out.println("mximum element: " + max);
    }


    //3.A container with most water - BRUTE FORCE
    public static int container(ArrayList<Integer> list){
        int maxWater = 0;
        for(int i=0; i<list.size(); i++){
            for(int j = i+1; j < list.size(); j++){

                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int water = height * width;

                maxWater = Math.max(water, maxWater);
            }
        }
        // System.out.println("max water stored: " + maxWater);
        return maxWater;
    }

    //3.B container with most water - 2 POINTER APPROACH
    public static int containerPointer(ArrayList<Integer> list){
        int left_pointer = 0;
        int right_pointer = list.size()-1;
        int maxWater = 0;

        while(left_pointer < right_pointer ){

            int height = Math.min(list.get(left_pointer), list.get(right_pointer));
            int width = right_pointer - left_pointer;
            int water = height * width;
            maxWater = Math.max(water, maxWater);

            if(left_pointer < right_pointer){
                left_pointer++;
            }else{
                right_pointer--;}
        }
        return maxWater;
    }

AB NHI PADHUNGI





    //4. PAIRSUM (given a sorted AL find the target sum pairs) 2 POINTERS
    public static boolean pairSum(ArrayList <Integer> list, int target){
        int lp = 0, rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }else if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList<>(); 
        // add elements
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);

        // System.out.println(l1);
        // System.out.println("element at index 1: " + l1.get(1));

        // reverse(l1);
        // System.out.println(l1);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        // max(list);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(8);
        l2.add(6);
        l2.add(2);
        l2.add(5);
        l2.add(4);
        l2.add(8);
        l2.add(3);
        l2.add(7);

        // System.out.println(container(l2));
        // System.out.println(containerPointer(l2));

        ArrayList <Integer> L3 = new ArrayList<>();
        L3.add(1);
        L3.add(2);
        L3.add(3);
        L3.add(4);
        L3.add(5);
        L3.add(6);
        int target = 5;
        System.out.println(pairSum(list, target));

    }
} 