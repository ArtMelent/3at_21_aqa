package day_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainCollection {
    public static void main(String[] args) {
        //1) Implement an application to work with a list. In the 1st half of the list replace all elements E1 with E2
        Integer e1=1;
        Integer e2=0;
        List<Integer> collection1 = Arrays.asList(120,1,45,0,0,234,34,34,55);
        int halfIndex = collection1.size()/2;
        for(int i1=0; i1<halfIndex;i1++){
            if(collection1.get(i1)==e1){collection1.set(i1,e2);}
        }
        System.out.println(collection1);

        //2) Input: matrix of integers. a) Print out matrix in reverse order. b) Print out matrix with unique values (delete duplicates)
        List<List<Integer>> collection2 = Arrays.asList(
                Arrays.asList(120,1,45,0),
                Arrays.asList(5,2,4,0),
                Arrays.asList(7,1,77,0),
                Arrays.asList(4,-2,45,0));
        for (List<Integer> row:collection2){
            System.out.println();
            for(Integer e:row){
                System.out.println(e+" ");
            }
        }
        for (int i2=0; i2<collection2.size();i2++){
            System.out.println();
            for (int j2=0; j2<collection2.get(i2).size();j2++){
                System.out.println(collection2.get(j2).get(i2)+" ");
            }
        }
        // b) Print out matrix with unique values (delete duplicates)
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i2=0; i2<collection2.size();i2++){
            System.out.println();
            int j2;
            for (j2 = 0; j2<collection2.get(i2).size(); j2++){
                if(uniqueSet.contains(collection2.get(i2).get(j2))){
                    collection2.get(i2).set(j2,0);
                }else{
                    uniqueSet.add(collection2.get(i2).get(j2));
                }
                System.out.println(collection2.get(i2).get(j2)+" ");
            }
        }

    }
}
