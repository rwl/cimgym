/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package CPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CPSM.PowerTransformer#getContains_TransformerWindings <em>Contains Transformer Windings</em>}</li>
 * </ul>
 * </p>
 *
 * @see CPSM.CPSMPackage#getPowerTransformer()
 * @model annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='An electrical device consisting of  two or more coupled windings, with or without a magnetic core, for introducing mutual coupling between electric circuits. Transformers can be used to control voltage and phase shift (active power flow).'"
 * @generated
 */
public interface PowerTransformer extends Equipment {
	/**
	 * Returns the value of the '<em><b>Contains Transformer Windings</b></em>' reference list.
	 * The list contents are of type {@link CPSM.TransformerWinding}.
	 * It is bidirectional and its opposite is '{@link CPSM.TransformerWinding#getMemberOf_PowerTransformer <em>Member Of Power Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Transformer Windings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Transformer Windings</em>' reference list.
	 * @see CPSM.CPSMPackage#getPowerTransformer_Contains_TransformerWindings()
	 * @see CPSM.TransformerWinding#getMemberOf_PowerTransformer
	 * @model opposite="MemberOf_PowerTransformer"
	 *        annotation="http://iec.ch/TC57/2008/CIM-schema-cim13# Documentation='A transformer has windings'"
	 *        annotation="http://langdale.com.au/2005/UML Profile\040documentation=''"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel Documentation='A transformer has windings' Profile\040documentation=''"
	 * @generated
	 */
	EList<TransformerWinding> getContains_TransformerWindings();

} // PowerTransformer
