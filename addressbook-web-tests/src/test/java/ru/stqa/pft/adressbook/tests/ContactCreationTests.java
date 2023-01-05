package ru.stqa.pft.adressbook.tests;

import org.junit.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation () {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("test", "test", "test", "88005553535"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
