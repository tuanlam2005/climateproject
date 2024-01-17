
package com.example.climate;

import java.util.List;

public interface TempRep {
    List<Temperature> findAllCities();
    List<Temperature> findFirstYear();
    List<Temperature> findLastYear();
}
