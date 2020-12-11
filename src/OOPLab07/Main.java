package OOPLab07;

public class Main {
    public static void main(String[] args) {
        MyPair<String,Integer> pair1;
        MyPair<String,Double> pair2;
        pair1 = new MyPair("Anders",12);
        pair2 = new MyPair("Phoenix",39.7);
        //pair1 = pair2;
        MyPair<String,Integer>[] grades;
        grades = new MyPair[5];
        grades[0]= new MyPair("A",1);
        grades[1]= new MyPair("B",2);
        grades[2]= new MyPair("C",3);
        /*
        for(MyPair p : grades){
            System.out.println(p.toString());
        }
        */
        MyPair<MyPair<Integer,Integer>,String> appointment = new MyPair(new MyPair(1,2),"hello");
        System.out.println(appointment.fst.snd.getClass().toString());
        System.out.println(pair1.toString());
        System.out.println(pair1.swap().toString());

        MyObjectMap map= new MyObjectMap();
        map.put("a","value of key a");
        System.out.println(map.get("a"));

        MyGenericMap generic = new MyGenericMap();
        generic.put("b","value of key b");
        System.out.println(generic.get("b"));
    }
}
