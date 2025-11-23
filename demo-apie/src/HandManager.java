import java.util.Arrays;

public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards) {
    // if cards.length !=5, throw exception
    this.cards = cards;
  }

  public void setCards(Card[]cards){
    this.cards = cards;
  }

  public boolean withEmptyCard() {
    return cards[0] == null || cards[1] == null//
        || cards[2] == null || cards[3] == null//
        || cards[4] == null;
  }

  // 33322
  // AAA99 -> A9A9A -> true

  public boolean isFullHouse() { //read only
    // Algorithm
    if (withEmptyCard())
      return false;
    int[] boxes = new int[13];// 13 ranks in total
    for (Card card : this.cards) {
      boxes[card.getRank().getValue() - 1]++;
    }
    // searching 3
    // one 3, one 2, eleven 0
    int threeCount = 0;
    int twoCount = 0;
    int zeroCount = 0;
    for (int i = 0; i < 13; i++) {
      if (boxes[i] == 0)
        zeroCount++;
      if (boxes[i] == 2)
        twoCount++;
      if (boxes[i] == 3)
        threeCount++;
    }
    return zeroCount == 11 && twoCount == 1 && threeCount == 1;
  }

  //Straight Flush







  public static void main(String[] args) {
    Card[] hand1 = new Card[]{//
      new Card(CardSuit.HEART,CardRank.ACE),
      new Card(CardSuit.CLUB,CardRank.ACE),
      new Card(CardSuit.HEART,CardRank.TEN),
      new Card(CardSuit.DIAMOND,CardRank.ACE),
      new Card(CardSuit.SPADE,CardRank.TEN)};

    Card[] hand2 = new Card[]{//
      new Card(CardSuit.HEART,CardRank.ACE),
      new Card(CardSuit.CLUB,CardRank.ACE),
      new Card(CardSuit.HEART,CardRank.TEN),
      new Card(CardSuit.DIAMOND,CardRank.QUEEN),
      new Card(CardSuit.SPADE,CardRank.TEN)};

      HandManager hm = new HandManager(hand1);
    System.out.println(hm.isFullHouse()); //true
    System.out.println(hm.withEmptyCard());//false

      hm.setCards(hand2);
      System.out.println(hm.isFullHouse());//false


  }
}


