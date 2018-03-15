package de.diskostu.demo;

import de.diskostu.demo.client.DemoApp1Test;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class DemoApp1Suite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for DemoApp1");
    suite.addTestSuite(DemoApp1Test.class);
    return suite;
  }
}
