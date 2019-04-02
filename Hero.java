/*
Autor: Chuy BC
Fecha de inicio: 4/2/19 
Fecha de terminación: ~
Objetivo del Programa:class hero vainglory
*/
class Hero
{
	public float health;
	public float weaponDamage;
	public float armor;
	public float shield;
	public Ability[] heroAblty;
	
	public Hero(float health, float weaponDamage, float armor, float shield, Ability[] heroAblty)
	{
		this.health = health;
		this.weaponDamage = weaponDamage;
		this.armor = armor;
		this.shield = shield;
		this.heroAblty = heroAblty;
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
}