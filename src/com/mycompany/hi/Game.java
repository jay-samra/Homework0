package com.mycompany.hi;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

public class Game {
	
	public Game() {
		Form hi = new Form("Hi World", BoxLayout.y());
		hi.add(new Label("Hi World From Game"));
		hi.show();
	}
}
