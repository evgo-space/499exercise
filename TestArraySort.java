import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class TestArraySort {
    ArraySort mySort = new ArraySort();
    @Test
    public void testIntSort(){
        assertEquals("[1, 2, 3, 4, 5]", ArraySort.intSort("35142"));
    }

    @Test
    public void testCharSort(){
        assertEquals("[a, b, c, d]", ArraySort.charSort("bdca"));
    }
    
}
