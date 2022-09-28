/**
 */
package filesystem;

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
 *   <li>{@link filesystem.Ui_Diagram#getDrives <em>Drives</em>}</li>
 * </ul>
 *
 * @see filesystem.FilesystemPackage#getUi_Diagram()
 * @model
 * @generated
 */
public interface Ui_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Drives</b></em>' containment reference list.
	 * The list contents are of type {@link filesystem.UserInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drives</em>' containment reference list.
	 * @see filesystem.FilesystemPackage#getUi_Diagram_Drives()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserInterface> getDrives();

} // Ui_Diagram
