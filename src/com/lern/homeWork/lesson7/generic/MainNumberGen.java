package com.lern.homeWork.lesson7.generic;

public class MainNumberGen {
    public static void main(String args[]) {

        NumberGen<Integer, Double> tgObj =
                new NumberGen<Integer, Double>(3, 6.5);

        tgObj.showTypes();

        System.out.println("sum: " + tgObj.sumOb());

        System.out.println();

        Integer nums[] = {1, 2, 3, 4, 5};
        Double nums2[] = {1.6, 2.0, 3.2, 4.0, 5.8};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Double nums4[] = {1.0, 2.0, 7.0, 4.0, 5.0};

        if (NumberGen.arraysEqual(nums, nums)) {
            System.out.println("nums equals nums");
        }
        if (NumberGen.arraysEqual(nums, nums2)) {
            System.out.println("nums equals nums2");
        }
        if (NumberGen.arraysEqual(nums, nums3)) {
            System.out.println("nums equals nums3");
        }
        if (NumberGen.arraysEqual(nums3, nums4)) {
            System.out.println("nums equals nums4");
        }

        System.out.println();

        Integer mas[] = {7, 2, 1, 8, 5};
        Double mas2[] = {9.6, 4.0, 2.2, 3.6, 4.8};

        NumberGen.arrayMaxAndMinElement(mas);
        System.out.println();
        NumberGen.arrayMaxAndMinElement(mas2);
    }
}

