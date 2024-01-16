package projects.factory_method.factory;

import projects.factory_method.buttons.Button;

public abstract class Dialog {
  public void renderWindow() {
    Button okButton = createButton();
    okButton.render();
  }

  public abstract Button createButton();
}