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
package modelo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Oscar Arenas
 */
public class NodoNArio {

    int padre;
    ArrayList<NodoNArio> hijos;

    public NodoNArio(int padre) {
        this.padre = padre;
        hijos = new ArrayList<>();
    }

    public boolean agregar(int hijo) {
        return hijos.add(new NodoNArio(hijo));
    }

    public boolean esHoja() {
        return hijos.isEmpty();
    }

    public int cantidadHijos() {
        return hijos.size();
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }

    @Override
    public String toString() {
        int[] valores = new int[hijos.size()];
        for (int i = 0; i < hijos.size(); i++) {
            valores[i] = hijos.get(i).padre;
        }
        return padre + ": " + Arrays.toString(valores);
    }
}
