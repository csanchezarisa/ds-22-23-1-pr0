package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0StackTest {

    PR0Stack pr0q;

    private void fillStack() {
        String[] angles = TestUtils.getSinValues().split(" ");
        for (int i = angles.length - 1; i >=0 ; i--) {
            pr0q.push(angles[i]);
        }
    }

    @Before
    public void setUp() {
        this.pr0q = new PR0Stack();

        assertNotNull(this.pr0q.getStack());
        this.fillStack();

    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @Test
    public void stackTest() {
        assertEquals(TestUtils.getSinValues(), pr0q.clearAllStack());

        assertEquals(0, this.pr0q.getStack().size());
    }
}
