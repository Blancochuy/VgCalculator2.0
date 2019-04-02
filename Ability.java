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
	public int damageAbility;

	public Ability(float wpRatio, float cpRatio, int damageAbility)
	{
		this.wpRatio = wpRatio;
		this.cpRatio = cpRatio;
		this.damageAbility = damageAbility;
	}
	public float getWpRatio()
	{
		return wpRatio;
	}
	public float getCpRatio()
	{
		return cpRatio;
	}
	public int damageAbility()
	{
		return damageAbility;
	}
}
