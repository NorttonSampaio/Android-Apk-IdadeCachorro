package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar oque foi digitado

                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty() || textoDigitado.equals("0")){
                    //String vazia ou invalida(mensagem de erro)
                    resultadoIdade.setText("Resultado invalido ou Vazio");
                }else{
                    resultadoIdade.setText("A idade do cachorro em anos humanos e: " + Integer.valueOf(textoDigitado)*7 + " Anos");
                }
            }
        });
    }
}
