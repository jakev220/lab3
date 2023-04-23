import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    
    @Test
    public void prependValueToList(){
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(0);
        assertEquals(0, linkedList.first());

    }

    @Test
    public void appendValueToList(){
        LinkedList linkedList = new LinkedList();
        linkedList.append(2);
        assertEquals(2, linkedList.last());

    }

    @Test
    public void stringRepresentationOfList(){
        LinkedList linkedList = new LinkedList();
        linkedList.prepend(0);
        linkedList.append(2);
        linkedList.append(3);
        
    }
}
