import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.aplie.android.robolectictest.BuildConfig;
import org.aplie.android.robolectictest.MainActivity;
import org.aplie.android.robolectictest.R;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.junit.Before;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    // @Before => Anotación que especifica que este método se debe ejecutar antes de la ejecución de cada prueba.
    // Utilidad para configurar los objetos que son necesarios para la prueba
    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    // @Test => Anotación que especifica que es un test ejecutable
    // Test que comprueba que los TextView existen y contienen el texto correcto.
    @Test
    public void validateTextViewContent() {
        TextView tvFirstNumber = (TextView) activity.findViewById(R.id.tvFistNumber);
        TextView tvSecondNumber = (TextView) activity.findViewById(R.id.tvSecondNumber);
        TextView tvResult = (TextView) activity.findViewById(R.id.tvResult);

        assertNotNull("TextView FirstNumber could not be found", tvFirstNumber);
        assertNotNull("TextView SecondNumber not be found", tvSecondNumber);
        assertNotNull("TextView Result not be found", tvResult);

        assertTrue("TextView FirstNumber contains incorrect text",
                "Introduce el primer número".equals(tvFirstNumber.getText().toString()));
        assertTrue("TextView SecondNumber contains incorrect text",
                "Introduce el segundo número".equals(tvSecondNumber.getText().toString()));
        assertTrue("TextView Result contains incorrect text",
                "Resultado:".equals(tvResult.getText().toString()));
    }

    // @Test => Anotación que especifica que es un test ejecutable
    // Test que comprueba que los Button existen y contienen el texto correcto.
    @Test
    public void validateButtonContent() {
        Button suma = (Button) activity.findViewById(R.id.bSumar);
        Button resta = (Button) activity.findViewById(R.id.bRestar);
        Button multiplicacion = (Button) activity.findViewById(R.id.bMultiplicar);
        Button division = (Button) activity.findViewById(R.id.bDividir);

        assertNotNull("TextView FirstNumber could not be found", suma);
        assertNotNull("TextView SecondNumber not be found", resta);
        assertNotNull("TextView Result not be found", multiplicacion);
        assertNotNull("TextView Result not be found", division);

        assertTrue("TextView FirstNumber contains incorrect text",
                "Sumar".equals(suma.getText().toString()));
        assertTrue("TextView SecondNumber contains incorrect text",
                "Restar".equals(resta.getText().toString()));
        assertTrue("TextView Result contains incorrect text",
                "Multiplicar".equals(multiplicacion.getText().toString()));
        assertTrue("TextView Result contains incorrect text",
                "Dividir".equals(division.getText().toString()));
    }


}
