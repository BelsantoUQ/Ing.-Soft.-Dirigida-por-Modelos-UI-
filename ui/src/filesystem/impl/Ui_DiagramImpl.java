/**
 */
package filesystem.impl;

import filesystem.FilesystemPackage;
import filesystem.Ui_Diagram;
import filesystem.UserInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ui Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.impl.Ui_DiagramImpl#getDrives <em>Drives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ui_DiagramImpl extends EObjectImpl implements Ui_Diagram {
	/**
	 * The cached value of the '{@link #getDrives() <em>Drives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrives()
	 * @generated
	 * @ordered
	 */
	protected EList<UserInterface> drives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ui_DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesystemPackage.Literals.UI_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserInterface> getDrives() {
		if (drives == null) {
			drives = new EObjectContainmentEList<UserInterface>(UserInterface.class, this, FilesystemPackage.UI_DIAGRAM__DRIVES);
		}
		return drives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesystemPackage.UI_DIAGRAM__DRIVES:
				return ((InternalEList<?>)getDrives()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilesystemPackage.UI_DIAGRAM__DRIVES:
				return getDrives();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilesystemPackage.UI_DIAGRAM__DRIVES:
				getDrives().clear();
				getDrives().addAll((Collection<? extends UserInterface>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FilesystemPackage.UI_DIAGRAM__DRIVES:
				getDrives().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FilesystemPackage.UI_DIAGRAM__DRIVES:
				return drives != null && !drives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Ui_DiagramImpl
