package Model.DB;

import Model.CharacterFactory;
import Model.Dwarf;
import Model.Glyphid.Glyphid;

import static Model.CharacterTypes.*;

/**
 * Runnable main DB class for making database changes.
 */
public class DBMain {

    /**
     * Main method to run the database initialization and test character creation.
     *
     * @param theArgs the command-line arguments (not used)
     */
    public static void main(final String[] theArgs) {

        // Initializes Database
        SQLiteConnection.getDataSource();

        // Initializes tables and data insertion for Dwarf and Glyphid.
        DwarfDB.initializeDB();
        GlyphidDB.initializeDB();

        // Creates test Dwarf objects
        Dwarf testDriller = CharacterFactory.createDwarf(DRILLER);
        System.out.println(testDriller.toString());

        Dwarf testEngineer = CharacterFactory.createDwarf(ENGINEER);
        System.out.println(testEngineer.toString());

        // Creates test Glyphid object
        Glyphid testGlyphid = CharacterFactory.createGlyphid(GRUNT);
        System.out.println(testGlyphid.toString());
    }
}
