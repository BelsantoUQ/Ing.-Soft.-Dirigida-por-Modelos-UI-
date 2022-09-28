/**
 */
package filesystem.impl;

import filesystem.FilesystemPackage;
import filesystem.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filesystem.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getIdModelElement <em>Id Model Element</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getColour <em>Colour</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getPosX <em>Pos X</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getPosY <em>Pos Y</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getHeigt <em>Heigt</em>}</li>
 *   <li>{@link filesystem.impl.ModelElementImpl#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelElementImpl extends EObjectImpl implements ModelElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdModelElement() <em>Id Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdModelElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_MODEL_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdModelElement() <em>Id Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdModelElement()
	 * @generated
	 * @ordered
	 */
	protected String idModelElement = ID_MODEL_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColour() <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColour() <em>Colour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColour()
	 * @generated
	 * @ordered
	 */
	protected String colour = COLOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected static final String POS_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosX() <em>Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosX()
	 * @generated
	 * @ordered
	 */
	protected String posX = POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected static final String POS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosY() <em>Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosY()
	 * @generated
	 * @ordered
	 */
	protected String posY = POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeigt() <em>Heigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigt()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeigt() <em>Heigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeigt()
	 * @generated
	 * @ordered
	 */
	protected String heigt = HEIGT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesystemPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdModelElement() {
		return idModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdModelElement(String newIdModelElement) {
		String oldIdModelElement = idModelElement;
		idModelElement = newIdModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__ID_MODEL_ELEMENT, oldIdModelElement, idModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColour(String newColour) {
		String oldColour = colour;
		colour = newColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__COLOUR, oldColour, colour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosX() {
		return posX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosX(String newPosX) {
		String oldPosX = posX;
		posX = newPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__POS_X, oldPosX, posX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosY() {
		return posY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosY(String newPosY) {
		String oldPosY = posY;
		posY = newPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__POS_Y, oldPosY, posY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeigt() {
		return heigt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeigt(String newHeigt) {
		String oldHeigt = heigt;
		heigt = newHeigt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__HEIGT, oldHeigt, heigt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesystemPackage.MODEL_ELEMENT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilesystemPackage.MODEL_ELEMENT__NAME:
				return getName();
			case FilesystemPackage.MODEL_ELEMENT__ID_MODEL_ELEMENT:
				return getIdModelElement();
			case FilesystemPackage.MODEL_ELEMENT__COLOUR:
				return getColour();
			case FilesystemPackage.MODEL_ELEMENT__POS_X:
				return getPosX();
			case FilesystemPackage.MODEL_ELEMENT__POS_Y:
				return getPosY();
			case FilesystemPackage.MODEL_ELEMENT__WIDTH:
				return getWidth();
			case FilesystemPackage.MODEL_ELEMENT__HEIGT:
				return getHeigt();
			case FilesystemPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				return getBackgroundColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilesystemPackage.MODEL_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__ID_MODEL_ELEMENT:
				setIdModelElement((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__COLOUR:
				setColour((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__POS_X:
				setPosX((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__POS_Y:
				setPosY((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__WIDTH:
				setWidth((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__HEIGT:
				setHeigt((String)newValue);
				return;
			case FilesystemPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
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
			case FilesystemPackage.MODEL_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__ID_MODEL_ELEMENT:
				setIdModelElement(ID_MODEL_ELEMENT_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__COLOUR:
				setColour(COLOUR_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__POS_X:
				setPosX(POS_X_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__POS_Y:
				setPosY(POS_Y_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__HEIGT:
				setHeigt(HEIGT_EDEFAULT);
				return;
			case FilesystemPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
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
			case FilesystemPackage.MODEL_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FilesystemPackage.MODEL_ELEMENT__ID_MODEL_ELEMENT:
				return ID_MODEL_ELEMENT_EDEFAULT == null ? idModelElement != null : !ID_MODEL_ELEMENT_EDEFAULT.equals(idModelElement);
			case FilesystemPackage.MODEL_ELEMENT__COLOUR:
				return COLOUR_EDEFAULT == null ? colour != null : !COLOUR_EDEFAULT.equals(colour);
			case FilesystemPackage.MODEL_ELEMENT__POS_X:
				return POS_X_EDEFAULT == null ? posX != null : !POS_X_EDEFAULT.equals(posX);
			case FilesystemPackage.MODEL_ELEMENT__POS_Y:
				return POS_Y_EDEFAULT == null ? posY != null : !POS_Y_EDEFAULT.equals(posY);
			case FilesystemPackage.MODEL_ELEMENT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case FilesystemPackage.MODEL_ELEMENT__HEIGT:
				return HEIGT_EDEFAULT == null ? heigt != null : !HEIGT_EDEFAULT.equals(heigt);
			case FilesystemPackage.MODEL_ELEMENT__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", idModelElement: ");
		result.append(idModelElement);
		result.append(", colour: ");
		result.append(colour);
		result.append(", posX: ");
		result.append(posX);
		result.append(", posY: ");
		result.append(posY);
		result.append(", width: ");
		result.append(width);
		result.append(", heigt: ");
		result.append(heigt);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(')');
		return result.toString();
	}

} //ModelElementImpl
