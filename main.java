import java.util.*;

public class main {
    public static void main(String[] args) {
            List<Object> list = new ArrayList<>();
            List<Object> list2 = new LinkedList<>();
            System.out.println("Array List : " + "\n");
            System.out.println("метод add, 2000 раз выполняется, " + comparison.Test_add(list, 2000) + " ms\n");
            System.out.println("метод get, 2000 раз выполняется, "+ comparison.Test_get(list,20000,2000)+" ms\n");
            System.out.println("метод remove, 2000 раз выполняется, "+ comparison.Test_remove(list,20000,2000)+" ms\n");
            System.out.println("Linked List : " + "\n");
            System.out.println("метод add, 2000 раз выполняется, " + comparison.Test_add(list2, 2000) + " ms\n");
            System.out.println("метод get, 2000 раз выполняется, "+ comparison.Test_get(list2,20000,2000)+" ms\n");
            System.out.println("метод remove, 2000 раз выполняется, "+ comparison.Test_remove(list2,20000,2000)+" ms\n");

    }
}