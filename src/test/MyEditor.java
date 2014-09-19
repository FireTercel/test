package test;

import java.beans.PropertyEditorSupport;

public class MyEditor extends PropertyEditorSupport {

	private Object lll;

	@Override
	public String getAsText() {
		
		return super.getAsText();
		//SimpleDateFormat()
	}
	
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		//2010-01-01
		//SimpleDateFormat().parse();
		
		//Date
		super.setAsText(text);
	}

	


	@Override
	public void setValue(Object value) {
		// TODO Auto-generated method stub
		//Date
		super.setValue(value);
	}


}
