package 코플릿;
import java.util.*;
public class hong_addNth {
        public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
            //TODO..
            if(arrayList.size() < index){
                return null;
            }

            arrayList.add(index, element);
            return arrayList;
        }
}
