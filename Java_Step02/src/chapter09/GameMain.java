package chapter09;

public class GameMain {

	public static void main(String[] args) {
		System.out.println("===전사 전투===");
		GameCharacter warrir = new Warrior();
		warrir.fight();
		System.out.println("\n====마법사 전투====");
		GameCharacter wizard = new Wizard();
		wizard.fight();

	}

}
