package com.jacksonfdam.crackinginterview.recursion

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class RecursionProblemsTest {

    private val recursionProblems = RecursionProblems()

    @Test fun `factorial happy case`() {
        assertThat(recursionProblems.factorial(5)).isEqualTo(120)
    }

    @Test fun `factorial of negative number should be zero`() {
        assertThat(recursionProblems.factorial(-1)).isEqualTo(0)
    }

    @Test fun `factorial of zero should one`() {
        assertThat(recursionProblems.factorial(0)).isEqualTo(1)
    }

    @Test fun `fibonacci happy case`() {
        assertThat(recursionProblems.fibonacci(7)).isEqualTo(13)
    }
}
