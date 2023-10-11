package Entidades;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Operacoes {
	
//Metodos-Funcionalidades
	public float getAdicao(float number, float numero) {
		return number+numero;}
	
	public float getSubtracao(float number, float numero) {
		return number-numero;}
	
	public float getDivisao(float number, float numero) {
		if (numero==0) {
			System.out.println("Nao se pode dividir por zero");
			return number;
		}else {
			return number/numero;}}
	
	public float getMultiplicacao(float number, float numero) {
		return number*numero;}
	
	public float getRaiz(float number) {
		return (float) Math.sqrt(number);}
	
	public float getPotencia(float number, float numero) {
		return (float) Math.pow(number, numero);}	
}