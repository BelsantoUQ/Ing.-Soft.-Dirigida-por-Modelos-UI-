/**
 */
package uidiagram.tests;

import junit.textui.TestRunner;

import uidiagram.AlertaDialog;
import uidiagram.UidiagramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alerta Dialog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlertaDialogTest extends IndividualElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AlertaDialogTest.class);
	}

	/**
	 * Constructs a new Alerta Dialog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertaDialogTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Alerta Dialog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AlertaDialog getFixture() {
		return (AlertaDialog)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidiagramFactory.eINSTANCE.createAlertaDialog());
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

} //AlertaDialogTest
