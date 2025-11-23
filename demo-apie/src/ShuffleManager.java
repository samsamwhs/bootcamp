import java.util.Random;

public class ShuffleManager {
  private Deck deck; // this is address

  public ShuffleManager(Deck deck) {
    this.deck = deck;
  }

  public void shuffle() {
    Card[] newCards = new Card[deck.getCards().length];
    int idx = 0;

    for (int i = 0; i < 50; i++) { // 100 times
      // random idx (20-40)
      int randomIdx = new Random().nextInt(21) + 20; // cutting card: pick 10 card in the middle
      idx = 0;
      for (int j = randomIdx; j < randomIdx + 10; j++) { // putting that 10 card into newCards (1st part)
        System.out.println("j=" + j);
        newCards[idx++] = deck.getCards()[j];
      }
      for (int j = 0; j < randomIdx; j++) { // putting original 1st part into newCards(2nd part)
        newCards[idx++] = deck.getCards()[j];
      }
      for (int j = randomIdx + 10; j < deck.getCards().length; j++) { //
        newCards[idx++] = deck.getCards()[j];
      }
      deck.setCards(newCards);
    }

  }



  public static void main(String[] args) {
    Deck d1 = new Deck();
    ShuffleManager sm = new ShuffleManager(d1);
    sm.shuffle();
    System.out.println(d1);
  }
}
