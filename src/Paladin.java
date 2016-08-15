
public class Paladin extends Character implements Stats {

	@Override
	public double Strength() {
		double str = 16;
		//Level Modifier
		if(this.charLvl > 1){
			str = str + (str * (.15 * charLvl));
		}
		return str;
	}

	@Override
	public double Dexterity() {
		double dex = 9;
		//Level Modifier
		if(this.charLvl > 1){
			dex = dex + (dex * (.1 * charLvl));
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
		double chr = 10;
		//Level Modifier
		if(this.charLvl > 1){
			chr = chr + (chr * (.1 * charLvl));
		}
		return chr;
	}



}
