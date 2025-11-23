public class Deck {

  //private static final char[] = //A,2,3,4,...J,Q

  //card array
  private Card[] cards;

  public Deck(){
    this.cards = new Card[CardSuit.values().length * CardRank.values().length];
    int idx = 0;
    for(CardSuit suit : CardSuit.values()){//4
      for(CardRank rank: CardRank.values()){ //13
        //create new card
        this.cards[idx++] = new Card(suit,rank);
      }
    }
  }

  public Card [] getCards(){
    return this.cards;
  }

  public void setCards (Card[] cards){
    this.cards = cards;
  }


}
