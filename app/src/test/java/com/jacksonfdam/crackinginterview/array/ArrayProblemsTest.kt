package com.jacksonfdam.crackinginterview.array

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class ArrayProblemsTest {
    private val array = ArrayProblems()

    @Test
    fun `find duplicate - brute force`() {
        assertThat(array.findDuplicateBruteForce(arrayOf(3, 5, 8, 9, 11, 5, 4, 1, 6))).isEqualTo(5)
        assertThat(array.findDuplicateBruteForce(arrayOf(3, 3))).isEqualTo(3)
        assertThat(array.findDuplicateBruteForce(arrayOf(0, 4, 1, 1))).isEqualTo(1)
    }

    @Test
    fun `array with no duplicates should return -1 - brute force`() {
        assertThat(array.findDuplicateBruteForce(arrayOf(0, 4, 1, 2))).isEqualTo(-1)
    }

    @Test
    fun `find duplicate - better`() {
        assertThat(array.findDuplicateBetter(arrayOf(3, 5, 8, 9, 11, 5, 4, 1, 6))).isEqualTo(5)
        assertThat(array.findDuplicateBetter(arrayOf(3, 3))).isEqualTo(3)
        assertThat(array.findDuplicateBetter(arrayOf(0, 4, 1, 1))).isEqualTo(1)
    }


    @Test
    fun `array with no duplicates should return -1 - better`() {
        assertThat(array.findDuplicateBetter(arrayOf(0, 4, 1, 2))).isEqualTo(-1)
    }


    @Test
    fun `should remove duplicates - using Set`() {
        assertThat(array.removeDuplicatesUsingSet(arrayOf(0, 0, 0, 1))).isEqualTo(arrayOf(0, 1))
        assertThat(array.removeDuplicatesUsingSet(arrayOf(1, 2, 3))).isEqualTo(arrayOf(1, 2, 3))
        assertThat(array.removeDuplicatesUsingSet(arrayOf(2, 2, 4, 4, 4, 5, 5))).isEqualTo(
            arrayOf(
                2,
                4,
                5
            )
        )
    }

    @Test
    fun `should remove duplicates`() {
        assertThat(
            array.removeDuplicates(arrayOf(0, 0, 0, 1))
        ).isEqualTo(arrayOf(0, 1))
        assertThat(array.removeDuplicates(arrayOf(1, 2, 3))).isEqualTo(arrayOf(1, 2, 3))
        assertThat(array.removeDuplicates(arrayOf(2, 2, 4, 4, 4, 5, 5)))
            .isEqualTo(arrayOf(2, 4, 5))
    }

    @Test
    fun `should reverse array using language built in functionality`() {
        assertThat(array.reverseKotlin(arrayOf(2, 9, 0, 4, 2, 8, 1))).isEqualTo(
            arrayOf(
                1,
                8,
                2,
                4,
                0,
                9,
                2
            )
        )
        assertThat(array.reverseKotlin(arrayOf(1, 2, 3))).isEqualTo(arrayOf(3, 2, 1))
        assertThat(array.reverseKotlin(arrayOf(0, 0, 1, 1))).isEqualTo(arrayOf(1, 1, 0, 0))
        assertThat(array.reverseKotlin(arrayOf(10, 11))).isEqualTo(arrayOf(11, 10))
    }

    @Test
    fun `should reverse array`() {
        assertThat(array.reverse(arrayOf(2, 9, 0, 4, 2, 8, 1))).isEqualTo(
            arrayOf(
                1,
                8,
                2,
                4,
                0,
                9,
                2
            )
        )
        assertThat(array.reverse(arrayOf(1, 2, 3))).isEqualTo(arrayOf(3, 2, 1))
        assertThat(array.reverse(arrayOf(0, 0, 1, 1))).isEqualTo(arrayOf(1, 1, 0, 0))
        assertThat(array.reverse(arrayOf(10, 11))).isEqualTo(arrayOf(11, 10))
        assertThat(array.reverse(arrayOf("One", "Two", "Three"))).isEqualTo(
            arrayOf(
                "Three",
                "Two",
                "One"
            )
        )
    }
}
