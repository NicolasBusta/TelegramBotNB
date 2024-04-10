package es.codegym.telegrambot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FrasesAleatorias {

    private Map<String, List<String>> frases;

    public FrasesAleatorias() {
        frases = new HashMap<>();

        List<String> frasesFelices = Arrays.asList(
            "La felicidad es interior, no exterior; por lo tanto, no depende de lo que tenemos, sino de lo que somos. - Henry Van Dyke",
            "La felicidad no es algo que pospones para el futuro; es algo que diseñas para el presente. - Jim Rohn",
            "La alegría es una red de amor por la cual puedes atrapar almas. - Madre Teresa de Calcuta",
            "La verdadera felicidad consiste en hacer el bien. - Aristóteles",
            "La felicidad se encuentra en la gratitud de lo que tenemos, no en la insatisfacción por lo que deseamos. - Steve Maraboli"
        );
        
        List<String> frasesTristes = Arrays.asList(
                "La tristeza es un océano, pero tú eres un nadador fuerte. - Victor Hugo",
                "No llores porque haya terminado, sonríe porque sucedió. - Dr. Seuss",
                "Las lágrimas son palabras que no se pueden decir. - Khalil Gibran",
                "La vida es como una montaña rusa, tiene sus subidas y bajadas, pero al final siempre llegas a la estación. - Paulo Coelho",
                "No tengas miedo de la oscuridad, porque es ahí donde nacen las estrellas. - Stephen Hawking"
            );
        
        List<String> frasesMotivado = Arrays.asList(
                "Si no tienes tus propios sueños, es posible que en tu vida te dediques a cumplir los sueños de otra persona.– Jim Rohn",
                "Todo parece imposible hasta que alguien lo hace. – Nelson Mandela",
                "Poco importa lo despacio que camines mientras no te pares. – Confucio",
                "El 99% de los proyectos fracasados pertenecen a personas acostumbradas a poner excusas.– George Washington Carver",
                "Resulta curioso, pero cuanto más me esfuerzo, más suerte tengo. – Thomas Jefferson"
            );
        
        List<String> frasesEstresado = Arrays.asList(
                "No puedes controlar todos los vientos, pero puedes ajustar las velas del barco. - Anónimo",
                "El secreto de la calma está en el interior de uno mismo. - Dalai Lama",
                "El arte de descansar es parte del arte de trabajar. - John Steinbeck",
                "El estrés es el resultado de tratar de hacer demasiado en muy poco tiempo.- Dr. Andrew Weil",
                "No dejes que el comportamiento de los demás te quite la paz. - Dalai Lama"
            );
        
        List<String> frasesEnojado = Arrays.asList(
                "El fuego que más arde es el que está dentro. - Anónimo",
                "No hables cuando estés enfadado, porque harás el mejor discurso que te arrepentirás. - Laurence J. Peter",
                "La ira es como un veneno que uno toma esperando que otro muera. - William Shakespeare",
                "El odio es como beber veneno y esperar que la otra persona muera. - Gautama Buda",
                "La paciencia es el antídoto para la ira. - Allan Lokos"
            );
        
        List<String> frasesDesmotivado = Arrays.asList(
                "La motivación es lo que te pone en marcha, el hábito es lo que hace que sigas. - Jim Ryun",
                "La desmotivación es el resultado de enfocarte en lo que no tienes en lugar de en lo que sí tienes. - Anónimo",
                "El éxito no es la clave de la felicidad, la felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito. - Albert Schweitzer",
                "La motivación es lo que te hace empezar. El hábito es lo que te mantiene firme. - Jim Ryun",
                "El secreto de la motivación está en encontrar algo que realmente te apasione. - Anónimo"
            );


        frases.put("¡Feliz!", frasesFelices);
        frases.put("¡Trizte!", frasesTristes);
        frases.put("¡Motivado!", frasesMotivado);
        frases.put("¡Estresado!", frasesEstresado);
        frases.put("¡Enojado!", frasesEnojado);
        frases.put("¡Desmotivado!", frasesDesmotivado);
        
    }

    public String obtenerFraseAleatoria(String estadoDeAnimo) {
        List<String> frasesEspecificas = frases.get(estadoDeAnimo);
        Random random = new Random();
        int indiceAleatorio = random.nextInt(frasesEspecificas.size());
        return frasesEspecificas.get(indiceAleatorio);
    }

}
