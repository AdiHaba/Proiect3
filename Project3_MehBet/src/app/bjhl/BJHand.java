package app.bjhl;
public class BJHand extends Hand
{
	public BJHand()
	{
		super(5);
	}
	
	public int BJValue()
	{
		int i, value = 0;
		Card temp;
		int cardVal;
		boolean ace = false;

		for(i = 0; i < getSize(); i++)
		{
			temp = getCard(i);
			cardVal = temp.getCardNumber();
			
			/*if(cardVal > 10)
				cardVal = 10;
			
			else*/
			if(cardVal == 1)
				ace = true;
			
			value += cardVal;
		}
		
		if((ace == true) && ((value + 10) <= 21))
			value += 10;
		
		return value;
	}
}
