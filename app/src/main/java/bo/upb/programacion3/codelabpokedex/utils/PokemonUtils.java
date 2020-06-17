package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));

        //Mis pokemon (Si, medio fan de los starters tipo Agua XD)
        pokemons.add(new Pokemon(13,"Mimikyu",R.drawable.mimikyu,"Ghost/Fairy"));
        pokemons.add(new Pokemon(14,"Popplio",R.drawable.popplio,"Water"));
        pokemons.add(new Pokemon(15,"Hydreigon",R.drawable.hydreigon,"Dragon/Dark"));
        pokemons.add(new Pokemon(16,"Greninja",R.drawable.greninja,"Water/Dark"));
        pokemons.add(new Pokemon(17,"Bayleef",R.drawable.bayleef,"Grass"));
        pokemons.add(new Pokemon(18,"Sobble",R.drawable.sobble,"Water"));
        pokemons.add(new Pokemon(19,"Impidimp",R.drawable.impidimp,"Dark/Fairy"));
        pokemons.add(new Pokemon(20,"Empoleon",R.drawable.empoleon,"Water/Steel"));
        pokemons.add(new Pokemon(21,"Goomy",R.drawable.goomy,"Dragon"));
        pokemons.add(new Pokemon(22,"Oshawott",R.drawable.oshawott,"Water"));
        pokemons.add(new Pokemon(23,"Drapion",R.drawable.drapion,"Poison/Dark"));
        pokemons.add(new Pokemon(24,"Marshtomp",R.drawable.marshtomp,"Water/Ground"));
        pokemons.add(new Pokemon(25,"Yamper",R.drawable.yamper,"Electric"));

        return pokemons;
    }
}
