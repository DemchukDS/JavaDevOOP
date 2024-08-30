package Lecture_3.Task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lecture_3.Task_2.Worker;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);
        nums.add(123456);
        nums.add(1234567);
        nums.add(12345678);
        nums.add(123456789);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
