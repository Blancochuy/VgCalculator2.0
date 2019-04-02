/*
Autor: Chuy BC
Fecha de inicio: 4/2/19
Fecha de terminación:
Objetivo del Programa:
*/
import java.io.Serializable;
public class Ability implements Serializable
{
	public float wpRatio;
	public float cpRatio;
	public int[] abilityDamage = new int[5];

	public Ability(float wpRatio, float cpRatio, int[] abilityDamage)
	{
		this.wpRatio = wpRatio;
		this.cpRatio = cpRatio;
		this.abilityDamage = abilityDamage;
	}
	public float getWpRatio()
	{
		return wpRatio;
	}
	public float getCpRatio()
	{
		return cpRatio;
	}
	public int[] getAbilityDamage()
	{
		return abilityDamage;
	}
}
