 // level, role -> maxHp, maxMp, pa, pd, ma, md, ag, cc, cd
public class Mage extends Hero {

  public Mage() {
    super();
  }

  public int getPD() {
    return Heros.getPD(Heros.MAGE, super.getLevel());
  }

  public void attack(Hero hero) {
    int myAttack = Heros.getPA(Heros.MAGE, super.getLevel());
    int hpTobeDeducted = myAttack - hero.getPD();
    hero.deductHp(hpTobeDeducted);
  }

  @Override
  public void levelUp() {
    super.levelUp();
    int maxHp = Heros.getMaxHp(Heros.MAGE, super.getLevel());
    super.setHp(maxHp);
    // System.out.println("test " + super.getLevel() +" " + maxHp);
  }

  public static void main(String[] args) {

    System.out.println(Heros.MAGE); //2
    System.out.println(Heros.getPA(Heros.MAGE, 8));//16

    // Testing
    Warrior warrior1 = new Warrior();
    warrior1.levelUp(); // 40

    Mage mage1 = new Mage();
    mage1.levelUp(); 

    Mage mage2 = new Mage();
    mage2.levelUp(); //40
    mage2.levelUp(); //60

    System.out.println(warrior1.getHp()); //40
    mage2.attack(warrior1);
    System.out.println(warrior1.getHp()); //36
  }
}