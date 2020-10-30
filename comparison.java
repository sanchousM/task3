import java.util.*;

public class comparison {
    private static List fill(List list,int Size) {
        for(Integer i=0;i<Size;i++) {
            list.add(i.toString());
        }
        return list;
    }
    public static long Test_add(List list,int time) {
        long startTime_add = System.currentTimeMillis();
        for(Integer i=0;i<time;i++) {
            list.add(i.toString());
        }
        long endTime_add = System.currentTimeMillis();
        return (endTime_add - startTime_add);
    }
    public static long Test_get(List list,int Size,int time) {
        list=fill(list,Size);
        long startTime_get = System.currentTimeMillis();
        for(int i=0;i<time;i++) {
            list.get(Size - 1);
        }
        long endTime_get = System.currentTimeMillis();
        return (endTime_get - startTime_get);
    }
    public static long Test_remove(List list,int Size,int time) {
        list=fill(list,Size);
        long startTime_remove = System.currentTimeMillis();
        for(int i=Size-1;i>Size-1-time;i--) {
            list.remove(i);
        }
        long endTime_remove = System.currentTimeMillis();
        return (endTime_remove - startTime_remove);
    }
}

