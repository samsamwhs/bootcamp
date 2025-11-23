import java.util.Arrays;
import java.util.Objects;


public class Card {
  private CardSuit suit;//DIAMOND, CLUB, HEART, SPADE
  private CardRank rank;//A,2,3,4,...J,Q,K

  //constructor, getter
  public Card (CardSuit suit, CardRank rank){
    this.suit = suit;
    this.rank = rank;
  }

  @Override
  public String toString(){
    return "Card("//
    + "suite=" + this.suit//
    + ",rank=" + this.rank//
    + ")";
  }

public CardSuit getSuit(){
  return this.suit;
}

public CardRank getRank(){
  return this.rank;
}

  //equals()
@Override
  public boolean equals(Object obj){
    if (this == obj) { 
      return true;
    }
    if (!(obj instanceof Card)) { //check if the datatype
      return false;
    }
    Card card = (Card) obj; //put obj to Card reference
    // return this.suit == card.getSuit()//
    //     && this.rank == card.getRank();
    return Objects.equals(this.suit, card.getSuit())//
        && Objects.equals(this.rank, card.getRank());
  }

  @Override
 
  public int hashCode(){
    return Objects.hash(this.suit, this.rank);
  }



  //52 cards
  //Deck.java


  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(Arrays.toString(deck.getCards()));

    Card c1 = new Card (CardSuit.DIAMOND, CardRank.KING);
    Card c2 = new Card (CardSuit.HEART, CardRank.QUEEN);
    System.out.println(c1.equals(c2)); //false
    Card c3 = new Card (CardSuit.HEART, CardRank.QUEEN);
    System.out.println(c2.equals(c3));//true
  
  }

}




