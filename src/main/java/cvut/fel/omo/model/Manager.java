package cvut.fel.omo.model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;

    // každý manažer má podřízené, jak to udělat, aby vznikla pěkná stromová struktura? Můžeme mít následující strukturu:
    // manager
    //    |   \
    // manager manager
    //   /|\     /|\
    // employee  employee
    // Jaký pattern na to použijeme?

    public Manager(String name) {
        this.name = name;
    }

    // TODO

}

