import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {6, 3, 7, 1, 5};
        MyLinkedList list = new MyLinkedList(numbers);
        for (int num : list) {
            System.out.print(num);
            
        }
        System.out.println();
        
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
    }
    System.out.println();
    System.out.println(list.getElement(1));
    list.deletelastElement();
    list.deletelastElement();
    
    
}
}
