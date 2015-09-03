package jp.shuri.robolectricsample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(CustomRobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ApplicationTest {

    @Test
    public void testAppName() {
        String actual = RuntimeEnvironment.application.getString(R.string.app_name);
        String expected = "RobolectricSample";
        assertThat(actual, is(expected));
    }
}
