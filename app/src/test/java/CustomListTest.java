import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());

    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(listSize+1, list.getCount());


    }
    @Test
    public void hasCityTest(){
        City city = new City("Edmonton", "AB");
        assertEquals(false, list.hasCity(city));

    }
    @Test
    public void deleteCityTest(){
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));


    }
    @Test
    public void countcityTest(){
        assertEquals(0, list.countCities());
    }
}
