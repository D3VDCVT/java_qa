package ru.stqa.pft.adressbook.tests;

import org.junit.Test;

public class ContactDeleteTests extends TestBase {
    @Test
    public void testContactDelete() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().acceptContactDelete();
        app.getContactHelper().returnToHomePage();
    }
}
