//Created as a refactoring for A4- God Class bad smell"
package org.gjt.sp.jedit;


import javax.swing.JOptionPane;
import java.io.Serializable;

public class SetViewTitle implements Serializable {
	private String userTitle;

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle2(String userTitle) {
		this.userTitle = userTitle;
	}

	/**
	* Sets a user-defined title for this view instead of the "view.title" property.
	*/
	public void setUserTitle(String title, View view) {
		userTitle = title + " - ";
		view.updateTitle();
	}

	/**
	* Shows a dialog for selecting a user-defined title for this view.
	*/
	public void showUserTitleDialog(View view) {
		String title = JOptionPane.showInputDialog(view, jEdit.getProperty("view.title.select"));
		if (title == null)
			return;
		setUserTitle(title, view);
	}
}
