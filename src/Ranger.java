
public class Ranger extends Character implements Stats {
	
	public Ranger(){
		//Class Weapon
		this.classWep = wepType.BOW;
	}
	@Override
	public double Strength() {
		double str = 10;
		//Level Modifier
		if(this.charLvl > 1){
			str = str + (str * (.1 * charLvl));
		}
		return str;
	}

	@Override
	public double Dexterity() {
		double dex = 16;
		//Level Modifier
		if(this.charLvl > 1){
			dex = dex + (dex * (.15 * charLvl));
		}
		return dex;
	}

	@Override
	public double Constitution() {
		double con = 14;
		//Level Modifier
		if(this.charLvl > 1){
			con = con + (con * (.12 * charLvl));
		}
		return con;
	}

	@Override
	public double Intelligence() {
		double inx = 12;
		//Level Modifier
		if(this.charLvl > 1){
			inx = inx + (inx * (.12 * charLvl));
		}
		return inx;
	}

	@Override
	public double Charisma() {
		double chr = 9;
		//Level Modifier
		if(this.charLvl > 1){
			chr = chr + (chr * (.1 * charLvl));
		}
		return chr;
	}


}
