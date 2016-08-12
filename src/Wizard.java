
public class Wizard extends Character implements Stats{
	
	@Override
	public double Strength() {
		double str = 8;
		//Level Modifier
		if(this.charLvl > 1){
			str = str + (str * (.1 * charLvl));
		}
		return str;
	}

	@Override
	public double Dexterity() {
		double dex = 13;
		//Level Modifier
		if(this.charLvl > 1){
			dex = dex + (dex * (.12 * charLvl));
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

	public static void main(String[] args){
		Wizard wiz = new Wizard();
		wiz.charLvl = 1;
		System.out.println(wiz.Strength());
		System.out.println(wiz.Dexterity());
		System.out.println(wiz.Constitution());
		System.out.println(wiz.Intelligence());
		System.out.println(wiz.Charisma());
	}
}
