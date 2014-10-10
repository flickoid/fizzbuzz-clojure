(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisible-by-three
  (testing "returns true for 3"
    (is (= true (divisible-by-three? 3)))))

(deftest is-not-divisible-by-three
  (testing "returns false for 1"
    (is (= false (divisible-by-three? 1)))))

(deftest is-divisible-by-five
  (testing "returns true for 5"
    (is (= true (divisible-by-five? 5)))))

(deftest is-not-divisible-by-five
  (testing "returns false for 1"
    (is (= false (divisible-by-five? 1)))))

(deftest is-divisible-by-fifteen
  (testing "returns true for 15"
    (is (= true (divisible-by-fifteen? 15)))))

(deftest is-not-divisible-by-fifteen
  (testing "returns false for 1"
    (is (= false (divisible-by-fifteen? 1)))))

(deftest returns-fizz-for-number-3
  (testing "returns 'Fizz' for 3"
    (is (= "Fizz" (fizz-buzz 3)))))

(deftest returns-buzz-for-number-5
  (testing "returns 'Buzz' for 5"
    (is (= "Buzz" (fizz-buzz 5)))))

(deftest returns-fizzbuzz-for-number-15
  (testing "returns 'FizzBuzz' for 15"
    (is (= "FizzBuzz" (fizz-buzz 15)))))

(deftest returns-1-for-number-1
  (testing "returns 1 for 1"
    (is (= 1 (fizz-buzz 1)))))








