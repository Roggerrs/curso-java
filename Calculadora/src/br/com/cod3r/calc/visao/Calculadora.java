package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;


import javax.swing.KeyStroke;

import br.com.cod3r.calc.modelo.Memoria;



@SuppressWarnings("serial")
public class Calculadora  extends JFrame{
	
	
	
	 public Calculadora() {
	        organizarLayout();
	        configurarTeclado();  // Chamada para configurar os key bindings

	        setSize(255, 300);
	        // setUndecorated(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLocation(900, 300);
	        setVisible(true);
	    }

	
	
private void organizarLayout() {
	setLayout(new BorderLayout());
	
	Display display = new Display();
	display.setPreferredSize(new Dimension(233, 60));
	add(display, BorderLayout.NORTH);
	
	Teclado teclado = new Teclado();
	add(teclado, BorderLayout.CENTER);
		
	}

public static void main(String[] args) {
	new Calculadora();
}


private void configurarTeclado() {
    // Obtém o InputMap e ActionMap do root pane em modo WHEN_IN_FOCUSED_WINDOW.
    InputMap im = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    ActionMap am = getRootPane().getActionMap();

    // Exemplo para dígitos:
    for (int i = 0; i <= 9; i++) {
        final String digito = String.valueOf(i);
        // Mapeia a tecla numérica (do teclado alfanumérico)
        im.put(KeyStroke.getKeyStroke("pressed " + digito), "digito" + digito);
        am.put("digito" + digito, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Memoria.getInstancia().processarComando(digito);
            }
        });
        // Se desejar, mapeie também o NUMPAD:
        im.put(KeyStroke.getKeyStroke("NUMPAD" + digito), "digito" + digito);
    }

    // Exemplo para operações:
    // Soma
    
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, 0), "soma"); // Algumas configurações do teclado numérico
    am.put("soma", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Memoria.getInstancia().processarComando("+");
        }
    });

    // Subtração (pode ser o sinal de menos)
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, 0), "subtracao");
    im.put(KeyStroke.getKeyStroke('-'), "subtracao");
    am.put("subtracao", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Memoria.getInstancia().processarComando("-");
        }
    });

    // Multiplicação
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ASTERISK, 0), "multiplicacao");
    im.put(KeyStroke.getKeyStroke('*'), "multiplicacao");
    am.put("multiplicacao", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Memoria.getInstancia().processarComando("*");
        }
    });

    // Divisão: observe que pode variar dependendo do layout do teclado
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH, 0), "divisao");
    im.put(KeyStroke.getKeyStroke('/'), "divisao");
    am.put("divisao", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Memoria.getInstancia().processarComando("/");
        }
    });

    // IGUAL (por exemplo, tecla ENTER também para "=")
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, 0), "igual");
    im.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "igual");
    im.put(KeyStroke.getKeyStroke('='), "igual");
    am.put("igual", new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Memoria.getInstancia().processarComando("=");
        }
    });

    // Outros comandos podem ser configurados de forma similar



}
}