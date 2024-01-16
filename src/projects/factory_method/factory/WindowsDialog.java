package projects.factory_method.factory;

import projects.factory_method.buttons.Button;
import projects.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}