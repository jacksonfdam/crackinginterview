package com.jacksonfdam.crackinginterview.list

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class LinkedListProblemsTest {
    private val linkedList = LinkedListProblems()

    @Test
    fun `find middle element happy cases`() {
        val myLinkedListOne = java.util.LinkedList<String>()
        myLinkedListOne.add("One")
        myLinkedListOne.add("Two")
        myLinkedListOne.add("Three")
        assertThat(linkedList.findMiddleElement(myLinkedListOne)).isEqualTo("Three")

        val myLinkedListTwo = java.util.LinkedList<Int>()
        myLinkedListTwo.add(1)
        myLinkedListTwo.add(2)
        myLinkedListTwo.add(3)
        myLinkedListTwo.add(4)
        assertThat(linkedList.findMiddleElement(myLinkedListTwo)).isEqualTo(3)
    }

    @Test fun `should be empty when creating a new linked list`() {
        val myLinkedList = LinkedList<String>()

        assertThat(myLinkedList.isEmpty()).isTrue()
        assertThat(myLinkedList.size()).isEqualTo(0)
    }
}
