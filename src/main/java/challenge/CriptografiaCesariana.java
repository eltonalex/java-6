package challenge;

import java.util.Arrays;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {

	@Override
	public String criptografar(String texto) {
		if(texto.toString().isEmpty())
			throw new IllegalArgumentException();
		if(texto.toString().equals(null))
			throw new NullPointerException();
		try {
			// chave de deslocamento
			int chave = 3;

			// Variavel que ira guardar o texto crifrado
			StringBuilder textoCifrado = new StringBuilder();

			// Variavel com tamanho do texto a ser encriptado
			int tamanhoTexto = texto.length();
			Integer n[] = new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
			List<Integer> numeros = Arrays.asList(n);
			// Criptografa cada caracter por vez
			for (int c = 0; c < tamanhoTexto; c++) {
				int letraCifradaASCII;
				int letraASCII = ((int) texto.charAt(c));
				if (letraASCII != 32 && !numeros.contains(letraASCII)) {
					// Transforma o caracter em codigo ASCII e faz a criptografia
					letraCifradaASCII = ((int) texto.charAt(c)) + chave;
				} else {
					letraCifradaASCII = letraASCII;
				}
				// Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
				while (letraCifradaASCII > 126)
					letraCifradaASCII -= 94;

				// Transforma codigo ASCII criptografado em caracter ao novo texto
				textoCifrado.append((char) letraCifradaASCII);

			}

			// Por fim retorna a mensagem criptografada por completo
			return textoCifrado.toString().toLowerCase();

		} catch (Exception e) {
			// TODO: handle exception,
			throw new UnsupportedOperationException("esse method nao esta implementado aainda");
		}

	}

	@Override
	public String descriptografar(String texto) {
		
		if(texto.toString().isEmpty()) 
			throw new IllegalArgumentException();
			
		if(texto.toString().equals(null))
			throw new NullPointerException();
		
		try {
			
			// chave de deslocamento
			int chave = -3;

			// Variavel que ira guardar o texto crifrado
			StringBuilder textoCifrado = new StringBuilder();

			// Variavel com tamanho do texto a ser encriptado
			int tamanhoTexto = texto.length();

			Integer n[] = new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
			List<Integer> numeros = Arrays.asList(n);

			// Criptografa cada caracter por vez
			for (int c = 0; c < tamanhoTexto; c++) {
				int letraCifradaASCII;
				int letraASCII = ((int) texto.charAt(c));
				if (letraASCII != 32 && !numeros.contains(letraASCII)) {
					// Transforma o caracter em codigo ASCII e faz a criptografia
					letraCifradaASCII = ((int) texto.charAt(c)) + chave;
				} else {
					letraCifradaASCII = letraASCII;
				}
				// Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
				while (letraCifradaASCII > 126)
					letraCifradaASCII -= 94;

				// Transforma codigo ASCII criptografado em caracter ao novo texto
				textoCifrado.append((char) letraCifradaASCII);

			}
			
			// Por fim retorna a mensagem criptografada por completo
			return textoCifrado.toString().toLowerCase();

		} catch (Exception e) {
			// TODO: handle exception,
			throw new UnsupportedOperationException("esse method nao esta implementado aainda");
		}

	}
}
