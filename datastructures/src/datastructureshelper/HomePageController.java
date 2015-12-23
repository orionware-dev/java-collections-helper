package datastructureshelper;

import datastructureshelper.buttonevents.UserAnswers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePageController
{
    public ToggleGroup radioButtonsGroup1;
    public ToggleGroup radioButtonsGroup2;
    public ToggleGroup radioButtonsGroup3;
    public ToggleGroup radioButtonsGroup4;
    public ToggleGroup radioButtonsGroup5;
    public ToggleGroup radioButtonsGroup6;
    public ToggleGroup radioButtonsGroup7;
    private Stage stage;
    private VBox page;


    public HomePageController()
    {

    }


    public HomePageController(Stage stage)
    {
        this.stage = stage;
    }


    public void openPage()
    {
        buildWindow();
    }


    private void buildWindow()
    {
        try
        {
            stage.setTitle("Data Structure Guide");
            page = (VBox)FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            page.setSpacing(15);
            ScrollPane scroller = new ScrollPane();
            scroller.setContent(page);
            Scene scene = new Scene(scroller, 1000, 1000);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    private void buildListOfAllDataStructures()
    {
        Text text1 = new Text("No data structures yet");
        text1.setId("list.of.data.structures.applied.to.user.answers");
        StringBuilder sb = new StringBuilder();
        sb.append("List and ArrayList");
        sb.append("\n");
        sb.append("List and CopyOnWriteArrayList");
        sb.append("\n");
        sb.append("List and LinkedList");
        sb.append("\n");
        sb.append("Set and HashSet");
        sb.append("\n");
        sb.append("Set and CopyOnWriteHashSet");
        sb.append("\n");
        sb.append("Set and LinkedHashSet");
        sb.append("\n");
        sb.append("SortedSet and TreeSet (with comparator)");
        sb.append("\n");
        sb.append("NavigableSet and TreeSet (with comparator)");

        sb.append("Map and HashMap");
        sb.append("\n");
        sb.append("ConcurrentMap and ConcurrentHashMap");
        sb.append("\n");
        sb.append("Map and LinkedHashMap");
        sb.append("\n");
        sb.append("SortedMap and TreeMap (with comparator)");
        sb.append("\n");
        sb.append("Map and IdentityHashMap");
        sb.append("\n");
        sb.append("Map and WeakHashMap");
        sb.append("\n");
        sb.append("NavigableMap and TreeMap (with comparator)");

        sb.append("Queue and PriorityQueue");
        sb.append("\n");
        sb.append("Queue and BlockingQueue");
        sb.append("\n");
        sb.append("BlockingQueue and SynchronousQueue");
        sb.append("\n");
        sb.append("BlockingQueue and DelayQueue");
        sb.append("\n");
        sb.append("Deque and LinkedList");
        sb.append("\n");
        sb.append("Deque and ArrayDeque");

        text1.setText(sb.toString());
        page.getChildren().add(text1);
    }


    @FXML
    public void question1Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needList = true;
        UserAnswers.needMapping = false;
        UserAnswers.needQueue = false;
        // new Question1ButtonsEventService(1).handle(event);
    }


    @FXML
    public void question1Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needList = false;
        UserAnswers.needMapping = true;
        UserAnswers.needQueue = false;
    }


    @FXML
    public void question1Button3EventHandler(ActionEvent event)
    {
        UserAnswers.needList = false;
        UserAnswers.needMapping = false;
        UserAnswers.needQueue = true;
    }


    @FXML
    public void question2Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needUniqueElements = true;
    }


    @FXML
    public void question2Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needUniqueElements = false;
    }


    @FXML
    public void question3Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needSortedElements = true;
        UserAnswers.needOrderedElements = false;
        UserAnswers.needUnsortedAndnUnorderedElements = false;
    }


    @FXML
    public void question3Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needSortedElements = false;
        UserAnswers.needOrderedElements = true;
        UserAnswers.needUnsortedAndnUnorderedElements = false;
    }


    @FXML
    public void question3Button3EventHandler(ActionEvent event)
    {
        UserAnswers.needSortedElements = false;
        UserAnswers.needOrderedElements = false;
        UserAnswers.needUnsortedAndnUnorderedElements = true;
    }


    @FXML
    public void question4Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needConcurrency = true;
    }


    @FXML
    public void question4Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needConcurrency = false;
    }


    @FXML
    public void question5Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needReverseIteration = true;
    }


    @FXML
    public void question5Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needReverseIteration = false;
    }


    @FXML
    public void question6Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needDequeue = true;
    }


    @FXML
    public void question6Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needDequeue = false;
    }


    @FXML
    public void question7Button1EventHandler(ActionEvent event)
    {
        UserAnswers.needFastSearching = true;
    }


    @FXML
    public void question7Button2EventHandler(ActionEvent event)
    {
        UserAnswers.needFastSearching = false;
    }


    @FXML
    public void showResultsEventHandler(ActionEvent event)
    {
        String results = new DataStructuresService().getResults();
        Button showResultsButton = (Button)event.getSource();
        VBox pageTemp = (VBox)showResultsButton.getParent().getParent();

        for(Node pageElement : pageTemp.getChildrenUnmodifiable())
        {
            if(pageElement instanceof Group)
            {
                Group group = (Group)pageElement;

                if(group.getId().equals("results.group"))
                {
                    Text text = (Text)group.getChildren().get(0);
                    text.setText(results);
                    break;
                }
            }
        }
    }


    public ToggleGroup getRadioButtonsGroup1()
    {
        return this.radioButtonsGroup1;
    }


    public void setRadioButtonsGroup1(ToggleGroup radioButtonsGroup1)
    {
        this.radioButtonsGroup1 = radioButtonsGroup1;
    }


    public ToggleGroup getRadioButtonsGroup2()
    {
        return this.radioButtonsGroup2;
    }


    public void setRadioButtonsGroup2(ToggleGroup radioButtonsGroup2)
    {
        this.radioButtonsGroup2 = radioButtonsGroup2;
    }


    public ToggleGroup getRadioButtonsGroup3()
    {
        return this.radioButtonsGroup3;
    }


    public void setRadioButtonsGroup3(ToggleGroup radioButtonsGroup3)
    {
        this.radioButtonsGroup3 = radioButtonsGroup3;
    }


    public ToggleGroup getRadioButtonsGroup4()
    {
        return this.radioButtonsGroup4;
    }


    public void setRadioButtonsGroup4(ToggleGroup radioButtonsGroup4)
    {
        this.radioButtonsGroup4 = radioButtonsGroup4;
    }


    public ToggleGroup getRadioButtonsGroup5()
    {
        return this.radioButtonsGroup5;
    }


    public void setRadioButtonsGroup5(ToggleGroup radioButtonsGroup5)
    {
        this.radioButtonsGroup5 = radioButtonsGroup5;
    }


    public ToggleGroup getRadioButtonsGroup6()
    {
        return this.radioButtonsGroup6;
    }


    public void setRadioButtonsGroup6(ToggleGroup radioButtonsGroup6)
    {
        this.radioButtonsGroup6 = radioButtonsGroup6;
    }


    public ToggleGroup getRadioButtonsGroup7()
    {
        return this.radioButtonsGroup7;
    }


    public void setRadioButtonsGroup7(ToggleGroup radioButtonsGroup7)
    {
        this.radioButtonsGroup7 = radioButtonsGroup7;
    }
}