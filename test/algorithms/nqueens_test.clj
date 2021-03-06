(ns algorithms.nqueens-test
  (:require [midje.sweet :refer [fact =>]]
            [algorithms.nqueens :refer [nqueens]]))

(fact "N-Queens"
      (nqueens 0) => 1
      (nqueens 1) => 1
      (nqueens 2) => 0
      (nqueens 3) => 0
      (nqueens 4) => 2
      (nqueens 5) => 10
      (nqueens 6) => 4
      (nqueens 7) => 40
      (nqueens 8) => 92
      (nqueens 9) => 352)

