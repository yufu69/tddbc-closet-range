import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.equals.shouldBeEqual
import org.example.ClosedRange
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class ClosedRangeTest {
    @Nested
    inner class 整数の閉区間 {
        private val target = ClosedRange(3, 8)

        @Test
        fun 閉区間の下端点を取得できる() {
            target.lowerEndpoint shouldBeEqual 3
        }

        @Test
        fun 閉区間の上端点を取得できる() {
            target.upperEndpoint shouldBeEqual 8
        }

        @Test
        fun 閉区間の文字列表記を取得できる() {
            target.toString() shouldBeEqual "[3,8]"
        }

        @Test
        fun lowerEndpointがupperEndpointより大きい場合は生成できない() {
            shouldThrow<IllegalArgumentException> {
                ClosedRange(8,3)
            }
        }
    }
}