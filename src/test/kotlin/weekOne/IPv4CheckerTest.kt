package weekOne

import org.example.weekOne.IPv4Checker
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IPv4CheckerTest {

    private val ipv4Checker = IPv4Checker()

    @Test
    fun isValidIPv4_allZeros_returnsTrue() {
        assertTrue { ipv4Checker.IPv4Checker("0.0.0.0") }
    }

    @Test
    fun isValidIPv4_validTypicalAddress_returnsTrue() {
        assertTrue { ipv4Checker.IPv4Checker("192.186.1.1") }
    }

    @Test
    fun isInvalidIPv4_containsNegativeNumber_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("-5.44.55.78") }
    }

    @Test
    fun isInvalidIPv4_containsLetters_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("aB.6.1.1") }
    }

    @Test
    fun isInvalidIPv4_hasMoreThanFourOctets_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("192.25.168.1.1") }
    }

    @Test
    fun isInvalidIPv4_containsSpecialCharacter_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("9%5.168.1.1") }
    }

    @Test
    fun isInvalidIPv4_octetGreaterThan255_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("192.186.288.1") }
    }

    @Test
    fun isInvalidIPv4_octetStartsWithLeadingZero_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("192.178.01.1") }
    }

    @Test
    fun isInvalidIPv4_octetStartsWithMultipleLeadingZeros_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("192.178.1.001") }
    }

    @Test
    fun isInvalidIPv4_hasLessThanFourOctets_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker("192.178.1") }
    }

    @Test
    fun isInvalidIPv4_containsOnlyWhitespace_returnsFalse() {
        assertFalse { ipv4Checker.IPv4Checker(" ") }
    }
}