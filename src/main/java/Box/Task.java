package Box;

    class Task1 {
        static void swapObj(Object[] array, int firstIndex, int secondIndex) {
            Object oneVal = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = oneVal;
        }
//klf
        static <T> ArrayList<T> convertToList(T[] array) {
            return new ArrayList<>(Arrays.asList(array));
        }
    }


