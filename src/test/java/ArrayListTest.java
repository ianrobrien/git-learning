import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {

    @Test
    public void testConstructionSizeEqualsZero() {
        ArrayList<String> arrayList = new ArrayList<>();
        assertThat(arrayList.size()).isEqualTo(0);
    }

    @Test
    public void testEmptyListAddAndRemove() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hi");
        assertThat(arrayList.size()).isEqualTo(1);
        assertThat(arrayList.get(0).equals("Hi"));

        arrayList.remove(0);
        assertThat(arrayList.size()).isEqualTo(0);
    }

    @Test
    public void getFromIllegalIndex() {
        ArrayList<String> arrayList = new ArrayList<>();

        boolean exceptionThrown = false;
        try {
            arrayList.get(0);
        } catch (IndexOutOfBoundsException ex) {
            exceptionThrown = true;
        }

        assertThat(exceptionThrown).isTrue();
    }

}
