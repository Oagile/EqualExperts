package Utilities;

import static Utilities.TestDataProperty.getDataItem;

public interface DataItem {
    String TEST_DATA_FIRSTNAME = getDataItem("equalExperts.firstname");
    String TEST_DATA_SURNAME = getDataItem("equalExperts.surname");
    String TEST_DATA_TOTAL_PRICE = getDataItem("equalExperts.totalPrice");

}
