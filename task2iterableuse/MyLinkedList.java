import java.util.Iterator;


public class MyLinkedList implements Iterable<Integer> {
    private Integer[] elements;
    public MyLinkedList(Integer[] elements) {
        this.elements = elements;
    }
    public Integer getElement(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }
    public void deletelastElement() {
        for (int i = 0; i < elements.length; i--) {
            System.out.print(elements[i]);
        }
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }
        
        @Override
        public Integer next() {
            return elements[currentIndex++];
        }
        
    
    };
 
}
    
}