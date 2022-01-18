/*
 * Copyright (C) 2022 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pruebaarbolnario;

import modelo.ArbolNArio;

/**
 *
 * @author Oscar Arenas
 */
public class PruebaArbolNArio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolNArio arbol = new ArbolNArio(0);

        arbol.agregar(1, 0);
        arbol.agregar(2, 0);
        arbol.agregar(3, 0);
        arbol.agregar(4, 0);
        arbol.agregar(9, 0);
        arbol.agregar(6, 0);
        arbol.agregar(7, 0);
        arbol.agregar(8, 0);
        arbol.agregar(5, 0);

        arbol.agregar(11, 1);
        arbol.agregar(12, 1);
        arbol.agregar(13, 1);

        arbol.agregar(42, 4);
        arbol.agregar(45, 4);
        arbol.agregar(46, 4);

        arbol.agregar(96, 9);
        arbol.agregar(91, 9);
        arbol.agregar(98, 9);

        arbol.agregar(137, 13);
        arbol.agregar(59, 5);

        arbol.agregar(594, 59);
        arbol.agregar(597, 59);

        arbol.agregar(5945, 594);
        arbol.agregar(5942, 594);

        arbol.agregar(51, 5);

        arbol.imprimir();

        System.out.println(arbol.contiene(5942));
    }
}
