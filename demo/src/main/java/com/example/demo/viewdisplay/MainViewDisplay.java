package com.example.demo.viewdisplay;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Thanak Ngan (t.ngan@gl-f.com) on 8/14/2017.
 */
@SpringViewDisplay
public class MainViewDisplay extends CustomComponent implements ViewDisplay {

  private final VerticalLayout content = new VerticalLayout();


  public MainViewDisplay(){
    final VerticalLayout root = new VerticalLayout();
    root.addComponent(new TextField("FirstName"));
    root.addComponent(new TextField("Password"));
    setCompositionRoot(root);
  }

  @Override
  public void showView(View view) {
    content.removeAllComponents();
    content.addComponent((Component) view);
  }
}
