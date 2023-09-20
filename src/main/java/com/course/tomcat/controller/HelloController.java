paquete com.por supuesto.Tomcat.controlador;
 
Importar org.Springframework.web.enlazar.anotación.*;
 
Importar Java.tiempo.LocalDateTime;
Importar Java.util.concurrente.ThreadLocalRandom;
 
@RestController
@RequestMapping("/api")
clase pública HelloController {
 
    @GetMapping(valor = {"", "/",   "/now"})
    Hola de cadena () {
        return  "Now is " + LocalDateTime.Ahora();
    }
    
    @GetMapping(valor =  "/random")
    int aleatorio(){
        return ThreadLocalRandom.current().siguienteInt(0,1000);
    }
}
