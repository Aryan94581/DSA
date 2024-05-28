import java.util.ArrayList;

public class ArrarListClass {
    public static void main(String[] args) {
        ArrayList<String> StringList = new ArrayList<String>();
        StringList.add("A");
        StringList.add("B");
        StringList.add("C");
        StringList.add("D");
        StringList.add("E");
        // first way
        for (int i = 0; i < StringList.size(); i++) {
            String Value = StringList.get(i);
            System.out.println(Value);
        }
        // Second way
        
    }

}