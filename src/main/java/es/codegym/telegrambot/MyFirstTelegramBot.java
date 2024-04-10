	package es.codegym.telegrambot;

import java.util.Map;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "TorkinBot_bot";
    public static final String TOKEN = "pasword";
    private FrasesAleatorias frasesAleatorias; 

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
    	frasesAleatorias = new FrasesAleatorias();
        // TODO: escribiremos la funcionalidad principal del bot aquí
    	
    	if(getMessageText().contains("hola")||getMessageText().contains(" ")||getMessageText().contains("/start")||getMessageText().contains("Hola")) {
    		
    		sendPhotoMessageAsync("step_1_pic");
    		
    		sendTextMessageAsync(TelegramBotContent.STEP_1_TEXT,Map.of(
    																	"¡Feliz!","step_1A_btn",
																		"¡Trizte!","step_1B_btn",
																		"¡Motivado!","step_1C_btn",
																		"¡Estresado!","step_1D_btn",
	    																"¡Enojado!","step_1E_btn",
	    																"¡Desmotivado!","step_1F_btn"));
    		}
    	
    	//Acciones boton 1-felicidad:
    	
    	
    	if(getCallbackQueryButtonKey().equals("step_1A_btn")) {
    		
    		sendPhotoMessageAsync("step_2_pic");

            String estadoDeAnimo = "¡Feliz!"; // Ejemplo, obtener el estado de ánimo del usuario
            String fraseAleatoria = frasesAleatorias.obtenerFraseAleatoria(estadoDeAnimo);

            // Usa la fraseAleatoria en tu respuesta
            sendTextMessageAsync("Tu frase de hoy es: "+fraseAleatoria);
            
            sendTextMessageAsync(TelegramBotContent.STEP_INI_TEXT,Map.of());
            
    	}
    	
    	//Acciones boton 2-Trizte:
    	
    	
    	if(getCallbackQueryButtonKey().equals("step_1B_btn")) {
    		
    		sendPhotoMessageAsync("step_3_pic");

            String estadoDeAnimo = "¡Trizte!"; // Ejemplo, obtener el estado de ánimo del usuario
            String fraseAleatoria = frasesAleatorias.obtenerFraseAleatoria(estadoDeAnimo);

            // Usa la fraseAleatoria en tu respuesta
            sendTextMessageAsync("Tu frase de hoy es: "+fraseAleatoria);
            
            sendTextMessageAsync(TelegramBotContent.STEP_INI_TEXT,Map.of());
            
    	}
    	
    	//Acciones boton 3-Motivado:
    	
    	
    	if(getCallbackQueryButtonKey().equals("step_1C_btn")) {
    		
    		sendPhotoMessageAsync("step_4_pic");

            String estadoDeAnimo = "¡Motivado!"; // Ejemplo, obtener el estado de ánimo del usuario
            String fraseAleatoria = frasesAleatorias.obtenerFraseAleatoria(estadoDeAnimo);

            // Usa la fraseAleatoria en tu respuesta
            sendTextMessageAsync("Tu frase de hoy es: "+fraseAleatoria);
            
            sendTextMessageAsync(TelegramBotContent.STEP_INI_TEXT,Map.of());
            
    	}
    	
    	//Acciones boton 4-Estresado:
    	
    	
    	if(getCallbackQueryButtonKey().equals("step_1D_btn")) {
    		
    		sendPhotoMessageAsync("step_5_pic");

            String estadoDeAnimo = "¡Estresado!"; // Ejemplo, obtener el estado de ánimo del usuario
            String fraseAleatoria = frasesAleatorias.obtenerFraseAleatoria(estadoDeAnimo);

            // Usa la fraseAleatoria en tu respuesta
            sendTextMessageAsync("Tu frase de hoy es: "+fraseAleatoria);
            
            sendTextMessageAsync(TelegramBotContent.STEP_INI_TEXT,Map.of());
            
    	}
    	
    	//Acciones boton 5-Enojado:
    	
    	
    	if(getCallbackQueryButtonKey().equals("step_1E_btn")) {
    		
    		sendPhotoMessageAsync("step_6_pic");

            String estadoDeAnimo = "¡Enojado!"; // Ejemplo, obtener el estado de ánimo del usuario
            String fraseAleatoria = frasesAleatorias.obtenerFraseAleatoria(estadoDeAnimo);

            // Usa la fraseAleatoria en tu respuesta
            sendTextMessageAsync("Tu frase de hoy es: "+fraseAleatoria);
            
            sendTextMessageAsync(TelegramBotContent.STEP_INI_TEXT,Map.of());
            
    	}
    	
    	//Acciones boton 6-Desmotivado:
    	
    	
    	if(getCallbackQueryButtonKey().equals("step_1F_btn")) {
    		
    		sendPhotoMessageAsync("step_7_pic");

            String estadoDeAnimo = "¡Desmotivado!"; // Ejemplo, obtener el estado de ánimo del usuario
            String fraseAleatoria = frasesAleatorias.obtenerFraseAleatoria(estadoDeAnimo);

            // Usa la fraseAleatoria en tu respuesta
            sendTextMessageAsync("Tu frase de hoy es: "+fraseAleatoria);
            
            sendTextMessageAsync(TelegramBotContent.STEP_INI_TEXT,Map.of());
            
    	}
  

    	
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}
