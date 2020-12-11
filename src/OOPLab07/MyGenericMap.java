package OOPLab07;

import java.util.ArrayList;

public class MyGenericMap<U,T> {
    private ArrayList<GenericObject> map = new ArrayList<>();
    public class GenericObject<U,T>{
        public U key;
        public T value;
        public GenericObject(U key, T value){
            this.key=key;
            this.value=value;
        }
    }
    public void put(U key, T value){
        GenericObject o = new GenericObject(key,value);
        map.add(o);
    }
    public T get(U key){
       for(GenericObject o : map){
           if(o.key.equals(key)){
               return (T) o.value;
           }
       }
       return null;
    }
}
