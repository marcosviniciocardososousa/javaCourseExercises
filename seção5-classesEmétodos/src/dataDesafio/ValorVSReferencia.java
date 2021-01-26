package dataDesafio;

public class ValorVSReferencia {

	public static void main(String[] args) {
		double a = 2;
		double b = a;
		a++;
		b--;
		System.out.println(a+" "+b);//um valor não depende do outro!!!!
		
		//exemplo de atribuição por referência.
		Data d1 = new Data(1,6,1970);
		Data d2 = d1; //atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		//independente se a modificação foi em d1 ou d2 ela vai ser refletida nos 2
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		
	}

}
