package Spring.Reto5.Redflix3;

import Spring.Reto5.Redflix3.Vista.VentanaPrincipal;
import java.awt.Color;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Spring.Reto5.Redflix3")
public class Redflix3Application {

	public static void main(String[] args) {
		VentanaPrincipal ventana=new VentanaPrincipal();
                ventana.setTitle("RedFlixPro3");
                ventana.getContentPane().setBackground(Color.WHITE);
                ventana.setVisible(true);
                
	}
        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(Redflix3Application.class, args);
        }

}
