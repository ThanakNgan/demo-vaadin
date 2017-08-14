package com.example.demo;

import com.example.demo.viewdisplay.MainViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * Copyright (c) GL Finance Plc. All rights reserved. (http://www.gl-f.com/)
 * Author: Thanak Ngan (t.ngan@gl-f.com) on 8/14/2017.
 */
@SpringUI
public class Application extends UI {

  private  MainViewDisplay mainViewDisplay ;

  public Application(MainViewDisplay mainViewDisplay) {
    this.mainViewDisplay = mainViewDisplay;
  }

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    setContent(mainViewDisplay);
  }
}
