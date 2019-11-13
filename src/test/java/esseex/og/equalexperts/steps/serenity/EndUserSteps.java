package esseex.og.equalexperts.steps.serenity;

import esseex.og.equalexperts.pages.LandingPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    LandingPage landingPage;

    @Step
    public void should_see_booking(String anyTextFromBookingCaptured) {
        assertThat(landingPage.getBookings(), hasItem(containsString(anyTextFromBookingCaptured)));
    }

    @Step
    public void is_the_home_page_open() {
        landingPage.open();
    }

    @Step
    public void capture_booking(boolean populateData) {
        landingPage.createBooking(populateData);
    }
}