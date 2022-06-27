
public class Monster {

	private String name;
	private String type;
	private int energy;

	public Monster(String name, String type) {

		this.name = name;
		this.type = type;
		energy = 100;
	}

	public String attackTo(Monster target) {

		target.attackedBy(this);
		if (type.equals("Fire")) {

			return attackFire();
		}

		else if (type.equals("Water")) {

			return attackWater();
		}

		else if (type.equals("Stone")) {

			return attackStone();
		}

		return " ";

	}

	public String attackFire() {

		return "Attack with fire";
	}

	public String attackWater() {

		return "Attack with water";
	}

	public String attackStone() {

		return "Attack with stone";
	}

	public int attackedBy(Monster attacker) {
		int damage = 0;
		if (type.equals("Fire")) {
			if (attacker.getType().equals("Water")) {
				damage = energy / 2;
			}
			if (attacker.getType().equals("Stone")) {
				damage = (int) ((float) energy / 1.5);
			}
		} else if (type.equals("Water")) {
			if (attacker.getType().equals("Stone")) {
				damage = energy / 2;
			}
			if (attacker.getType().equals("Fire")) {
				damage = (int) ((float) energy / 1.5);
			}

			else if (type.equals("Stone")) {
				if (attacker.getType().equals("Fire")) {
					damage = energy / 2;
				}
				if (attacker.getType().equals("Water")) {
					damage = (int) ((float) energy / 1.5);
				}

			}

		}
		return damage;

	}

	public String getType() {

		return type;
	}
}
