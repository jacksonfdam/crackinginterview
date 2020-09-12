package com.jacksonfdam.crackinginterview.string

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class StringProblemsTest {

    private val stringProblems = StringProblems()

    @Test
    fun `should find duplicate characters`() {
        assertThat(stringProblems.findDuplicates("holaah")).isEqualTo("ah")
        assertThat(stringProblems.findDuplicates("asdfg")).isEqualTo("")
        assertThat(stringProblems.findDuplicates("This is another sentence")).isEqualTo("ishent")
    }
}
