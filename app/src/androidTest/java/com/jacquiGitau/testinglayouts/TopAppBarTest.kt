package com.jacquiGitau.testinglayouts

import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import com.example.compose.rally.RallyScreen
import com.example.compose.rally.ui.components.RallyTopAppBar
import org.junit.Rule
import org.junit.Test

/**
 * PROJECT NAME: Testing Layouts
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Oct, 10/21/23
 * TIME        : 7:24 AM
 */
class TopAppBarTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun rallyTopAppBarTest() {
        composeTestRule.setContent {
            val allScreens = RallyScreen.values().toList()
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }
        Thread.sleep(5000)

        composeTestRule.onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()
    }

    @Test
    fun rallyTopAppBarTest_currentLabelExists() {
        composeTestRule.setContent {
            val allScreens = RallyScreen.values().toList()
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }

        composeTestRule.onRoot().printToLog("currentLabelExists")

        // Test will fail
        composeTestRule.onNodeWithText(RallyScreen.Accounts.name.uppercase())
            .assertExists()

        // Test will pass
        composeTestRule.onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertExists()

        composeTestRule.onRoot(useUnmergedTree = true).printToLog("currentLabelExists")
    }



}