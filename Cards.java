package ws2;
import java.util.*;
public class Cards {
	LinkedList<String> cards = new LinkedList<String>();
	String[] suits = { "Diamond", "Heart", "Spades", "Club" };
	String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	
	public void setcard() {
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 12; j++ ) {
				cards.add(suits[i]+" "+rank[j]);
			}
		}
	}
	public static void main(String[] args) {
		Cards card = new Cards();
		card.setcard();
	}
}
