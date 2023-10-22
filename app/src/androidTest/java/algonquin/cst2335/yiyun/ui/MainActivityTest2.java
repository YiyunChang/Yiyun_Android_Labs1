package algonquin.cst2335.yiyun.ui;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testGoodPsw() {
        ViewInteraction appCompatEditText = onView(withId(algonquin.cst2335.yiyun.R.id.passwordText));
        appCompatEditText.perform(replaceText("wI123*"), closeSoftKeyboard());

        ViewInteraction materialButton = onView((withId(algonquin.cst2335.yiyun.R.id.loginButton)));
        materialButton.perform(click());

        ViewInteraction textView = onView(withId(algonquin.cst2335.yiyun.R.id.responseText));
        textView.check(matches(withText("Your password is complex enough.")));
    }
}
