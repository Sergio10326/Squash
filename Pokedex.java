import java.util.HashMap;

public class Pokedex {
    private HashMap<String, String> pokemonEntries;

    public Pokedex() {
        pokemonEntries = new HashMap<>();
    }

    // Agregar una entrada a la Pokédex
    public void addEntry(String pokemonName, String description) {
        pokemonEntries.put(pokemonName, description);
    }

    // Obtener la descripción de un Pokémon
    public String getEntry(String pokemonName) {
        return pokemonEntries.get(pokemonName);
    }

    // Mostrar todos los Pokémon en la Pokédex
    public void displayAllEntries() {
        System.out.println("Pokédex Entries:");
        for (String pokemonName : pokemonEntries.keySet()) {
            System.out.println(pokemonName + ": " + pokemonEntries.get(pokemonName));
        }
    }

    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();

        // Agregar algunas entradas de ejemplo
        pokedex.addEntry("Pikachu", "This Pokémon has electricity-storing pouches on its cheeks.");
        pokedex.addEntry("Charmander", "Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.");

        // Mostrar todas las entradas de la Pokédex
        pokedex.displayAllEntries();

        // Obtener la descripción de Pikachu
        String pikachuDescription = pokedex.getEntry("Pikachu");
        System.out.println("\nDescription of Pikachu: " + pikachuDescription);
    }
}
