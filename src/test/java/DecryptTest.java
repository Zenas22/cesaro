import org.junit.Test;
import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void runDecrypt_instantiates(){
        Decrypt testDecrypt = new Decrypt();
        assertEquals(true, testDecrypt instanceof Decrypt);
    }

    @Test
    public void runDecrypt_ifInputIsString() {
        Decrypt testDecrypt = new Decrypt();
        assertEquals("abc", testDecrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Decrypt testDecrypt = new Decrypt();
        assertEquals(2, testDecrypt.getmShift());
    }
    @Test
    public void runDecrypt_ifDecryptsVariousInputs() {
        Decrypt testDecrypt = new Decrypt();
        assertEquals("abc" , testDecrypt.decrypt("def", 3));
        assertEquals("Faith Mutete", testDecrypt.decrypt("Lgozn Sazkzk", 6));
        assertEquals("moringa school", testDecrypt.decrypt("prulqjd vfkrro", 3));
        // does not decrypt integers and other characters but returns them as is
        assertEquals("!LAZY BROWN FOX JUMPS OVER A LAZY DOG2", testDecrypt.decrypt("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", 3));
    }
}