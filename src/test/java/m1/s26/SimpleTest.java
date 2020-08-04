package m1.s26;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    public void negatePositive() {
        Simple simple = new Simple();
        int value = 42;
        int expected = -42; //valore che mi aspetto come risultato
        		
        int result = simple.negate(value);

        //assertThat(result, equalTo(-42));
        assertThat(result, equalTo(expected));
    }
}
