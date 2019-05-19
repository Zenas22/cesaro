import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void runEncrypt_instantiates(){
        Encrypt testEncrypt = new Encrypt();
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encrypt();
        assertEquals("abc", testEncrypt.getmInputString());
    }

    @Test
    public void runDecrypt_ifKeyIsInt() {
        Encrypt testEncrypt = new Encrypt();
        assertEquals(2, testEncrypt.getmShift());
    }
    @Test
    public void runEncrypt_ifEncryptsVariousInputs() {
        Encrypt testEncrypt = new Encrypt();
        assertEquals("def" , testEncrypt.encrypt("abc", 3));
        assertEquals("Lgozn Sazkzk", testEncrypt.encrypt("Faith Mutete", 6));
        assertEquals("prulqjd vfkrro", testEncrypt.encrypt("moringa school", 3));
        // does not decrypt integers and other characters but returns them as is
        assertEquals("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", testEncrypt.encrypt("!LAZY BROWN FOX JUMPS OVER A LAZY DOG2", 3));
    }
}