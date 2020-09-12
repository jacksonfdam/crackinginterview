package com.jacksonfdam.crackinginterview.tree

import com.google.common.truth.Truth.assertThat
import org.junit.Test

internal class TreeProblemsTest {
    private val treeProblems = TreeProblems()
    private val treeSamples = SampleTree()

    @Test fun `should return max depth`() {
        assertThat(treeProblems.maxDepth(treeSamples.createBasicBST())).isEqualTo( 2)
        assertThat(treeProblems.maxDepth(treeSamples.createBasicTree())).isEqualTo( 3)
    }

    @Test fun `should validate a BST`() {
        assertThat(treeProblems.isValidBST(treeSamples.createBasicBST())).isTrue()
        assertThat(treeProblems.isValidBST(treeSamples.createNoBST())).isFalse()
        assertThat(treeProblems.isValidBST(treeSamples.createTrickyNoBST())).isFalse()
    }
}
