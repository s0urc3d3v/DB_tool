import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Matthewelbing on 1/21/16.
 */
public class Tests {

    @Test
    public void testAddPrefToLHM(){
        Main.addPreference("testAddPref", true);
        assertEquals(true, (boolean) Main.prefs.get("testAddPref"));
    }

    @Test
    public void testGetPrefFromLHM(){
        Main.prefs.put("testGetPref", true);
        assertEquals(true, (boolean) Main.prefs.get("testGetPref"));
    }

}
