import javax.swing.text.StyledEditorKit.ForegroundAction;

class A {
    void SumAndProductOfArray(int[] Array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
            product *= Array[i];
        }
        System.out.println("Sum :" + sum + " and Product :" + product);
    }

    void Pairs(int[] Array) {
        for (int value : Array) {
            for (int Value2 : Array) {
                System.err.print(value + "" + Value2 + " ");
            }
        }
    }
}

public class SumProArray {
    public static void main(String[] args) {
        int customArray[] = { 1, 3, 4, 6, 8 };
        A Obj = new A();
        Obj.SumAndProductOfArray(customArray);
        Obj.Pairs(customArray);
    }
}
