/**
 */
package filesystem.tests;

import filesystem.FilesystemFactory;
import filesystem.GraphicalContainer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Graphical Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicalContainerTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GraphicalContainerTest.class);
	}

	/**
	 * Constructs a new Graphical Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Graphical Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GraphicalContainer getFixture() {
		return (GraphicalContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FilesystemFactory.eINSTANCE.createGraphicalContainer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GraphicalContainerTest
