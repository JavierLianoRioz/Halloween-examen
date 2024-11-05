
public class Halloween {

    public static void main(String args[]) {
        int caramelosNiño1 = 0;
        int caramelosNiño2 = 0;
        int caramelosNiño3 = 0;

        boolean bolsa1Llena = false;
        boolean bolsa2Llena = false;
        boolean bolsa3Llena = false;

        int pisoActual = 1;
        int casasVisitadas = 0;

        final int CHUCHEMAS_MAXIMAS_POR_BOLSA = 20;

        while ((bolsa1Llena && bolsa2Llena && bolsa3Llena) || pisoActual != 5) {
            System.out.println("");
            System.out.println("=== Piso " + pisoActual + " ===");

            int casa = 1;
            while (casa <= 4 || (bolsa1Llena && bolsa2Llena && bolsa3Llena)) {
                System.out.println("");
                System.out.println("Visitando casa " + casa + " del piso " + pisoActual);

                boolean CasaAbierta = (int) (Math.random() * 100 + 1) <= 70;
                if (CasaAbierta) {
                    System.out.println("¡La casa está abierta!");

                    if (bolsa1Llena) {
                        caramelosNiño1 = CHUCHEMAS_MAXIMAS_POR_BOLSA;

                        System.out.println("¡La bolsa del niño 1 está llena!");
                    } else {

                        boolean danCaramelos = (int) (Math.random() * 100 + 1) <= 80;
                        int numeroCaramelasQueDan = (int) (Math.random() * 3 + 1);
                        if (danCaramelos) {
                            caramelosNiño1 += numeroCaramelasQueDan;
                            bolsa1Llena = caramelosNiño1 >= CHUCHEMAS_MAXIMAS_POR_BOLSA;
                        }

                        System.out.println("Niño 1 recibió " + numeroCaramelasQueDan + " caramelos");
                    }

                    if (bolsa2Llena) {
                        caramelosNiño2 = CHUCHEMAS_MAXIMAS_POR_BOLSA;

                        System.out.println("¡La bolsa del niño 2 está llena!");
                    } else {

                        boolean danCaramelos = (int) (Math.random() * 100 + 1) <= 80;
                        int numeroCaramelasQueDan = (int) (Math.random() * 3 + 1);
                        if (danCaramelos) {
                            caramelosNiño2 += numeroCaramelasQueDan;
                            bolsa2Llena = caramelosNiño2 >= CHUCHEMAS_MAXIMAS_POR_BOLSA;
                        }

                        System.out.println("Niño 2 recibió " + numeroCaramelasQueDan + " caramelos");
                    }

                    if (bolsa3Llena) {
                        caramelosNiño3 = CHUCHEMAS_MAXIMAS_POR_BOLSA;

                        System.out.println("¡La bolsa del niño 3 está llena!");
                    } else {

                        boolean danCaramelos = (int) (Math.random() * 100 + 1) <= 80;
                        int numeroCaramelasQueDan = (int) (Math.random() * 3 + 1);
                        if (danCaramelos) {
                            caramelosNiño3 += numeroCaramelasQueDan;
                            bolsa3Llena = caramelosNiño3 >= CHUCHEMAS_MAXIMAS_POR_BOLSA;
                        }

                        System.out.println("Niño 3 recibió " + numeroCaramelasQueDan + " caramelos");
                    }

                } else {
                    System.out.println("Casa cerrada, seguimos adelante...");
                }

                casa++;
                casasVisitadas++;
            }

            if (bolsa1Llena && bolsa2Llena && bolsa3Llena) {
                System.out.println("");
                System.out.println("¡Todas las bolsas están llenas! Terminamos la búsqueda.");
            }

            pisoActual++;
        }


        System.out.println("");
        System.out.println("=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println("Niño 1: " + caramelosNiño1 + " caramelos" + (bolsa1Llena ? " (Bolsa llena)" : ""));
        System.out.println("Niño 2: " + caramelosNiño2 + " caramelos" + (bolsa2Llena ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + caramelosNiño3 + " caramelos" + (bolsa3Llena ? " (Bolsa llena)" : ""));
    }
}
