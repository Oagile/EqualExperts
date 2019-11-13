package esseex.og.equalexperts.features.bookings;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import esseex.og.equalexperts.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class HotelBookingStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps og;

    @Issue("#EQUAL-EXPERTS-HOTEL-BOOKING")
    @Test
    public void creating_a_booking_entry() {
        og.is_the_home_page_open();
        og.capture_booking(true);
   //   og.should_see_booking(anyTextFromBookingCaptured);
    }

    @Pending
    @Test
    public void creating_a_booking_entry_THEN_DELETE() {
    }

    @Test
    public void creating_a_booking_entry_no_data() {
        og.is_the_home_page_open();
        og.capture_booking(false);
    //  og.should_see_booking(anyTextFromBookingCaptured); // TODO report on error message (valid fields)
    }

    @Pending
    @Test
    public void creating_a_booking_entry_no_empty_FROM_dates() {
    }

    @Pending
    @Test
    public void creating_a_booking_entry_no_empty_dates() {
    }

    @Pending
    @Test
    public void creating_a_booking_entry_no_empty_TO_date() {
    }


    @Pending
    @Test
    public void creating_a_booking_entry_no_empty_surname() {
    }

    @Pending
    @Test
    public void creating_a_booking_entry_no_empty_lastName() {
    }


} 