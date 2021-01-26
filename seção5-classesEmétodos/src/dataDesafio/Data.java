package dataDesafio;

public class Data {
	Integer dia;
	Integer mes;
	Integer ano;
	Data(){
		
	}
	Data(int diaNovo, int mesNovo, int anoNovo){
		dia = diaNovo;
		mes = mesNovo;
		ano = anoNovo;
		
	}
	
	String dataFormatada(){
		String data = dia.toString() + "/" + mes.toString() + "/" + ano.toString(); 
		return data;
		/*PODERIAMOS USAR STRING.FORMAT
		 return String.format("%d/%d/%d",dia,mes,ano);
		 //funciona como se fosse um printf
		 
		 */
	}
	
	
}
