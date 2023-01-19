package tryThis9;

//A character queque interface
public interface ICharQ {
    //put a character into the queue
    void put(char ch) throws QueueFullException;

    //Get a character from the queue
    char get() throws QueueEmptyException;
}