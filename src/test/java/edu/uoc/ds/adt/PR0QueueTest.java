package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0QueueTest {

    PR0Queue pr0q;


    private void fillQueue() {
        for (String angle : TestUtils.getSinValues().split(" ")) {
            pr0q.add(angle);
        }
    }
    @Before
    public void setUp() {
        this.pr0q = new PR0Queue();

        assertNotNull(this.pr0q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr0q = null;
    }


    @Test
    public void queueTest() {
        assertEquals(TestUtils.getSinValues(), pr0q.clearFullQueue());

        assertEquals(0, this.pr0q.getQueue().size());
    }

}
