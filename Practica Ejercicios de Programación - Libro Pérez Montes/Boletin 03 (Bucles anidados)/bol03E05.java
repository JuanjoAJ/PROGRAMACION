/* Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0
al 9-9-9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
*/
public class bol03E05 {
    public static void main(String[] args) {
        String[]array=new String[10];

        for (int i = 0; i < 10; i++) {
            array[i] = String.valueOf(i).replaceAll("3", "E");
            for (int j = 0; j < 10; j++) {
                array[j] = String.valueOf(j).replaceAll("3", "E");
                for (int k = 0; k < 10; k++) {
                    array[k] = String.valueOf(k).replaceAll("3", "E");
                    for (int l = 0; l < 10; l++) {
                        array[l] = String.valueOf(l).replaceAll("3", "E");
                        for (int m = 0; m < 10; m++) {
                            array[m] = String.valueOf(m).replaceAll("3", "E");
                            System.out.println(array[i] + "-" + array[j] + "-" + array[k] + "-" + array[l] + "-" + array[m]);

                        }

                    }

                }

            }

        }
    }
}
