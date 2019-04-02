/*
Autor: Chuy BC
Fecha de inicio: 4/2/19
Fecha de terminación: ~
Objetivo del Programa:class hero vainglory
*/
import java.io.Serializable;
public class Hero implements Serializable
{
	public String heroName;
	public float health;
	public float weaponDamage;
	public float armor;
	public float shield;
	public Ability[] heroAblty;

	ArrayList<Ability> heroeAbilies  = new ArrayList<Ability>();

	public Hero(String heroName, float health, float weaponDamage, float armor, float shield, Ability[] heroAblty)
	{
		this.heroName = heroName;
		this.health = health;
		this.weaponDamage = weaponDamage;
		this.armor = armor;
		this.shield = shield;
		this.heroAblty = heroAblty;
	}
	//Get start ---------------------
	public String getHeroName()
	{
		return  heroName;
	}
	public float getHealth()
	{
		return health;
	}
	public float getWeaponDamage()
	{
		return weaponDamage;
	}
	public float getArmor()
	{
		return armor;
	}
	public float getShield()
	{
		return shield;
	}
	public Ability[] getHeroAblty()
	{
		return heroAblty;
	}
	//Get end ---------------------

	//Methods start --------------
	private void createAbility()
	{
		heroeAbilies.add(new Ability(/*read*/0.8,1.0,500));
		heroeAbilies.add(new Ability(/*read*/0.8,1.0,500));
		heroeAbilies.add(new Ability(/*read*/0.8,1.0,500));
	}
	//Methods end ----------------
}
