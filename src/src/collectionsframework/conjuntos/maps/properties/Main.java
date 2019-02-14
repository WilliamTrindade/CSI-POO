/*
 * Ela é uma Implementação da Classe HashTable que em si deriva da Interface Map
 *
 * Um mapa importante é a tradicional classe Properties,	 que mapeia strings e é
 * muito utilizada para	a configuração de aplicações.
 */
package collectionsframework.conjuntos.maps.properties;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties config = new Properties();
        config.setProperty("URL", "site.com");
        config.setProperty("dbUser", "root");
        
        // algumas linhas de codigo depois
        
        System.out.println(config.getProperty("URL"));
        System.out.println(config.getProperty("dbUser"));
    }
    
}
