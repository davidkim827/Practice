package CSC202.Labs.Week4;

public class LLNode {
    private int randomNumber;
    private LLNode next;

    public LLNode(int randomNumber, LLNode n) {
        next = n;
        if (randomNumber <= 1000 && randomNumber > 0)
            setRandomNumber(randomNumber);
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    public String toString() {
        return "" + randomNumber;
    }
}
