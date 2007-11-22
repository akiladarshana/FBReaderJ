package org.zlibrary.text.view.style;

import org.zlibrary.text.view.ZLTextStyle;

import org.zlibrary.options.util.*;

public class ZLTextFullDecoratedStyle extends ZLTextDecoratedStyle implements ZLTextStyle {
	private final ZLTextFullStyleDecoration myDecoration;
	
	/*package*/ ZLTextFullDecoratedStyle(ZLTextStyle base, ZLTextFullStyleDecoration decoration) {
		super(base);
		myDecoration = decoration;	
	}

	public String fontFamily() {
		return "default";
	}

	public int fontSize() {
//		if (myDecoration.FontSizeDeltaOption != null && getBase() != null) {
//			return getBase().fontSize() + (int) myDecoration.FontSizeDeltaOption.getValue();
//		} 
		return 12;
	}
	
	public boolean bold() {
		ZLBoolean3 b = myDecoration.BoldOption.getValue();	
		return (b == ZLBoolean3.B3_UNDEFINED) ? getBase().bold() : (b == ZLBoolean3.B3_TRUE);
	}

	public boolean italic() {
		return false;
	}

	public int leftIndent() {
		return 0;
	}

	public int rightIndent() {
		return 0;
	}

	public int lineSpace() {
		return 1;
	}

	public int verticalShift() {
		return 0;
	}

	public int spaceBefore() {
		return 0;
	}

	public int spaceAfter() {
		return 0;
	}		
}