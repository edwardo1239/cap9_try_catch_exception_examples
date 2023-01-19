package tryThis9;

//An axception for queue-empty errors
public class QueueEmptyException extends Exception {
    
    public String toString() {
        return "\nQueue is empty.";
    }
}
