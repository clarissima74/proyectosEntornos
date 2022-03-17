import org.eclipse.swt.widgets.Display;
	import org.eclipse.swt.widgets.Shell;
	import org.eclipse.swt.widgets.Table;

	import javax.swing.JOptionPane;

	import org.eclipse.swt.SWT;
	import org.eclipse.swt.widgets.Button;
	import org.eclipse.swt.widgets.Text;
	import org.eclipse.swt.events.SelectionAdapter;
	import org.eclipse.swt.events.SelectionEvent;

public class Calculadora2 {

	//comentario escrito en GitHub

	// Constantes
		final int MAX_DIGITOS = 5;
		final int MODO_ENTRADA = 0;
		final int MODO_RESULTADO = 1;
	 
		//Variables
		int modo;
		int valor1;
		int valor2;
		String operacion;
		boolean inicializar_resultado;
	 
		private static Text texto_resultado;

		public static void main(String args[]) {
			Calculadora2 calculadora = new Calculadora2(true);
		}	
	 
		public Calculadora2(boolean gui) {		
	 
			//Inicialización de las variables.
			inicializar();
	 
			if (gui==true) dibujaCalculadora();
	 
		}
	 	private void dibujaCalculadora() {
	 
			Display display = Display.getDefault();
			Shell shlCalculadora = new Shell();
			shlCalculadora.setSize(259, 250);
			shlCalculadora.setText("Calculadora");
	 
			//-------------------------------------------------
			//Números
			//-------------------------------------------------
	 
			//botón con el número 0
			Button button_0 = new Button(shlCalculadora, SWT.NONE);
			button_0.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(0);
				}
			});
			button_0.setText("0");
			button_0.setBounds(23, 163, 40, 33);
	 
			//botón con el número 1
			Button button_1 = new Button(shlCalculadora, SWT.NONE);
			button_1.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(1);
				}
			});
			button_1.setText("1");
			button_1.setBounds(23, 124, 40, 33);
	 
			//botón con el número 2
			Button button_2 = new Button(shlCalculadora, SWT.NONE);
			button_2.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(2);
				}
			});
			button_2.setText("2");
			button_2.setBounds(69, 124, 40, 33);
	 
			//botón con el número 3
			Button button_3 = new Button(shlCalculadora, SWT.NONE);
			button_3.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(3);
				}
			});
			button_3.setText("3");
			button_3.setBounds(115, 124, 40, 33);
	 
			//botón con el número 4
			Button button_4 = new Button(shlCalculadora, SWT.NONE);
			button_4.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(4);
				}
			});
			button_4.setText("4");
			button_4.setBounds(23, 85, 40, 33);
	 
			//botón con el número 5
			Button button_5 = new Button(shlCalculadora, SWT.NONE);
			button_5.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(5);
				}
			});
			button_5.setText("5");
			button_5.setBounds(69, 85, 40, 33);
	 
			//botón con el número 6
			Button button_6 = new Button(shlCalculadora, SWT.NONE);
			button_6.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(6);
				}
			});
			button_6.setText("6");
			button_6.setBounds(115, 85, 40, 33);
	 
			//botón con el número 7
			Button button_7 = new Button(shlCalculadora, SWT.NONE);
			button_7.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(7);
				}
			});
			button_7.setText("7");
			button_7.setBounds(23, 46, 40, 33);
	 
			//botón con el número 8
			Button button_8 = new Button(shlCalculadora, SWT.NONE);
			button_8.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(8);
				}
			});
			button_8.setBounds(69, 46, 40, 33);
			button_8.setText("8");
	 
			//botón con el número 9
			Button button_9 = new Button(shlCalculadora, SWT.NONE);
			button_9.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					anyadirDigitoNuevo(9);
				}
			});
			button_9.setText("9");
			button_9.setBounds(115, 46, 40, 33);
			//-------------------------------------------------
			//Operaciones
			//-------------------------------------------------
	 
			//botón con la operación de división
			Button button_12 = new Button(shlCalculadora, SWT.NONE);
			button_12.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ejecutarOperador("/");
				}
			});
			button_12.setText("/");
			button_12.setBounds(178, 46, 40, 33);
	 
			//botón con la operación de multiplicación
			Button button_13 = new Button(shlCalculadora, SWT.NONE);
			button_13.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ejecutarOperador("*");
				}
			});
			button_13.setText("*");
			button_13.setBounds(178, 85, 40, 33);
	 
			//botón con la operación de suma
			Button button_14 = new Button(shlCalculadora, SWT.NONE);
			button_14.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ejecutarOperador("+");
				}
			});
			button_14.setText("+");
			button_14.setBounds(178, 124, 40, 33);
	 
			//botón con la operación de resta
			Button button_15 = new Button(shlCalculadora, SWT.NONE);
			button_15.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ejecutarOperador("-");
				}
			});
			button_15.setText("-");
			button_15.setBounds(178, 163, 40, 33);
	 
			//botón con la operación de igual
			Button button_11 = new Button(shlCalculadora, SWT.NONE);
			button_11.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ejecutarIgual();
				}
			});
			button_11.setText("=");
			button_11.setBounds(69, 163, 86, 33);
	 
			//Texto donde se visualiza el resultado
			texto_resultado = new Text(shlCalculadora, SWT.BORDER);
			texto_resultado.setText("0");
			texto_resultado.setBounds(22, 19, 196, 21);
	 
			shlCalculadora.open();
			shlCalculadora.layout();
			while (!shlCalculadora.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}		
		}
	 
		void inicializar()	{
			operacion = "null";
			valor1 = 0;
			valor2 = 0;
			modo = MODO_ENTRADA;
			inicializar_resultado = true;
		}
	 
		String getresultadoString (){
			return texto_resultado.getText();
		}
	 
		void setresultadoString(String s){
			texto_resultado.setText(s);
		}
	 
		int getresultadoInt()	{
			String resultado = texto_resultado.getText();
			return Integer.parseInt(resultado);
		}
	 
		void anyadirDigitoNuevo(int digito){
			if (inicializar_resultado)
				setresultadoString("");
	 
			String inputString = getresultadoString();
	 
			if (inputString.indexOf("0") == 0){
				inputString = inputString.substring(1);
			}
	 		if ((!inputString.equals("0") || digito > 0)  && inputString.length() < MAX_DIGITOS){
				setresultadoString(inputString + digito);
			}
	 		modo = MODO_ENTRADA;
			inicializar_resultado = false;
		}
	 
		void ejecutarOperador(String new_operacion) {
	 
			int resultado;
	 		if (operacion.equals("null"))	
			{
				resultado = getresultadoInt();
				valor1 = resultado;
			}
	 		else
			{
				valor2 = getresultadoInt();
				resultado = ejecutarOperacion();
				mostraresultado(resultado);
				valor1 = resultado;			
			}
	 
			inicializar_resultado = true;
			operacion = new_operacion;
		}
	 
		void ejecutarIgual(){
			int resultado = 0;
	 
			valor2 = getresultadoInt();
			resultado = ejecutarOperacion();
			mostraresultado(resultado);
	 
			operacion = "null";
		}	
	 
		int ejecutarOperacion() {
			int resultado = 0;
	 
		        if (operacion.equals("/"))
		        {
			    if (valor2 == 0)
			    {
				JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
				operacion = "null";
				valor1 = 0;
				modo = MODO_ENTRADA;
				inicializar_resultado = true;
			    }
		 	    else
				resultado = valor1 / valor2;
		        }
	 
			if (operacion.equals("/"))
				resultado = valor1 / valor2;
	 
			if (operacion.equals("*"))
				resultado = valor1 * valor2;
	 
			if (operacion.equals("-"))
				resultado = valor1 - valor2;
	 
			if (operacion.equals("+"))
				resultado = valor1 + valor2;
	 
			return resultado;
		}
	 	void mostraresultado(int resultado){
			setresultadoString(Integer.toString(resultado));
			valor1 = resultado;
			modo = MODO_RESULTADO;
			inicializar_resultado = true;
		}

	}
