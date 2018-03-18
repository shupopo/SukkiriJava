package practice_chap3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero h = new Hero("Saito");
		Hero h2 = new Hero("Suzuki");
		List<Hero> l = new ArrayList<>();
		l.add(h);
		l.add(h2);
		for (Hero hero : l) {
			System.out.println(hero.getName());
		}
		Map<Hero, Integer> enemyNum = new HashMap<Hero, Integer>();
		enemyNum.put(h,3);
		enemyNum.put(h2, 7);
		for(Hero hero:enemyNum.keySet()){
			int value = enemyNum.get(hero);
			System.out.println(hero.getName()+"が倒した敵の数は"+value+"です");
		}
	}

}
