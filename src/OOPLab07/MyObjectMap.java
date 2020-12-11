package OOPLab07;

import java.util.ArrayList;

public class MyObjectMap {
    private ArrayList<Object> key= new ArrayList<>();
    private ArrayList<Object> value= new ArrayList<>();
    public void put(Object key, Object value){
        this.key.add(key);
        this.value.add(this.key.indexOf(key),value);
    }
    public Object get(Object key){
        return value.get(this.key.indexOf(key));
    }
}
