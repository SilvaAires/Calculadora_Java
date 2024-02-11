public class Calculadora {
	private double num1;
	private double num2;
	private String simbolo;
	
	public Calculadora() {
		
	}
	public Calculadora(double num1, double num2, String simbolo) {
		this.num1 = num1;
		this.num2 = num2;
		this.simbolo = simbolo;
	}
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public String getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	public double calres(double num1, double num2, String simbolo) {
		double r = 0;
		if(simbolo == "s") {
			r = num1 + num2;
			return r;
		}else {
			if(simbolo == "d") {
				r = num1 - num2;
				return r;
			}else {
				if(simbolo == "m") {
					r = num1 * num2;
					return r;
				}else {
					if(simbolo == "dd") {
						r = num1 / num2;
						return r;
					}
				}
			}
		}
		return r;
	}
	
	@Override
	public String toString() {
		return  this.num1 + " " + this.num2 + " " + this.simbolo;
	}
}
