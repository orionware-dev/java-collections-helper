package datastructureshelper.buttonevents;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.VBox;

public class Question1ButtonsEventService implements EventHandler<ActionEvent>
{
    private int buttonID;
    private boolean buildQuestion2 = true;
    private VBox page;
    private int indexOfEmptyNode;


    public Question1ButtonsEventService(int buttonID)
    {
        this.buttonID = buttonID;
    }


    @Override
    public void handle(ActionEvent event)
    {
        /*
         * Group group = (Group)pageElement;
         * FunctionalInterfaceIndexOfEmptyNode functionalInterfaceIndexOfEmptyNode = (Node emptyNode) -> this.indexOfEmptyNode = group.getChildren().indexOf(emptyNode);
         * group.getChildren().parallelStream().filter((node) -> node.getId() != null).filter((node) -> node.getId().equals("empty.node")).forEach(functionalInterfaceIndexOfEmptyNode::setIndexOfEmptyNode);
         * if(buttonID == 1)
         * {
         * UserAnswers.needList = true;
         * sb.append("List and ArrayList");
         * sb.append("\n");
         * sb.append("List and CopyOnWriteArrayList");
         * sb.append("\n");
         * sb.append("List and LinkedList");
         * sb.append("\n");
         * sb.append("Set and HashSet");
         * sb.append("\n");
         * sb.append("Set and CopyOnWriteHashSet");
         * sb.append("\n");
         * sb.append("Set and LinkedHashSet");
         * sb.append("\n");
         * sb.append("SortedSet and TreeSet (with comparator)");
         * sb.append("\n");
         * sb.append("NavigableSet and TreeSet (with comparator)");
         * }
         * else if(buttonID == 2)
         * {
         * UserAnswers.needMapping = true;
         * sb.append("Map and HashMap");
         * sb.append("\n");
         * sb.append("ConcurrentMap and ConcurrentHashMap");
         * sb.append("\n");
         * sb.append("Map and LinkedHashMap");
         * sb.append("\n");
         * sb.append("SortedMap and TreeMap (with comparator)");
         * sb.append("\n");
         * sb.append("Map and IdentityHashMap");
         * sb.append("\n");
         * sb.append("Map and WeakHashMap");
         * sb.append("\n");
         * sb.append("NavigableMap and TreeMap (with comparator)");
         * }
         * else if(buttonID == 3)
         * {
         * UserAnswers.needQueue = true;
         * sb.append("Queue and PriorityQueue");
         * sb.append("\n");
         * sb.append("Queue and BlockingQueue");
         * sb.append("\n");
         * sb.append("BlockingQueue and SynchronousQueue");
         * sb.append("\n");
         * sb.append("BlockingQueue and DelayQueue");
         * sb.append("\n");
         * sb.append("Deque and LinkedList");
         * sb.append("\n");
         * sb.append("Deque and ArrayDeque");
         */
    }
}