
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

        int chuchemasMaximasPorBolsa = 20;

        while ((bolsa1Llena && bolsa2Llena && bolsa3Llena) || pisoActual == 5) {
            System.out.println("");
            System.out.println("=== Piso " + pisoActual + " ===");

            int casa = 1;
            while (casa <= 4) {
                casasVisitadas++;
                System.out.println("");
                System.out.println("Visitando casa " + casa + " del piso " + pisoActual);

                int CasaAbierta = (int)(Math.random() * 100 + 1);
                if (CasaAbierta <= 70) {
                    System.out.println("¡La casa está abierta!");

                    if (bolsa1Llena == false) {
                        int danCaramelos = (int)(Math.random() * 100 + 1);
                        if (danCaramelos <= 80) {
                            int numeroCaramelasQueDan = (int) (Math.random() * 3 + 1);
                            caramelosNiño1 = caramelosNiño1 + numeroCaramelasQueDan ;
                            System.out.println("Niño 1 recibió " + numeroCaramelasQueDan  + " caramelos");

                            if (caramelosNiño1 >= chuchemasMaximasPorBolsa) {
                                bolsa1Llena = true;
                                caramelosNiño1 = chuchemasMaximasPorBolsa;
                                System.out.println("¡La bolsa del niño 1 está llena!");
                            }
                        }
                    }

                    if (bolsa2Llena == false) {
                        int danCaramelos = (int)(Math.random() * 100 + 1);
                        if (danCaramelos <= 80) {
                            int numeroCaramelasQueDan = (int) (Math.random() * 3 + 1);
                            caramelosNiño2 = caramelosNiño2 + numeroCaramelasQueDan;
                            System.out.println("Niño 2 recibió " + numeroCaramelasQueDan + " caramelos");

                            if (caramelosNiño2 >= chuchemasMaximasPorBolsa) {
                                bolsa2Llena = true;
                                caramelosNiño2 = chuchemasMaximasPorBolsa;
                                System.out.println("¡La bolsa del niño 2 está llena!");
                            }
                        }
                    }

                    if (bolsa3Llena == false) {
                        int danCaramelos = (int)(Math.random() * 100 + 1);
                        if (danCaramelos <= 80) {
                            int numeroCaramelasQueDan = (int) (Math.random() * 3 + 1);
                            caramelosNiño3 = caramelosNiño3 + numeroCaramelasQueDan;
                            System.out.println("Niño 3 recibió " + numeroCaramelasQueDan + " caramelos");

                            if (caramelosNiño3 >= chuchemasMaximasPorBolsa) {
                                bolsa3Llena = true;
                                caramelosNiño3 = chuchemasMaximasPorBolsa;
                                System.out.println("¡La bolsa del niño 3 está llena!");
                            }
                        }
                    }
                } else {
                    System.out.println("Casa cerrada, seguimos adelante...");
                }

                if (bolsa1Llena && bolsa2Llena && bolsa3Llena) {
                    System.out.println("");
                    System.out.println("¡Todas las bolsas están llenas! Terminamos la búsqueda.");
                    break;
                }

                casa++;
            }

            pisoActual = pisoActual + 1;
        }

        System.out.println("");
        System.out.println("=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println("Niño 1: " + caramelosNiño1 + " caramelos" + (bolsa1Llena ? " (Bolsa llena)" : ""));
        System.out.println("Niño 2: " + caramelosNiño2 + " caramelos" + (bolsa2Llena ? " (Bolsa llena)" : ""));
        System.out.println("Niño 3: " + caramelosNiño3 + " caramelos" + (bolsa3Llena ? " (Bolsa llena)" : ""));
    }
}
