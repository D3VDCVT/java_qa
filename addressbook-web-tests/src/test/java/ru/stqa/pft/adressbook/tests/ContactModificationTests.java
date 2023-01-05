package ru.stqa.pft.adressbook.tests;

import org.junit.Test;

import ru.stqa.pft.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("mod", "mod", "mod", "9148843757"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
    }

}
