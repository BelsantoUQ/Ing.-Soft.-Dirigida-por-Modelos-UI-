/**
 */
package filesystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see filesystem.FilesystemFactory
 * @model kind="package"
 * @generated
 */
public interface FilesystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filesystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "filesystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "filesystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesystemPackage eINSTANCE = filesystem.impl.FilesystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link filesystem.impl.Ui_DiagramImpl <em>Ui Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.Ui_DiagramImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getUi_Diagram()
	 * @generated
	 */
	int UI_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Drives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__DRIVES = 0;

	/**
	 * The number of structural features of the '<em>Ui Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link filesystem.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.ModelElementImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID_MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__COLOUR = 2;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POS_X = 3;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POS_Y = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__HEIGT = 6;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BACKGROUND_COLOR = 7;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link filesystem.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.UserInterfaceImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__ID_MODEL_ELEMENT = MODEL_ELEMENT__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__COLOUR = MODEL_ELEMENT__COLOUR;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POS_X = MODEL_ELEMENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POS_Y = MODEL_ELEMENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGT = MODEL_ELEMENT__HEIGT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ls Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LS_WIDGETS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link filesystem.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.GraphicalContainerImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__ID_MODEL_ELEMENT = MODEL_ELEMENT__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__COLOUR = MODEL_ELEMENT__COLOUR;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POS_X = MODEL_ELEMENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POS_Y = MODEL_ELEMENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__HEIGT = MODEL_ELEMENT__HEIGT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Graphical Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.impl.IndividualContainerImpl <em>Individual Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.IndividualContainerImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getIndividualContainer()
	 * @generated
	 */
	int INDIVIDUAL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__ID_MODEL_ELEMENT = MODEL_ELEMENT__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__COLOUR = MODEL_ELEMENT__COLOUR;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__POS_X = MODEL_ELEMENT__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__POS_Y = MODEL_ELEMENT__POS_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__HEIGT = MODEL_ELEMENT__HEIGT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Individual Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.LabelImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = INDIVIDUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID_MODEL_ELEMENT = INDIVIDUAL_CONTAINER__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOUR = INDIVIDUAL_CONTAINER__COLOUR;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POS_X = INDIVIDUAL_CONTAINER__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POS_Y = INDIVIDUAL_CONTAINER__POS_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = INDIVIDUAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGT = INDIVIDUAL_CONTAINER__HEIGT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = INDIVIDUAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = INDIVIDUAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.ButtonImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = INDIVIDUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID_MODEL_ELEMENT = INDIVIDUAL_CONTAINER__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOUR = INDIVIDUAL_CONTAINER__COLOUR;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POS_X = INDIVIDUAL_CONTAINER__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POS_Y = INDIVIDUAL_CONTAINER__POS_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = INDIVIDUAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGT = INDIVIDUAL_CONTAINER__HEIGT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND_COLOR = INDIVIDUAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = INDIVIDUAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link filesystem.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see filesystem.impl.TextInputImpl
	 * @see filesystem.impl.FilesystemPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__NAME = INDIVIDUAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ID_MODEL_ELEMENT = INDIVIDUAL_CONTAINER__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__COLOUR = INDIVIDUAL_CONTAINER__COLOUR;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POS_X = INDIVIDUAL_CONTAINER__POS_X;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POS_Y = INDIVIDUAL_CONTAINER__POS_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__WIDTH = INDIVIDUAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__HEIGT = INDIVIDUAL_CONTAINER__HEIGT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__BACKGROUND_COLOR = INDIVIDUAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = INDIVIDUAL_CONTAINER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link filesystem.Ui_Diagram <em>Ui Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Diagram</em>'.
	 * @see filesystem.Ui_Diagram
	 * @generated
	 */
	EClass getUi_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.Ui_Diagram#getDrives <em>Drives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drives</em>'.
	 * @see filesystem.Ui_Diagram#getDrives()
	 * @see #getUi_Diagram()
	 * @generated
	 */
	EReference getUi_Diagram_Drives();

	/**
	 * Returns the meta object for class '{@link filesystem.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see filesystem.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.UserInterface#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see filesystem.UserInterface#getTitle()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link filesystem.UserInterface#getLsWidgets <em>Ls Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ls Widgets</em>'.
	 * @see filesystem.UserInterface#getLsWidgets()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_LsWidgets();

	/**
	 * Returns the meta object for class '{@link filesystem.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see filesystem.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see filesystem.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getIdModelElement <em>Id Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Model Element</em>'.
	 * @see filesystem.ModelElement#getIdModelElement()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_IdModelElement();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getColour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colour</em>'.
	 * @see filesystem.ModelElement#getColour()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Colour();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see filesystem.ModelElement#getPosX()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PosX();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see filesystem.ModelElement#getPosY()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PosY();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see filesystem.ModelElement#getWidth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getHeigt <em>Heigt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigt</em>'.
	 * @see filesystem.ModelElement#getHeigt()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Heigt();

	/**
	 * Returns the meta object for the attribute '{@link filesystem.ModelElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see filesystem.ModelElement#getBackgroundColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link filesystem.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Container</em>'.
	 * @see filesystem.GraphicalContainer
	 * @generated
	 */
	EClass getGraphicalContainer();

	/**
	 * Returns the meta object for class '{@link filesystem.IndividualContainer <em>Individual Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Container</em>'.
	 * @see filesystem.IndividualContainer
	 * @generated
	 */
	EClass getIndividualContainer();

	/**
	 * Returns the meta object for class '{@link filesystem.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see filesystem.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link filesystem.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see filesystem.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link filesystem.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see filesystem.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilesystemFactory getFilesystemFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link filesystem.impl.Ui_DiagramImpl <em>Ui Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.Ui_DiagramImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getUi_Diagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUi_Diagram();

		/**
		 * The meta object literal for the '<em><b>Drives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__DRIVES = eINSTANCE.getUi_Diagram_Drives();

		/**
		 * The meta object literal for the '{@link filesystem.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.UserInterfaceImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE = eINSTANCE.getUserInterface_Title();

		/**
		 * The meta object literal for the '<em><b>Ls Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LS_WIDGETS = eINSTANCE.getUserInterface_LsWidgets();

		/**
		 * The meta object literal for the '{@link filesystem.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.ModelElementImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id Model Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ID_MODEL_ELEMENT = eINSTANCE.getModelElement_IdModelElement();

		/**
		 * The meta object literal for the '<em><b>Colour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__COLOUR = eINSTANCE.getModelElement_Colour();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POS_X = eINSTANCE.getModelElement_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POS_Y = eINSTANCE.getModelElement_PosY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__WIDTH = eINSTANCE.getModelElement_Width();

		/**
		 * The meta object literal for the '<em><b>Heigt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__HEIGT = eINSTANCE.getModelElement_Heigt();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getModelElement_BackgroundColor();

		/**
		 * The meta object literal for the '{@link filesystem.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.GraphicalContainerImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EClass GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '{@link filesystem.impl.IndividualContainerImpl <em>Individual Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.IndividualContainerImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getIndividualContainer()
		 * @generated
		 */
		EClass INDIVIDUAL_CONTAINER = eINSTANCE.getIndividualContainer();

		/**
		 * The meta object literal for the '{@link filesystem.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.LabelImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link filesystem.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.ButtonImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link filesystem.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see filesystem.impl.TextInputImpl
		 * @see filesystem.impl.FilesystemPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

	}

} //FilesystemPackage
