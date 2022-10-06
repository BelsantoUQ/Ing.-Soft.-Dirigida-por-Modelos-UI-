/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.GraphicalContainer#getLstWidgets <em>Lst Widgets</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getGraphicalContainer()
 * @model
 * @generated
 */
public interface GraphicalContainer extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Lst Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lst Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Widgets</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getGraphicalContainer_LstWidgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getLstWidgets();

} // GraphicalContainer
