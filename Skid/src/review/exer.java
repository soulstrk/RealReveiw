package review;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Exer {
	
	public static void print(Player[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}
	}
	
	public static void PlusRecord(Player p, int plusTasu, int plusAnta) {
		p.tasu += plusTasu;
		p.anta += plusAnta;
		p.avg = (double) p.anta / p.tasu;
		p.avg = Double.parseDouble(String.format("%.3f", p.avg));

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player[] players = new Player[4];
		
		for (int i = 0; i < players.length; i++) {
			String name = sc.next();
			int tasu = sc.nextInt();
			int anta = sc.nextInt();
			players[i] = new Player(name, tasu, anta);
		}
		
		Arrays.sort(players);
		System.out.println("타율순위");
		print(players);
		
		boolean flag = true;
		while(flag) {
			System.out.println("1."+players[0].name+" 2."+players[1].name+" 3."+players[2].name+" 4."+players[3].name+" 기록종료>0");
			int playerNum = sc.nextInt();
			if(playerNum == 0) break;
			int plusTasu = sc.nextInt();
			int plusAnta = sc.nextInt();
			
			switch (playerNum) {
			case 1:
				PlusRecord(players[playerNum-1], plusTasu, plusAnta);
				break;
			case 2:
				PlusRecord(players[playerNum-1], plusTasu, plusAnta);
				break;
			case 3:
				PlusRecord(players[playerNum-1], plusTasu, plusAnta);
				break;
			case 4:
				PlusRecord(players[playerNum-1], plusTasu, plusAnta);
				break;
			}
		}
		
		print(players);

	}
}

class Player implements Comparable<Player> {
	String name;
	int tasu;
	int anta;
	double avg = 0f;

	Player(String name, int tasu, int anta) {
		this.name = name;
		this.tasu = tasu;
		this.anta = anta;
		avg = (double) anta / tasu;
		avg = Double.parseDouble(String.format("%.3f", avg));
	}

	public String toString() {
		return "선수이름:" + name + " 타율:" + avg;
	}
	
	public int compareTo(Player p) {
		if(this.avg < p.avg) {
			return 1;
		} else if (this.avg == p.avg) {
			return 0;
		} else {
			return -1;
		}
	}

}