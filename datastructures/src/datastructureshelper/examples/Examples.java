package datastructureshelper.examples;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Examples
{
    public void temp()
    {
        Button button = new Button("Click");
        // button.setOnAction(new Question1ButtonsEventService(1));

        Label label = new Label("this is a label");

        TextField textBox = new TextField();
    }


    private void loop1()
    {
        VBox page = new VBox();

        for(Node pageElement : page.getChildrenUnmodifiable())
        {
            if(pageElement instanceof Group)
            {
                Group group = (Group)pageElement;

                if(group.getId().equals("question.1.group"))
                {
                    Text text = (Text)group.getChildren().get(0);
                    text.setText("new text");
                    break;
                }
            }
        }
    }
}