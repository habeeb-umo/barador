
public class Druid extends Character implements Stats{
		
	public Druid(){
		//Class Weapon
		this.classWep = wepType.STAFF;
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
		double dex = 14;
		//Level Modifier
		if(this.charLvl > 1){
			dex = dex + (dex * (.12 * charLvl));
		}
		return dex;
	}

	@Override
	public double Constitution() {
		double con = 13;
		//Level Modifier
		if(this.charLvl > 1){
			con = con + (con * (.12 * charLvl));
		}
		return con;
	}

	@Override
	public double Intelligence() {
		double inx = 16;
		//Level Modifier
		if(this.charLvl > 1){
			inx = inx + (inx * (.15 * charLvl));
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
