import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptingTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void BelEncryptingTest() 
	{
		
		assertEquals("PNTUW", CryptoManager.encryptBellaso("HELLO", "HI"));
		assertEquals("PF\\ SU", CryptoManager.encryptBellaso("LAPTOP", "DELL"));
		assertEquals("MP#Q_U[S*F$HSO[F\\J$H", CryptoManager.encryptBellaso("COMPUTER ENGINEERING", "JAVA"));
		assertEquals("X^^Y.MZ%W],", CryptoManager.encryptBellaso("JUST DO IT!", "NIKE"));
		assertEquals("*!J)XE5&UV'F(", CryptoManager.encryptBellaso("UNITED STATES", "USA"));
		
	}
	
	
	@Test
	void BelDecryptingTest() 
	{
		
		assertEquals("HELLO", CryptoManager.decryptBellaso("PNTUW", "HI"));
		assertEquals("LAPTOP", CryptoManager.decryptBellaso("PF\\ SU", "DELL"));
		assertEquals("COMPUTER ENGINEERING", CryptoManager.decryptBellaso("MP#Q_U[S*F$HSO[F\\J$H", "JAVA"));
		assertEquals("JUST DO IT!", CryptoManager.decryptBellaso("X^^Y.MZ%W],", "NIKE"));
		assertEquals("UNITED STATES", CryptoManager.decryptBellaso("*!J)XE5&UV'F(", "USA"));
		
	}
	
	
	@Test
	void CeaEncryptingTest() 
	{
		assertEquals("KBWB", CryptoManager.encryptCaesar("JAVA", 1));
		assertEquals("IKVJWD", CryptoManager.encryptCaesar("GITHUB", 2));
		assertEquals("PKMOLYYU", CryptoManager.encryptCaesar("FACEBOOK", 10));
		assertEquals("_!^V!P\\\\X]V/X\"/R^^[", CryptoManager.encryptCaesar("PROGRAMMING IS COOL", 15));
		assertEquals("Z1YR'V1^ _V*1Z_1^*1! T\\V%", CryptoManager.encryptCaesar("I HAVE MONEY IN MY POCKET", 17));
		
	}

	@Test
	void CeaDecryptingTest() 
	{
		assertEquals("JAVA", CryptoManager.decryptCaesar("KBWB", 1));
		assertEquals("GITHUB", CryptoManager.decryptCaesar("IKVJWD", 2));
		assertEquals("FACEBOOK", CryptoManager.decryptCaesar("PKMOLYYU", 10));
		assertEquals("PROGRAMMING IS COOL", CryptoManager.decryptCaesar("_!^V!P\\\\X]V/X\"/R^^[", 15));
		assertEquals("I HAVE MONEY IN MY POCKET", CryptoManager.decryptCaesar("Z1YR'V1^ _V*1Z_1^*1! T\\V%", 17));
		
	}

}
