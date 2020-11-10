package com.company;

/** nalezy zaimplementowac interfejs Quiz. */
class QuizImpl implements Quiz {

    private int digit;

    public QuizImpl() {
        this.digit = 254;    // zmienna moze ulegac zmianie!
    }

    @Override
    public void isCorrectValue(int value) throws Quiz.ParamTooLarge, Quiz.ParamTooSmall {
        if (digit > value) {
            throw new Quiz.ParamTooSmall();
        }
        if (digit < value) {
            throw new Quiz.ParamTooLarge();
        }


    }
}
