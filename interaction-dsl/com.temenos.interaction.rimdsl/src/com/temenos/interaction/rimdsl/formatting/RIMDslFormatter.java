/*
 * generated by Xtext
 */
package com.temenos.interaction.rimdsl.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfig.LinewrapLocator;

import com.temenos.interaction.rimdsl.services.RIMDslGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class RIMDslFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		RIMDslGrammarAccess f = (RIMDslGrammarAccess) getGrammarAccess();

		setPreservingLinewraps(c, 2).after(f.getDomainDeclarationRule());
		setPreservingLinewraps(c, 1).around(f.getUseRule());
		setPreservingLinewraps(c, 2).after(f.getResourceInteractionModelRule());
		setPreservingLinewraps(c, 2).around(f.getStateRule());
 		setPreservingLinewraps(c, 1).around(f.getEventRule());
		setPreservingLinewraps(c, 1).around(f.getCommandRule());
		setPreservingLinewraps(c, 1).around(f.getCommandSpecRule());
		setPreservingLinewraps(c, 1).around(f.getBasePathRule());
		setPreservingLinewraps(c, 1).around(f.getResourceTypeRule());
		setPreservingLinewraps(c, 1).around(f.getEntityRule());
		setPreservingLinewraps(c, 1).around(f.getImplRefRule());
		setPreservingLinewraps(c, 1).around(f.getPathRule());
		setPreservingLinewraps(c, 1).around(f.getTransitionRule());
		setPreservingLinewraps(c, 1).around(f.getTransitionForEachRule());
		setPreservingLinewraps(c, 1).around(f.getTransitionAutoRule());
		setPreservingLinewraps(c, 1).around(f.getTransitionEmbeddedRule());
		setPreservingLinewraps(c, 1).around(f.getTransitionRefRule());
		setPreservingLinewraps(c, 1).around(f.getTitleRule());
		setPreservingLinewraps(c, 1).after(f.getTransitionSpecAccess().getRightSquareBracketKeyword_2_1_3());
		setPreservingLinewraps(c, 1).after(f.getResourceCommandAccess().getRightSquareBracketKeyword_1_4());

		// indent the domain {} block
		setIndentationIncrementAndDecrementAndLinewrapAfter(c,
				f.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2(),
				f.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4());

		// indent the rim {} block
		setIndentationIncrementAndDecrementAndLinewrapAfter(c,
				f.getResourceInteractionModelAccess().getLeftCurlyBracketKeyword_2(),
				f.getResourceInteractionModelAccess().getRightCurlyBracketKeyword_4());

		// indent the resource {} block
		setIndentationIncrementAndDecrementAndLinewrapAfter(c,
				f.getStateAccess().getLeftCurlyBracketKeyword_3(),
				f.getStateAccess().getRightCurlyBracketKeyword_5());

		// indent the transition {} block
		setIndentationIncrementAndDecrementAndLinewrapAfter(c,
				f.getTransitionSpecAccess().getLeftCurlyBracketKeyword_0(),
				f.getTransitionSpecAccess().getRightCurlyBracketKeyword_3());

		// indent the resource command {} block
		setIndentationIncrementAndDecrementAndLinewrapAfter(c,
				f.getResourceCommandAccess().getLeftCurlyBracketKeyword_1_0(),
				f.getResourceCommandAccess().getRightCurlyBracketKeyword_1_5());

		// formatting comments	    
		setPreservingLinewrap(c).before(f.getML_COMMENTRule());
	}

	protected void setIndentationIncrementAndDecrementAndLinewrapAfter(FormattingConfig c, EObject increment, EObject decrement) {
		c.setIndentationIncrement().after(increment);
		setPreservingLinewrap(c).after(increment);

		c.setIndentationDecrement().before(decrement);
		setPreservingLinewrap(c).after(decrement);
	}

	protected LinewrapLocator setPreservingLinewraps(FormattingConfig c, int lines) {
		return c.setLinewrap(lines, lines, Integer.MAX_VALUE);
	}
	protected LinewrapLocator setPreservingLinewrap(FormattingConfig c) {
		return setPreservingLinewraps(c, 1);
	}

}
