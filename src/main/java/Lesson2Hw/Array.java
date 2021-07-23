package Lesson2Hw;

public class Array {
    public static int arraySum(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        if (myArray.length != 4) {
            throw new MyArraySizeException("Длина массива !=4");
        }
        for (String[] array : myArray) {
            if (array.length != 4) {
                throw new MyArraySizeException("Высота массива != 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число в элементе:" + i + "," + j);
                }
            }
        } return sum;
    }


    public static void main(String[] args) {
        String[][] myArray =
                {{"1", "3", "5", "6"},
                        {"1", "3", "5", "6"},
                        {"1", "3", "5", "6", "5"},
                        {"1", "3", "5", "6"}};


        Integer[][] array;
        array = new Integer[4][];
        array[0] = new Integer[4];
        array[0] = new Integer[5];
        array[0] = new Integer[4];

        try {
            System.out.println(arraySum(myArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        String[][] invalidArray =
                {{"1", "3", "5", "6"},
                        {"1", "3a", "5", "6"},
                        {"1", "3", "5", "6"},
                        {"1", "3", "5", "6"}};
        try {
            System.out.println(arraySum(invalidArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        }


    }

