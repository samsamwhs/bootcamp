 // level, role -> maxHp, maxMp, pa, pd, ma, md, ag, cc, cd
public class Archer extends Hero {

  public Archer() {
    super();
  }

  public int getPD() {
    return Heros.getPD(Heros.ARCHER, super.getLevel());
  }

  public void attack(Hero hero) {
    int myAttack = Heros.getPA(Heros.ARCHER, super.getLevel());
    int hpTobeDeducted = myAttack - hero.getPD();
    hero.deductHp(hpTobeDeducted);
  }

  @Override
  public void levelUp() {
    super.levelUp();
    int maxHp = Heros.getMaxHp(Heros.ARCHER, super.getLevel());
    super.setHp(maxHp);
    // System.out.println("test " + super.getLevel() +" " + maxHp);
  }

  public static void main(String[] args) {

    System.out.println(Heros.ARCHER); //1
    System.out.println(Heros.getPA(Heros.ARCHER, 8));//16

    // Testing


    Warrior warrior1 = new Warrior();
    warrior1.levelUp(); // 40

    Mage mage1 = new Mage();
    mage1.levelUp(); 

    Archer archer2 = new Archer();
    archer2.levelUp(); //40
    archer2.levelUp(); //60
    archer2.levelUp(); //80

    System.out.println(warrior1.getHp()); //40
    archer2.attack(warrior1);
    System.out.println(warrior1.getHp()); //34
  }
}