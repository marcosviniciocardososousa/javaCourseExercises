package dataDesafio;

public class DataTeste {

	public static void main(String[] args) {
		var d1 = new Data();
		var d2 = new Data();
		
		d2.dia = 07;
		d2.mes = 06;
		d2.ano = 2019;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		
	}

}
