package CH.ifa.draw.test.util;

import junit.framework.TestCase;
// JUnitDoclet begin import
import CH.ifa.draw.util.SerializationStorageFormat;
// JUnitDoclet end import

/*
* Generated by JUnitDoclet, a tool provided by
* ObjectFab GmbH under LGPL.
* Please see www.junitdoclet.org, www.gnu.org
* and www.objectfab.de for informations about
* the tool, the licence and the authors.
*/


// JUnitDoclet begin javadoc_class
/**
* TestCase SerializationStorageFormatTest is generated by
* JUnitDoclet to hold the tests for SerializationStorageFormat.
* @see CH.ifa.draw.util.SerializationStorageFormat
*/
// JUnitDoclet end javadoc_class
public class SerializationStorageFormatTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
  // JUnitDoclet begin class
  // instance variables, helper methods, ... put them in this marker
  CH.ifa.draw.util.SerializationStorageFormat serializationstorageformat = null;
  // JUnitDoclet end class
  
  /**
  * Constructor SerializationStorageFormatTest is
  * basically calling the inherited constructor to
  * initiate the TestCase for use by the Framework.
  */
  public SerializationStorageFormatTest(String name) {
    // JUnitDoclet begin method SerializationStorageFormatTest
    super(name);
    // JUnitDoclet end method SerializationStorageFormatTest
  }
  
  /**
  * Factory method for instances of the class to be tested.
  */
  public CH.ifa.draw.util.SerializationStorageFormat createInstance() throws Exception {
    // JUnitDoclet begin method testcase.createInstance
    return new CH.ifa.draw.util.SerializationStorageFormat();
    // JUnitDoclet end method testcase.createInstance
  }
  
  /**
  * Method setUp is overwriting the framework method to
  * prepare an instance of this TestCase for a single test.
  * It's called from the JUnit framework only.
  */
  protected void setUp() throws Exception {
    // JUnitDoclet begin method testcase.setUp
    super.setUp();
    serializationstorageformat = createInstance();
    // JUnitDoclet end method testcase.setUp
  }
  
  /**
  * Method tearDown is overwriting the framework method to
  * clean up after each single test of this TestCase.
  * It's called from the JUnit framework only.
  */
  protected void tearDown() throws Exception {
    // JUnitDoclet begin method testcase.tearDown
    serializationstorageformat = null;
    super.tearDown();
    // JUnitDoclet end method testcase.tearDown
  }
  
  // JUnitDoclet begin javadoc_method createFileDescription()
  /**
  * Method testCreateFileDescription is testing createFileDescription
  * @see CH.ifa.draw.util.SerializationStorageFormat#createFileDescription()
  */
  // JUnitDoclet end javadoc_method createFileDescription()
  public void testCreateFileDescription() throws Exception {
    // JUnitDoclet begin method createFileDescription
    // JUnitDoclet end method createFileDescription
  }
  
  // JUnitDoclet begin javadoc_method store()
  /**
  * Method testStore is testing store
  * @see CH.ifa.draw.util.SerializationStorageFormat#store(java.lang.String, CH.ifa.draw.framework.Drawing)
  */
  // JUnitDoclet end javadoc_method store()
  public void testStore() throws Exception {
    // JUnitDoclet begin method store
    // JUnitDoclet end method store
  }
  
  // JUnitDoclet begin javadoc_method restore()
  /**
  * Method testRestore is testing restore
  * @see CH.ifa.draw.util.SerializationStorageFormat#restore(java.lang.String)
  */
  // JUnitDoclet end javadoc_method restore()
  public void testRestore() throws Exception {
    // JUnitDoclet begin method restore
    // JUnitDoclet end method restore
  }
  
  
  
  // JUnitDoclet begin javadoc_method testVault
  /**
  * JUnitDoclet moves marker to this method, if there is not match
  * for them in the regenerated code and if the marker is not empty.
  * This way, no test gets lost when regenerating after renaming.
  * <b>Method testVault is supposed to be empty.</b>
  */
  // JUnitDoclet end javadoc_method testVault
  public void testVault() throws Exception {
    // JUnitDoclet begin method testcase.testVault
    // JUnitDoclet end method testcase.testVault
  }
  
  /**
  * Method to execute the TestCase from command line
  * using JUnit's textui.TestRunner .
  */
  public static void main(String[] args) {
    // JUnitDoclet begin method testcase.main
    junit.textui.TestRunner.run(SerializationStorageFormatTest.class);
    // JUnitDoclet end method testcase.main
  }
}