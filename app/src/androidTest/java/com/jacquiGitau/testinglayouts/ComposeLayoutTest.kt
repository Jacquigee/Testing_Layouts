package com.jacquiGitau.testinglayouts

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

/**
 * PROJECT NAME: Testing Layouts
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Oct, 10/20/23
 * TIME        : 6:19 PM
 */
class ComposeLayoutTest {
    @get:Rule
    val rule = createComposeRule()

    @Test
    fun enterFormula_showsFormula() {
        rule.setContent { Screen()}

        rule.onNode(hasTestTag("yourTestTag")).assertIsDisplayed().performClick()
    }

}