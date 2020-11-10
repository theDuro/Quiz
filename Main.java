package com.company;

import java.util.Random;


class Main {

        /**
         * metoda main powinna implementowac algorytm do
         * jak najszybszego wyszukiwania wartosci
         * zmiennej digit z klasy QuizImpl (zakladamy ze
         * programista nie zna zawartosci klasy QuizImpl).
         * Nalezy zalozyc, ze pole digit w klasie QuizImpl
         * moze w kazdej chwili ulec zmianie. Do wyszukiwania
         * odpowiedniej wartosci nalezy wykorzystywac tylko
         * i wylacznie metode isCorrectValue - jesli metoda
         * przestanie rzucac wyjatki wowczas mamy pewnosc ze
         * poszukiwana zmienna zostala odnaleziona.
         */
        public static void main(String[] args) {
            Random generator = new Random();
            int range = 1000;
            int minValue = 0;
            int digit = 1; // zainicjuj zmienna
            Quiz quiz = (Quiz) new QuizImpl();
            int randomNumer;


            for(int counter = 1; ;counter++) {
                 randomNumer= generator.nextInt(range);

                digit = randomNumer + minValue;

                try {

                    quiz.isCorrectValue(digit);
                    System.out.println("Trafiona proba!!! Szukana liczba to: "
                            + digit + " Ilosc prob: " + counter);
                    break;
                } catch(Quiz.ParamTooLarge e) {
                    System.out.println("Argument za Durzy!!");
                        range -=randomNumer;
                } catch(Quiz.ParamTooSmall e) {

                    System.out.println(" Argument za maly!!!");
                    minValue=digit;
                    if(range> 1000-minValue){
                        range=1000-minValue;

                    }

                }

            }
        }
    }

