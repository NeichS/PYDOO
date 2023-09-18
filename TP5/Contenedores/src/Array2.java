public class Array2 {
    // Metodos que imprime contenido de arrays
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void print(double[] arr) {
        for (double d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void print(boolean[] arr) {
        for (boolean b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void print(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void print(Object[] arr) {
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    //Imprimir con comienzo y fin
    public static void print(int[]arr, int start, int end) {
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void print(Double[]arr, int start, int end) {
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void print(Boolean[]arr, int start, int end) {
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void print(String[]arr, int start, int end) {
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
    public static void print(Object[]arr, int start, int end) {
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    //Imprimir con mensaje adelante
    public static void print(String message, double arr[]) {
        System.out.print(message);
        print(arr);
    }
    public static void print(String message, int arr[]) {
        System.out.print(message);
        print(arr);
    }
    public static void print(String message, boolean arr[]) {
        System.out.print(message);
        print(arr);
    }
    public static void print(String message, String arr[]) {
        System.out.print(message);
        print(arr);
    }
    public static void print(String message, Object arr[]) {
        System.out.print(message);
        print(arr);
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.7, 3.1, 4.2, 5.9};
        boolean[] booleanArray = {true, false, true, true};
        String[] stringArray = {"Hola", "Mundo"};
        Object[] objectArray = {1, "dos", 3.0, true};

        // Ejemplos de uso
        print(intArray);
        print(doubleArray);
        print(booleanArray);
        print(stringArray);
        print(objectArray);

        print( intArray, 1, 3);
        print( doubleArray);
    }

}
