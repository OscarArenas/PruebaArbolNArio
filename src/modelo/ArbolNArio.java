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

/**
 *
 * Arbol n-ario para almacenar valores enteros. No permite almacenar valores
 * repetidos.
 *
 *
 * @author Oscar Arenas
 */
public class ArbolNArio {

    private NodoNArio raiz;
    private int n;

    public ArbolNArio(int dato) {
        raiz = new NodoNArio(dato);
        n = 1;
    }

    public ArbolNArio() {
        raiz = null;
        n = 0;
    }

    public boolean agregar(int hijo, int padre) {
        boolean inserta = false;
        if (raiz != null) {
            if (!contiene(hijo)) {
                inserta = agregar(raiz, hijo, padre);
            }
        } else {
            raiz = new NodoNArio(hijo);
            n = 1;
            inserta = true;
        }
        return inserta;
    }

    private boolean agregar(NodoNArio r, int hijo, int padre) {
        if (r.padre == padre) {
            n++;
            return r.agregar(hijo);
        } else {
            for (int i = 0; i < r.cantidadHijos(); i++) {
                if (agregar(r.hijos.get(i), hijo, padre)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean contiene(int dato) {
        return contiene(raiz, dato);
    }

    private boolean contiene(NodoNArio r, int dato) {
        if (r.padre == dato) {
            return true;
        } else {
            for (int i = 0; i < r.cantidadHijos(); i++) {
                if (contiene(r.hijos.get(i), dato)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public void borrar() {
        raiz = null;
        n = 0;
    }

    public void imprimir() {
        if (raiz != null) {
            imprimir(raiz, "");
        }
    }

    private void imprimir(NodoNArio r, String espacio) {
        System.out.println(espacio + r);

        for (int i = 0; i < r.cantidadHijos(); i++) {
            imprimir(r.hijos.get(i), espacio + "    ");
        }
    }
}
