package codes.horm.coderetreat

import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class FooTest: DescribeSpec({
    describe("foo") {
        it("should return true") {
            foo() shouldBe true
        }
    }
})