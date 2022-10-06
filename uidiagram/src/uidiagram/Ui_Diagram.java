/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ui Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.Ui_Diagram#getListUserInterface <em>List User Interface</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getUi_Diagram()
 * @model
 * @generated
 */
public interface Ui_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>List User Interface</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.UserInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List User Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List User Interface</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getUi_Diagram_ListUserInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserInterface> getListUserInterface();

} // Ui_Diagram
