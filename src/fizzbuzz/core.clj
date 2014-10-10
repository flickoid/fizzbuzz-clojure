(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divisible-by-three? [number] (zero? (mod number 3)))

(defn divisible-by-five? [number] (zero? (mod number 5)))

(defn divisible-by-fifteen? [number] (zero? (mod number 15)))

(defn fizz-buzz [number]
  (if (divisible-by-fifteen? number) "FizzBuzz"
  (if (divisible-by-three? number) "Fizz"
  (if (divisible-by-five? number) "Buzz"
  number))))

(doseq [x (map fizz-buzz (range 1 101))]
  (println x))
