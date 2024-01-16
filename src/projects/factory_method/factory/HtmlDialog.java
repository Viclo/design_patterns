package projects.factory_method.factory;

import projects.factory_method.buttons.Button;
import projects.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}