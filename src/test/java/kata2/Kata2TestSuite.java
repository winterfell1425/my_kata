package kata2;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Kata2TestSuite {
    @Test
    public void exampleTest() {
        assertArrayEquals(new int[]{}, FlattenedAndSortedArray.flattenAndSort(new int[][]{}));
        assertArrayEquals(new int[]{1}, FlattenedAndSortedArray.flattenAndSort(new int[][]{{}, {1}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, FlattenedAndSortedArray.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, FlattenedAndSortedArray.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));
        assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, FlattenedAndSortedArray.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
    }
    @Test
    public void basic1() {
        Person[] meet = new Person[] {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };
        assertEquals("Get Out Now!", TheOffice.outed(meet, "laura"));
    }

    @Test
    public void basic2() {
        Person[] meet = new Person[] {
                new Person("tim", 1),
                new Person("jim", 3),
                new Person("randy", 9),
                new Person("sandy", 6),
                new Person("andy", 7),
                new Person("katie", 6),
                new Person("laura", 9),
                new Person("saajid", 9),
                new Person("alex", 9),
                new Person("john", 9),
                new Person("mr", 8)
        };
        assertEquals("Nice Work Champ!", TheOffice.outed(meet, "katie"));
    }

    @Test
    public void basic3() {
        Person[] meet = new Person[] {
                new Person("tim", 2),
                new Person("jim", 4),
                new Person("randy", 0),
                new Person("sandy", 5),
                new Person("andy", 8),
                new Person("katie", 6),
                new Person("laura", 2),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 8),
        };
        assertEquals("Get Out Now!", TheOffice.outed(meet, "john"));
    }
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Maps.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Maps.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Maps.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
    @Test
    public void sampleTest() {
        assertEquals(3, Arguments.countArgs(1, 2, 3));
        assertEquals(3, Arguments.countArgs(1, 2, "uhsaf uas"));
        assertEquals(1, Arguments.countArgs(1));
        assertEquals(4, Arguments.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        assertEquals(0, Arguments.countArgs());
    }
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
        assertEquals("Nope!", 3, Vowels.getCount("mariusz"));
    }
    @Test
    public void testCharsCount() {
        assertEquals(1, CharsCount.strCount("Hello", 'o'));
        assertEquals(2, CharsCount.strCount("Hello", 'l'));
        assertEquals(0, CharsCount.strCount("",'z'));
        assertEquals(1, CharsCount.strCount("Mariusz",'M'));
    }
    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
}