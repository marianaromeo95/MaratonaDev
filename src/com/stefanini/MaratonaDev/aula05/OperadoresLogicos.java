package com.stefanini.MaratonaDev.aula05;

public class OperadoresLogicos {
    public static void main(String[] args) {


        /**
         *
         * AND
         * V and F => F
         * V and V => V
         * F and V => F
         * F and F => F
         *
         * OR
         * V and F => V
         * V and V => V
         * F and V => V
         * F and F => F
         *
         * XOR
         * V and F => V
         * V and V => F
         * F and V => V
         * F and F => F
         *
         * Negação Logica
         * !V => F
         * !F => V
         */

        boolean v = true;
        boolean f = false;

        // and &&

        System.out.println(v && f); // false

        // or || ou |

        System.out.println(v || f); // true

        // xor !=

        System.out.println(v != f); // true

        // !

        System.out.println(!f); // true

    }
}
