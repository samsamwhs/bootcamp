
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MSWord {
  
  //Current list of characters
  //private List<Character> characters;
  private Deque<Character> characters;
  //Deque
  //private Deque<Character> undoStack;
  //private Deque<Character> redoStack;
  private char temp;

  public MSWord(){
    this.characters = new LinkedList<>();
  }

  public void write (char c){
    this.characters.add(c);
  }

  public void undo(){
    temp = this.characters.pollLast();
  }

  public void redo(){
    this.characters.addLast(temp);
  }


  public static void main(String[] args) {
    Deque<Character> test = new 
  }


}
