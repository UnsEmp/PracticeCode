package day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

interface Collections{
    void sort(List<String> L);
}


public class Test {
    public static String[] str = {"cab","bac","acb","cba","bca","abc"};
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {

        for(int i = 0;i < str.length;++i) {
            list.add(str[i]);
        }

        CollectionsSort(L->{
            for(int i = 0;i < L.size();++i) {
                String t = L.get(i);
                int idx = i;
                for(int j = L.size() - 1;j > i;--j) {
                    if(t.compareTo(L.get(j)) < 0) {
                        t = L.get(j);
                        idx = j;
                    }
                }
                // i, idx
                if(t.compareTo(L.get(i)) < 0) {
                    String tmp = L.get(idx);
                    L.set(idx, L.get(i));
                    L.set(i, tmp);
                }
            }
            System.out.println(L);
        });

//        CollectionsSort(L->{
////            java.util.Collections.sort(L);
//
//            for(int i = 0;i < L.size();++i) {
//                String t = L.get(i);
//                for(int j = 0;j < L.size() - i;++j) {
//                }
//            }
//
//        });


    }
    public static void CollectionsSort(Collections so) {
        so.sort(list);
    }

}
