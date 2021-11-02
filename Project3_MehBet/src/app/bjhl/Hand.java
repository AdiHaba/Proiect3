package app.bjhl;
import java.util.ArrayList;

public class Hand 
{
	protected ArrayList<Card> hand;
    private int maxSize;

	public Hand(int maxSize)
	{
		hand = new ArrayList<Card>();
        this.maxSize = maxSize;
	}

	public boolean addCard(Card currentCard)
	{
        if(hand.size() >= maxSize){
             return false;
        }

		hand.add(currentCard);
        return true;
	}

	public int getSize()
	{
		return hand.size();
	}

	public void removeCard(int cardPosition)
	{
		hand.remove(cardPosition - 1);
	}
	public void removeCard(Card currentCard)
	{
		hand.remove(currentCard);
	}
	public void clearHand()
	{
		hand.clear();
	}
	public Card getCard(int i)
	{
		return hand.get(i);
	}
	public ArrayList<Card> getHand(){
		return hand;
	}

    public int getMaxSize(){
        return maxSize;
    }
}
