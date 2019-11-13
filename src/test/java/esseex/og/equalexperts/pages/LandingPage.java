package esseex.og.equalexperts.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

import static Utilities.DataItem.*;
import static Utilities.WebElementLocators.*;

@DefaultUrl("http://hotel-test.equalexperts.io/")
public class LandingPage extends PageObject {

    @FindBy(id="firstname")  WebElementFacade firstname;
    @FindBy(id="lastname") WebElementFacade lastname;
    @FindBy(id="totalprice")  WebElementFacade totalprice;

    /*
        TODO
        other elements
     */

    @FindBy(id="bookings") WebElementFacade bookings;


    public List<String> getBookings() {
        return bookings.findElements(By.tagName("p")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());

        /*
        TODO
        Not tested yet
         */
    }


    public void createBooking(boolean populateData){
        if (populateData)
            createBookingPopulateData();
        else
            clickCreateBookingButton();
        /*
         TODO
         this could be better to cater for more permutations
         */
    }

    private void clickCreateBookingButton(){
        $(By.xpath(CREATE_BOOKING)).click();
        /*
         TODO
         you probably want to return message that you get after clicking the button for assertions
         */
    }

    private void createBookingPopulateData(){
        //waitForRenderedElementsToBePresent($(By.id(FIRST_NAME)));
        firstname.type(TEST_DATA_FIRSTNAME);
        lastname.type(TEST_DATA_SURNAME);
        totalprice.type(TEST_DATA_TOTAL_PRICE);
        clickCreateBookingButton();


    }
}