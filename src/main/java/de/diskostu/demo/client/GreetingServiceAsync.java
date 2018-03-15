package de.diskostu.demo.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import de.diskostu.demo.shared.model.Person;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {

  void greetServer(Person person, AsyncCallback<String> async);
}