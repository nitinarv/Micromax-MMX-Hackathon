package hackathon.test.contacts.logic;

import java.util.ArrayList;

import hackathon.test.contacts.model.Contact;

/**
 * Created by nitin on 6/27/15.
 */
public class ContactTasks {

    public interface OperationCallback{
        public void onException(Exception excpetion);
        public void onSuccess(ArrayList<Contact> listOfContacts);
    }


}
