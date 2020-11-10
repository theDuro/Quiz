package com.company;

import java.util.Random;


class Main {

   static Random generator = new Random();
        public static void main(String[] args) {

            int maxValue= Quiz.MAX_VALUE;
            int minValue = Quiz.MIN_VALUE;
            int digit;
            Quiz quiz = (Quiz) new QuizImpl();
            int randomNumer;
            for(int counter = 1; ;counter++) {
                    digit =randFromRange( minValue,maxValue);
                    try {
                        quiz.isCorrectValue(digit);
                        System.out.println("Trafiona proba!!! Szukana liczba to: "
                                + digit + " Ilosc prob: " + counter);
                        break;
                    } catch(Quiz.ParamTooLarge e) {
                        System.out.println("Argument za Durzy!!");
                        maxValue=digit;
                    } catch(Quiz.ParamTooSmall e) {
                          System.out.println(" Argument za maly!!!");
                        minValue=digit;
                        }
                }
            }

        static int randFromRange(int minV, int maxV){
          return generator.nextInt(maxV-minV)+minV;
        }

    }

