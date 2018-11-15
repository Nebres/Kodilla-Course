package collection.operationsMeasurement;

import java.util.ArrayList;

public class IdCreator {

    private int k;

    public IdCreator(int k){
        this.k = k;
    }

    public ArrayList<Integer> createId() {

        ArrayList<Integer> idList = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) {
            idList.add(i);
        }
        return idList;
    }

}
