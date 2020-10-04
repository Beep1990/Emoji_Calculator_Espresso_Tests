package com.raywenderlich.android.emojicalculator

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class MainActivityTest {

    @Rule @JvmField
    var activityTestRule =
            ActivityTestRule(MainActivity::class.java)

    @Test
    fun appLaunchesSuccessfully() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun onLaunchCheckAmountInputIsDisplayed() {

        onView(withId(R.id.inputAmount))
                .check(matches(isDisplayed()))
    }

    @Test
    fun onLaunchBadButtonIsDisplayed() {

        onView(withId(R.id.buttonBad))
                .check(matches(isDisplayed()))
    }

    @Test
    fun onLaunchOkayButtonIsDisplayed() {

        onView(withId(R.id.buttonOkay))
                .check(matches(isDisplayed()))
    }

    @Test
    fun onLaunchGreatButtonIsDisplayed() {

        onView(withId(R.id.buttonGreat))
                .check(matches(isDisplayed()))
    }

    @Test
    fun whenOkayButtonIsPressedAndAmountIsEmptyTipIsEmpty() {
        onView(withId(R.id.buttonOkay))
                .perform(click())

        onView(allOf(withId(R.id.textTip), withText("")))
                .check(matches(isDisplayed()))
    }
    
    @Test
    fun whenBadButtonIsPressedAndAmountIsEmptyTipIsEmpty() {
        onView(withId(R.id.buttonBad))
                .perform(click())

        onView(allOf(withId(R.id.textTip), withText("")))
                .check(matches(isDisplayed()))
    }



}