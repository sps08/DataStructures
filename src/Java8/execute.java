package Java8;

public class execute {

	public static void main(String[] args) {
		
		Scoreboard e= new Scoreboard(10);
		GameEntry g1 = new GameEntry("satinder", 400);
		GameEntry g2 = new GameEntry("Sonia", 300);
		GameEntry g3 = new GameEntry("Veenu", 200);
		GameEntry g4 = new GameEntry("Lovy", 190);
		GameEntry g5 = new GameEntry("Kumar", 290);
		GameEntry g6 = new GameEntry("Rafia", 800);
		e.add(g1);
		e.add(g2);
		e.add(g3);
		e.add(g4);
		e.add(g5);
		e.add(g6);
		
		System.out.println(e.toString());
		
		
		e.remove(2);
		System.out.println("Entries---" +e.toString());

	}

}
