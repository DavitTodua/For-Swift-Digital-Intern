public class Main {
    public static void main(String[] args) throws Throwable {
        Methods methods = new Methods();
        System.out.println(methods.isPalindrome("saippuakivikauppias"));

        System.out.println("THE TEST OVER");

        System.out.println(methods.minSplit(200));
        System.out.println(methods.minSplit(0));
        System.out.println(methods.minSplit(530));
        System.out.println(methods.minSplit(57));

        System.out.println("THE TEST OVER");

        int[] test1 = new int[] {1,3,45,61,33,44,332,311,24,5,6,0};
        int[] test2 = new int[] {1,2,3,4,6,5,7,9,8,10,11,12};
        int[] test3 = new int[] {1,2,35,61,33,44,332,311,24,5,6,0};

        System.out.println(methods.notContains(test1));
        System.out.println(methods.notContains(test2));
        System.out.println(methods.notContains(test3));

        System.out.println("THE TEST OVER");

        System.out.println(methods.countVariants(1));
        System.out.println(methods.countVariants(0));
        System.out.println(methods.countVariants(5));
        System.out.println(methods.countVariants(3));
        System.out.println(methods.countVariants(10));
        System.out.println(methods.countVariants(4));

        System.out.println("THE TEST OVER");

        System.out.println(methods.isProperly("(k)"));
        System.out.println(methods.isProperly("((()2243)())"));
        System.out.println(methods.isProperly("("));
        System.out.println(methods.isProperly("()))((()"));
        System.out.println(methods.isProperly("())()"));
        System.out.println(methods.isProperly("()()()()((()()))"));

        System.out.println("THE TEST OVER");

        DataStructure<Integer> curr = new DataStructure<Integer>();
        curr.add(10);
        curr.add(20);
        curr.add(30);

        System.out.println(curr.size);

        curr.remove(20);
        System.out.println(curr.contains(10));
        System.out.println(curr.contains(20));
        System.out.println(curr.contains(220));

        System.out.println("THE TEST OVER");

        WebsiteThing thing = new WebsiteThing();
        System.out.println(thing.getCourse("USD","GBP"));

    }
}
