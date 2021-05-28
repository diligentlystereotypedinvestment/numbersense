genRunner is the runner file

qUp__ is each set of question types

eliminateZero is for checking if the zero at the end of a double is needed and auto-removes it if unnessary

range creates a range for randomization between the interval

simplify is for simplifying fractions and putting them into LaTeX format

Currently being tested is OofO's placeholder method, which is meant to take Objects with ranges for each operation and generate an equation and answer for it

the ArrayList questions and answers are for the questions and answers

i is for the question number

The answer key and question numbers may be off, because the questions are generated with the numbers and the answer key is generated at the end.

fracOperations has methods for fraction arithmetic

### To-Do List

- Bugs

    ~~Question numbers doubling up I think this is done~~
    
    Questions not fully genning? (questions generating like 43=)
    
    Answer key being wrong for some problems
    
    idk if this is fixable, but answer key and question numbers not being aligned
    
    I think that sequences aren't adding right
    
    Exponents - I think answer key is wrong and question also needs "$=n^k$, what is $k$"
    
    make sure answers don't have letters(bases)
    
    Roman Numerals shouldn't have four symbols in a row
    
    ~~OofO's placeholder method, not generating a first term for the equation~~

    I think Adding has a problem with a/b + b/a has some weird problems with simplifying, like 1/2 + 9/9
    
- More Add/Sub/Mult/Div Tricks/Common Problems

- Making the LaTeX formatting look more accurate

- Figure out how to incorporate OofO's equation method with its exponent method

- Matrix multiplication, absolute value bar notation for determinants

- More Problems

    ~~Conversion Library for units~~

    Know what Substitution/Word-Problems are

    ~~Simple Interest Problems~~
    
    ~~Theorems from Geometry - angle bisector, what else?~~
    
    ~~Complex Numbers, there are a couple of problems with this (question number doubling up, $i$'s not printing)~~
    
    Unnecessary 0's after doubles

    Log - toString making the argument more simplified, i.e. 4^{3/2} -> 8, 3^3 -> 27, but 3^{3/2} -> 3^{3/2}, etc., needed for direct computation questions
    
    Problems like "If A is 40 more than B and C is 60 less than A, then C is how much less than B?"
    
    Advanced Remainder problems like "If 3x/5 has a remainder of 2 and 3y/5 has a remainder of 1, then xy/5 has a remainder of ___"
    
    Repeating decimal problems like "The first 4 digits of 427/990 are"
    
    more theorem from geo, diamter of circumscribed circle of right triangle
    
    sets problems like A has n elements B has i elements and A U B has a elements, how many elements are in A ∩ B
    
    Base reminader problems
    
    time between hours/days 40-60
    
    Greatest integer - square roots
    
    wilson's theorem
    
    Approximation
    
        60 - irrational numbers like phi, pi, e, golden ratio, etc
        
        Long Division

- Spaces after the question number

- balance problems more, i.e. no more $2^2$

- L'Hopital Rule for Limits

- bigger polynomial multiplication

- add some calculus stuff to the function class like derivatives and integrals

~~- fracOperations negative signs should be in front of the fraction, but also continue to work with the other operations~~

~~- simplify should be able to return things as a whole number~~

~~- rename and replace all fracOperations with just "frac", and rename and replace simplify with simp~~

- extravagent numbers

- make comparison more challenging, i.e. +- num/denom of two fractions, round and +- .01
