package com.udacity.gradle.builditbigger;

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityInstrumentedTest {

        @Rule
        public ActivityTestRule<MainActivity> mActivityTestRule =
                new ActivityTestRule<>(MainActivity.class);

        @Test
        public void testAsyncNonEmptyString() throws Exception {

            // perform a click on the button
            onView(withId(R.id.button)).perform(click());

            // passes if the textView does not match the empty string
            onView(withId(R.id.joke_textview)).check(matches(not(withText(""))));

        }


    }

