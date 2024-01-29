package ru.job4j.converter;

public class Converter {

        public static float rubleToEuro(float value) {
            float result = value / 70;
            return result;
        }

        public static float rubleToDollar(float value) {
            float result = value / 60;
            return result;
        }

        public static void main(String[] args) {
            float euro = Converter.rubleToEuro(140);
            System.out.println("140 rubles are " + euro + " euro.");
            float dollar = Converter.rubleToDollar(120);
            System.out.println("120 rubles are " + dollar + " dollar.");
            float input = 140;
            float expected = 2;
            float output = Converter.rubleToEuro(input);
            boolean passed = expected == output;
            System.out.println("140 rubles are 2. Test result : " + passed);
            float inputRubles = 140;
            float expectedDollar = 2;
            float outputDollar = Converter.rubleToDollar(input);
            boolean passedResult = expected == output;
            System.out.println("120 rubles are 2. Test result : " + passedResult);
        }
    }

