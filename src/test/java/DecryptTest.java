import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void runDecrypt() {
        Decrypt ifInputIsString = new Decrypt();
        assertEquals("abc" , ifInputIsString.decrypt("def", 3));
        assertEquals("Faith Mutete", ifInputIsString.decrypt("Lgozn Sazkzk", 6));
        assertEquals("moringa school", ifInputIsString.decrypt("prulqjd vfkrro", 3));
        //
        assertEquals("LAZY BROWN FOX JUMPS OVER A LAZY DOG", ifInputIsString.decrypt("ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ", 3));
    }
}